package br.com.maisha.wind.test.mock;

import br.com.maisha.wind.controller.execution.api.groovy.GroovyEngineBootstrap;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.storage.hibernate.HibernateStorage;

public class SaveConta {

	private HibernateStorage storage;
	private GroovyEngineBootstrap groovyApi;
	
	public ExecutionContext<?> execute(ExecutionContext<?> ctx){
		ctx.getSession().put("msg", "Hello!");
		ctx.getSession().put("executed", true);
		return ctx;
	}
	
	/** @see SaveConta#storage */
	public void setStorage(HibernateStorage storage) {
		this.storage = storage;
	}
	
	
	/** @see SaveConta#storage */
	public HibernateStorage getStorage() {
		return storage;
	}

	/** @see SaveConta#groovyApi */
	public GroovyEngineBootstrap getGroovyApi() {
		return groovyApi;
	}

	/** @see SaveConta#groovyApi */
	public void setGroovyApi(GroovyEngineBootstrap groovyApi) {
		this.groovyApi = groovyApi;
	}
	
	
}
