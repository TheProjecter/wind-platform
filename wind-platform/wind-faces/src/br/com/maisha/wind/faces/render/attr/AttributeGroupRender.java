package br.com.maisha.wind.faces.render.attr;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.wind.faces.render.layout.GroupLayoutRender;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AttributeGroupRender extends BaseAttrRender {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.GROUP;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 * org.eclipse.swt.widgets.Composite, br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent, ModelReference modelInstance) {

		new Label(parent, SWT.NONE);
		GroupLayoutRender groupRender = new GroupLayoutRender(attr);
		Composite group = groupRender.render(attr.getDomainObject(), parent, modelInstance);

		GridData gd = (GridData) group.getLayoutData();
		setColspan(gd, attr);
		setRowspan(gd, attr);

	}
}
