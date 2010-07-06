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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.faces.databinding.RequiredObservableValue;

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
		f = Graphics.getFont(fd.getName(), fd.getHeight(), fd.getStyle() | SWT.BOLD);
		return f;
	}

	protected GridData getLayoutData() {
		return getLayoutData(SWT.NONE);
	}

	/**
	 * TODO javadoc!
	 * 
	 * @return
	 */
	protected GridData getLayoutData(int style) {
		GridData gd = new GridData(style);
		gd.horizontalAlignment = GridData.BEGINNING;
		gd.grabExcessHorizontalSpace = true;
		return gd;
	}

	/**
	 * 
	 * @param parent
	 * @param attr
	 */
	protected Label createLabel(Composite parent, Attribute attr) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(attr.getLabel());
		setRequiredLabel(attr, label);
		return label;
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

	protected DataBindingContext configureDataBindings(Control control, Label label, Attribute attr) {

		DataBindingContext dbctx = new DataBindingContext();

		// data binding required...
		if (label != null) {
			IObservableValue reqLabelObservable = new RequiredObservableValue(label);
			Property p = attr.getProperties().get(PropertyInfo.REQUIRED.getPropName());
			if (p != null) {
				dbctx.bindValue(reqLabelObservable, BeansObservables.observeValue(p, "value"));
			}
		}

		// data binding visible
		Property pVis = attr.getProperties().get(PropertyInfo.VISIBLE.getPropName());
		if (pVis != null) {
			dbctx.bindValue(SWTObservables.observeVisible(control), BeansObservables.observeValue(pVis, "value"));
			if (label != null) {
				dbctx.bindValue(SWTObservables.observeVisible(label), BeansObservables.observeValue(pVis, "value"));
			}
		}

		// data binding enabled
		Property pEnabled = attr.getProperties().get(PropertyInfo.DISABLED.getPropName());
		if (pEnabled != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pEnabled, "value"));
		}

		// data binding width
		Property pWidth = attr.getProperties().get(PropertyInfo.WIDTH.getPropName());
		if (pWidth != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pWidth, "value"));
		}

		// data binding height
		Property pHeight = attr.getProperties().get(PropertyInfo.HEIGHT.getPropName());
		if (pHeight != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pHeight, "value"));
		}

		// data binding max_length
		Property pMaxL = attr.getProperties().get(PropertyInfo.MAX_LENGTH.getPropName());
		if (pMaxL != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pMaxL, "value"));
		}

		// data binding min_length
		Property pMinL = attr.getProperties().get(PropertyInfo.MIN_LENGTH.getPropName());
		if (pMinL != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pMinL, "value"));
		}

		// data binding mask
		Property pMask = attr.getProperties().get(PropertyInfo.MASK.getPropName());
		if (pMask != null) {
			dbctx.bindValue(SWTObservables.observeEnabled(control), BeansObservables.observeValue(pMask, "value"));
		}

		return dbctx;
	}
}
