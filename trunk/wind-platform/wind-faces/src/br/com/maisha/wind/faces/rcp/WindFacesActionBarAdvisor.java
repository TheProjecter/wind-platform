package br.com.maisha.wind.faces.rcp;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Creates, adds and disposes actions for the menus and action bars of each
 * workbench window.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindFacesActionBarAdvisor extends ActionBarAdvisor {

	/** Log ref. */
	private static final Logger log = Logger
			.getLogger(WindFacesActionBarAdvisor.class);

	/**
	 * 
	 * @param configurer
	 */
	public WindFacesActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/** */
	private IWorkbenchAction exitAction;

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
	 */
	protected void makeActions(IWorkbenchWindow window) {
		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

	}

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
	 */
	protected void fillMenuBar(IMenuManager menuBar) {
		log.debug("Filling Menu Bar... ");
		MenuManager fileMenu = new MenuManager("&File",
				IWorkbenchActionConstants.M_FILE);
		menuBar.add(fileMenu);
		fileMenu.add(exitAction);

		// group marker for application menus...
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		log.debug("Menu Bar filled... ");
	}

}
