package br.com.maisha.wind.controller.execution;

import br.com.maisha.wind.controller.model.ExecutionContext;

public class SaveCarRule {

	public ExecutionContext<?> execute(ExecutionContext<?> ctx){
		ctx.getSession().put("msg", "Hello!");
		return ctx;
	}
	
}
