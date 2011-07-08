package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a container (either folder or group), that will be rendered to the user.
 * <p/>
 * Contains a set of attributes.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Container extends TerraClass {

	public static enum PresentationType {
		FOLDER("folder"), GROUP("group");

		private String name;

		private PresentationType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	/** it's reference */
	private String ref;

	/** it's label */
	private String label;

	/** it's properties */
	private Map<String, Property> properties = new HashMap<String, Property>();

	/** it's attributes, just reference! */
	private List<String> attributes = new ArrayList<String>();

	/** How it will be presented (GUI). */
	private PresentationType type;

	/** it's domain object. */
	private DomainObject domainObject;

	/**
	 * Constructor configures ref and label.
	 * 
	 * @param ref
	 *            Reference
	 * @param label
	 *            Label
	 */
	public Container(String ref, String label) {
		super();
		this.ref = ref;
		if (!label.trim().isEmpty()) {
			this.label = label.substring(1, label.length() - 1);
		}
	}

	/** @see #label */
	public String getRef() {
		return ref;
	}

	/** @see #ref */
	public void setRef(String ref) {
		this.ref = ref;
	}

	/** @see #label */
	public String getLabel() {
		return label;
	}

	/** @see #label */
	public void setLabel(String label) {
		this.label = label;
	}

	/** @see #properties */
	public Map<String, Property> getProperties() {
		return properties;
	}

	/** @see #properties */
	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}

	/** @see #attributes */
	public List<String> getAttributes() {
		return attributes;
	}

	/** @see #attributes */
	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	/** @see #attributes */
	public void addAttribute(String attRef) {
		if (this.getAttributes() != null) {
			this.getAttributes().add(attRef);
		}
	}

	/** @see #domainObject */
	public DomainObject getDomainObject() {
		return domainObject;
	}

	/** @see #domainObject */
	public void setDomainObject(DomainObject domainObject) {
		this.domainObject = domainObject;
	}

	/** @see #type */
	public PresentationType getType() {
		return type;
	}

	/** @see #type */
	public void setType(PresentationType type) {
		this.type = type;
	}

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ref);
		sb.append("[").append(label).append("]");
		sb.append(" - ").append(type);
		return sb.toString();
	}
}
