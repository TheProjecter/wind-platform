package br.com.maisha.wind.controller.validator;

import br.com.maisha.terra.lang.Property;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RequiredValidator implements IValidator {

	/** */
	private boolean required;

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#configure(br.com.maisha.terra.lang.Property)
	 */
	public void configure(Property property) {
		this.required = Boolean.valueOf(property.getValue().toString());
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#getId()
	 */
	public String getId() {
		return "required";
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#validate(java.lang.Object)
	 */
	public boolean validate(Object value) {
		boolean valid = true;

		if (required && value == null) {
			valid = false;
		}

		return valid;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#getMessageKey()
	 */
	public String getMessageKey() {
		return null;
	}

}
