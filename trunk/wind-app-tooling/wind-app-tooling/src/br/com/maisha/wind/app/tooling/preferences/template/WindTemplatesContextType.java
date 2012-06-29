package br.com.maisha.wind.app.tooling.preferences.template;

import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateVariableResolver;

public class WindTemplatesContextType extends TemplateContextType {

	/**
	 * Default constructor.
	 */
	public WindTemplatesContextType() {
		setId("terra-files");
		addResolver(new GlobalTemplateVariables.Cursor());
		addResolver(new GlobalTemplateVariables.WordSelection());
		addResolver(new GlobalTemplateVariables.Dollar());
		addResolver(new GlobalTemplateVariables.Date());
		addResolver(new GlobalTemplateVariables.Year());
		addResolver(new GlobalTemplateVariables.Time());
		addResolver(new GlobalTemplateVariables.User());
		addResolver(new TemplateVariableResolver());
		
		addResolver(new WindTemplatesVariableResolver(WindTemplatesVariableResolver.DMO_NAME_VARIABLE, ""));
		addResolver(new WindTemplatesVariableResolver(WindTemplatesVariableResolver.PKG_VARIABLE, ""));
	}

}
