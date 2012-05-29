package com.maisha.wind.editor.editors;

import org.eclipse.jface.text.rules.*;

public class AttributeRule extends SingleLineRule {

	public AttributeRule(IToken token) {
		super("\"", "{", token);
	}

	protected boolean sequenceDetected(ICharacterScanner scanner, char[] sequence, boolean eofAllowed) {
		if(sequence[0] == '{'){
			System.out.println(String.valueOf(sequence));
			
		}
		
		return super.sequenceDetected(scanner, sequence, false);
	}
}
