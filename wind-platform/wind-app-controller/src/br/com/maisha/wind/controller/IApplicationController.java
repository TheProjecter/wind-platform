package br.com.maisha.wind.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * TODO javadoc
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IApplicationController {

	/**
	 * 
	 * @param ctx
	 * @return
	 */
	ExecutionContext<ModelReference> runOperation(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param modelInstance
	 */
	void evalExpressions(ModelReference modelInstance);

	/**
	 * 
	 * @param ctx
	 */
	ModelReference processExecutionContext(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param dobj
	 * @return
	 */
	List<ModelReference> filter(Serializable sessid, DomainObject dobj);

	/**
	 * 
	 * @param instance
	 * @param attributeName
	 * @return
	 */
	Object getObjectValue(Object instance, String attributeName);

	/**
	 * 
	 * @param obj
	 * @param lst
	 * @return
	 */
	List<Map<String, Object>> toMap(DomainObject obj, List<ModelReference> lst);

	/**
	 * 
	 * @param script
	 * @param context
	 * @return
	 */
	Object runScript(String script, Map<String, Object> context);

	/**
	 * 
	 * @param engineType
	 * @param script
	 * @param context
	 * @return
	 */
	Object runScript(String engineType, String script, Map<String, Object> context);

	/**
	 * 
	 * @param ref
	 */
	ModelReference openObjectInstance(Serializable sessid, ModelReference ref);

	/**
	 * Configures all labels for all domain objects in every application installed in the platform.
	 * 
	 * @param context
	 */
	void configureAllLabels(BundleContext context);

	/**
	 * Configures all labels for all domain objects in every application installed in the platform.
	 * 
	 * @param context
	 * @param app
	 * 
	 */
	void configureAllLabels(BundleContext context, WindApplication app);

	/**
	 * 
	 * @param dObj
	 * @param ct
	 * @param level
	 */
	void handleObjectEvent(DomainObject dObj, ChangeType ct, LevelType level);

	/**
	 * Creates a new instance of the given DomainObject.
	 * 
	 * @param dObj
	 * @return
	 */
	ModelReference createNewInstance(DomainObject dObj);

	/**
	 * 
	 * @param appId
	 * @param objectId
	 */
	DomainObject openObject(String appId, String objectId, Serializable sessid);

	/**
	 * 
	 * @param appId
	 * @param objectId
	 */
	void closeObject(String appId, String objectId, Serializable sessid);
}
