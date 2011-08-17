package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class TerraWhiteSpaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		return Character.isWhitespace(c);
	}

}
