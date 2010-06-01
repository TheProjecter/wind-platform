package br.com.maisha.wind.controller.validator;

import br.com.maisha.terra.lang.Property;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MinLengthValidator implements IValidator {

	/** */
	private int min;

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#configure(br.com.maisha.terra.lang.Property)
	 */
	public void configure(Property property) {
		this.min = Integer.valueOf(property.getValue().toString());
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#getId()
	 */
	public String getId() {
		return "min_length";
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#validate(java.lang.Object)
	 */
	public boolean validate(Object value) {
		if (value == null) {
			return true;
		}

		String asString = value.toString();
		if (asString.length() < min) {
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.validator.IValidator#getMessageKey()
	 */
	public String getMessageKey() {
		return "wind.messages.minLength";
	}

}
