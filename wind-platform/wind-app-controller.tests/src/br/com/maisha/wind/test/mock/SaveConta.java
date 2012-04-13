package br.com.maisha.wind.test.mock;

import br.com.maisha.wind.controller.model.ExecutionContext;

public class SaveConta {

	public ExecutionContext<?> execute(ExecutionContext<?> ctx){
		ctx.getSession().put("msg", "Hello!");
		return ctx;
	}
	
}
