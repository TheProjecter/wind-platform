/**
 * 
 */
package br.com.maisha.wind.controller.execution;

import java.util.Map;

import br.com.maisha.terra.lang.ModelReference;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IScriptExecutor {

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
	 * @param instance
	 * @param attributeName
	 * @return
	 */
	Object getObjectValue(Object instance, String attributeName);

	/**
	 * Processes all expressions (declared on the Domain Object) based on the
	 * current state of the given model instance.
	 * 
	 * @param modelInstance
	 *            Instance to eval.
	 */
	void evalExpressions(ModelReference modelInstance);

}
