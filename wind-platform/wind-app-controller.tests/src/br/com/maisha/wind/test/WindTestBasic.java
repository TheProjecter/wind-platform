package br.com.maisha.wind.test;

import org.junit.After;
import org.junit.Before;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindTestBasic {

	/** */
	protected WindApplicationMockBuilder mockBuilder;

	@Before
	public void before() throws Exception {
		mockBuilder = new WindApplicationMockBuilder();
	}

	@After
	public void after() throws Exception {
		mockBuilder = null;
	}

}
