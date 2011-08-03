package br.com.maisha.wind.faces.action;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;

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

		setDescription(labelClear);
		setText(labelClear);
		setToolTipText(labelClear);

		setImageDescriptor(ImageDescriptor.createFromImage(Activator.getImageDescriptor("icons/clear.gif").createImage()));

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
			appController.openObjectInstance(appController.createNewCurrentInstance(object));
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

}
