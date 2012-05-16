package br.com.maisha.wind.controller.execution;

import groovy.lang.Closure;

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
			throw new IllegalArgumentException("Operation is a required argument.");
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
	public ExecutionContext<ModelReference> run(ExecutionContext<ModelReference> ctx) {
		ExecutionContext<ModelReference> r = null;

		String type = op.getType();
		if ("groovy".equals(type)) {
			Closure<ExecutionContext<ModelReference>> cl = Reflect.on(getRule()).get("execute");
			ctx = cl.call(ctx);
		} else {
			ctx = Reflect.on(getRule()).call("execute", ctx).get();
		}
		return ctx;
	}
}
