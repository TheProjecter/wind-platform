package br.com.maisha.terra.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Paulo
 * 
 */
public class Attribute extends TerraClass {

	/** */
	private String type;

	/** */
	private String ref;

	/** */
	private String label;

	/** */
	private String i18nLabel;
	
	/** */
	private Map<String, Property> properties = new HashMap<String, Property>();

	/** */
	private DomainObject domainObject;

	/**
	 * 
	 * @param type
	 * @param ref
	 * @param label
	 */
	public Attribute(String type, String ref, String label) {
		super();
		this.type = type;
		this.ref = ref;

		if (!label.trim().isEmpty()) {
			this.label = label.substring(1, label.length() - 1);
			this.i18nLabel = this.label;
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

	public DomainObject getDomainObject() {
		return domainObject;
	}

	public void setDomainObject(DomainObject domainObject) {
		this.domainObject = domainObject;
	}

	
	public String getI18nLabel() {
		return i18nLabel;
	}

	public void setI18nLabel(String i18nLabel) {
		this.i18nLabel = i18nLabel;
	}

	/**
	 * 
	 * @param <T>
	 * @param pInfo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getPropertyValue(PropertyInfo<T> pInfo) {
		if (properties != null && pInfo.getPropName() != null) {
			Property p = properties.get(pInfo.getPropName());
			if (p == null || p.getValue() == null) {
				return pInfo.getDefaultValue();
			}
			return (T) p.getValue();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T property(String name) {
		if (properties != null && name != null) {
			Property p = properties.get(name);
			if (p != null) {
				return (T) p.getValue();
			}
		}
		return null;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getType());
		sb.append(" ").append(getRef());
		sb.append(" [").append(getLabel()).append("]");
		return sb.toString();
	}
}
