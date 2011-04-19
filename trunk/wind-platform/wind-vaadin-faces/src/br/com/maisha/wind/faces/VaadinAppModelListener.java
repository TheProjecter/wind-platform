package br.com.maisha.wind.faces;

import org.apache.log4j.Logger;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class VaadinAppModelListener implements IAppRegistryListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(VaadinAppModelListener.class);

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object,
	 *      java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(Object oldValue, Object newValue, LevelType level, ChangeType change) {
		log.debug("		Model changed... rendering");

		final IPresentationProvider presProvider = ServiceProvider.getInstance().getService(
				IPresentationProvider.class, Activator.getContext());

		// render always occurs on the UI-Thread
		presProvider.render(newValue, level, change);
	}

}
