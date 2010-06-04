package br.com.maisha.wind.controller.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;

import br.com.maisha.terra.lang.Operation;

/**
 * Encapsulates all information collected during the process of execute an
 * operation.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ExecutionContext<T> {

	/** Monitor. */
	IProgressMonitor monitor;

	/** Operation to run. */
	private Operation operation;

	/** Domain object instance. */
	private T instance;

	/** Log reference. */
	private Logger log;

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

	/** @see #monitor */
	public IProgressMonitor getMonitor() {
		return monitor;
	}

	/** @see #monitor */
	public void setMonitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	/** @see #log */
	public Logger getLog() {
		return log;
	}

	/** @see #log */
	public void setLog(Logger log) {
		this.log = log;
	}

}
