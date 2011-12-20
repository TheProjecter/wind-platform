package br.com.maisha.wind.faces;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.rwt.SessionSingletonBase;

import br.com.maisha.wind.faces.render.IRender;

/**
 * TODO javadoc
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RenderSessionBase extends SessionSingletonBase {

	/** Lista de renderizadores resgistrados nesta sessao. TODO translate. */
	private Set<IRender> render = new HashSet<IRender>();

	/** */
	private Boolean initialized = false;

	/**
	 * 
	 * @return
	 */
	public static RenderSessionBase instance() {
		return (RenderSessionBase) getInstance(RenderSessionBase.class);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#registerRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void registerRender(IRender render) {
		this.render.add(render);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.IPresentationProvider#removeRender(br.com.maisha.wind.faces.render.IRender)
	 */
	public void unRegisterRender(IRender render) {
		this.render.remove(render);
	}

	public void setRender(Set<IRender> render) {
		this.render = render;
	}

	public Set<IRender> getRender() {
		return render;
	}

	public Boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}
}
