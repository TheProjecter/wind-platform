package br.com.maisha.wind.faces;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Display;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener;
import br.com.maisha.wind.common.user.CommonUserContext;
import br.com.maisha.wind.common.user.IUserContext.UserData;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FacesAppModelListener implements IAppRegistryListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(FacesAppModelListener.class);

	private Display display;

	public FacesAppModelListener(Display diplay) {
		super();
		this.display = diplay;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object, java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(final Object oldValue, final Object newValue, final LevelType level, final ChangeType change) {
		log.debug("		Model changed... rendering");

		final IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());

		// render always occurs on the UI-Thread
		if (display != null && !display.isDisposed()) {
			display.asyncExec(new Runnable() {
				public void run() {
					presProvider.render(newValue, level, change);
				}
			});
		}

	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Display getDisplay() {
		return display;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof FacesAppModelListener)) {
			return false;
		}
		FacesAppModelListener other = (FacesAppModelListener) obj;
		return other.getDisplay() != null && this.getDisplay() != null && this.getDisplay().equals(other.getDisplay());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, new String[] { "display" });
	}
}
