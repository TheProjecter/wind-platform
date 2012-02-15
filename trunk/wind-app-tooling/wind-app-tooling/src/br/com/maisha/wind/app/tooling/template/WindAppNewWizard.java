package br.com.maisha.wind.app.tooling.template;

import org.eclipse.pde.core.plugin.IMatchRules;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.ui.templates.ITemplateSection;
import org.eclipse.pde.ui.templates.NewPluginTemplateWizard;
import org.eclipse.pde.ui.templates.PluginReference;

/**
 * 
 * @author pfreitas
 * 
 */
public class WindAppNewWizard extends NewPluginTemplateWizard {

	@Override
	public ITemplateSection[] createTemplateSections() {
		return new ITemplateSection[] { new WindAppPDETemplate() };
	}

	@Override
	public String[] getImportPackages() {
		return new String[] { "br.com.maisha.terra",
				"br.com.maisha.terra.lang", "javax.persistence" };
	}

	@Override
	public IPluginReference[] getDependencies(String schemaVersion) {

		return new IPluginReference[] {
				new PluginReference("wind_app_controller", "1.0.0",
						IMatchRules.GREATER_OR_EQUAL),
				new PluginReference("wind_common", "1.0.0",
						IMatchRules.GREATER_OR_EQUAL) };
	}
}
