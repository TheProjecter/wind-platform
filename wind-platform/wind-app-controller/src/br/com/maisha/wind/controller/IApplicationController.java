package br.com.maisha.wind.controller;

import java.util.List;
import java.util.Map;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
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
	void processExecutionContext(ExecutionContext<ModelReference> ctx);

	/**
	 * 
	 * @param dobj
	 * @return
	 */
	List<ModelReference> filter(DomainObject dobj);

	/**
	 * 
	 * @param instance
	 * @param attributeName
	 * @return
	 */
	Object getObjectValue(Object instance, String attributeName);
	
	List<Map<String, Object>> toMap(DomainObject obj, List<ModelReference> lst);
}
