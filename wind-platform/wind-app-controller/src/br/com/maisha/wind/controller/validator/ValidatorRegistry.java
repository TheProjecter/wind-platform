package br.com.maisha.wind.controller.validator;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ValidatorRegistry {

	/** */
	private Map<String, IValidator> registry = new HashMap<String, IValidator>();

	/** @see #registry */
	public Map<String, IValidator> getRegistry() {
		return registry;
	}

	/** @see #registry */
	public void setRegistry(Map<String, IValidator> registry) {
		this.registry = registry;
	}

	/** @see #registry */
	public IValidator getValidator(String key) {
		return registry.get(key);
	}

}
