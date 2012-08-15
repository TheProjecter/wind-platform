/**
 * 
 */
package br.com.maisha.wind.faces.action;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.common.user.IUserContext.UserData;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FowardNavigationAction extends Action implements SelectionListener {

	/** Attributes to Navigate. */
	private List<Attribute> attributes;

	/**
	 * 
	 */
	public FowardNavigationAction(List<Attribute> pAttributes) {
		this.attributes = pAttributes;
		setImageDescriptor(ImageDescriptor.createFromImage(Activator.getImageDescriptor("icons/forward_nav.gif")
				.createImage()));

		setMenuCreator(new IMenuCreator() {
			public Menu getMenu(Menu parent) {
				return null;
			}

			public Menu getMenu(Control parent) {
				Menu m = new Menu(parent);

				for (Attribute attribute : attributes) {
					MenuItem mi = new MenuItem(m, SWT.NONE);
					mi.setText(attribute.getI18nLabel());
					mi.setData(attribute);
					mi.addSelectionListener(FowardNavigationAction.this);
				}

				return m;
			}

			public void dispose() {
			}
		});

	}

	/**
	 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void runWithEvent(Event e) {
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetSelected(SelectionEvent e) {
		widgetDefaultSelected(e);
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		IApplicationController appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
		
		IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
		ModelReference openedInstance = userContext.getUserData(UserData.OPENED_INSTANCE);
		
		appCtrl.navigateFrom(userContext, (Attribute) e.widget.getData(), openedInstance);
	}

}
