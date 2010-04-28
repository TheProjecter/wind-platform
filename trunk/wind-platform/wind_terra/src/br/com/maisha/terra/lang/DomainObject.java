package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;

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

	public Attribute getAttribute(String name) {
		for (Attribute attr : atts) {
			if (attr.getRef().equals(name)) {
				return attr;
			}
		}
		return null;
	}
	
	public Attribute attribute(String name){
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
