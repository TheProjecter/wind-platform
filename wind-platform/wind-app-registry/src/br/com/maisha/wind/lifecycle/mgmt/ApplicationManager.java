package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Locale;
import java.util.PropertyResourceBundle;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.IClassMaker;
import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ResourceBundleEntry;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.storage.IStorage;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManager implements IApplicationManager {

	private static final Logger log = Logger
			.getLogger(ApplicationManager.class);

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

	/** Current DomainObject opened for edition. */
	private DomainObject openedObject;
	
	/** Persistent Storage. */
	private IStorage persistentStorage;

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#loadApplication()
	 */
	@SuppressWarnings("unchecked")
	public void registerApplication(BundleContext context) {
		try {

			log.debug("		Registering Wind Application");

			// reads it's configuration file
			URL appCfg = context.getBundle().getEntry(
					"/META-INF/wind-app.cfg.xml");
			WindApplication app = appCfgReader.read(appCfg.openStream());

			log.debug("		App: [" + app.getAppId() + "] " + app.getName());

			// compile it's domain objects
			Enumeration<URL> e = context.getBundle().findEntries("/bin",
					"*.do", true);
			while (e.hasMoreElements()) {
				URL dObjURL = e.nextElement();
				InputStream dObjIptStream = dObjURL.openStream();
				if (dObjIptStream != null) {

					// interpret source code
					DomainObject dObj = langCompiler.compile(dObjIptStream);
					app.addDomainObject(dObj);

					// make java object
					dObj.setObjectClass(classMaker.make(persistentStorage.getClassLoader(), dObj));
					
					dObj.setApplication(app);

					// fire model event
					modelListeners.fireEvent(null, dObj, LevelType.Object,
							ChangeType.Added);
				} else {
					// TODO throws exception
				}
			}

			// load it's resource bundles
			for (ResourceBundleEntry rbEntry : app.getResourceBundles()) {
				URL rbPath = context.getBundle().getResource(
						rbEntry.getPath() + ".properties");
				if (rbPath == null) {
					log.error("Could not find resource under the given path ["
							+ rbEntry.getPath() + "] for app ["
							+ app.getAppId() + "]...");
					continue;
				}
				String[] langCountry = rbEntry.getLocale().split("_");
				Locale locale = new Locale(langCountry[0], langCountry[1]);
				PropertyResourceBundle rb = new PropertyResourceBundle(rbPath
						.openStream());

				app.addResourceBundle(locale, rb);
			}

			app.setBundleContext(context);
				
			// configure application's persistence 
			URL hibCfg = context.getBundle().getResource("hibernate.cfg.xml");
			if(hibCfg != null){
				// creates session factory
				app.setHibernateConfig(hibCfg);
				persistentStorage.configure(app);
			}
			
			// register the application, fire model event
			if (registry.register(app)) {
				modelListeners.fireEvent(null, app, LevelType.Application,
						ChangeType.Added);
			}

		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}

	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#openObject(java.lang.String,
	 *      java.lang.String)
	 */
	public void openObject(String appId, String objectId) {
		DomainObject obj = registry.getObject(appId, objectId);
		openedObject = obj;
		modelListeners.fireEvent(null, openedObject, LevelType.Object,
				ChangeType.ObjectOpened);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#closeObject(java.lang.String,
	 *      java.lang.String)
	 */
	public void closeObject(String appId, String objectId) {
		openedObject = null;
		modelListeners.fireEvent(null, null, LevelType.Object,
				ChangeType.ObjectClosed);
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
	
	
}
