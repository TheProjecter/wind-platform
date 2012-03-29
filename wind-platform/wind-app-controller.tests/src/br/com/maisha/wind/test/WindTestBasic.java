package br.com.maisha.wind.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.execution.SaveCarRule;
import br.com.maisha.wind.lifecycle.mgmt.ApplicationManager;

public class WindTestBasic {

	protected WindApplication windApp;

	public void setUp() {
		mockWindApplication();
	}

	private void mockWindApplication() {
		windApp = new WindApplication();
		windApp.setClassLoader(SaveCarRule.class.getClassLoader());
		buildDomainObjects(windApp);
	}



	private void buildDomainObjects(WindApplication app) {
		DomainObject obj = new DomainObject("car", "Car");

		obj.setOperations(new ArrayList<Operation>());

		Operation op = new Operation("groovy", "save", "Salvar");

		op.setProperties(new HashMap<String, Property>());
		op.getProperties().put(
				PropertyInfo.FILE.getPropName(),
				new Property(PropertyInfo.FILE.getPropName(),
						"br.com.maisha.wind.controller.execution.SaveCarRule"));
		op.setDomainObject(obj);
		obj.getOperations().add(op);

		obj.setApplication(app);
		app.addDomainObject(obj);
	}

	
	protected void buildApplicationContext() {
		ApplicationManager appMngr = new ApplicationManager();
		windApp.setAppCtx(appMngr.buildApplicationContext(windApp));

	}
}
