package br.com.maisha.wind.faces;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchWindow;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.user.CommonUserContext;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * Listen to the changes fired by Workbench Window.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WorkbenchWindowListener implements IWindowListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(WorkbenchWindowListener.class);

	/** */
	private FacesAppModelListener listener;

	/**
	 * 
	 * @see org.eclipse.ui.IWindowListener#windowActivated(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void windowActivated(IWorkbenchWindow window) {
		log.debug("		Window Activated... starting first render.");
		BundleContext ctx = Activator.getDefault().getBundle().getBundleContext();

		// retrive application metadata model...
		IApplicationRegistry appRegistry = ServiceProvider.getInstance().getService(IApplicationRegistry.class, ctx);
		List<WindApplication> applications = appRegistry.retrieve();

		// presentation provider to render...
		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		for (WindApplication app : applications) {
			presProvider.render(app, LevelType.Application, ChangeType.Added);
		}

		log.debug("		Window is ready...");
	}

	/**
	 * 
	 * @see org.eclipse.ui.IWindowListener#windowClosed(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void windowClosed(IWorkbenchWindow window) {
		log.debug("Wind Closed");
		IAppModelListenerRegistry modelListenerReg = ServiceProvider.getInstance().getService(
				IAppModelListenerRegistry.class, Activator.getDefault().getBundle().getBundleContext());
		modelListenerReg.removeSessionAppModelListener(
				(IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT), listener);
	}

	/**
	 * 
	 * @see org.eclipse.ui.IWindowListener#windowDeactivated(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void windowDeactivated(IWorkbenchWindow window) {

	}

	/**
	 * 
	 * @see org.eclipse.ui.IWindowListener#windowOpened(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void windowOpened(IWorkbenchWindow window) {
		log.debug("Wind Opened");

		// creates a UserContext and stores it at session scope
		RWT.getSessionStore().setAttribute(IUserContext.USER_CONTEXT,
				new CommonUserContext(RWT.getSessionStore().getId()));

		// register app model listener to react to it's changes...
		IAppModelListenerRegistry modelListenerReg = ServiceProvider.getInstance().getService(
				IAppModelListenerRegistry.class, Activator.getDefault().getBundle().getBundleContext());
		listener = new FacesAppModelListener(Display.getCurrent());
		modelListenerReg.registerSessionAppModelListener(
				(IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT), listener);

	}
}
