package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Property.PresentationType;

/**
 * TODO javadoc
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TextAreaAttrRender extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger
			.getLogger(TextAreaAttrRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return Property.PresentationType.TEXTAREA;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent,
			ModelReference modelInstance) {
		log.debug("Starting render [" + getPresentationType() + "] for attr ["
				+ attr + "] ");

		// checkNumColumns(parent, attr);

		Label l = createLabel(parent, attr);

		Text text = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		text.setData(attr.getRef());
		text.setToolTipText(attr.getLabel());

		Integer maxLength = attr.getPropertyValue(PropertyInfo.MAX_LENGTH);
		if (maxLength != null) {
			text.setTextLimit(maxLength);
		}

		GridData gd = getLayoutData();
		text.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		text.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

		// configure common bindings
		DataBindingContext dbctx = configureDataBindings(text, l, attr);

		// configure value binding
		IObservableValue observable = BeansObservables.observeValue(
				modelInstance, attr.getRef());
		dbctx.bindValue(SWTObservables.observeText(text, SWT.Modify),
				observable);
	}

}
