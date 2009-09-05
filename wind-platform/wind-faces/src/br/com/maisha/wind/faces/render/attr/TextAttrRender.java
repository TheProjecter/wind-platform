package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.Property.PresentationType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TextAttrRender extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(TextAttrRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return Property.PresentationType.TEXT;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite)
	 */
	public void render(Attribute attr, Composite parent) {
		log.debug("Starting render for attr [" + attr + "] ");

		//checkNumColumns(parent, attr);

		createLabel(parent, attr);

		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE);
		text.setData(attr.getRef());
		text.setToolTipText(attr.getLabel());

		Integer maxLength = attr.getPropertyValue(PropertyInfo.MAX_LENGTH);
		if (maxLength != null) {
			text.setTextLimit(maxLength);
		}

		String mask = attr.getPropertyValue(PropertyInfo.MASK);
		if (mask.trim().length() > 0) {
			text.addListener(SWT.Verify, new MaskListener(mask, false));
		}

		GridData gd = getLayoutData();
		text.setLayoutData(gd);
		setDimensions(gd, attr);

		setColspan(gd, attr);
		setRowspan(gd, attr);

		text.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

	}
}
