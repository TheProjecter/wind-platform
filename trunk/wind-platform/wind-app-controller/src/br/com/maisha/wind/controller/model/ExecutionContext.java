package br.com.maisha.wind.controller.model;

import java.util.ArrayList;
import java.util.List;

import br.com.maisha.terra.lang.Operation;

/**
 * Encapsulates all information collected during the process of execute an
 * operation.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ExecutionContext<T> {

	/** Operation to run. */
	private Operation operation;

	/** Domain object instance. */
	private T instance;

	/** Message list. */
	private List<UserMessage> messages = new ArrayList<UserMessage>();

	/** @see #operation */
	public Operation getOperation() {
		return operation;
	}

	/** @see #operation */
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	/** @see #instance */
	public T getInstance() {
		return instance;
	}

	/** @see #instance */
	public void setInstance(T instance) {
		this.instance = instance;
	}

	/** @see #messages */
	public List<UserMessage> getMessages() {
		return messages;
	}

	/** @see #messages */
	public void setMessages(List<UserMessage> messages) {
		this.messages = messages;
	}

}
