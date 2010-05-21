package br.com.maisha.wind.controller.validator;

import br.com.maisha.terra.lang.Property;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IValidator {

	/**
	 * 
	 * @param property
	 */
	void configure(Property property);

	/**
	 * 
	 * @param value
	 * @return
	 */
	boolean validate(Object value);

	/**
	 * 
	 * @return
	 */
	String getId();

	/**
	 * 
	 * @return
	 */
	String getMessageKey();
}
