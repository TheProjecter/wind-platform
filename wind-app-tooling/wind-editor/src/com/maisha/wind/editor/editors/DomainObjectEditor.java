package com.maisha.wind.editor.editors;

import org.eclipse.ui.editors.text.TextEditor;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObjectEditor extends TextEditor {

	/** Color Manager */
	private ColorManager colorManager;

	/** */
	public DomainObjectEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new DomainObjectEditorConfiguration(colorManager));
		setDocumentProvider(new DomainObjectDocumentProvider());
	}

	/***
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#dispose()
	 */
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
