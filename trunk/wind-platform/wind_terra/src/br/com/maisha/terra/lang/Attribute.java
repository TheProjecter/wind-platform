package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;

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

	/** TODO change it to be a hashmap. */
	private List<Property> props = new ArrayList<Property>();

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
		this.label = label;
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

	public List<Property> getProps() {
		return props;
	}

	public void setProps(List<Property> props) {
		this.props = props;
	}

	public void addProperty(Property p) {
		props.add(p);
	}

	/**
	 * TODO change props to be a hashmap!!
	 * 
	 * @param <T>
	 * @param pInfo
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getPropertyValue(PropertyInfo<T> pInfo) {
		if (props != null && pInfo.getPropName() != null) {
			for (Property p : props) {
				if (pInfo.getPropName().equals(p.getPropName())) {
					return (T) p.getValue();
				}
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
