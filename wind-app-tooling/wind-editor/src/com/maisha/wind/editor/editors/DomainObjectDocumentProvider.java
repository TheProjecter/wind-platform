package com.maisha.wind.editor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class DomainObjectDocumentProvider extends FileDocumentProvider {

	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);

		if (document != null) {
			IDocumentPartitioner partitioner = new DomainObjectPartitioner(new DomainObjectPartitionScanner(),
					new String[] {
							DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION,
							DomainObjectPartitionScanner.OPERATION_DECLARATION,
							// DomainObjectPartitionScanner.ATTRIBUTE_DECLARATION,
							DomainObjectPartitionScanner.VALIDATION_RULE_DECLARATION,
							DomainObjectPartitionScanner.IMPORT_DECLARATION,
							DomainObjectPartitionScanner.PACKAGE_DECLARATION });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}