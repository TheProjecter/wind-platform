package br.com.maisha.wind.app.tooling.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

public class TerraCodeScanner extends RuleBasedScanner {

	private static String[] fgKeywords = { "package", "import",
			"domain_object", "operation" };

	private static String[] attrKeywords = { "visible", "presentation_type",
			"rowspan", "width", "height", "sequence", "x", "y", "colspan" };

	public TerraCodeScanner(ColorProvider colorProvider) {

		IToken keyword = new Token(new TextAttribute(
				colorProvider.getColor(ColorProvider.KEYWORD), null, SWT.BOLD));
		IToken string = new Token(new TextAttribute(
				colorProvider.getColor(ColorProvider.STRING)));
		IToken comment = new Token(new TextAttribute(
				colorProvider.getColor(ColorProvider.SINGLE_LINE_COMMENT)));
		IToken other = new Token(new TextAttribute(
				colorProvider.getColor(ColorProvider.DEFAULT)));

		IToken attrKeyword = new Token(new TextAttribute(
				colorProvider.getColor(ColorProvider.ATTR)));

		List<IRule> rules = new ArrayList<IRule>();
		// Add rule for single line comments.
		rules.add(new EndOfLineRule("//", comment));
		rules.add(new MultiLineRule("/*", "*/", comment, (char) 0, true));
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		
		rules.add(new WhitespaceRule(new TerraWhiteSpaceDetector()));

		// Add word rule for keywords.
		WordRule wordRule = new WordRule(new TerraWordDetector(), other);
		for (int i = 0; i < fgKeywords.length; i++)
			wordRule.addWord(fgKeywords[i], keyword);

		for (int i = 0; i < attrKeywords.length; i++)
			wordRule.addWord(attrKeywords[i], attrKeyword);

		rules.add(wordRule);

		IRule[] result = new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);

	}
}
