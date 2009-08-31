package br.com.maisha.wind.faces.render.attr;

import org.eclipse.rwt.graphics.Graphics;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.PropertyInfo;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public abstract class BaseAttrRender implements IAttributeRender {

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
	 * @return
	 */
	protected GridData getLayoutData(){
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.BEGINNING;
		gd.grabExcessHorizontalSpace = true;
		return gd;
	}

}
