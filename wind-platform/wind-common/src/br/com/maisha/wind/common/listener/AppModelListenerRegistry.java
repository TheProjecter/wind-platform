package br.com.maisha.wind.common.listener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

	/** */
	private Map<Serializable, List<IAppRegistryListener>> sessionReg = new HashMap<Serializable, List<IAppRegistryListener>>();

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppModelListenerRegistry#registerSessionAppModelListener(java.io.Serializable,
	 * br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void registerSessionAppModelListener(Serializable sessid, IAppRegistryListener listener) {
		log.debug("		Listener " + listener + " registered within session " + sessid);
		List<IAppRegistryListener> listeners = sessionReg.get(sessid);
		if (listeners == null) {
			listeners = new ArrayList<IAppRegistryListener>();
		}
		listeners.add(listener);
		sessionReg.put(sessid, listeners);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppModelListenerRegistry#removeAppModelListener(java.io.Serializable,
	 * br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void removeSessionAppModelListener(Serializable sessid, IAppRegistryListener listener) {
		List<IAppRegistryListener> listeners = sessionReg.get(sessid);
		if (listeners != null) {
			if (listeners.remove(listener)) {
				log.debug("		Removed listener previously registered within session " + sessid);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppModelListenerRegistry#fireEvent(java.io.Serializable, java.lang.Object, java.lang.Object,
	 * br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 * br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void fireEvent(Serializable sessid, Object oldValue, Object newValue, LevelType level, ChangeType change) {
		log.debug("		Model Changed [ " + level + ", " + change + " ] firing event to listeners registered within [" + sessid + "] session");

		List<IAppRegistryListener> listeners = sessionReg.get(sessid);

		if (listeners == null) {
			throw new IllegalStateException("There is no listeners registered within session [" + sessid + "]");
		}

		for (IAppRegistryListener listener : listeners) {
			log.debug("		Event fired to Listener: " + listener);
			listener.modelChanged(oldValue, newValue, level, change);
		}
	}
}
