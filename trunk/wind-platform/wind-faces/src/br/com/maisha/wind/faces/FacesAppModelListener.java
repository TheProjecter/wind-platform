package br.com.maisha.wind.faces;

import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Display;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FacesAppModelListener implements IAppRegistryListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(FacesAppModelListener.class);

	/** */
	private Display display;

	/**
	 * 
	 * @param display
	 */
	public FacesAppModelListener(Display display) {
		this.display = display;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object,
	 *      java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(final Object oldValue, final Object newValue, final LevelType level,
			final ChangeType change) {
		log.debug("		Model changed... rendering");

		final IPresentationProvider presProvider = ServiceProvider.getInstance().getService(
				IPresentationProvider.class, Activator.getDefault().getBundle().getBundleContext());

		// render always occurs on the UI-Thread
		display.syncExec(new Runnable() {
			public void run() {
				presProvider.render(newValue, level, change);
			}
		});
	}
}
