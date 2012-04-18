package br.com.maisha.wind.controller.execution;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * Establishes the basic interface for every rule intended to be executed by the
 * Application Controller.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IRule {

	Object getRule();

	Operation getMeta();

	ExecutionContext<ModelReference> run(ExecutionContext<ModelReference> ctx);

}
