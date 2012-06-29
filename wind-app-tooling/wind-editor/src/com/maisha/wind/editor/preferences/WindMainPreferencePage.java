package com.maisha.wind.editor.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Wind Main Preference Page
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class WindMainPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{

	/**
	 * Construtor configura titulo e descricao.
	 */
	public WindMainPreferencePage() {
		setTitle("Wind Preferences");
		setDescription("Customize things related to the Wind Platform");
	}

	/**
	 * 
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		new Label(container, SWT.NONE);
		return container;
	}

	/**
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		// nothing
	}

}
