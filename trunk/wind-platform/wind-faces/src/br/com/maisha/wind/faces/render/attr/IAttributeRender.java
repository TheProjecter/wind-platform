package br.com.maisha.wind.faces.render.attr;

import org.eclipse.swt.widgets.Composite;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Property;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IAttributeRender {

	/**
	 * 
	 * @return
	 */
	Property.PresentationType getPresentationType();

	/**
	 * 
	 * @param attr
	 * @param parent
	 */
	void render(Attribute attr, Composite parent, Object modelInstance);

}
