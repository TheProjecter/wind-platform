package br.com.maisha.wind.common.listener;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AppModelListenerRegistry implements IAppModelListenerRegistry {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(AppModelListenerRegistry.class);

	/** */
	private Set<IAppRegistryListener> reg = new HashSet<IAppRegistryListener>();

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry#registerAppModelListener(br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void registerAppModelListener(IAppRegistryListener listener) {
		if (reg.contains(listener)) {
			reg.remove(listener);
		}
		log.debug("		Listener registered: " + listener);
		reg.add(listener);

	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry#removeAppModelListener(br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void removeAppModelListener(IAppRegistryListener listener) {
		log.debug("		Listener removed: " + listener);
		reg.remove(listener);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry#fireEvent(java.lang.Object, java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void fireEvent(Object oldValue, Object newValue, LevelType level, ChangeType change) {

		log.debug("		Model Changed [ " + level + ", " + change + " ]");

		for (IAppRegistryListener listener : reg) {
			log.debug("		Event fired to Listener: " + listener);
			listener.modelChanged(oldValue, newValue, level, change);
		}
	}

}
