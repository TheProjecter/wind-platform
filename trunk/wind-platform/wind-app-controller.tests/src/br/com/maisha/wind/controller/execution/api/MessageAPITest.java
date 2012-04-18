package br.com.maisha.wind.controller.execution.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.test.WindTestBasic;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class MessageAPITest extends WindTestBasic{

	private MessageAPI bean;
	private ExecutionContext<ModelReference> ctx;
	
	@Before
	public void before(){
		bean = new MessageAPI();
		ctx = new ExecutionContext<ModelReference>();
		DomainObject meta = new DomainObject("non", "Non");
		meta.setApplication(new WindApplication());
		ctx.setMeta(meta);
		
		PlatformMessageRegistry pmr = new PlatformMessageRegistry();
		pmr.init();
	}
	
	@After
	public void after(){
		bean = null;
	}
	
	@Test
	public void testInfo1(){
		bean.info(ctx, "this is an info");
		assertNotNull(ctx.getMessages());
		assertEquals(ctx.getMessages().size(), 1);
		assertEquals("this is an info", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is an info", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	
	@Test
	public void testInfo2(){
		bean.info(ctx, "this is an info with {0}", "PARAM");
		assertNotNull(ctx.getMessages());
		assertEquals(1, ctx.getMessages().size());
		assertEquals("this is an info with {0}", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is an info with PARAM", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	@Test
	public void testWarn1(){
		bean.info(ctx, "this is a warn");
		assertNotNull(ctx.getMessages());
		assertEquals(ctx.getMessages().size(), 1);
		assertEquals("this is a warn", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is a warn", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	
	@Test
	public void testWarn2(){
		bean.info(ctx, "this is a warn with {0}", "PARAM");
		assertNotNull(ctx.getMessages());
		assertEquals(1, ctx.getMessages().size());
		assertEquals("this is a warn with {0}", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is a warn with PARAM", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	@Test
	public void testError1(){
		bean.info(ctx, "this is an error");
		assertNotNull(ctx.getMessages());
		assertEquals(ctx.getMessages().size(), 1);
		assertEquals("this is an error", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is an error", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	
	@Test
	public void testError2(){
		bean.info(ctx, "this is an error with {0}", "PARAM");
		assertNotNull(ctx.getMessages());
		assertEquals(1, ctx.getMessages().size());
		assertEquals("this is an error with {0}", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is an error with PARAM", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	@Test
	public void testSuccess1(){
		bean.info(ctx, "this is a success");
		assertNotNull(ctx.getMessages());
		assertEquals(ctx.getMessages().size(), 1);
		assertEquals("this is a success", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is a success", ctx.getMessages().get(0).getFormattedMessage());
	}
	
	
	@Test
	public void testSuccess2(){
		bean.info(ctx, "this is a success with {0}", "PARAM");
		assertNotNull(ctx.getMessages());
		assertEquals(1, ctx.getMessages().size());
		assertEquals("this is a success with {0}", ctx.getMessages().get(0).getI18nMessage());
		assertEquals("this is a success with PARAM", ctx.getMessages().get(0).getFormattedMessage());
	}
}
