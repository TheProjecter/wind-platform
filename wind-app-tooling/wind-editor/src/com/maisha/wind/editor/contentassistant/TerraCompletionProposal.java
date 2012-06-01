package com.maisha.wind.editor.contentassistant;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension6;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import com.maisha.wind.editor.model.TerraModel.Proposal;
import com.maisha.wind.editor.model.TerraModel.ProposalType;

public class TerraCompletionProposal implements ICompletionProposal, ICompletionProposalExtension6 {

	private ICompletionProposal delegate;

	private Proposal proposal;

	/**
	 * 
	 * @param proposal
	 * @param delegate
	 */
	public TerraCompletionProposal(Proposal proposal, ICompletionProposal delegate) {
		this.delegate = delegate;
		this.proposal = proposal;
	}

	@Override
	public StyledString getStyledDisplayString() {
		StyledString styledString = new StyledString(getDisplayString());
		if (!ProposalType.KEYWORD.equals(proposal.getType())) {
			styledString.append(" - " + proposal.getType(), StyledString.QUALIFIER_STYLER);
		}
		return styledString;
	}

	@Override
	public void apply(IDocument document) {
		delegate.apply(document);

	}

	@Override
	public Point getSelection(IDocument document) {
		return delegate.getSelection(document);
	}

	@Override
	public String getAdditionalProposalInfo() {
		return delegate.getAdditionalProposalInfo();
	}

	@Override
	public String getDisplayString() {
		return delegate.getDisplayString();
	}

	@Override
	public Image getImage() {
		return delegate.getImage();
	}

	@Override
	public IContextInformation getContextInformation() {
		return delegate.getContextInformation();
	}

}
