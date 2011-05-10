package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javassist.CtClass;

/**
 * TODO javadoc.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObject extends TerraClass {

	private String ref;

	private String label;

	private String pckg;

	private List<Attribute> atts = new ArrayList<Attribute>();

	private List<Import> imports = new ArrayList<Import>();

	private List<Operation> operations = new ArrayList<Operation>();

	private List<Validation> validations = new ArrayList<Validation>();

	private Map<String, Property> properties = new HashMap<String, Property>();

	private CtClass ctClass;
	
	/** Java class that represents this domain object. */
	private Class<?> objectClass;

	/** */
	private WindApplication application;

	public DomainObject(String ref, String label) {
		super();
		this.ref = ref;
		if (!label.trim().isEmpty()) {
			this.label = label.substring(1, label.length() - 1);
		}
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

	public void addAttribute(Attribute att) {
		atts.add(att);
	}

	public List<Attribute> getAtts() {
		return atts;
	}

	public void setAtts(List<Attribute> atts) {
		for (Attribute att : atts) {
			att.setDomainObject(this);
		}
		this.atts = atts;
	}

	public List<Import> getImports() {
		return imports;
	}

	public void setImports(List<Import> imports) {
		this.imports = imports;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		for (Operation op : operations) {
			op.setDomainObject(this);
		}
		this.operations = operations;
	}

	public Class<?> getObjectClass() {
		return objectClass;
	}

	public void setObjectClass(Class<?> objectClass) {
		this.objectClass = objectClass;
	}

	public String getPckg() {
		return pckg;
	}

	public void setPckg(String pckg) {
		this.pckg = pckg;
	}

	public WindApplication getApplication() {
		return application;
	}

	public void setApplication(WindApplication application) {
		this.application = application;
	}

	public List<Validation> getValidations() {
		return validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}

	public Attribute getAttribute(String name) {
		for (Attribute attr : atts) {
			if (attr.getRef().equals(name)) {
				return attr;
			}
		}
		return null;
	}

	public Validation getValidation(String ref) {
		for (Validation val : validations) {
			if (val.getRef().equals(ref)) {
				return val;
			}
		}
		return null;
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

	public Map<String, Property> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Property> properties) {
		this.properties = properties;
	}

	public Attribute attribute(String name) {
		return getAttribute(name);
	}

	
	
	public CtClass getCtClass() {
		return ctClass;
	}

	public void setCtClass(CtClass ctClass) {
		this.ctClass = ctClass;
	}

	/**
	 * Get Method for property missing to use by Groovy.
	 * <p/>
	 * This enables you to call <code>meta.<ATTRIBUTE_NAME></code> where "meta"
	 * is a reference to this class and <ATTRIBUTE_NAME> is the name of the
	 * desired attribute.
	 * 
	 * @param name
	 *            Attribute name.
	 * @return Returns the corresponding {@link Attribute} if there is any.
	 */
	public Attribute propertyMissing(String name) {
		return getAttribute(name);
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getRef());
		sb.append(" [");
		sb.append(getLabel());
		sb.append("]");
		return sb.toString();
	}

}
