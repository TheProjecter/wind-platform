package br.com.maisha.wind.controller.storage;

import java.io.Serializable;
import java.util.List;

import org.hibernate.cfg.Configuration;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;

/**
 * 
 * @author paulo.freitas
 * 
 */
public interface IStorage {

	Configuration configure(WindApplication app);

	/**
	 * 
	 * @return
	 */
	ClassLoader getClassLoader();

	/**
	 * 
	 * @param appId
	 * @param ref
	 */
	void save(ModelReference ref);

	/**
	 * 
	 * @param appId
	 * @param dObj
	 * @return
	 */
	List<?> getAll(DomainObject dObj);
	
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
	 * @param appId
	 * @param d
	 * @param query
	 * @param param
	 * @return
	 */
	List<?> filter(ModelReference d, String query, Object ... param);
}
