package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Property.PresentationType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class CheckboxRenderer extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TextAttrRender.class);

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
		
		Button checkbox = new Button(parent, SWT.CHECK);
		checkbox.setData(attr.getRef());
		checkbox.setText(attr.getLabel());
		checkbox.setToolTipText(attr.getLabel());
		
		GridData gd = getLayoutData();
		checkbox.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);
		
		checkbox.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));
	}

}
