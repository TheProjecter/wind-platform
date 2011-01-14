package br.com.maisha.wind.faces.rcp;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.framework.internal.core.Msg;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

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
		final BundleContext ctx = Activator.getDefault().getBundle().getBundleContext();

		// images
		ImageDescriptor helpActionImage = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.rap.demo",
				"icons/help.gif");

		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

		// about action
		aboutAction = new Action() {
			public void run() {
				Shell shell = window.getShell();

				IApplicationRegistry appRegistry = ServiceProvider.getInstance().getService(IApplicationRegistry.class,
						ctx);
				
				StringBuffer sb = new StringBuffer();
				List<WindApplication> apps = appRegistry.retrieve();
				for(WindApplication app : apps){
					sb.append(app.getName()).append("\n");
				}

				MessageDialog.openInformation(shell, "Wind Platform", sb.toString());

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
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillStatusLine(org.eclipse.jface.action.IStatusLineManager)
	 */
	protected void fillStatusLine(IStatusLineManager statusLine) {
		statusLine.add(aboutAction);
	}

}
