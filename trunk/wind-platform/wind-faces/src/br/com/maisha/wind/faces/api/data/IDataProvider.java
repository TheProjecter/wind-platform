/*******************************************************************************
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Wind Technologies - initial API and implementation
 ******************************************************************************/
package br.com.maisha.wind.faces.api.data;

import java.io.Serializable;
import java.util.Map;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;

/**
 * Determines a contract responsible for load the data displayed by a visual
 * component.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IDataProvider {

	/**
	 * Returns a Map where the key is used as identifier and the value as a
	 * label to the user.
	 * 
	 * @param attr
	 * @param instance
	 * @return
	 */
	Map<Serializable, Object> getData(Attribute attr, ModelReference instance);

}
