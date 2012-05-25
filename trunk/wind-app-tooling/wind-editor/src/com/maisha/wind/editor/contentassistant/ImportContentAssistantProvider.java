package com.maisha.wind.editor.contentassistant;

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
import org.eclipse.jface.text.rules.RuleBasedScanner;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ImportContentAssistantProvider implements IContentAssistProcessor {

	private ICompletionProposal[] NO_COMPLETIONS = {};

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer,
	 *      int)
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		try {
			IDocument doc = viewer.getDocument();
			ITypedRegion partition = doc.getPartition(offset);
			System.out.println("Computing completionProposals for " + partition);

			String lastWord = lastWord(doc, offset);
			String importWord = "import";
			if (lastWord != null && lastWord.length() > 0 && importWord.startsWith(lastWord)) {
				IContextInformation info = new ContextInformation(importWord, importWord + "Info");
				CompletionProposal completion = new CompletionProposal(importWord, offset, 0, importWord.length(),
						null, importWord, info, importWord + "INFO");

				return new ICompletionProposal[] { completion };
			}
		} catch (Exception e) {
			return NO_COMPLETIONS;
		}
		return NO_COMPLETIONS;

	}

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

	private String lastIndent(IDocument doc, int offset) {
		try {
			int start = offset - 1;
			while (start >= 0 && doc.getChar(start) != '\n')
				start--;
			int end = start;
			while (end < offset && Character.isSpaceChar(doc.getChar(end)))
				end++;
			return doc.get(start + 1, end - start - 1);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return new IContextInformation[]{new ContextInformation("cInfo", "Context Info")};
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { 'i', 'm', 'p', 'o', 'r' };
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

}
