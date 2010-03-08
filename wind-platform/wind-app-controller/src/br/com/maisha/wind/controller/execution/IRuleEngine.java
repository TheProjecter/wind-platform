package br.com.maisha.wind.controller.execution;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * Represents an engine capable of running business rules.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IRuleEngine {

	/**
	 * Run a defined operation referenced by the given context.
	 * <p/>
	 * Model data living inside the context are accessible for the rule.
	 * 
	 * @param ctx
	 *            Execution Context.
	 * @return Execution Contex.
	 */
	ExecutionContext<ModelReference> execute(
			ExecutionContext<ModelReference> ctx);

}
