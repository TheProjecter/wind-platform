package com.maisha.wind.editor.contentassistant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

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

import com.maisha.wind.editor.editors.DomainObjectPartitionScanner;
import com.maisha.wind.editor.editors.WhitespaceDetector;
import com.maisha.wind.editor.model.TerraModel;
import com.maisha.wind.editor.model.TerraModel.Proposal;
import com.maisha.wind.editor.model.TerraModel.ProposalType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObjectContentAssistantProvider implements IContentAssistProcessor {

	private static TerraTemplateCompletionProcessor templateProcessor = new TerraTemplateCompletionProcessor();

	/** */
	private ICompletionProposal[] NO_COMPLETIONS = {};

	/** Mensagens */
	private ResourceBundle messages = null;

	public DomainObjectContentAssistantProvider() {
		messages = ResourceBundle.getBundle("messages");
	}

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

			ITypedRegion nextestPartition = findNextestPartition(doc, offset);
			Integer unclosedBrackets = countUnclosedBrackets(doc, offset, nextestPartition);

			return findProposals(viewer, offset, nextestPartition, lastWord(doc, offset), unclosedBrackets > 0);
		} catch (Exception e) {
			return NO_COMPLETIONS;
		}
	}

	/**
	 * 
	 * @return
	 */
	private ICompletionProposal[] findProposals(ITextViewer viewer, int offset, ITypedRegion nextestPartition,
			String lastWord, boolean openBrackets) {
		List<ICompletionProposal> ret = new ArrayList<ICompletionProposal>();

		Proposal[] propsals = new Proposal[0];
		if (DomainObjectPartitionScanner.ATTRIBUTE_DECLARATION.equals(nextestPartition.getType()) && openBrackets) {

			// procura por uma propriedade aberta (property_name: ); caso encontre, sugere palavras para essa propriedade.
			String lastProperty = detectProperty(viewer, offset);
			if (lastProperty != null && !lastProperty.isEmpty()) {
				propsals = TerraModel.findProposalsForProperty(lastProperty);
			} else {
				propsals = TerraModel.findAttributeProperties();
			}
		} else if (DomainObjectPartitionScanner.OPERATION_DECLARATION.equals(nextestPartition.getType())
				&& openBrackets) {
			propsals = TerraModel.findOperationProperties();
		} else if (DomainObjectPartitionScanner.IMPORT_DECLARATION.equals(nextestPartition.getType())
				|| DomainObjectPartitionScanner.PACKAGE_DECLARATION.equals(nextestPartition.getType())) {
			propsals = new Proposal[] { new Proposal("import", ProposalType.KEYWORD) };

		} else if (DomainObjectPartitionScanner.DOMAIN_OBJECT_DECLARATION.equals(nextestPartition.getType())
				|| IDocument.DEFAULT_CONTENT_TYPE.equals(nextestPartition.getType()) || !openBrackets) {
			List<Proposal> proposalsLst = new ArrayList<TerraModel.Proposal>();
			proposalsLst.addAll(Arrays.asList(TerraModel.findDomainObjectProperties()));
			propsals = proposalsLst.toArray(new Proposal[] {});

			// templates when u are in a dmo declaration
			ret.addAll(Arrays.asList(templateProcessor.computeCompletionProposals(viewer, offset)));
		}

		for (Proposal p : propsals) {
			if (p.getText().startsWith(lastWord)) {
				ret.add(toCompletionProposal(p, offset - lastWord.length(), lastWord.length()));
			}
		}

		return ret.toArray(new ICompletionProposal[] {});
	}

	private String detectProperty(ITextViewer viewer, int offset) {
		StringBuffer lastProperty = new StringBuffer();
		try {
			WhitespaceDetector wh = new WhitespaceDetector();
			
			int offsetCopy = offset - 1;
			char ch = ' ';
			while (ch != ':' && wh.isWhitespace(ch)) {
				ch = viewer.getDocument().getChar(offsetCopy--);
			}

			if (ch == ':') {
				ch = viewer.getDocument().getChar(offsetCopy--);
				while (wh.isWhitespace(ch)) {
					ch = viewer.getDocument().getChar(offsetCopy--);
				}

				while (!wh.isWhitespace(ch)) {
					lastProperty.append(ch);
					ch = viewer.getDocument().getChar(offsetCopy--);
				}
			}
		} catch (BadLocationException e) {
			// nothing
		}
		return lastProperty.reverse().toString();
	}

	/**
	 * 
	 * @return
	 */
	private ICompletionProposal toCompletionProposal(Proposal proposal, int offset, int replacementLength) {
		String additionalInfo = "";
		if (messages != null) {
			try {
				additionalInfo = messages.getString("br.com.maisha.assistant.info." + proposal.getText());
			} catch (MissingResourceException mre) {
				additionalInfo = "";
			}
		}
		return new TerraCompletionProposal(proposal, new CompletionProposal(proposal.getText(), offset,
				replacementLength, proposal.getText().length(), proposal.getType().createImage(),
				proposal.getDisplayText(), null, additionalInfo));
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
