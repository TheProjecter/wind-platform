package com.maisha.wind.editor.editors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;

import com.maisha.wind.editor.model.TerraModel;
import com.maisha.wind.editor.model.TerraModel.Proposal;

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
		for (Proposal p : TerraModel.findAllKeywords()) {
			keywordRule.addWord(p.getText(), keywordToken);
		}
		rules[2] = keywordRule;

		// Add rule for property names
		WordRule propertyNameRule = new WordRule(new WordDetector());
		for (Proposal p : getPropertyNames()) {
			propertyNameRule.addWord(p.getText(), propertyNameToken);
		}
		rules[3] = propertyNameRule;

		setRules(rules);

		TextAttribute dftTextAttribute = new TextAttribute(colorManager.getColor(ColorConstants.DEFAULT));
		Token token = new Token(dftTextAttribute);
		setDefaultReturnToken(token);
	}


	/**
	 * Retorna as palavras usadas como nomes de propriedades na linguagem Terra.
	 * 
	 * @return Nomes das propriedades.
	 */
	private Proposal[] getPropertyNames() {
		List<Proposal> allProperties = new ArrayList<Proposal>();
		allProperties.addAll(Arrays.asList(TerraModel.findAttributeProperties()));
		allProperties.addAll(Arrays.asList(TerraModel.findDomainObjectProperties()));
		allProperties.addAll(Arrays.asList(TerraModel.findOperationProperties()));
		return allProperties.toArray(new Proposal[]{});
	}
}
