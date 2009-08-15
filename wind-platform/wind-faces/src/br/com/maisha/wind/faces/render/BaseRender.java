package br.com.maisha.wind.faces.render;

import br.com.maisha.wind.faces.IPresentationProvider;

/**
 * Base class for all renders at the platform.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public abstract class BaseRender implements IRender {

	/** Current {@link IPresentationProvider} */
	private IPresentationProvider presentationProvider;

	/** @see BaseRender#presentationProvider */
	public void setPresentationProvider(
			IPresentationProvider presentationProvider) {
		this.presentationProvider = presentationProvider;
	}

	/** @see BaseRender#presentationProvider */
	public IPresentationProvider getPresentationProvider() {
		return presentationProvider;
	}

}
