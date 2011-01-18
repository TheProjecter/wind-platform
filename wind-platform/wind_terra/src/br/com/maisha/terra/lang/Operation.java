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
	public static enum OperationType {
		java("java",true), python("python",false), groovy("groovy", true);

		private String value;
		private boolean useNewOperator;
		
		private OperationType(String value, boolean useNewOperator) {
			this.value = value;
			this.useNewOperator = useNewOperator;
		}

		public boolean getUseNewOperator(){
			return useNewOperator;
		}
		
		public String getValue() {
			return value;
		}
	}
	
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
	public Operation(String type, String ref, String label) {
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
			if (p == null) {
				return pInfo.getDefaultValue();
			}
			return (T) p.getValue();
		}
		return null;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("type: ").append(getType());
		sb.append(" ref: ").append(getRef());
		sb.append(" label: ").append(getLabel());
		return sb.toString();
	}
}
