package br.com.maisha.wind.app.tooling.template;

import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.ui.templates.OptionTemplateSection;
import org.osgi.framework.Bundle;

import br.com.maisha.wind.app.tooling.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindAppPDETemplate extends OptionTemplateSection {

	/**
	 * 
	 */
	public WindAppPDETemplate() {
		setPageCount(0);
		setOptionEnabled("Next", false);
	}


	@Override
	public void addPages(Wizard wizard) {
	}

	@Override
	public String[] getNewFiles() {
		return new String[0];
	}

	@Override
	public String getUsedExtensionPoint() {
		return "";
	}

	@Override
	protected URL getInstallURL() {		
		return Activator.getDefault().getInstallURL();
	}

	@Override
	public String getSectionId() {
		return "basic-wind-app";
	}

	@Override
	protected ResourceBundle getPluginResourceBundle() {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		return Platform.getResourceBundle(bundle);
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {

	}

	@Override
	protected void generateFiles(IProgressMonitor monitor, URL locationUrl)
			throws CoreException {
		super.generateFiles(monitor, locationUrl);



	}

	@Override
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}

}
