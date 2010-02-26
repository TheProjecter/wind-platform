package br.com.maisha.wind.faces.render.attr;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.rwt.graphics.Graphics;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.PropertyInfo;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public abstract class BaseAttrRender implements IAttributeRender {

	/**
	 * 
	 * @param attr
	 * @param label
	 */
	protected void setRequiredLabel(Attribute attr, Label label) {
		// bold if required
		Boolean required = attr.getPropertyValue(PropertyInfo.REQUIRED);
		if (required) {
			FontData fd = label.getFont().getFontData()[0];
			label.setFont(getBoldFont(fd));
		}
	}

	/**
	 * TODO javadoc!
	 * 
	 * @param fd
	 * @return
	 */
	protected Font getBoldFont(FontData fd) {
		Font f = null;
		f = Graphics.getFont(fd.getName(), fd.getHeight(), fd.getStyle()
				| SWT.BOLD);
		return f;
	}

	/**
	 * TODO javadoc!
	 * 
	 * @return
	 */
	protected GridData getLayoutData() {
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		gd.grabExcessHorizontalSpace = true;
		return gd;
	}

	/**
	 * 
	 * @param parent
	 * @param attr
	 */
	protected void createLabel(Composite parent, Attribute attr) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(attr.getLabel());
		setRequiredLabel(attr, label);
	}

	/**
	 * 
	 * @param parent
	 * @param attr
	 */
	protected void checkNumColumns(Composite parent, Attribute attr) {
		Integer x = attr.getPropertyValue(PropertyInfo.X);
		GridLayout gl = (GridLayout) parent.getLayout();
		if (x > gl.numColumns) {
			gl.numColumns = x * 2;
		}
	}

	/**
	 * 
	 * @param gd
	 * @param attr
	 */
	protected void setWidth(GridData gd, Attribute attr) {
		Integer width = attr.getPropertyValue(PropertyInfo.WIDTH);
		if (width != null) {
			gd.widthHint = width;
			gd.grabExcessHorizontalSpace = false;
		}

	}

	/**
	 * 
	 * @param gd
	 * @param attr
	 */
	protected void setHeight(GridData gd, Attribute attr) {
		Integer height = attr.getPropertyValue(PropertyInfo.HEIGHT);
		if (height != null) {
			gd.heightHint = height;
		}
	}

	/**
	 * 
	 * @param gd
	 * @param attr
	 */
	protected void setDimensions(GridData gd, Attribute attr) {
		setWidth(gd, attr);
		setHeight(gd, attr);
	}

	/**
	 * 
	 * @param gd
	 * @param attr
	 */
	protected void setColspan(GridData gd, Attribute attr) {
		gd.horizontalSpan = (attr.getPropertyValue(PropertyInfo.COL_SPAN) * 2) - 1;

	}

	/**
	 * 
	 * @param gd
	 * @param attr
	 */
	protected void setRowspan(GridData gd, Attribute attr) {
		gd.verticalSpan = attr.getPropertyValue(PropertyInfo.ROW_SPAN);
	}

	
}
