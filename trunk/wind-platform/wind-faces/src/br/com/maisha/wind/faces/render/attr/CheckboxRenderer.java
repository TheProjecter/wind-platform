package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.wind.controller.model.UserMessage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class CheckboxRenderer extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(CheckboxRenderer.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.CHECKBOX;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent,
			ModelReference modelInstance) {
		log.debug("Starting render for attr [" + attr + "] ");

		Label emptyLabel = new Label(parent, SWT.NONE);
		
		Button checkbox = new Button(parent, SWT.CHECK);
		checkbox.setData(attr.getRef());
		checkbox.setText(attr.getLabel());

		// tooltip
		String tooltip = attr.getPropertyValue(PropertyInfo.TOOLTIP);
		UserMessage um = new UserMessage(null, tooltip, attr.getDomainObject());
		checkbox.setToolTipText(um.getFormattedMessage());

		GridData gd = getLayoutData();
		checkbox.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		// configure common bindings
		DataBindingContext dbctx = configureDataBindings(checkbox, null, attr);

		// configure value binding
		IObservableValue observable = BeansObservables.observeValue(
				modelInstance, attr.getRef());
		dbctx.bindValue(SWTObservables.observeSelection((Control) checkbox),
				observable);
	}

}
