package br.com.maisha.wind.common.listener;

import java.io.Serializable;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

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
	 * @param sessid
	 * @param listener
	 */
	void registerSessionAppModelListener(Serializable sessid, IAppRegistryListener listener);

	/**
	 * 
	 * @param sessid
	 */
	void removeSessionAppModelListener(Serializable sessid, IAppRegistryListener listener);

	/**
	 * 
	 * @param listener
	 */
	void removeAppModelListener(IAppRegistryListener listener);

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @param level
	 * @param change
	 */
	void fireEvent(Object oldValue, Object newValue, LevelType level, ChangeType change);

	/**
	 * @param sessid
	 * @param oldValue
	 * @param newValue
	 * @param level
	 * @param change
	 */
	void fireEvent(Serializable sessid, Object oldValue, Object newValue, LevelType level, ChangeType change);
}
