package br.com.maisha.wind.faces.rcp;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * This workbench advisor creates the window advisor, and specifies the
 * perspective id for the initial window.
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "wind_faces.perspective";

	private ApplicationWorkbenchWindowAdvisor workbenchWindowAdvisor;

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		workbenchWindowAdvisor = new ApplicationWorkbenchWindowAdvisor(configurer);
		return workbenchWindowAdvisor;
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	
	public ApplicationWorkbenchWindowAdvisor getWorkbenchWindowAdvisor() {
		return workbenchWindowAdvisor;
	}
}
