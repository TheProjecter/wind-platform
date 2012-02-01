package br.com.maisha.wind.faces;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.ui.PlatformUI;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.rcp.Application;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.render.attr.IAttributeRender;
import br.com.maisha.wind.faces.util.Constants;

/**
 * Implementacao default de {@link IPresentationProvider}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PresentationProvider implements IPresentationProvider {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(PresentationProvider.class);

	/** Lista de renderizadores resgistrados neste Presentation Provider. */
	private Set<IRender> render = new HashSet<IRender>();

	/** */
	private Map<String, IAttributeRender> attrRender = new HashMap<String, IAttributeRender>();

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#render(java.lang.Object)
	 */
	public void render(final Object model, final LevelType level, final ChangeType change) {
		if (Application.getApp() != null && PlatformUI.isWorkbenchRunning()) {
			log.debug("Processing change [" + change + " at level [" + level + "]");
			log.debug("Rendering: " + RenderSessionBase.instance().hashCode());
			for (IRender r : RenderSessionBase.instance().getRender()) {
				if (ArrayUtils.contains(r.getModelLevel(), level)) {
					log.debug("		Call render [" + r + "]");
					r.render(level, change, model);
				}
			}
		}
	}

	/*
	 * Magic, don't touch it!
	 * 
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#initialize()
	 */
	public void initialize() {
		RenderSessionBase renderSessionBase = RenderSessionBase.instance();
		renderSessionBase.setRender(new HashSet<IRender>(render));
		RWT.getServiceStore().setAttribute("presentationProvider", Boolean.TRUE);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#registerRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void registerRender(IRender render) {
		if (RWT.getServiceStore().getAttribute("presentationProvider") == null) {
			initialize();
		}
		log.debug("		Render registered: " + render);
		RenderSessionBase.instance().registerRender(render);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#removeRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void unRegisterRender(IRender render) {
		if (RWT.getServiceStore().getAttribute("presentationProvider") == null) {
			throw new IllegalStateException("Presentation Provider has not been initilized.");
		}
		log.debug("		Render removed: " + render);
		RenderSessionBase.instance().unRegisterRender(render);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#processMenu(java.lang.String, java.lang.String)
	 */
	public void processMenu(String appId, String objectId) {
		log.debug("Processing menu click at [" + objectId + "]");
		IApplicationController appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		DomainObject openedObject = (DomainObject) RWT.getSessionStore().getAttribute(Constants.OPENED_DOMAIN_OBJECT);
		if (openedObject != null) {
			appCtrl.closeObject(appId, objectId, RWT.getSessionStore().getId());
		}
		openedObject = appCtrl.openObject(appId, objectId, RWT.getSessionStore().getId());
		RWT.getSessionStore().setAttribute(Constants.OPENED_DOMAIN_OBJECT, openedObject);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#getAttributeRender(java.lang.String)
	 */
	public IAttributeRender getAttributeRender(String key) {
		return this.attrRender.get(key);
	}

	/** @see PresentationProvider#render */
	public void setRender(Set<IRender> render) {
		this.render = render;
	}

	/** @see PresentationProvider#attrRender */
	public void setAttrRender(Map<String, IAttributeRender> attrRender) {
		this.attrRender = attrRender;
	}
}
