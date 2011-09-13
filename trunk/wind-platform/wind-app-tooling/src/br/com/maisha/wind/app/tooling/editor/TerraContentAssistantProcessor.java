package br.com.maisha.wind.app.tooling.editor;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class TerraContentAssistantProcessor implements IContentAssistProcessor {

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		try {
			IDocument document = viewer.getDocument();
			int currOffset = offset - 1;

			String currWord = "";
			char currChar;
			while (currOffset > 0
					&& !Character.isWhitespace(currChar = document
							.getChar(currOffset))) {
				currWord = currChar + currWord;
				currOffset--;
			}

			ITypedRegion partition = document.getPartition(offset);
			partition.toString();

			printPartitions(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void printPartitions(IDocument document) {
		StringBuffer buffer = new StringBuffer();
		try {
			ITypedRegion[] partitions = document.computePartitioning(0,
					document.getLength());
			for (int i = 0; i < partitions.length; i++) {

				buffer.append("Partition type: " + partitions[i].getType()
						+ ", offset: " + partitions[i].getOffset()
						+ ", length: " + partitions[i].getLength());
				buffer.append("\n");
				buffer.append("Text:\n");
				buffer.append(document.get(partitions[i].getOffset(),
						partitions[i].getLength()));
				buffer.append("\n---------------------------\n\n\n");

			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		System.out.print(buffer);
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}

}
