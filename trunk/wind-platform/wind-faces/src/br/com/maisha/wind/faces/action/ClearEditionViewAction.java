package br.com.maisha.wind.faces.action;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.util.Constants;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ClearEditionViewAction extends Action implements IWorkbenchAction {

	/** LOG ref. */
	private static final Logger log = Logger.getLogger(ClearEditionViewAction.class);

	/** */
	private DomainObject object;

	/** */
	private IApplicationController appController;

	/**
	 * 
	 * @param object
	 * @param ref
	 */
	public ClearEditionViewAction(DomainObject object) {
		setId("wind.faces.edition.clear");

		String labelClear = PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageview.clear");

		setImageDescriptor(ImageDescriptor.createFromImage(Activator.getImageDescriptor("icons/clear.gif").createImage()));

		setDescription(labelClear);
		setText(labelClear);
		setToolTipText(labelClear);

		this.appController = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		this.object = object;
	}

	/**
	 * 
	 * @see org.eclipse.ui.actions.ActionFactory.IWorkbenchAction#dispose()
	 */
	public void dispose() {

	}

	/**
	 * 
	 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(Event event) {
		try {
			ModelReference ref = appController.openObjectInstance(RWT.getSessionStore().getId(), appController.createNewInstance(object));
			RWT.getSessionStore().setAttribute(Constants.OPENED_INSTANCE, ref);
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

}
