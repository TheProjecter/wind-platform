package br.com.maisha.wind.controller.storage;

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
	void save(String appId, ModelReference ref);

	/**
	 * 
	 * @param appId
	 * @param dObj
	 * @return
	 */
	List<?> getAll(String appId,  DomainObject dObj);
}
