package br.com.maisha.wind.controller.rcp;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Activator implements BundleActivator {

	private static Logger log = Logger.getLogger(Activator.class);

	// The shared instance
	private static BundleContext context;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext ctx) throws Exception {

		log.info("		Wind Application Controller Starting... ");

		context = ctx;

		ScriptEngineManager manager = new ScriptEngineManager();
		List<ScriptEngineFactory> engines = manager.getEngineFactories();

		if (!engines.isEmpty()) {
			log.debug("The following " + engines.size()
					+ " scripting engines were found");

			for (ScriptEngineFactory engine : engines) {
				log.debug("Engine name: " + engine.getEngineName());
				log.debug("\tVersion: " + engine.getEngineVersion());
				log.debug("\tLanguage: " + engine.getLanguageName());
				List<String> extensions = engine.getExtensions();
				if (extensions.size() > 0) {
					log.debug("\tEngine supports the following extensions:");
					for (String e : extensions) {
						log.debug("\t\t" + e);
					}
				}
				List<String> shortNames = engine.getNames();
				if (shortNames.size() > 0) {
					log.debug("\tEngine has the following short names:");
					for (String n : engine.getNames()) {
						log.debug("\t\t" + n);
					}
				}
				log.debug("=========================");
			}
		}

		log.info("		Wind Application Controller Started... ");
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static BundleContext getDefault() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		log.info("		Wind Application Controller Stopping... ");
		context = null;
		log.info("		Wind Application Controller Stopped... ");
	}

}
