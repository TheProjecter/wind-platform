package br.com.maisha.wind.controller.execution.api;

import java.io.Serializable;
import java.util.List;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.storage.IStorage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PersistenceAPI {

	/** */
	private IStorage persistenceStorage;

	/**
	 * 
	 * @param persistenceStorage
	 */
	public PersistenceAPI(IStorage persistenceStorage) {
		this.persistenceStorage = persistenceStorage;
	}

	/**
	 * 
	 * @param d
	 */
	public void save(ModelReference d) {
		persistenceStorage.save(d);
	}

	/**
	 */
	public Object getById(String appId, Class<?> clazz, Serializable id) {
		return persistenceStorage.getById(appId, clazz, id);
	}

	public void update(ModelReference ref) {
		persistenceStorage.update(ref);
	}

	public void delete(ModelReference ref) {
		persistenceStorage.delete(ref);
	}

	public List<ModelReference> filter(ModelReference model, String query, Object... param) {
		return persistenceStorage.filter(model, query, param);
	}

	public List<ModelReference> filter(ModelReference model, String query) {
		return persistenceStorage.filter(model, query, (Object[]) null);
	}

	public IStorage getPersistentStorage() {
		return persistenceStorage;
	}

	public void setPersistentStorage(IStorage persistentStorage) {
		this.persistenceStorage = persistentStorage;
	}

}
