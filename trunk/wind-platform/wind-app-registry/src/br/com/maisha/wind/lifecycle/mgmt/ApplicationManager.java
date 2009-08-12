package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.IClassMaker;
import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.lifecycle.model.WindApplication;
import br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry;
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
					classMaker.make(dObj);

					// fire model event
					modelListeners.fireEvent(null, dObj, LevelType.Object,
							ChangeType.Added);
				} else {
					// TODO throws exception
				}
			}

			// register the application, fire model event
			registry.register(app);
			modelListeners.fireEvent(null, app, LevelType.Application,
					ChangeType.Added);

		} catch (Exception e) {
			e.printStackTrace(); // TODO
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
}
