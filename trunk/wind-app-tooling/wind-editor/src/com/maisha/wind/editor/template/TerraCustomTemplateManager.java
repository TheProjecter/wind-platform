package com.maisha.wind.editor.template;

import java.io.IOException;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.ui.editors.text.templates.ContributionContextTypeRegistry;
import org.eclipse.ui.editors.text.templates.ContributionTemplateStore;

import com.maisha.wind.editor.Activator;
import com.maisha.wind.editor.contentassistant.TerraTemplateContextTypes;

/**
 * Stores and manages template for haxe code.
 */
public class TerraCustomTemplateManager {
	private static final String CUSTOM_TEMPLATES_KEY = Activator.PLUGIN_ID + ".customtemplates";
	private static TerraCustomTemplateManager instance;
	private TemplateStore fStore;
	private ContributionContextTypeRegistry fRegistry;

	private TerraCustomTemplateManager() {
	}

	/**
	 * @return Instance of manager.
	 */
	public static TerraCustomTemplateManager getInstance() {
		if (instance == null) {
			instance = new TerraCustomTemplateManager();
		}
		return instance;
	}

	/**
	 * @return Templates store.
	 */
	public TemplateStore getTemplateStore() {
		if (fStore == null) {
			fStore = new ContributionTemplateStore(getContextTypeRegistry(), Activator.getDefault()
					.getPreferenceStore(), CUSTOM_TEMPLATES_KEY);
			try {
				fStore.load();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
		return fStore;
	}

	/**
	 * Get context type registry.
	 * 
	 * @return Get context type registry.
	 */
	public ContextTypeRegistry getContextTypeRegistry() {
		if (fRegistry == null) {
			fRegistry = new ContributionContextTypeRegistry();

			fRegistry.addContextType(TerraTemplateContextTypes.DMO_MEMBERS);
			fRegistry.addContextType(TerraTemplateContextTypes.TERRA_FILES);
		}

		return fRegistry;
	}

	IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	void savePluginPreferences() {
		// EclihxUIPlugin.flushInstanceScope();
	}
}