/**
 * 
 */
package br.com.maisha.wind.controller.execution;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

import org.apache.log4j.Logger;

import br.com.maisha.wind.controller.rcp.Activator;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindScriptEngineManager extends ScriptEngineManager {

	/** Log Ref. */
	private static final Logger log = Logger.getLogger(Activator.class);

	/** Registered Factories */
	private List<ScriptEngineFactory> factories = new ArrayList<ScriptEngineFactory>();

	/**
	 * 
	 * @see javax.script.ScriptEngineManager#getEngineFactories()
	 */
	public List<ScriptEngineFactory> getEngineFactories() {
		List<ScriptEngineFactory> baseFactories = super.getEngineFactories();

		List<ScriptEngineFactory> result = new ArrayList<ScriptEngineFactory>();
		result.addAll(factories);
		result.addAll(baseFactories);
		return result;
	}

	/**
	 * 
	 * @param factory
	 */
	public void registerScriptEngineFactory(ScriptEngineFactory factory) {
		for (Object ext : factory.getExtensions()) {
			registerEngineExtension((String) ext, factory);
		}

		for (Object mime : factory.getMimeTypes()) {
			registerEngineMimeType((String) mime, factory);
		}

		for (Object name : factory.getNames()) {
			registerEngineName((String) name, factory);
		}

		factories.add(factory);
	}

	/** @see WindScriptEngineManager#factories */
	public void setFactories(List<ScriptEngineFactory> factories) {
		for (ScriptEngineFactory f : factories) {
			registerScriptEngineFactory(f);
		}

		logInstalledEngines();
	}

	private void logInstalledEngines() {
		if (log.isDebugEnabled()) {
			List<ScriptEngineFactory> engines = getEngineFactories();

			if (!engines.isEmpty()) {
				log.debug("The following " + engines.size() + " scripting engines were found");

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

		}
	}
}
