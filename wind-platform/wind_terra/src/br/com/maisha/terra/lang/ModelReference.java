package br.com.maisha.terra.lang;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Base class for every domain model class.
 * <p/>
 * It's used by IClassMaker from wind_terra as super class when defining domain
 * model java classes.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ModelReference {

	private DomainObject meta;

	/** Property change. */
	protected PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

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

	public DomainObject getMeta() {
		return meta;
	}

	public void setMeta(DomainObject meta) {
		this.meta = meta;
	}
}
