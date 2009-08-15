package br.com.maisha.wind.faces.rcp;

import org.apache.log4j.Logger;
import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import br.com.maisha.wind.faces.WorkbenchWindowListener;

/**
 * This class controls all aspects of the application's execution and is
 * contributed through the plugin.xml.
 */
public class Application implements IEntryPoint {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(Application.class);

	/**  */
	private static Application app;

	/** */
	private ApplicationWorkbenchAdvisor workbenchAdvisor;

	/**
	 * 
	 * @see org.eclipse.rwt.lifecycle.IEntryPoint#createUI()
	 */
	public int createUI() {
		app = this;
		Display display = PlatformUI.createDisplay();
		workbenchAdvisor = new ApplicationWorkbenchAdvisor();
		log.debug("		Create And Run Workbench... ");

		// register listener to configure screen when window is activated...
		RCPUtil.getWorkbench().addWindowListener(
				new WorkbenchWindowListener());

		return PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
	}

	/** @see Application#workbenchAdvisor */
	public ApplicationWorkbenchAdvisor getWorkbenchAdvisor() {
		return workbenchAdvisor;
	}

	/** @see Application#app */
	public static Application getApp() {
		return app;
	}

}
