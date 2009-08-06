package br.com.maisha.wind.lifecycle.registry;

import java.util.ArrayList;
import java.util.List;

import br.com.maisha.wind.common.listener.IAppRegistryListener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AppModelListenerRegistry implements IAppModelListenerRegistry {

	/**
	 * 
	 */
	private List<IAppRegistryListener> reg = new ArrayList<IAppRegistryListener>();

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry#registerAppModelListener(br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void registerAppModelListener(IAppRegistryListener listener) {
		if (!reg.contains(listener)) {
			reg.add(listener);
		}

	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry#removeAppModelListener(br.com.maisha.wind.common.listener.IAppRegistryListener)
	 */
	public void removeAppModelListener(IAppRegistryListener listener) {
		reg.remove(listener);
	}

}
