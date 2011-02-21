package br.com.maisha.wind.faces.rcp;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.faces.view.AboutView;

/**
 * Creates, adds and disposes actions for the menus and action bars of each
 * workbench window.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindFacesActionBarAdvisor extends ActionBarAdvisor {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(WindFacesActionBarAdvisor.class);

	/**
	 * 
	 * @param configurer
	 */
	public WindFacesActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/** */
	private IWorkbenchAction exitAction;

	/** */
	private Action aboutAction;

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
	 */
	protected void makeActions(final IWorkbenchWindow window) {
		// images
		ImageDescriptor helpActionImage = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.rap.demo",
				"icons/help.gif");

		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

		// about action
		aboutAction = new Action() {
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(AboutView.ID, null,
							IWorkbenchPage.VIEW_VISIBLE);
				} catch (PartInitException e) {
					ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
				}

			}
		};
		aboutAction.setText("About");
		aboutAction.setId("org.eclipse.rap.demo.about");
		aboutAction.setImageDescriptor(helpActionImage);
	}

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
	 */
	protected void fillMenuBar(IMenuManager menuBar) {
		log.debug("Filling Menu Bar... ");
		MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		menuBar.add(fileMenu);
		fileMenu.add(exitAction);

		// group marker for application menus...
		menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		log.debug("Menu Bar filled... ");
	}

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
	 */
	protected void fillCoolBar(ICoolBarManager coolBar) {
		IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.LEFT);
		toolbar.add(aboutAction);
		coolBar.add(toolbar);
	}

	/**
	 * 
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillStatusLine(org.eclipse.jface.action.IStatusLineManager)
	 */
	protected void fillStatusLine(IStatusLineManager statusLine) {
		statusLine.add(aboutAction);
	}

}
