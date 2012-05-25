package com.maisha.wind.editor.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import com.maisha.wind.editor.contentassistant.DomainObjectContentAssistantProvider;
import com.maisha.wind.editor.contentassistant.ImportContentAssistantProvider;

/**
 * Editor Configuration.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class DomainObjectEditorConfiguration extends SourceViewerConfiguration {

	/** Color Manager. */
	private ColorManager colorManager;

	/** Basic Scanner. */
	private RuleBasedScanner basicScanner;

	/**
	 * 
	 * @param colorManager
	 */
	public DomainObjectEditorConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE, DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION,
				DomainObjectPartitionScanner.OPERATION_DECLARATION,
				// DomainObjectPartitionScanner.ATTRIBUTE_DECLARATION,
				DomainObjectPartitionScanner.VALIDATION_RULE_DECLARATION,
				DomainObjectPartitionScanner.IMPORT_DECLARATION, DomainObjectPartitionScanner.PACKAGE_DECLARATION };

	}

	/**
	 * Obtem o Basic Scanner usado no syntax coloring.
	 * 
	 * @return Basic Scanner.
	 */
	private RuleBasedScanner getBasicScanner() {
		if (basicScanner == null) {
			basicScanner = new BasicTokenScanner(colorManager);
		}
		return basicScanner;
	}

	/**
	 * PresentationReconciler para os divertos tipos de particionamento do
	 * documento.
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION);
		reconciler.setRepairer(dr, DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION);

		dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, DomainObjectPartitionScanner.OPERATION_DECLARATION);
		reconciler.setRepairer(dr, DomainObjectPartitionScanner.OPERATION_DECLARATION);

		dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, DomainObjectPartitionScanner.PACKAGE_DECLARATION);
		reconciler.setRepairer(dr, DomainObjectPartitionScanner.PACKAGE_DECLARATION);

		dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, DomainObjectPartitionScanner.IMPORT_DECLARATION);
		reconciler.setRepairer(dr, DomainObjectPartitionScanner.IMPORT_DECLARATION);

		dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, DomainObjectPartitionScanner.VALIDATION_RULE_DECLARATION);
		reconciler.setRepairer(dr, DomainObjectPartitionScanner.VALIDATION_RULE_DECLARATION);

		dr = new DefaultDamagerRepairer(getBasicScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return reconciler;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getContentAssistant(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setStatusLineVisible(true);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		
		IContentAssistProcessor tagContentAssistProcessor = new ImportContentAssistantProvider();
		assistant.setContentAssistProcessor(tagContentAssistProcessor, IDocument.DEFAULT_CONTENT_TYPE);
		assistant.setContentAssistProcessor(new DomainObjectContentAssistantProvider(), IDocument.DEFAULT_CONTENT_TYPE);
		return assistant;

	}
}