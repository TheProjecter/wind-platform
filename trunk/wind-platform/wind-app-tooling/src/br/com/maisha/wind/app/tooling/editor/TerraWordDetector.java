package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.jface.text.rules.IWordDetector;

public class TerraWordDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		return Character.isJavaIdentifierStart(c);
	}

	public boolean isWordPart(char c) {
		return Character.isJavaIdentifierPart(c);
	}

}
