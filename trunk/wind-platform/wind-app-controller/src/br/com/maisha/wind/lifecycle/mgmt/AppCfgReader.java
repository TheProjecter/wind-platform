package br.com.maisha.wind.lifecycle.mgmt;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.digester.Digester;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.maisha.terra.lang.MenuGroup;
import br.com.maisha.terra.lang.MenuItem;
import br.com.maisha.terra.lang.ResourceBundleEntry;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.controller.rcp.Activator;

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
		d.addSetProperties("app", "locale", "defaultLocale");
		d.addCallMethod("app/about/description", "setDescription", 0);
		d.addCallMethod("app/about/licence", "setLicence", 0);
		d.addCallMethod("app/about/copyright", "setCopyright", 0);

		d.addObjectCreate("app/bundle", ResourceBundleEntry.class);
		d.addSetProperties("app/bundle", "id", "id");
		d.addSetProperties("app/bundle", "path", "path");
		d.addSetProperties("app/bundle", "locale", "locale");

		d.addSetNext("app/bundle", "addResourceBundle");

		d.addObjectCreate("*/group", MenuGroup.class);
		d.addSetProperties("*/group", "icon", "icon");
		d.addSetProperties("*/group", "label", "label");
		d.addSetProperties("*/group", "visible", "visible");
		d.addSetProperties("*/group", "sequence", "sequence");

		d.addObjectCreate("*/item", MenuItem.class);
		d.addSetProperties("*/item", "domain", "domainObject");
		d.addSetProperties("*/item", "icon", "icon");
		d.addSetProperties("*/item", "label", "label");
		d.addSetProperties("*/item", "visible", "visible");
		d.addSetProperties("*/item", "sequence", "sequence");
		d.addSetNext("*/item", "addItem");

		d.addObjectCreate("*/separator", MenuItem.class);
		d.addSetProperties("*/separator", "sequence", "sequence");
		d.addCallMethod("*/separator", "setSeparator");
		d.addSetNext("*/separator", "addItem");

		d.addSetNext("*/group", "addMenuGroup");

		WindApplication app = (WindApplication) d.parse(is);

		return app;
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class DTDEntityResolver implements EntityResolver {

		/**
		 * 
		 * @see org.xml.sax.EntityResolver#resolveEntity(java.lang.String, java.lang.String)
		 */
		public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
			URL url = Activator.getDefault().getBundle().getResource("wind-app-cfg.dtd");
			return new InputSource(url.openStream());
		}

	}

}
