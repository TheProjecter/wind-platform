package br.com.maisha.wind.faces;

import br.com.maisha.wind.common.listener.IAppRegistryListener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FacesAppModelListener implements IAppRegistryListener {

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object,
	 *      java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(Object oldValue, Object newValue, LevelType level,
			ChangeType change) {
		System.out.println("Model changeddd" + newValue);

	}

}
