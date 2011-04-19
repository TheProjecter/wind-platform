package br.com.maisha.wind.faces;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.lifecycle.mgmt.IApplicationManager;

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
	private List<IRender> render = new ArrayList<IRender>();

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#render(java.lang.Object)
	 */
	public void render(final Object model, final LevelType level, final ChangeType change) {
		log.debug("Processing change [" + change + " at level [" + level + "]");
		for (IRender r : render) {
			if (ArrayUtils.contains(r.getModelLevel(), level)) {
				log.debug("		Call render [" + r + "]");
				r.render(level, change, model);
			}
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#registerRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void registerRender(IRender render) {
		log.debug("		Render registered: " + render);
		this.render.add(render);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#removeRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void removeRender(IRender render) {
		log.debug("		Render removed: " + render);
		this.render.remove(render);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#processMenu(java.lang.String,
	 *      java.lang.String)
	 */
	public void processMenu(String appId, String objectId) {
		log.debug("Processing menu click at [" + objectId + "]");
		IApplicationManager appMgr = ServiceProvider.getInstance().getService(IApplicationManager.class,
				Activator.getContext());

		appMgr.openObject(appId, objectId);
	}



	/** @see PresentationProvider#render */
	public void setRender(List<IRender> render) {
		this.render = render;
	}


}
