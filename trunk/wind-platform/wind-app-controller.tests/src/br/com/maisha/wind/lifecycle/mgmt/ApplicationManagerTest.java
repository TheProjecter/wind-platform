package br.com.maisha.wind.lifecycle.mgmt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import br.com.maisha.wind.controller.execution.BasicRule;
import br.com.maisha.wind.controller.execution.SaveCarRule;
import br.com.maisha.wind.test.WindTestBasic;

/**
 * Test cases for {@link ApplicationManager}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManagerTest extends WindTestBasic{
	
	private ApplicationManager bean;
	
	@Before
	public void setUp(){
		super.setUp();
		bean = new ApplicationManager();
	}
	
	@After
	public void tearDown(){
		bean = null;
	}
	
	@Test
	public void testBuildApplicationContext(){
		ApplicationContext appCtx = bean.buildApplicationContext(windApp);
		
		Object saveObject = appCtx.getBean("save");
		Object ruleObject = appCtx.getBean("saveRule");
		
		Assert.assertNotNull(saveObject);
		Assert.assertNotNull(ruleObject);
		Assert.assertTrue(saveObject instanceof SaveCarRule);
		Assert.assertTrue(ruleObject instanceof BasicRule);
		
	}

}
