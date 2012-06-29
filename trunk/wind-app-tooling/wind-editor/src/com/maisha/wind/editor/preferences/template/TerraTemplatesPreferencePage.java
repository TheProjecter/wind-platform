package com.maisha.wind.editor.preferences.template;

import org.eclipse.ui.texteditor.templates.TemplatePreferencePage;

import com.maisha.wind.editor.Activator;

/**
 * 
 * @author pfreitas
 *
 */
public class TerraTemplatesPreferencePage extends TemplatePreferencePage{

	/**
	 * Identifier of the preference page.
	 */
	public static final String ID = "com.maisha.wind.editor.editors.TemplatgesPreferencePage";

	/**
	 * Default constructor.
	 */
	public TerraTemplatesPreferencePage() {
		try {
			setPreferenceStore(Activator.getDefault().getPreferenceStore());
			setTemplateStore(TerraCustomTemplateManager.getInstance().getTemplateStore());
			setContextTypeRegistry(TerraCustomTemplateManager.getInstance().getContextTypeRegistry());
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	@Override
	protected boolean isShowFormatterSetting() {
		return true;
	}

	@Override
	public boolean performOk() {
		boolean ok = super.performOk();
		return ok;
	}
	
}
