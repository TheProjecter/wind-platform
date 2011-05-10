package br.com.maisha.wind.lifecycle.registry;

import java.util.List;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.component.Component;

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
	boolean register(WindApplication app);

	/**
	 * Removes the given application from registry.
	 * 
	 * @param app
	 *            App to remove.
	 */
	boolean unregister(WindApplication app);	
	
	/**
	 * Gets the application corresponding to the given id.
	 * 
	 * @param appId
	 *            Application ID.
	 * @return The matching application.
	 */
	WindApplication retrieve(String appId);

	/**
	 * Gets all application registered under this.
	 * 
	 * @return A list containing all application's metadata.
	 */
	List<WindApplication> retrieve();

	/**
	 * Convenience method for obtaining all objects of a given application.
	 * 
	 * @param appId
	 *            Application ID;
	 * @return All objects that belongs to the given application.
	 */
	List<DomainObject> getAllObjects(String appId);

	/**
	 * 
	 * @param appId
	 * @param objectId
	 * @return
	 */
	DomainObject getObject(String appId, String objectId);
	
	/**
	 * 
	 * @param appId
	 * @param type
	 * @return
	 */
	@Deprecated
	DomainObject getObjectByType(String appId, String type);
}
