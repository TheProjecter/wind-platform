package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ValidValue extends TerraClass {

	/** Value Key */
	private String key;

	/** Value Itself */
	private String value;

	/** @see ValidValue#key */
	public String getKey() {
		return key;
	}

	/** @see ValidValue#key */
	public void setKey(String key) {
		this.key = key;
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
