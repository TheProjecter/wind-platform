package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * 
 * @author pfreitas
 *
 */
public class DomainObjectEditor extends TextEditor {
	
	public DomainObjectEditor() {
		super();
		setDocumentProvider(new DomainObjectDocumentProvider());
	}
	
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setSourceViewerConfiguration(new TerraSourceViwerConfiguration());
	}
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		super.doSave(progressMonitor);
	}
	

}
