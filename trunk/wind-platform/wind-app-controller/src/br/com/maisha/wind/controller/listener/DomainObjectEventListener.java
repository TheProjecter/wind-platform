package br.com.maisha.wind.controller.listener;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.listener.IAppRegistryListener;

/**
 * This is a AppRegistryListener, thus it recieves notifications of all that
 * happen at applications registry. The purpose of this class is listen to App
 * Registry and call EventHandler class indicated by Domain Object when
 * appropriated.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObjectEventListener implements IAppRegistryListener {

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object,
	 *      java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(Object oldValue, Object newValue, LevelType level, ChangeType change) {

		if (LevelType.Object.equals(level)) {
			if(newValue instanceof DomainObject){
				DomainObject dObj = (DomainObject) newValue;
				
				
			}
		}

	}

}
