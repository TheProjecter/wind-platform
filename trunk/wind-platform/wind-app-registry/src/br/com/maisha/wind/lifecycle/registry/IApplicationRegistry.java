package br.com.maisha.wind.lifecycle.registry;

import java.util.List;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.component.Component;
import br.com.maisha.wind.lifecycle.model.WindApplication;

/**
 * This is responsible for hold all object metadata of all applications current
 * running on the platform.
 * 
 * <p/>
 * The most common implementation {@link ApplicationRegistry} based on HashMap.
 * 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IApplicationRegistry extends Component {

	/**
	 * Places the given application into the registry.
	 * 
	 * @param app
	 *            App to put into registry.
	 */
	void register(WindApplication app);

	/**
	 * Gets the application corresponding to the given id.
	 * 
	 * @param appId
	 *            Application ID.
	 * @return The matching application.
	 */
	WindApplication retrieve(String appId);

	/**
	 * Convenience method for obtaining all objects of a given application.
	 * 
	 * @param appId
	 *            Application ID;
	 * @return All objects that belongs to the given application.
	 */
	List<DomainObject> getAllObjects(String appId);
}
