package br.com.maisha.wind.lifecycle.registry;

import java.util.ArrayList;
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

	/** Holds all registered metadata listeners in this registry. */
	private List<IMetadataListener> metadataListener = new ArrayList<IMetadataListener>();

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
		fireMetadataChanged(app);
		this.registry.put(app.getAppId(), app);

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
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#addMetadataListener(br.com.maisha.wind.lifecycle.registry.IMetadataListener)
	 */
	public void addMetadataListener(IMetadataListener listener) {
		metadataListener.add(listener);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IApplicationRegistry#removeMetadataListener(br.com.maisha.wind.lifecycle.registry.IMetadataListener)
	 */
	public void removeMetadataListener(IMetadataListener listener) {
		metadataListener.remove(listener);
	}

	/**
	 * Notifies all listeners model has changed it's state.
	 * 
	 * @param app
	 *            Model which has changed.
	 */
	private void fireMetadataChanged(WindApplication app) {
		for (IMetadataListener listener : metadataListener) {
			listener.metadataChanged(app);
		}
	}

}
