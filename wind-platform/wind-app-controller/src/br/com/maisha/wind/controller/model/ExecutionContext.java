package br.com.maisha.wind.controller.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.wind.common.user.IUserContext;

/**
 * Encapsulates all information collected during the process of execute an
 * operation.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ExecutionContext<T> {

	/** Reference to current meta object. */
	private DomainObject meta;

	/** Operation to run. */
	private Operation operation;

	/** Domain object instance. */
	private T instance;

	/** Message list. */
	private List<UserMessage> messages = new ArrayList<UserMessage>();

	/** Grid Selection */
	private List<?> gridSelection = null;

	/** Objects to be displayed in Grid View */
	private List<ModelReference> gridData = null;

	/** Rules can use this map to store data between executions. */
	private Map<String, Object> session = new HashMap<String, Object>();

	/** User Data. */
	private IUserContext userContext;

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

	/** @see #gridSelection */
	public List<?> getGridSelection() {
		return gridSelection;
	}

	/** @see #gridSelection */
	public void setGridSelection(List<?> gridSelection) {
		this.gridSelection = gridSelection;
	}

	/** @see #gridData */
	public List<ModelReference> getGridData() {
		return gridData;
	}

	/** @see #gridData */
	public void setGridData(List<ModelReference> gridData) {
		this.gridData = gridData;
	}

	/** @see #meta */
	public DomainObject getMeta() {
		return meta;
	}

	/** @see #meta */
	public void setMeta(DomainObject meta) {
		this.meta = meta;
	}

	/** @see #session */
	public Map<String, Object> getSession() {
		return session;
	}

	/** @see #session */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/** @see ExecutionContext#userContext */
	public IUserContext getUserContext() {
		return userContext;
	}

	/** @see ExecutionContext#userContext */
	public void setUserContext(IUserContext userContext) {
		this.userContext = userContext;
	}

}
