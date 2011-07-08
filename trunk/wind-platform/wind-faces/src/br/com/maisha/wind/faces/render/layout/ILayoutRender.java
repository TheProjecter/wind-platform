package br.com.maisha.wind.faces.render.layout;

import org.eclipse.swt.widgets.Composite;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface ILayoutRender {

	/**
	 * 
	 * @param dObj
	 * @param parent
	 * @param modelInstance
	 * @return
	 */
	Composite render(DomainObject dObj, Composite parent, ModelReference modelInstance);

}
