package com.maisha.wind.editor.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

/**
 * 
 * @author pfreitas
 * 
 */
public class DomainObjectPartitionScanner extends RuleBasedPartitionScanner {

	public static final String DOMAIN_OBJECT_DECLARATION = "__dmo_dcltn__";
	public static final String OPERATION_DECLARATION = "__operation_dcltn__";
	public static final String ATTRIBUTE_DECLARATION = "__attr_dcltn__";
	public static final String VALIDATION_RULE_DECLARATION = "__validation_rule_dcltn__";
	public static final String IMPORT_DECLARATION = "__import_dcltn__";
	public static final String PACKAGE_DECLARATION = "__pkg_dcltn__";

	public DomainObjectPartitionScanner() {

		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();

		rules.add(new SingleLineRule("package", "", createToken(PACKAGE_DECLARATION)));
		rules.add(new SingleLineRule("import", "", createToken(IMPORT_DECLARATION)));
		rules.add(new SingleLineRule("domain_object", "{", createToken(DOMAIN_OBJECT_DECLARATION)));
		rules.add(new SingleLineRule("operation", "{", createToken(OPERATION_DECLARATION)));
		// rules.add(new AttributeRule(createToken(ATTRIBUTE_DECLARATION)));
		rules.add(new SingleLineRule("validationRule", "{", createToken(VALIDATION_RULE_DECLARATION)));
		

		setPredicateRules(rules.toArray(new IPredicateRule[] {}));
	}

	private IToken createToken(Object data) {
		return new Token(data);
	}
}
