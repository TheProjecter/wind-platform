package com.maisha.wind.editor.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

/**
 * Identificador basico de tokens.
 * <p/>
 * Usado para highlight.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class BasicTokenScanner extends RuleBasedScanner {

	/**
	 * Construtor configura os tokens basicos.
	 * 
	 * @param colorManager
	 *            Color Manager
	 */
	public BasicTokenScanner(ColorManager colorManager) {

		TextAttribute textAttribute = new TextAttribute(colorManager.getColor(ColorConstants.STRING));
		IToken stringToken = new Token(textAttribute);

		TextAttribute keywordAttribute = new TextAttribute(colorManager.getColor(ColorConstants.KEYWORD), null,
				SWT.BOLD);
		IToken keywordToken = new Token(keywordAttribute);

		TextAttribute propertyNameAttribute = new TextAttribute(colorManager.getColor(ColorConstants.PROPERTY_NAME));
		IToken propertyNameToken = new Token(propertyNameAttribute);

		IRule[] rules = new IRule[4];

		// Add rule for string literal
		rules[0] = new SingleLineRule("\"", "\"", stringToken, '\\');

		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new WhitespaceDetector());

		// Add rule for keyword
		WordRule keywordRule = new WordRule(new WordDetector());
		for (String keywordStr : getKeywords()) {
			keywordRule.addWord(keywordStr, keywordToken);
		}
		rules[2] = keywordRule;

		// Add rule for property names
		WordRule propertyNameRule = new WordRule(new WordDetector());
		for (String keywordStr : getPropertyNames()) {
			propertyNameRule.addWord(keywordStr, propertyNameToken);
		}
		rules[3] = propertyNameRule;

		setRules(rules);

		TextAttribute dftTextAttribute = new TextAttribute(colorManager.getColor(ColorConstants.DEFAULT));
		Token token = new Token(dftTextAttribute);
		setDefaultReturnToken(token);
	}

	/**
	 * Retorna as palavras chaves da linguagem Terra.
	 * 
	 * @return Palavras chaves.
	 */
	private String[] getKeywords() {
		return new String[] { "domain_object", "package", "import", "validationRule", "operation", "java", "python",
				"groovy", "using" };
	}

	/**
	 * Retorna as palavras usadas como nomes de propriedades na linguagem Terra.
	 * 
	 * @return Nomes das propriedades.
	 */
	private String[] getPropertyNames() {
		return new String[] { "presentation_type", "text", "radio", "checkbox", "combo", "list", "textarea", "date",
				"related", "embedded_object", "group", "x", "y", "colspan", "rowspan", "disabled", "icon", "width",
				"height", "tooltip", "folder", "parent_group", "visibleInEdition", "visibleInGrid", "content", "value",
				"validValues", "validation", "required", "max_length", "min_length", "range", "mask", "event",
				"toString", "onetomany", "manytoone", "transient", "class", "file", "validWhen", "is_filter",
				"validate", "open_filtering", "event_handler", "sequence", "visible", "false" };
	}
}
