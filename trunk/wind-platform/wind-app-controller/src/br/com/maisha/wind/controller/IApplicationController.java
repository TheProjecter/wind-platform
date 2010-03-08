package br.com.maisha.wind.controller;

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

	void evalExpressions(ModelReference modelInstance);
}
