package br.com.maisha.wind.faces.render;

import org.apache.log4j.Logger;

import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MenuRender implements IRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(MenuRender.class);

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType getModelLevel() {
		return LevelType.Application;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		log.debug(" 	Menu rendering started... ");

		log.debug(" 	Menu rendering finished... ");
	}

}
