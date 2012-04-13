package br.com.maisha.wind.lifecycle.mgmt;

import javax.sql.DataSource;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;

import br.com.maisha.terra.lang.Datasource;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.execution.BasicRule;
import br.com.maisha.wind.test.WindTestBasic;
import br.com.maisha.wind.test.mock.SaveConta;

/**
 * Test cases for {@link ApplicationManager}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManagerTest extends WindTestBasic {

	private ApplicationManager bean;
	private WindApplication windApp;

	@Before
	public void before() throws Exception {
		super.before();
		windApp = mockBuilder.buildWindApplication();
		bean = new ApplicationManager();
	}

	@After
	public void after() throws Exception {
		bean = null;
		windApp = null;
	}

	/**
	 * <p>
	 * Given that I want to build an ApplicationContext for a determinated Wind
	 * Application
	 * </p>
	 * <p>
	 * When I call buildApplicationContext on IApplicationManager
	 * </p>
	 * <p>
	 * Then I must check the created ApplicationContext
	 * </p>
	 * 
	 * @throws Exception
	 */
	@Test
	public void testBuildApplicationContext() throws Exception {
		windApp.setDatasource(new Datasource("jdbc:hsqldb:mem:testdb", "sa", "", "hsqldb"));
		ApplicationContext appCtx = bean.buildApplicationContext(windApp);

		// verifica se as regras de negocio foram carregadas
		Object saveObject = appCtx.getBean("SaveConta");
		Object ruleObject = appCtx.getBean("SaveContaRule");

		Assert.assertNotNull(saveObject);
		Assert.assertNotNull(ruleObject);
		Assert.assertTrue(saveObject instanceof SaveConta);
		Assert.assertTrue(ruleObject instanceof BasicRule);

		// verifica se o datasource e o sessionFactory foram criados
		Object datasource = appCtx.getBean("datasource");
		Assert.assertNotNull(datasource);
		Object sessionFactory = appCtx.getBean("sessionFactory");
		Assert.assertNotNull(sessionFactory);
		Object storage = appCtx.getBean("storage");
		assertNotNull(storage);

		// tenta realizar uma conexao
		((DataSource) datasource).getConnection();
	}

	/**
	 * <p>
	 * Given that I want to build an ApplicationContext for a determinated Wind
	 * Application without using a datasource
	 * </p>
	 * <p>
	 * When I call buildApplicationContext on IApplicationManager
	 * </p>
	 * <p>
	 * Then I must check the created ApplicationContext but no sessionFactory
	 * </p>
	 * 
	 * @throws Exception
	 */
	@Test(expected = NoSuchBeanDefinitionException.class)
	public void testBuildApplicationContext2() throws Exception {
		ApplicationContext appCtx = bean.buildApplicationContext(windApp);

		// verifica se o sessionFactory NAO foi criado
		appCtx.getBean("sessionFactory");
		fail("Experada uma " + NoSuchBeanDefinitionException.class);
	}

	
	/**
	 * <p>
	 * Given that I want to build an ApplicationContext for a determinated Wind
	 * Application with a datasource for an invalid RDBMS
	 * </p>
	 * <p>
	 * When I call buildApplicationContext on IApplicationManager
	 * </p>
	 * <p>
	 * Then I must get an exception
	 * </p>
	 * 
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testBuildApplicationContext3() throws Exception {
		windApp.setDatasource(new Datasource("jdbc:hsqldb:mem:testdb", "sa", "", "NOSENSE"));
		bean.buildApplicationContext(windApp);
	}
	
	
	/**
	 * <p>
	 * Given that I want to build an ApplicationContext for a determinated Wind
	 * Application with a datasource for an invalid RDBMS
	 * </p>
	 * <p>
	 * When I call buildApplicationContext on IApplicationManager
	 * </p>
	 * <p>
	 * Then I must get an exception
	 * </p>
	 * 
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testBuildApplicationContext4() throws Exception {
		windApp.setDatasource(new Datasource("jdbc:hsqldb:mem:testdb", "sa", "", null));
		bean.buildApplicationContext(windApp);
	}
}
