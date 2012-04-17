package br.com.maisha.wind.test.mock;

import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.storage.hibernate.HibernateStorage;

public class SaveConta {

	private HibernateStorage storage;
	
	public ExecutionContext<?> execute(ExecutionContext<?> ctx){
		ctx.getSession().put("msg", "Hello!");
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
}
