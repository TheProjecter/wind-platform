package br.com.maisha.wind.controller.execution.api;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
import br.com.maisha.wind.controller.storage.IStorage;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RuleAPI {

	/** */
	private ExecutionContext<ModelReference> ctx;

	/** */
	private IStorage persistentStorage;

	/**
	 * 
	 * @param ctx
	 */
	public RuleAPI(ExecutionContext<ModelReference> ctx) {
		this.ctx = ctx;
	}

	public void save(String appId, ModelReference d){
		persistentStorage.save(appId, d);
	}
	
	public Object getById(String appId, Class<?> clazz, Serializable id){
		return persistentStorage.getById(appId, clazz, id);
	}
	
	
	public void update(String appId, ModelReference ref){
		persistentStorage.update(appId, ref);
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

	public IStorage getPersistentStorage() {
		return persistentStorage;
	}

	public void setPersistentStorage(IStorage persistentStorage) {
		this.persistentStorage = persistentStorage;
	}

}
