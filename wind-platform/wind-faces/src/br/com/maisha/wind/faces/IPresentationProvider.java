package br.com.maisha.wind.faces;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.IRender;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IPresentationProvider extends Component {

	/**
	 * 
	 * @param model
	 * @param level
	 * @param change
	 */
	void render(Object model, LevelType level, ChangeType change);

	/**
	 * 
	 * @param render
	 */
	void registerRender(IRender render);

	/**
	 * 
	 * @param render
	 */
	void removeRender(IRender render);

}
