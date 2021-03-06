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

	public DomainObject(String ref, String label) {
		super();
		this.ref = ref;
		this.label = label;
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
	
	

}
