package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Paulo
 * 
 */
public class DomainObject extends TerraClass {

	private String ref;

	private String label;

	private List<Attribute> atts = new ArrayList<Attribute>();

	private List<Import> imports = new ArrayList<Import>();

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
		this.atts = atts;
	}

	public List<Import> getImports() {
		return imports;
	}

	public void setImports(List<Import> imports) {
		this.imports = imports;
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
