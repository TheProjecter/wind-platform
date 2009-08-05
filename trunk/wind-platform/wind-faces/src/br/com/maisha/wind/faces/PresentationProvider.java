package br.com.maisha.wind.faces;

import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PresentationProvider implements IPresentationProvider {

	/** */
	private IApplicationRegistry registry;

	/** @see #registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}
}
