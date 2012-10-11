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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Item {

	private Serializable id;

	private Object value;

	/** Property change. */
	protected PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	/**
	 * @param id
	 * @param value
	 */
	public Item(Serializable id, Object value) {
		super();
		this.id = id;
		this.value = value;
	}

	/** @see Item#id */
	public Serializable getId() {
		return id;
	}

	/** @see Item#value */
	public Object getValue() {
		return value;
	}

	/**
	 * Add a listener for the given property.
	 * 
	 * @param propertyName
	 *            Property name.
	 * @param listener
	 *            Listener.
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * Add a listener for all properties.
	 * 
	 * @param listener
	 *            Listener.
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Removes a listener for the given property.
	 * 
	 * @param propertyName
	 *            Property name.
	 * @param listener
	 *            Listener.
	 */
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

}
