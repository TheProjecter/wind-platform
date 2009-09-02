package br.com.maisha.terra.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO javadoc.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Operation extends TerraClass {

	/** */
	private String type;

	/** */
	private String ref;

	/** */
	private String label;

	/** */
	private Map<String, Property> properties = new HashMap<String, Property>();

	/**
	 * 
	 * @param type
	 * @param ref
	 * @param label
	 */
	public Operation(String type, String ref, String label) {
		super();
		this.type = type;
		this.ref = ref;

		if (!label.trim().isEmpty()) {
			this.label = label.substring(1, label.length() - 1);
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Map<String, Property> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}

}
