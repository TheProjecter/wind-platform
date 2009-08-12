package br.com.maisha.wind.faces.render;

import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IRender {

	/**
	 * 
	 * @param model
	 */
	void render(Object model);

	/**
	 * 
	 * @return
	 */
	LevelType getModelLevel();
}
