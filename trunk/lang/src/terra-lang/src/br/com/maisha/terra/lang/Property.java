package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo
 * 
 */
public class Property extends TerraClass {

	private String propName;

	private Object value;

	public Property(String propName) {
		super();
		this.propName = propName;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
