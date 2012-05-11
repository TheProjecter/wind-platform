/**
 * 
 */
package br.com.maisha.wind.test;

import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;

import br.com.maisha.terra.ClassMaker;
import br.com.maisha.terra.IClassMaker;
import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.terra.TerraCompiler;
import br.com.maisha.terra.lang.Datasource;
import br.com.maisha.terra.lang.Datasource.RDMBSVendor;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.lifecycle.mgmt.ApplicationManager;

/**
 * Builds an instance of {@link WindApplication} mocked for tests. 
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class WindApplicationMockBuilder {

	/** */
	private ITerraCompiler langCompiler = new TerraCompiler() ;
	
	/** */
	private IClassMaker classMaker = new ClassMaker();

	/** */
	ApplicationManager appMngr = new ApplicationManager();
	
	/**
	 * 
	 * @return WindApplication prepared for tests.
	 * @throws Exception 
	 */
	public WindApplication buildWindApplication() throws Exception{
		WindApplication app = new WindApplication();
		app.setAppId("testApp");
		app.setName("Wind Mock Application for Tests");
		
		app.setDatasource(createDatasource());
		
		DomainObject dObj = buildDomainObject(getClass().getResourceAsStream("/br/com/maisha/wind/test/mock/Conta.do"));
		app.addDomainObject(dObj);

		dObj.setApplication(app);
		app.setClassLoader(new URLClassLoader(new URL[]{}, getClass().getClassLoader()));
		classMaker.makeClasses(app.getClassLoader(), app);
		
		return app;
	}

	/**
	 * @return
	 */
	private Datasource createDatasource() {
		Datasource ds = new Datasource();
		ds.setRdbmsVendor(RDMBSVendor.hsqldb.name());
		ds.setUrl("jdbc:hsqldb:mem:winddb");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}

	/**
	 * 
	 * @param dmoFile
	 * @return
	 * @throws Exception
	 */
	public DomainObject buildDomainObject(InputStream dmo) throws Exception{
		return langCompiler.compile(dmo);
	}
	
	/**
	 * 
	 * @param app
	 */
	public void buildApplicationContext(WindApplication app) {
		app.setAppCtx(appMngr.buildApplicationContext(app));
	}

}
