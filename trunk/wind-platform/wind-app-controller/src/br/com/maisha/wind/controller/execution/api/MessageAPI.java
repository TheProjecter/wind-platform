package br.com.maisha.wind.controller.execution.api;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class MessageAPI {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(MessageAPI.class);

	/** */
	private ExecutionContext<ModelReference> ctx;

	/**
	 * 
	 * @param ctx
	 */
	public MessageAPI(ExecutionContext<ModelReference> ctx) {
		this.ctx = ctx;
	}

	/**
	 * 
	 * @param message
	 */
	public void info(DomainObject source, String message, Object... param) {
		message(source, MessageKind.INFO, message, param);
	}

	/**
	 * 
	 * @param message
	 */
	public void error(DomainObject source, String message, Object... param) {
		message(source, MessageKind.ERROR, message, param);
	}

	/**
	 * 
	 * @param message
	 */
	public void success(DomainObject source, String message, Object... param) {
		message(source, MessageKind.SUCCESS, message, param);
	}

	/**
	 * 
	 * @param message
	 */
	public void warn(DomainObject source, String message, Object... param) {
		message(source, MessageKind.WARNING, message, param);
	}

	/**
	 * @param kind
	 * @param message
	 */
	private void message(DomainObject source, MessageKind kind, String message, Object... param) {
		UserMessage um = new UserMessage(kind, message, source, param);
		ctx.getMessages().add(um);
	}

	/**
	 * 
	 * @param op
	 * @param message
	 */
	public void logDebug(Operation op, String message){
		log(Level.DEBUG, op, message);
	}

	/**
	 * 
	 * @param op
	 * @param message
	 */
	public void logInfo(Operation op, String message){
		log(Level.INFO, op, message);
	}	
	
	/**
	 * 
	 * @param op
	 * @param message
	 */
	public void logError(Operation op, String message){
		log(Level.ERROR, op, message);
	}	
	
	/**
	 * 
	 * @param op
	 * @param message
	 */
	public void logWarn(Operation op, String message){
		log(Level.WARN, op, message);
	}
	
	/**
	 * 
	 * @param source
	 * @param message
	 */
	private void log(Level level, Operation op, String message) {
		log.log(op.getLabel(), level, message, null);
	}







	
	
}
