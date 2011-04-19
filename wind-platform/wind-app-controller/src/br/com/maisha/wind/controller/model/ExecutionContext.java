package br.com.maisha.wind.controller.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
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

	
	
}
