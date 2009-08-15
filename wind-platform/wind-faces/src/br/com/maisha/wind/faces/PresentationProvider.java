package br.com.maisha.wind.faces;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.ui.PlatformUI;

import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.rcp.Application;
import br.com.maisha.wind.faces.render.IRender;

/**
 * Implementacao default de {@link IPresentationProvider}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PresentationProvider implements IPresentationProvider {

	/** Log ref. */
	private static final Logger log = Logger
			.getLogger(PresentationProvider.class);

	/** Lista de renderizadores resgistrados neste Presentation Provider. */
	private List<IRender> render = new ArrayList<IRender>();

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#render(java.lang.Object)
	 */
	public void render(Object model, LevelType level, ChangeType change) {
		if (Application.getApp() != null && PlatformUI.isWorkbenchRunning()) {
			for (IRender r : render) {
				if (r.getModelLevel() == level) {
					log.debug("		Call render [" + r + "]");
					r.render(model);
				}
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

	/** @see PresentationProvider#render */
	public void setRender(List<IRender> render) {
		this.render = render;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#processMenu(java.lang.String)
	 */
	public void processMenu(String menuId) {
		log.debug("Processing menu click at [" + menuId + "]");
	}
}
