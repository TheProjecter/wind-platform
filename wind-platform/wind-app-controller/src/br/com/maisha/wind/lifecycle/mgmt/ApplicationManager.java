package br.com.maisha.wind.lifecycle.mgmt;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import br.com.maisha.terra.IClassMaker;
import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.terra.lang.Datasource;
import br.com.maisha.terra.lang.Datasource.RDMBSVendor;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.ResourceBundleEntry;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.execution.BasicRule;
import br.com.maisha.wind.controller.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;
import br.com.maisha.wind.storage.IStorage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManager implements IApplicationManager {

	private static final Logger log = Logger.getLogger(ApplicationManager.class);

	/** Reference to the terra language compiler. */
	private ITerraCompiler langCompiler;

	/** */
	private IClassMaker classMaker;

	/** The application registry. */
	private IApplicationRegistry registry;

	/** The application configuration file reader. */
	private IAppCfgReader appCfgReader;

	/** Listeners for model changes. */
	private IAppModelListenerRegistry modelListeners;

	/** Persistent Storage. */
	private IStorage persistentStorage;

	/** Application Controller. */
	private IApplicationController appCtrl;

	/**
	 * 
	 * @param context
	 * @return
	 * @throws Exception
	 */
	private String readAppCfg(BundleContext context) throws Exception {
		URL appCfg = context.getBundle().getEntry("/META-INF/wind-app.cfg");
		StringWriter writer = new StringWriter();
		IOUtils.copy(appCfg.openStream(), writer);
		String script = writer.toString();

		script = "StringWriter writer = new java.io.StringWriter()\ndef wind = new groovy.xml.MarkupBuilder(writer)\n"
				+ script;
		script = script + "\nreturn writer.toString()";

		Object ret = appCtrl.runScript("groovy", script, null);
		return ret != null ? ret.toString() : "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#registerApplication
	 * (org.osgi.framework.BundleContext, java.lang.ClassLoader)
	 */
	public void registerApplication(BundleContext context, ClassLoader classLoader) {
		try {
			log.debug("		Registering Wind Application");

			// reads it's configuration file
			String appCfg = readAppCfg(context);
			WindApplication app = appCfgReader.read(new ByteArrayInputStream(appCfg.getBytes()));

			log.debug("		App: [" + app.getAppId() + "] " + app.getName());

			// compile it's domain objects
			Enumeration<URL> e = context.getBundle().findEntries("/", "*.do", true);
			if (e != null) {
				while (e.hasMoreElements()) {
					// TODO ignore duplicated entries on this iteration

					URL dObjURL = e.nextElement();
					InputStream dObjIptStream = dObjURL.openStream();
					if (dObjIptStream != null) {

						// interpret source code
						DomainObject dObj = langCompiler.compile(dObjIptStream);
						app.addDomainObject(dObj);

						dObj.setApplication(app);

						// fire model event
						modelListeners.fireEvent(null, dObj, LevelType.Object, ChangeType.Added);
					} else {
						// TODO throws exception
					}
				}

				app.setClassLoader(classLoader);
				classMaker.makeClasses(classLoader, app);
			}

			// load it's resource bundles
			for (ResourceBundleEntry rbEntry : app.getResourceBundles()) {
				URL rbPath = context.getBundle().getResource(rbEntry.getPath() + ".properties");
				if (rbPath == null) {
					log.error("Could not find resource under the given path [" + rbEntry.getPath() + "] for app ["
							+ app.getAppId() + "]...");
					continue;
				}
				String[] langCountry = rbEntry.getLocale().split("_");
				Locale locale = new Locale(langCountry[0], langCountry[1]);
				PropertyResourceBundle rb = new PropertyResourceBundle(rbPath.openStream());

				app.addResourceBundle(locale, rb);
			}

			app.setBundleContext(context);

			// configure objects labels
			appCtrl.configureAllLabels(context, app);

			// configure application's persistence
			URL hibCfg = context.getBundle().getResource("hibernate.cfg.xml");
			if (hibCfg != null) {
				// creates session factory
				app.setHibernateConfig(hibCfg);
				// persistentStorage.configure(app);
			}

			// build a spring application context to this wind application
			buildApplicationContext(app);

			// register the application, fire model event
			if (registry.register(app)) {
				modelListeners.fireEvent(null, app, LevelType.Application, ChangeType.Added);
			}

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

	}

	/**
	 * Constructs an Spring Application Context for the given Wind Application
	 * <p/>
	 * For each operation two beans will be registered. One for the class that
	 * implements the operation an another called "wrapper". The wrapper
	 * encapsulates the complexity involved in calling the rule.
	 * 
	 * @param windApp
	 *            Wind Application for which the App Ctx is being constructed
	 * @return Application Context
	 */
	public ApplicationContext buildApplicationContext(WindApplication windApp) {
		GenericApplicationContext springAppCtx = new GenericApplicationContext();

		Set<DomainObject> dObjs = windApp.getDomainObjects();
		for (DomainObject domainObject : dObjs) {
			List<Operation> operations = domainObject.getOperations();
			for (Operation operation : operations) {
				String file = operation.getPropertyValue(PropertyInfo.FILE);

				// le business rule itself
				BeanDefinitionBuilder ruleBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(file);
				springAppCtx.registerBeanDefinition(operation.getRef(), ruleBeanDefinition.getBeanDefinition());

				// le "wrapper" for it
				BeanDefinitionBuilder wrapperBeanDefinition = BeanDefinitionBuilder
						.genericBeanDefinition(BasicRule.class);
				wrapperBeanDefinition.addConstructorArgValue(operation);
				springAppCtx.registerBeanDefinition(operation.getRef() + "Rule",
						wrapperBeanDefinition.getBeanDefinition());
			}
		}

		Datasource ds = windApp.getDatasource();
		if (ds != null) {
			RDMBSVendor vendor = null;
			try {
				vendor = Datasource.RDMBSVendor.valueOf(ds.getRdbmsVendor());
			} catch (Exception e) {
				throw new IllegalArgumentException(ds.getRdbmsVendor() + " is an invalid RDBMS. Please use one of "
						+ Arrays.toString(Datasource.RDMBSVendor.values()));
			}
			String jdbcDriver = vendor.getDriverClassName();
			String dialect = vendor.getHibDialect();

			BeanDefinitionBuilder datasource = BeanDefinitionBuilder
					.genericBeanDefinition("org.apache.commons.dbcp.BasicDataSource");
			datasource.setDestroyMethodName("close");
			datasource.addPropertyValue("driverClassName", jdbcDriver);
			datasource.addPropertyValue("url", ds.getUrl());
			datasource.addPropertyValue("username", ds.getUsername());
			datasource.addPropertyValue("password", ds.getPassword());
			springAppCtx.registerBeanDefinition("datasource", datasource.getBeanDefinition());
			BeanDefinitionBuilder sessionFactory = BeanDefinitionBuilder
					.genericBeanDefinition("org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean");

			sessionFactory.addPropertyReference("dataSource", "datasource");

			Properties hibProps = new Properties();
			hibProps.put("hibernate.dialect", dialect);
			hibProps.put("hibernate.show_sql", true);
			hibProps.put("hibernate.hbm2ddl.auto", "create-drop");
			sessionFactory.addPropertyValue("hibernateProperties", hibProps);

			List<String> classesList = new ArrayList<String>();
			for (DomainObject dObj : windApp.getDomainObjects()) {
				if (dObj.getObjectClass() != null) {
					classesList.add(dObj.getObjectClass().getName());
				}
			}
			sessionFactory.addPropertyValue("annotatedClasses", classesList);

			springAppCtx.registerBeanDefinition("sessionFactory", sessionFactory.getBeanDefinition());
		}
		springAppCtx.setClassLoader(windApp.getClassLoader());
		springAppCtx.refresh();

		return springAppCtx;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#unregisterApplication
	 * (org.osgi.framework.BundleContext)
	 */
	public void unregisterApplication(BundleContext context) {
		try {
			log.debug("		Unregistering Wind Application");

			// reads it's configuration file
			URL appCfg = context.getBundle().getEntry("/META-INF/wind-app.cfg.xml");
			WindApplication app = appCfgReader.read(appCfg.openStream());

			String appId = app.getAppId();

			log.debug("		App: [" + app.getAppId() + "] " + app.getName() + " is going to be uninstalled");

			// get app from registry
			app = registry.retrieve(appId);
			if (app == null) {
				log.error("Registry does not know the application registered under the given id [" + appId + "] ...");
				return;
			}

			// detach classes created with javassist
			classMaker.detachClasses(app);

			if (registry.unregister(app)) {
				modelListeners.fireEvent(null, app, LevelType.Application, ChangeType.Removed);
			}

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/** @see ApplicationManager#appCfgReader */
	public void setAppCfgReader(IAppCfgReader appCfgReader) {
		this.appCfgReader = appCfgReader;
	}

	/** @see ApplicationManager#langCompiler */
	public void setLangCompiler(ITerraCompiler langCompiler) {
		this.langCompiler = langCompiler;
	}

	/** @see ApplicationManager#registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}

	/** @see ApplicationManager#classMaker */
	public void setClassMaker(IClassMaker classMaker) {
		this.classMaker = classMaker;
	}

	/** @see ApplicationManager#modelListeners */
	public void setModelListeners(IAppModelListenerRegistry modelListeners) {
		this.modelListeners = modelListeners;
	}

	/** @see ApplicationManager#persistentStorage */
	public IStorage getPersistentStorage() {
		return persistentStorage;
	}

	/** @see ApplicationManager#persistentStorage */
	public void setPersistentStorage(IStorage persistentStorage) {
		this.persistentStorage = persistentStorage;
	}

	/** @see ApplicationManager#appCtrl */
	public void setAppCtrl(IApplicationController appCtrl) {
		this.appCtrl = appCtrl;
	}
}
