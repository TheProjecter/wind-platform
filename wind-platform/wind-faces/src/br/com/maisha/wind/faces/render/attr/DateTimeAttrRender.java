package br.com.maisha.wind.faces.render.attr;

import java.util.Calendar;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
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
public class DateTimeAttrRender extends BaseAttrRender {

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.DATE;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent, ModelReference modelInstance) {

		Label l = createLabel(parent, attr);

		DateTime dateTimeCmp = new DateTime(parent, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
		dateTimeCmp.setData(attr.getRef());

		// tooltip
		String tooltip = attr.getPropertyValue(PropertyInfo.TOOLTIP);
		UserMessage um = new UserMessage(null, tooltip, attr.getDomainObject());
		dateTimeCmp.setToolTipText(um.getFormattedMessage());

		GridData gd = getLayoutData();
		dateTimeCmp.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		dateTimeCmp.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

		// configure common bindings
		DataBindingContext dbctx = configureDataBindings(dateTimeCmp, l, attr);

		// configure value binding
		IObservableValue observable = BeansObservables.observeValue(modelInstance, attr.getRef());
		dbctx.bindValue(SWTObservables.observeSelection(dateTimeCmp), observable);

		Calendar cal = Calendar.getInstance();
		dateTimeCmp.setDate(cal.get(Calendar.YEAR+1), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
	}

}
