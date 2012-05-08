package br.com.maisha.wind.storage;

import java.io.Serializable;
import java.util.List;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;

/**
 * 
 * @author paulo.freitas
 * 
 */
public interface IStorage {

	/** The name under which the implementation of this interface will be registered within the Application Context.*/
	public static final String BEAN_NAME = "storage";
	
	/**
	 * 
	 * @param app
	 */
	void configure(WindApplication app);

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	void save(ModelReference ref);

	/**
	 * 
	 * @param appIdgetAll
	 * @param dObj
	 * @return
	 */
	List<ModelReference> getAll(DomainObject dObj);

	/**
	 * 
	 * @param appId
	 * @param clazz
	 * @param id
	 * @return
	 */
	Object getById(String appId, Class<?> clazz, Serializable id);

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	void update(ModelReference ref);

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	void delete(ModelReference ref);

	/**
	 * 
	 * @param model
	 * @param query
	 * @param param
	 * @return
	 */
	List<ModelReference> filter(ModelReference model, String query, Object... param);

	/**
	 * 
	 * @param meta
	 * @param id
	 * @return
	 */
	ModelReference loadFullEntity(DomainObject meta, Serializable id);
}
