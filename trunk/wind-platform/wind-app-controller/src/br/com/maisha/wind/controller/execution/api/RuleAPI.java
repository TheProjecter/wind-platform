package br.com.maisha.wind.controller.execution.api;

import org.apache.commons.lang.StringUtils;

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

	/** */
	private ExecutionContext<ModelReference> ctx;

	/**
	 * 
	 * @param ctx
	 */
	public RuleAPI(ExecutionContext<ModelReference> ctx) {
		this.ctx = ctx;
	}

	/**
	 * 
	 * @param message
	 */
	public void info(String message) {
		message(MessageKind.INFO, message);
	}

	/**
	 * 
	 * @param message
	 */
	public void error(String message) {
		message(MessageKind.ERROR, message);
	}

	/**
	 * 
	 * @param message
	 */
	public void success(String message) {
		message(MessageKind.SUCCESS, message);
	}

	/**
	 * 
	 * @param message
	 */
	public void warn(String message) {
		message(MessageKind.WARNING, message);
	}

	/**
	 * @param kind
	 * @param message
	 */
	private void message(MessageKind kind, String message) {
		UserMessage um = new UserMessage(kind, message);
		ctx.getMessages().add(um);
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean notNull(Object value) {
		return value != null;
	}

	/**
	 * 
	 * @param string
	 * @return
	 */
	public boolean notEmpty(String string) {
		return !StringUtils.isEmpty(string) && !StringUtils.isBlank(string);
	}
}
