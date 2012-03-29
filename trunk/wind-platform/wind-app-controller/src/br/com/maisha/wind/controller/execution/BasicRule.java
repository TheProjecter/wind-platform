package br.com.maisha.wind.controller.execution;

import org.joor.Reflect;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.model.ExecutionContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class BasicRule implements IRule {

	/** Metadata that represents this Business Rule. */
	private Operation op;

	/**
	 * Create a new business rule based on the given metadata.
	 * 
	 * @param op
	 *            Operation metadata.
	 */
	public BasicRule(Operation op) {
		if (op == null) {
			throw new IllegalArgumentException(
					"Operation is a required argument.");
		}
		this.op = op;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IRule#getRule()
	 */
	public Object getRule() {
		WindApplication application = op.getDomainObject().getApplication();
		return application.getAppCtx().getBean(op.getRef());
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IRule#getMeta()
	 */
	public Operation getMeta() {
		return op;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.controller.execution.IRule#run(br.com.maisha.wind.controller.model.ExecutionContext)
	 */
	public ExecutionContext<?> run(ExecutionContext<?> ctx) {
		return Reflect.on(getRule())
				.call("execute", new ExecutionContext<ModelReference>()).get();
	}
}
