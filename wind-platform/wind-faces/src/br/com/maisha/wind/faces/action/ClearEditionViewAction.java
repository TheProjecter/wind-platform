package br.com.maisha.wind.faces.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.springframework.beans.BeanUtils;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ClearEditionViewAction extends Action implements IWorkbenchAction {

	/** */
	private DomainObject object;
	
	/** */
	private ModelReference ref;
	
	/**
	 * 
	 * @param object
	 * @param ref
	 */
	public ClearEditionViewAction(DomainObject object, ModelReference ref) {
		setId("wind.faces.edition.clear");
		
		String labelClear = PlatformMessageRegistry.getInstance().getMessage("wind_faces.messageview.clear");
		
		setDescription(labelClear);
		setText(labelClear);
		setToolTipText(labelClear);

		setImageDescriptor(ImageDescriptor.createFromImage(Activator.getImageDescriptor("icons/clear.gif")
				.createImage()));
		
		this.object = object;
		this.ref = ref;
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
		super.runWithEvent(event);
		
		try {
			Object newRef = object.getObjectClass().newInstance();
			BeanUtils.copyProperties(newRef, ref);
		} catch (Exception e) {
			// TODO handle
			e.printStackTrace();
		}
	}

}
