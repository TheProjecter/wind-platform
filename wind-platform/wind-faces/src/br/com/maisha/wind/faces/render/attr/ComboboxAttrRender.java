package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Property.PresentationType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ComboboxAttrRender extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ComboboxAttrRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return Property.PresentationType.COMBO;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent, ModelReference modelInstance) {
		log.debug("Starting render for attr [" + attr + "] ");

		// checkNumColumns(parent, attr);

		Label l = createLabel(parent, attr);

		Combo cb = new Combo(parent, SWT.READ_ONLY);
		cb.setData(attr.getRef());
		cb.setToolTipText(attr.getLabel());

		// events

		GridData gd = getLayoutData();
		cb.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		cb.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

		// configure common bindings
		DataBindingContext dbctx = configureDataBindings(cb, l, attr);

		// configure value binding
		IObservableValue observable = BeansObservables.observeValue(modelInstance, attr.getRef());
		dbctx.bindValue(SWTObservables.observeSelection(cb), observable);

	}
	
	
	 public static String getEventName(int eventType) {
		    switch(eventType) {
		      case SWT.None:
		        return "null";
		      case SWT.KeyDown:
		        return "key down";
		      case SWT.KeyUp:
		        return "key up";
		      case SWT.MouseDown:
		        return "mouse down";
		      case SWT.MouseUp:
		        return "mouse up";
		      case SWT.MouseDoubleClick:
		        return "mouse double click";
		      case SWT.Move:
		        return "move";
		      case SWT.Resize:
		        return "resize";
		      case SWT.Dispose:
		        return "dispose";
		      case SWT.Selection:
		        return "selection";
		      case SWT.DefaultSelection:
		        return "default selection";
		      case SWT.FocusIn:
		        return "focus in";
		      case SWT.FocusOut:
		        return "focus out";
		      case SWT.Expand:
		        return "expand";
		      case SWT.Collapse:
		        return "collapse";
		      case SWT.Close:
		        return "close";
		      case SWT.Show:
		        return "show";
		      case SWT.Hide:
		        return "hide";
		      case SWT.Modify:
		        return "modify";
		      case SWT.Verify:
		        return "verify";
		      case SWT.Activate:
		        return "activate";
		      case SWT.Deactivate:
		        return "deactivate";
		      case SWT.Help:
		        return "help";
		      case SWT.DragDetect:
		        return "drag detect";
		      case SWT.Arm:
		        return "arm";
		      case SWT.Traverse:
		        return "traverse";
		      case SWT.MenuDetect:
		        return "menu detect";
		    }
		    
		    return "unkown ???";
		  }

}
