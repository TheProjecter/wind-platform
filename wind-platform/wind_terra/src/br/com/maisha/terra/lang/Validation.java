package br.com.maisha.terra.lang;

import java.util.List;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class Validation extends TerraClass {

	private String ref;
	
	private List<ValidationRule> rules;

	
	
	public Validation(String ref) {
		this.ref = ref;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public List<ValidationRule> getRules() {
		return rules;
	}

	public void setRules(List<ValidationRule> rules) {
		this.rules = rules;
	}
	
	
	
	
}
