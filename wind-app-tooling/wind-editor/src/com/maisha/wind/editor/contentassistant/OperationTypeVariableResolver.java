package com.maisha.wind.editor.contentassistant;

import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.jface.text.templates.TemplateVariableResolver;

public class OperationTypeVariableResolver extends TemplateVariableResolver {

	private String[] fProposals;

	public OperationTypeVariableResolver() {
		super();
	}

	public OperationTypeVariableResolver(String type, String description) {
		super(type, description);
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateVariableResolver#resolve(org.eclipse.jface.text.templates.TemplateVariable,
	 *      org.eclipse.jface.text.templates.TemplateContext)
	 */
	public void resolve(TemplateVariable variable, TemplateContext context) {
		variable.setUnambiguous(false);
		fProposals = new String[] { "java", "groovy", "python"};
		super.resolve(variable, context);
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateVariableResolver#resolveAll(org.eclipse.jface.text.templates.TemplateContext)
	 */
	protected String[] resolveAll(TemplateContext context) {
		return fProposals;
	}
}
