package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.osgi.framework.BundleContext;

import br.com.maisha.terra.ClassMaker;
import br.com.maisha.terra.IClassMaker;
import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.lifecycle.model.WindApplication;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManager implements IApplicationManager {

	/** Reference to the terra language compiler. */
	private ITerraCompiler langCompiler;

	/** */
	private IClassMaker classMaker;

	/** The application registry. */
	private IApplicationRegistry registry;

	/** The application configuration file reader. */
	private IAppCfgReader appCfgReader;

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#loadApplication()
	 */
	@SuppressWarnings("unchecked")
	public void registerApplication(BundleContext context) {
		try {

			// reads it's configuration file
			URL appCfg = context.getBundle().getEntry(
					"/META-INF/wind-app.cfg.xml");
			WindApplication app = appCfgReader.read(appCfg.openStream());

			// compile it's domain objects
			Enumeration<URL> e = context.getBundle().findEntries("/bin", "*.do",
					true);
			while (e.hasMoreElements()) {
				URL dObjURL = e.nextElement();
				InputStream dObjIptStream = dObjURL.openStream();
				if (dObjIptStream != null) {
					DomainObject dObj = langCompiler.compile(dObjIptStream);
					app.addDomainObject(dObj);
					classMaker.make(dObj);
				} else {
					// TODO throws exception
				}
			}

			// register the application
			registry.register(app);

		} catch (Exception e) {
			e.printStackTrace(); // TODO
		}

	}

	/** @see #appCfgReader */
	public void setAppCfgReader(IAppCfgReader appCfgReader) {
		this.appCfgReader = appCfgReader;
	}

	/** @see #langCompiler */
	public void setLangCompiler(ITerraCompiler langCompiler) {
		this.langCompiler = langCompiler;
	}

	/** @see #registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}

	/** @see ClassMaker */
	public void setClassMaker(IClassMaker classMaker) {
		this.classMaker = classMaker;
	}
}
