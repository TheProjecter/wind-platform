package br.com.maisha.wind.lifecycle.registry;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.common.listener.IAppRegistryListener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IAppModelListenerRegistry extends Component {

	/**
	 * 
	 * @param listener
	 */
	void registerAppModelListener(IAppRegistryListener listener);

	/**
	 * 
	 * @param listener
	 */
	void removeAppModelListener(IAppRegistryListener listener);
}
