package br.com.maisha.wind.controller;

import java.util.List;
import java.util.Map;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * Responsible for a Wind Application
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IApplicationController {

	/**
	 * Executes the operation requested for the given Execution Context.
	 * 
	 * @param ctx
	 *            Execution Context containing all request info.
	 * @return The resultant Execution Context.
	 */
	ExecutionContext<ModelReference> runOperation(ExecutionContext<ModelReference> ctx);

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
	List<ModelReference> filter(IUserContext userContext, DomainObject dobj);

	/**
	 * 
	 * @param obj
	 * @param lst
	 * @return
	 */
	List<Map<String, Object>> toMap(DomainObject obj, List<ModelReference> lst);

	/**
	 * 
	 * @param ref
	 */
	ModelReference openObjectInstance(IUserContext userContext, ModelReference ref);

	/**
	 * Creates a new instance of the given DomainObject.
	 * 
	 * @param dObj
	 * @param userContext
	 * @return
	 */
	ModelReference createNewInstance(IUserContext userContext, DomainObject dObj);

	/**
	 * 
	 * @param appId
	 * @param objectId
	 */
	DomainObject openObject(String appId, String objectId, IUserContext userContext);

	/**
	 * 
	 * @param appId
	 * @param objectId
	 */
	void closeObject(String appId, String objectId, IUserContext userContext);

	/**
	 * Navigates to the DomainObject mentioned as the type of the given
	 * attribute.
	 * 
	 * @param sessid
	 *            SessionID
	 * @param originatingAttribute
	 *            Attribute that originates (or requests) the navigation
	 */
	void navigateFrom(IUserContext userContext, Attribute originatingAttribute, ModelReference ref);
}
