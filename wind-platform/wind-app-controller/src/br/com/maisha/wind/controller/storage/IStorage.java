package br.com.maisha.wind.controller.storage;

import org.hibernate.cfg.Configuration;

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
}
