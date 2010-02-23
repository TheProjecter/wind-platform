package br.com.maisha.wind.faces.rcp;

import org.eclipse.swt.SWT;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	private WindFacesActionBarAdvisor actionBarAdvisor;

	public ApplicationWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		actionBarAdvisor = new WindFacesActionBarAdvisor(configurer);
		return actionBarAdvisor;
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
	    configurer.setShowCoolBar( true );
	    configurer.setTitle( "Wind" );
	    configurer.setShellStyle( SWT.TITLE | SWT.MAX | SWT.RESIZE );
	    configurer.setShowProgressIndicator( true );
	}
	
	public WindFacesActionBarAdvisor getActionBarAdvisor() {
		return actionBarAdvisor;
	}
}
