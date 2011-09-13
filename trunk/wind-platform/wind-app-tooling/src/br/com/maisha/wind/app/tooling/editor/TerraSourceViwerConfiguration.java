package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import br.com.maisha.wind.app.tooling.Activator;

public class TerraSourceViwerConfiguration extends SourceViewerConfiguration {

	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return Activator.TERRA_PARTITIONING;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return TerraDocumentPartitionScanner.PARTITION_TYPES;

	}

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sv) {
		PresentationReconciler rec = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				new TerraCodeScanner(new ColorProvider()));
		rec.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		rec.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		dr = new DefaultDamagerRepairer(new TerraCodeScanner(
				new ColorProvider()));
		rec.setDamager(dr, TerraDocumentPartitionScanner.ATTRIBUTE);
		rec.setRepairer(dr, TerraDocumentPartitionScanner.ATTRIBUTE);

		dr = new DefaultDamagerRepairer(new TerraCodeScanner(
				new ColorProvider()));
		rec.setDamager(dr, TerraDocumentPartitionScanner.OPERATION);
		rec.setRepairer(dr, TerraDocumentPartitionScanner.OPERATION);

		return rec;
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {

		ContentAssistant ca = new ContentAssistant();
		ca.setDocumentPartitioning(IDocument.DEFAULT_CONTENT_TYPE);
		ca.setContentAssistProcessor(new TerraContentAssistantProcessor(),
				IDocument.DEFAULT_CONTENT_TYPE);
		ca.setAutoActivationDelay(0);
		ca.enableAutoActivation(true);
		return ca;
	}

}
