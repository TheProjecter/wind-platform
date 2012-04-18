package br.com.maisha.wind.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;

import org.joor.Reflect;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.listener.AppModelListenerRegistry;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
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
	 * Given that I want to execute a groovy business rule that uses the message api
	 * </p>
	 * <p>
	 * When I call {@link ApplicationController#runOperation(ExecutionContext)}
	 * </p>
	 * <p>
	 * Then I must check the resulting ExecutionContext with all messages added by the rule
	 * </p>
	 * @throws Exception 
	 */
	@Test
	public void testMessageAPIGroovyOperation() throws Exception {
		PlatformMessageRegistry pmr = new PlatformMessageRegistry();
		pmr.init();

		Locale ptBrLoc = new Locale("pt", "BR");
		windApp.addResourceBundle(ptBrLoc, new PropertyResourceBundle(getClass().getResourceAsStream("/wind-app-controller-messages-mock.properties")));
		windApp.setCurrentLocale(ptBrLoc);
		
		ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
		DomainObject dObj = findDomainObject("Conta", windApp);
		ctx.setOperation(dObj.getOperation("UsesOfMessageAPI"));
		ctx.setSessid("TEST_SESSID");
		ctx.setMeta(dObj);
		
		ctx = bean.runOperation(ctx);
		
		assertTrue((Boolean) ctx.getSession().get("executed"));
		assertNotNull(ctx.getMessages());
		assertEquals(10, ctx.getMessages().size());
		assertEquals("this is a warn", ctx.getMessages().get(0).getI18nMessage());
		assertEquals(MessageKind.WARNING, ctx.getMessages().get(0).getKind());
		
		assertEquals("this is an info", ctx.getMessages().get(1).getI18nMessage());
		assertEquals(MessageKind.INFO, ctx.getMessages().get(1).getKind());
		
		assertEquals("this is an error", ctx.getMessages().get(2).getI18nMessage());
		assertEquals(MessageKind.ERROR, ctx.getMessages().get(2).getKind());
		
		assertEquals("this is a success", ctx.getMessages().get(3).getI18nMessage());
		assertEquals(MessageKind.SUCCESS, ctx.getMessages().get(3).getKind());
		
		assertEquals("this is a warn with PARAM", ctx.getMessages().get(4).getFormattedMessage());
		assertEquals(MessageKind.WARNING, ctx.getMessages().get(4).getKind());
		
		assertEquals("this is an info with PARAM", ctx.getMessages().get(5).getFormattedMessage());
		assertEquals(MessageKind.INFO, ctx.getMessages().get(5).getKind());

		assertEquals("this is an error with PARAM", ctx.getMessages().get(6).getFormattedMessage());
		assertEquals(MessageKind.ERROR, ctx.getMessages().get(6).getKind());
		
		assertEquals("this is a success with PARAM", ctx.getMessages().get(7).getFormattedMessage());
		assertEquals(MessageKind.SUCCESS, ctx.getMessages().get(7).getKind());
		
		assertEquals("this is a success with a param and another one", ctx.getMessages().get(8).getFormattedMessage());
		assertEquals(MessageKind.SUCCESS, ctx.getMessages().get(8).getKind());
		
		assertEquals("this is a message key used for tests", ctx.getMessages().get(9).getFormattedMessage());
		assertEquals(MessageKind.SUCCESS, ctx.getMessages().get(9).getKind());
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
