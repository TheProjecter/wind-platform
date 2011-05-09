package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ValidValue extends TerraClass {

	/** Value Itself */
	private String value;

	/**
	 * Empty Constructor
	 */
	public ValidValue() {
	}

	/**
	 * Constructor configures Key and Value.
	 * 
	 * @param value
	 *            Valid Value itself.
	 */
	public ValidValue(String value) {
		setValue(value);
	}

	/** @see ValidValue#value */
	public String getValue() {
		return value;
	}

	/** @see ValidValue#value */
	public void setValue(String value) {
		if (!value.trim().isEmpty()) {
			this.value = value.substring(1, value.length() - 1);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return value.toString();
	}

}
