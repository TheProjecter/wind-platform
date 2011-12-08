package br.com.maisha.wind.faces.render;

import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;

/**
 * A Render is responsible for the visual representation of the received model.
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IRender {

	/**
	 * Creates the visual representation of the given model.
	 * 
	 * @param model
	 *            Model object to render.
	 */
	void render(LevelType leve, ChangeType ct, Object model);

	/**
	 * Returns the {@link LevelType} this render act.
	 * 
	 * @see LevelType
	 * @return Level of this render.
	 */
	LevelType[] getModelLevel();
}
