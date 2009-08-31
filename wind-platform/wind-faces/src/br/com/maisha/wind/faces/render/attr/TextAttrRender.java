package br.com.maisha.wind.faces.render.attr;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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

		Integer x = attr.getPropertyValue(PropertyInfo.X);
		GridLayout gl = (GridLayout) parent.getLayout();
		if (x > gl.numColumns) {
			gl.numColumns = x * 2;
		}

		Label label = new Label(parent, SWT.NONE);
		label.setText(attr.getLabel());
		setRequiredLabel(attr, label);

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

		Integer width = attr.getPropertyValue(PropertyInfo.WIDTH);
		if (width != null) {
			gd.widthHint = width;
			gd.grabExcessHorizontalSpace = false;
		}

		Integer height = attr.getPropertyValue(PropertyInfo.HEIGHT);
		if (height != null) {
			gd.heightHint = height;
		}

		gd.horizontalSpan = (attr.getPropertyValue(PropertyInfo.COL_SPAN) * 2) - 1;
		gd.verticalSpan = attr.getPropertyValue(PropertyInfo.ROW_SPAN);

		text.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));

	}
}
