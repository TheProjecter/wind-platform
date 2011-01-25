package br.com.maisha.wind.faces.action;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.springframework.beans.BeanUtils;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
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

	/** */
	private DomainObject object;
	
	/** */
	private ModelReference ref;
	
	private IApplicationController appController;
	
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
		
		this.appController = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
		
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
			ModelReference newRef = (ModelReference) object.getObjectClass().newInstance();
			
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("ref", newRef);
			context.put("appId", object.getApplication().getAppId());
			context.put("objId", object.getRef());
			appController.runScript("${ ref.setAppId(appId)}", context);
			appController.runScript("${ref.setObjId(objId)}", context);

			newRef.setMeta(object);
			
			BeanUtils.copyProperties(newRef, ref);
			ref.toString();
		} catch (Exception e) {
			// TODO handle
			e.printStackTrace();
		}
	}

}
