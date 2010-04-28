package br.com.maisha.wind.lifecycle.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;

/**
 * Memory HashMap impl of {@link IApplicationRegistry}.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationRegistry implements IApplicationRegistry {

	/** Log ref. */
	private static final Logger log = Logger
			.getLogger(ApplicationRegistry.class);

	/** HashMap registry. */
	private Map<String, WindApplication> registry = new HashMap<String, WindApplication>();

	/* Avoid instantiation. */
	private ApplicationRegistry() {
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#getAllObjects(java.lang.String)
	 */
	public List<DomainObject> getAllObjects(String appId) {
		WindApplication app = registry.get(appId);
		if (app != null) {
			return app.getDomainObjects();
		}
		return Collections.emptyList();
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#register(br.com.maisha.wind.lifecycle.model.WindApplication)
	 */
	public boolean register(WindApplication app) {
		if (registry.containsKey(app.getAppId())) {
			log.error("Registry already contains an application "
					+ "registered under the given id [" + app.getAppId()
					+ "] ... " + "choose a different one!");
			return false;
		}
		this.registry.put(app.getAppId(), app);
		log.debug("		Application [" + app.getAppId() + "] registered...");
		return true;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#retrieve(java.lang.String)
	 */
	public WindApplication retrieve(String appId) {
		return this.registry.get(appId);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#retrieve()
	 */
	public List<WindApplication> retrieve() {
		return new ArrayList<WindApplication>(registry.values());
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#getObject(java.lang.String,
	 *      java.lang.String)
	 */
	public DomainObject getObject(String appId, String objectId) {
		WindApplication app = retrieve(appId);
		if (app != null) {
			for (DomainObject obj : app.getDomainObjects()) {
				if (objectId.equals(obj.getRef())) {
					return obj;
				}
			}
		}
		return null;
	}

}
