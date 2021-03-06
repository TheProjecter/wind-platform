package br.com.maisha.terra.lang;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import br.com.maisha.terra.lang.Property.PresentationType;

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
		if (properties != null && pInfo != null && pInfo.getPropName() != null) {
			Property p = properties.get(pInfo.getPropName());
			if (p == null || p.getValue() == null) {
				return pInfo.getDefaultValue();
			}
			return (T) p.getValue();
		}
		return null;
	}

	public Property getProperty(String propName) {
		if (properties != null && propName != null) {
			return properties.get(propName);
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
	 * Get Method for property missing to use by Groovy.
	 * <p/>
	 * This enables you to call <code>def a = attr.required</code>, where "attr" is a reference to this class and "required" is a property
	 * name. It's possible to use any defined in {@link PropertyInfo}.
	 * 
	 * @param name
	 *            Property name. One of those defined in {@link PropertyInfo}.
	 * @return Returns the corresponding value of the property if there is any.
	 */
	@SuppressWarnings("unchecked")
	public <T> T propertyMissing(String name) {
		return (T) getPropertyValue(PropertyInfo.getPropertyInfo(name));
	}

	/**
	 * Set Method for property missing to use by Groovy.
	 * <p/>
	 * This enables you to call <code>attr.required = true;</code>, where "attr" is a reference to this class and "required" is a property
	 * name. It's possible to use any defined in {@link PropertyInfo}.
	 * 
	 * @param name
	 *            Property name. One of those defined in {@link PropertyInfo}.
	 * @param value
	 *            Value assigned to variable.
	 */
	public void propertyMissing(String name, Object value) {
		Property p = getProperties().get(name);
		if (p != null) {
			p.setValue(value);
		}
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

	/**
	 * Indicates whether this attribute is associated with a folder
	 * 
	 * @return true if this attribute is associated with a folder; false otherwise;
	 */
	public boolean isFolderAttribute() {
		return StringUtils.isNotBlank(this.getPropertyValue(PropertyInfo.FOLDER));
	}

	/**
	 * Indicates whether this attribute represents Group
	 * 
	 * @return true if this attribute represents a group; false otherwise;
	 */
	public boolean isGroupAttribute() {
		return "Group".equals(this.getType())
				&& PresentationType.GROUP.getValue().equals(this.getPropertyValue(PropertyInfo.PRESENTATION_TYPE));
	}
}
