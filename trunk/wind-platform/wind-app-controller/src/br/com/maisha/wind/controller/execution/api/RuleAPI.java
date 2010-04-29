package br.com.maisha.wind.controller.execution.api;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RuleAPI {

	private ExecutionContext<ModelReference> ctx;

	public RuleAPI(ExecutionContext<ModelReference> ctx) {
		this.ctx = ctx;
	}

	public void info(String message) {
		UserMessage um = new UserMessage(MessageKind.INFO, message);
		ctx.getMessages().add(um);
	}
	
	public void warn(String message) {
		UserMessage um = new UserMessage(MessageKind.WARNING, message);
		ctx.getMessages().add(um);
	}

}
