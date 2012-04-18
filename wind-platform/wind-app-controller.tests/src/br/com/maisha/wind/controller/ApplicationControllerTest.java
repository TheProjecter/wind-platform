package br.com.maisha.wind.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.joor.Reflect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.AppModelListenerRegistry;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.lifecycle.mgmt.ApplicationManager;
import br.com.maisha.wind.test.WindTestBasic;

/**
 * Test cases for {@link ApplicationController}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationControllerTest extends WindTestBasic {

	private ApplicationManager appMgr;
	private ApplicationController bean;
	private WindApplication windApp;

	@Before
	public void before() throws Exception {
		super.before();
		
		// mock
		windApp = mockBuilder.buildWindApplication();
		appMgr = new ApplicationManager();
		ApplicationContext appCtx = appMgr.buildApplicationContext(windApp);
		windApp.setAppCtx(appCtx);
		
		// bean under test
		bean = new ApplicationController();
		bean.setModelListener(new AppModelListenerRegistry());
	}

	@After
	public void after() throws Exception {
		bean = null;
		windApp = null;
	}

	/**
	 * <p>
	 * Given that I want to get a business rule executed.
	 * </p>
	 * <p>
	 * When I call {@link ApplicationController#runOperation(ExecutionContext)}
	 * </p>
	 * <p>
	 * Then I must check the resulting ExecutionContext
	 * </p>
	 */
	@Test
	public void testRunOperation() {
		ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
		DomainObject dObj = findDomainObject("Conta", windApp);
		ctx.setOperation(dObj.getOperation("SaveConta"));
		ctx.setSessid("TEST_SESSID");
		
		ctx = bean.runOperation(ctx);
		
		assertEquals("Hello!", ctx.getSession().get("msg"));
		assertTrue((Boolean) ctx.getSession().get("executed"));

	}

	
	/**
	 * <p>
	 * Given that I want to validate the execution of a ExecutionContext
	 * </p>
	 * <p>
	 * When I call {@link ApplicationController#processValidations(ExecutionContext)}
	 * </p>
	 * <p>
	 * Then I must check the resulting ExecutionContext
	 * </p>
	 * @throws Exception 
	 */
	@Test
	public void testProcessValidations() throws Exception {
		ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
		DomainObject dObj = findDomainObject("Conta", windApp);
		ctx.setOperation(dObj.getOperation("SaveConta"));
		ctx.setSessid("TEST_SESSID");
		ctx.setMeta(dObj);
		
		// popula os dados submetidos a validacao
		ModelReference instance = (ModelReference) dObj.getObjectClass().newInstance();
		Reflect.on(instance).set("nome", "Credito Itau");
		Reflect.on(instance).set("tipo", "Credito");
		ctx.setInstance(instance);
		
		//TODO
		//ctx = bean.processValidations(ctx);

	}
	
}
