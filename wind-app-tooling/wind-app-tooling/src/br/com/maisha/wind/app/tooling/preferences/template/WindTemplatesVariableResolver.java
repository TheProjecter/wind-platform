package br.com.maisha.wind.app.tooling.preferences.template;

import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindTemplatesVariableResolver extends SimpleTemplateVariableResolver {

	/** */
	public static final String PKG_VARIABLE = "pkg";
	
	/** */
	public static final String DMO_NAME_VARIABLE = "dmoName";
	
	/**
	 * 
	 * @param type
	 * @param description
	 */
	public WindTemplatesVariableResolver(String type, String description) {
		super(type, description);
	}

	/**
	 * 
	 * @see org.eclipse.jface.text.templates.TemplateVariableResolver#resolve(org.eclipse.jface.text.templates.TemplateVariable,
	 *      org.eclipse.jface.text.templates.TemplateContext)
	 */
	protected String resolve(TemplateContext context) {
		String value = context.getVariable(this.getType());
		if (value == null)
			return "";
		return value;
	}
}
