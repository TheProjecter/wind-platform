package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;

import org.apache.commons.digester.Digester;

import br.com.maisha.terra.lang.ResourceBundleEntry;
import br.com.maisha.terra.lang.WindApplication;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AppCfgReader implements IAppCfgReader {

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IAppCfgReader#read(java.io.InputStream)
	 */
	public WindApplication read(InputStream is) throws Exception {
		Digester d = new Digester();
		d.setValidating(false);

		d.addObjectCreate("app", WindApplication.class);
		d.addSetProperties("app", "name", "name");
		d.addSetProperties("app", "appId", "appId");

		d.addObjectCreate("app/bundle", ResourceBundleEntry.class);
		d.addSetProperties("app/bundle", "id", "id");
		d.addSetProperties("app/bundle", "path", "path");

		d.addSetNext("app/bundle", "addResourceBundle");

		WindApplication app = (WindApplication) d.parse(is);

		return app;
	}

}
