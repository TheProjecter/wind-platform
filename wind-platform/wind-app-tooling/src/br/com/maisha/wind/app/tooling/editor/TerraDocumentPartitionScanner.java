package br.com.maisha.wind.app.tooling.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class TerraDocumentPartitionScanner extends RuleBasedPartitionScanner {

	public final static String ATTRIBUTE = "attribute";
	public final static String OPERATION = "operation";

	public final static String[] PARTITION_TYPES = new String[] { ATTRIBUTE,
			OPERATION };

	public TerraDocumentPartitionScanner() {
		super();

		IToken attr = new Token(ATTRIBUTE);
		IToken operation = new Token(OPERATION);

		List<PatternRule> rules = new ArrayList<PatternRule>();

		rules.add(new MultiLineRule("folder", "}", attr, (char) 0, true));
		rules.add(new MultiLineRule("operation", "}", operation, (char) 0, true));

		IPredicateRule[] result = new IPredicateRule[rules.size()];
		rules.toArray(result);
		setPredicateRules(result);
	}

}
