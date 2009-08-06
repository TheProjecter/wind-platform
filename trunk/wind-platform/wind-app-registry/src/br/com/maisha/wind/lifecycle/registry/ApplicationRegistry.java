package br.com.maisha.wind.lifecycle.registry;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.lifecycle.model.WindApplication;

/**
 * Memory HashMap impl of {@link IApplicationRegistry}.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationRegistry implements IApplicationRegistry {

	/** HashMap registry. */
	private Map<String, WindApplication> registry = new HashMap<String, WindApplication>();

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
	public void register(WindApplication app) {
		this.registry.put(app.getAppId(), app);

	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#retrieve(java.lang.String)
	 */
	public WindApplication retrieve(String appId) {
		return this.registry.get(appId);
	}

}
