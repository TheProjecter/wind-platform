package br.com.maisha.wind.test;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.springframework.util.CollectionUtils;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindTestBasic {

	/** */
	protected WindApplicationMockBuilder mockBuilder;

	protected WindApplication windApp;
	
	@Before
	public void before() throws Exception {
		mockBuilder = new WindApplicationMockBuilder();
	}

	@After
	public void after() throws Exception {
		mockBuilder = null;
	}


	/**
	 * @see org.springframework.test.AbstractSingleSpringContextTests#getConfigLocations()
	 */
	public String[] getConfigLocations() {
		return new String[] { "/spring-ctx-test.xml" };
	}

	/**
	 * Finds a Domain Object that matches the given Ref.
	 * 
	 * @param dObjRef
	 *            Ref to look for
	 * @param app
	 *            Application containing potencial matches
	 * @return The Domain Object if found.
	 */
	protected DomainObject findDomainObject(String dObjRef, WindApplication app) {
		if (StringUtils.isNotBlank(dObjRef) && app != null && !CollectionUtils.isEmpty(app.getDomainObjects())) {
			for (DomainObject dObj : app.getDomainObjects()) {
				if (dObjRef.equals(dObj.getRef())) {
					return dObj;
				}
			}
		}

		return null;
	}

}
