package br.com.maisha.wind.controller;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.framework.BundleContext;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
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
	List<ModelReference> filter(DomainObject dobj, IProgressMonitor monitor);

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
	 * @param ref
	 */
	void openObjectInstance(ModelReference ref);

	/**
	 * Configures all labels for all domain objects in every application
	 * installed in the platform.
	 * 
	 * @param context
	 */
	void configureAllLabels(BundleContext context);
	
	/**
	 * Configures all labels for all domain objects in every application
	 * installed in the platform.
	 * 
	 * @param context
	 * @param app
	 * 
	 */
	void configureAllLabels(BundleContext context, WindApplication app);
}
