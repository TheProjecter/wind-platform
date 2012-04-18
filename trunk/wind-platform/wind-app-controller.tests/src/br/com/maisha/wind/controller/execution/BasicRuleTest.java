package br.com.maisha.wind.controller.execution;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.test.WindTestBasic;

/**
 * Test cases for {@link BasicRule}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class BasicRuleTest extends WindTestBasic {

	private BasicRule bean;
	private WindApplication windApp;

	@Before
	public void before() throws Exception {
		super.before();
		windApp = mockBuilder.buildWindApplication();
	}

	@After
	public void after() throws Exception {
		super.after();
		windApp = null;
	}

	/**
	 * <p>
	 * Given that I have an DomainObject with an operation called save.
	 * </p>
	 * <p>
	 * When I got a BasicRule for that operation
	 * </p>
	 * <p>
	 * Then I must get a reference to the class that implements that Business
	 * Rule
	 * </p>
	 * 
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testGetRule() throws Exception {
		mockBuilder.buildApplicationContext(windApp);
		
		DomainObject obj = windApp.getDomainObjects().iterator().next();
		Operation op = obj.getOperation("SaveConta");

		bean = new BasicRule(op);
		Assert.assertNotNull("Expected to get a reference to rule.",
				bean.getRule());
	}

	/**
	 * <p>
	 * Given that I have an DomainObject with an operation called save.
	 * </p>
	 * <p>
	 * When I try to create an Basic Rule passing null as argument.
	 * </p>
	 * <p>
	 * Then I must get an exception because it is not allowed. Rule
	 * </p>
	 */
	@Test
	public void testGetRule2() {

		try {
			bean = new BasicRule(null);
			Assert.fail("esperado uma exception");
		} catch (Exception e) {
			Assert.assertTrue("Esperado uma IllegalArgumentException",
					e instanceof IllegalArgumentException);
		}

	}

	/**
	 * <p>
	 * Given that I want to execute a certain operation.
	 * </p>
	 * <p>
	 * When I create an BasicRule an call run.
	 * </p>
	 * <p>
	 * Then I must get an ExecutionContext back.
	 * </p>
	 */
	@Test
	public void testRun() {
		mockBuilder.buildApplicationContext(windApp);
		DomainObject obj = windApp.getDomainObjects().iterator().next();
		Operation op = obj.getOperation("SaveConta");

		bean = new BasicRule(op);
		Assert.assertNotNull("Expected to get a reference to rule.",
				bean.getRule());

		ExecutionContext<ModelReference> ctxIn = new ExecutionContext<ModelReference>();
		ExecutionContext<?> ctxOut = bean
				.run(ctxIn);
		Assert.assertEquals(ctxIn, ctxOut);
		Assert.assertNotNull("Execution context nao pode ser null", ctxOut);
		Assert.assertEquals("Hello!", ctxOut.getSession().get("msg"));
	}

}
