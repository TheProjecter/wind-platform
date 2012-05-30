package com.maisha.wind.editor.contentassistant;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import com.maisha.wind.editor.Activator;
import com.maisha.wind.editor.editors.DomainObjectPartitionScanner;
import com.maisha.wind.editor.model.TerraModel;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObjectContentAssistantProvider implements IContentAssistProcessor {

	/** */
	private ICompletionProposal[] NO_COMPLETIONS = {};

	/**
	 * 
	 * @param doc
	 * @param offset
	 * @return
	 * @throws BadLocationException
	 */
	private ITypedRegion findNextestPartition(IDocument doc, int offset) throws BadLocationException {
		ITypedRegion partition = doc.getPartition(offset);
		if (IDocument.DEFAULT_CONTENT_TYPE.equals(partition.getType())) {
			for (int i = offset; i >= 0; i--) {
				ITypedRegion region = doc.getPartition(i);
				if (!IDocument.DEFAULT_CONTENT_TYPE.equals(region.getType())) {
					return region;
				}
			}

		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer,
	 *      int)
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		try {
			IDocument doc = viewer.getDocument();

			ITypedRegion region = findNextestPartition(doc, offset);
			Integer unclosedBrackets = countUnclosedBrackets(doc, offset, region);

			return findProposals(offset, region, lastWord(doc, offset), unclosedBrackets > 0);
		} catch (Exception e) {
			return NO_COMPLETIONS;
		}
	}

	/**
	 * 
	 * @return
	 */
	private ICompletionProposal[] findProposals(int offset, ITypedRegion region, String lastWord, boolean openBrackets) {
		List<ICompletionProposal> ret = new ArrayList<ICompletionProposal>();

		String[] propsals = new String[0];
		if (DomainObjectPartitionScanner.ATTRIBUTE_DECLARATION.equals(region.getType()) && openBrackets) {
			propsals = TerraModel.findAttributeProperties();
		} else if (DomainObjectPartitionScanner.OPERATION_DECLARATION.equals(region.getType()) && openBrackets) {
			propsals = TerraModel.findOperationProperties();
		} else if (DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION.equals(region.getType())
				|| IDocument.DEFAULT_CONTENT_TYPE.equals(region.getType()) || !openBrackets) {
			propsals = TerraModel.findDomainObjectKeywords();
		}

		for (String p : propsals) {
			if (p.startsWith(lastWord)) {
				ret.add(toCompletionProposal(p, offset - lastWord.length(), lastWord.length()));
			}
		}

		return ret.toArray(new ICompletionProposal[] {});
	}

	/**
	 * 
	 * @return
	 */
	private ICompletionProposal toCompletionProposal(String text, int offset, int replacementLength) {
		ImageDescriptor id = Activator.getImageDescriptor("icons/sample.gif");
		ContextInformation info = new ContextInformation(id.createImage(), "Display", "Information");
		return new CompletionProposal(text, offset, replacementLength, text.length(), null, text, info,
				"<b>Param:</b><br/>" + text + " bla bla bla bla");

	}

	/**
	 * 
	 * @param doc
	 * @param offset
	 * @param nextestRegion
	 * @return
	 * @throws BadLocationException
	 */
	private Integer countUnclosedBrackets(IDocument doc, int offset, ITypedRegion nextestRegion)
			throws BadLocationException {
		Integer cntCloses = 0;
		Integer cntOpenings = 0;

		if (offset > nextestRegion.getOffset()) {
			for (int i = offset; i >= nextestRegion.getOffset(); i--) {
				if (doc.getChar(i) == '}') {
					cntCloses++;
				}

				if (doc.getChar(i) == '{') {
					cntOpenings++;
				}
			}
		}

		return cntOpenings - cntCloses;
	}

	/**
	 * 
	 * @param doc
	 * @param offset
	 * @return
	 */
	private String lastWord(IDocument doc, int offset) {
		try {
			for (int n = offset - 1; n >= 0; n--) {
				char c = doc.getChar(n);
				if (!Character.isJavaIdentifierPart(c))
					return doc.get(n + 1, offset - n - 1);
			}
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer,
	 *      int)
	 */
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return new IContextInformation[] { new ContextInformation("cInfo", "Context Info") };
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	public String getErrorMessage() {
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

}
