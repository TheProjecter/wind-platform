package br.com.maisha.wind.faces;

import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.render.attr.IAttributeRender;

/**
 * The Presentation Provider is responsible for the conversation between the
 * model and the user interface. Every change in model causes the rerender of
 * the user interface.
 * 
 * The render process consists in calling all of the registered {@link IRender}.
 * Each render recieves the model and renders it in a proper way.
 * 
 * @see FacesAppModelListener
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IPresentationProvider extends Component {

	/**
	 * Renders de given model, based on the level and type of the change. See
	 * {@link LevelType} and {@link ChangeType} for possible values.
	 * 
	 * @see LevelType
	 * @see ChangeType
	 * @param model
	 *            Model object which has changed.
	 * @param level
	 *            The level model is at.
	 * @param change
	 *            Type of the change.
	 */
	void render(Object model, LevelType level, ChangeType change);

	/**
	 * Registers the given render.
	 * 
	 * @param render
	 */
	void registerRender(IRender render);

	/**
	 * Remove the given render.
	 * 
	 * @param render
	 */
	void removeRender(IRender render);

	/**
	 * Process the click of the menu identified by the given Id.
	 * 
	 * @param appId
	 * @param objectId
	 *            Id of the menu that was clicked.
	 */
	void processMenu(String appId, String objectId);

	/**
	 * 
	 * @param key
	 * @return
	 */
	IAttributeRender getAttributeRender(String key);

}
