package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.jface.text.IDocument;
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
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				TerraDocumentPartitionScanner.MULTILINE_COMMENT,
				TerraDocumentPartitionScanner.SINGLELINE_COMMENT,
				TerraDocumentPartitionScanner.STRING };

	}

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sv) {
		PresentationReconciler rec = new PresentationReconciler();
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				new TerraCodeScanner(new ColorProvider()));
		rec.setDamager(dr, TerraDocumentPartitionScanner.STRING);
		rec.setRepairer(dr, TerraDocumentPartitionScanner.STRING);

		dr = new DefaultDamagerRepairer(new TerraCodeScanner(
				new ColorProvider()));
		rec.setDamager(dr, TerraDocumentPartitionScanner.MULTILINE_COMMENT);
		rec.setRepairer(dr, TerraDocumentPartitionScanner.MULTILINE_COMMENT);

		dr = new DefaultDamagerRepairer(new TerraCodeScanner(
				new ColorProvider()));
		rec.setDamager(dr, TerraDocumentPartitionScanner.SINGLELINE_COMMENT);
		rec.setRepairer(dr, TerraDocumentPartitionScanner.SINGLELINE_COMMENT);

		dr = new DefaultDamagerRepairer(new TerraCodeScanner(
				new ColorProvider()));
		rec.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		rec.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		return rec;
	}

}
