package br.com.maisha.wind.common.listener;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.user.IUserContext;

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
	 * @param userContext
	 * @param listener
	 */
	void registerSessionAppModelListener(IUserContext userContext, IAppRegistryListener listener);

	/**
	 * 
	 * @param userContext
	 */
	void removeSessionAppModelListener(IUserContext userContext, IAppRegistryListener listener);

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
	 * @param userContext
	 * @param oldValue
	 * @param newValue
	 * @param level
	 * @param change
	 */
	void fireEvent(IUserContext userContext, Object oldValue, Object newValue, LevelType level, ChangeType change);
}
