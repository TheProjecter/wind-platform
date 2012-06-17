package com.maisha.wind.editor.contentassistant;

import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateVariableResolver;


public class TerraTemplateContextTypes extends TemplateContextType {
	
	public static final String DMO_MEMBERS = "dmo-members"; //$NON-NLS-1$

	public static final String TERRA_FILES = "terra-files";

	/**
	 * Default constructor.
	 */
	public TerraTemplateContextTypes() {
		addResolver(new GlobalTemplateVariables.Cursor());
		addResolver(new GlobalTemplateVariables.WordSelection());
		addResolver(new GlobalTemplateVariables.Dollar());
		addResolver(new GlobalTemplateVariables.Date());
		addResolver(new GlobalTemplateVariables.Year());
		addResolver(new GlobalTemplateVariables.Time());
		addResolver(new GlobalTemplateVariables.User());
		addResolver(new TemplateVariableResolver());

		addResolver(new OperationTypeVariableResolver("lang", "none"));
	}
}
