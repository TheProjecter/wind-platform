package br.com.maisha.wind.controller.listener;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.listener.IAppModelListenerRegistry;
import br.com.maisha.wind.common.listener.IAppRegistryListener;
import br.com.maisha.wind.controller.IApplicationController;

/**
 * This is an AppRegistryListener, thus it receives notifications of all that happen at application's registry. The purpose of this class is
 * listen to App Registry and call EventHandler class indicated by Domain Object when appropriated.
 * 
 * @deprecated This class must suffer a redesign
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class DomainObjectEventListener implements IAppRegistryListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(DomainObjectEventListener.class);

	/** Application Controller. */
	private IApplicationController appCtrl;

	/** Application Model Listener Registry. */
	private IAppModelListenerRegistry appModelListenerRegisty;

	/**
	 * 
	 */
	public DomainObjectEventListener() {

	}

	/**
	 * 
	 * @see br.com.maisha.wind.common.listener.IAppRegistryListener#modelChanged(java.lang.Object, java.lang.Object,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType)
	 */
	public void modelChanged(Object oldValue, Object newValue, LevelType level, ChangeType change) {

		log.debug("		Model changed... processing object events");

		ChangeType[] supportedChangeTypes = new ChangeType[] { ChangeType.BeforeObjectOpen, ChangeType.AfterObjectOpen,
				ChangeType.BeforeObjectClose, ChangeType.AfterObjectClose };

		if (LevelType.Object.equals(level) && ArrayUtils.contains(supportedChangeTypes, change)) {
			if (newValue instanceof DomainObject) {
				DomainObject dObj = (DomainObject) newValue;

				appCtrl.handleObjectEvent(dObj, change, level);
			}
		}

	}

	/** @see #appCtrl */
	public void setAppCtrl(IApplicationController appCtrl) {
		this.appCtrl = appCtrl;
	}

	/** @see #appModelListenerRegisty */
	public void setAppModelListenerRegisty(IAppModelListenerRegistry appModelListenerRegisty) {
		this.appModelListenerRegisty = appModelListenerRegisty;
		// this.appModelListenerRegisty.registerAppModelListener(this); TODO disabled until redesign
	}

}
