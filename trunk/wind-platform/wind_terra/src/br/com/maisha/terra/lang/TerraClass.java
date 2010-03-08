package br.com.maisha.terra.lang;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 
 * @author Paulo
 * 
 */
public class TerraClass {

	/** Property change. */
	protected PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);

	/**
	 * Add a listener for the given property.
	 * 
	 * @param propertyName
	 *            Property name.
	 * @param listener
	 *            Listener.
	 */
	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * Removes a listener for the given property.
	 * 
	 * @param propertyName
	 *            Property name.
	 * @param listener
	 *            Listener.
	 */
	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

}
