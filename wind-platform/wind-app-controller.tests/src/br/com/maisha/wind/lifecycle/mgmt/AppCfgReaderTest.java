package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;
import java.util.List;

import br.com.maisha.terra.lang.MenuGroup;
import br.com.maisha.terra.lang.MenuItem;
import br.com.maisha.terra.lang.MenuItem.MenuType;
import br.com.maisha.terra.lang.ResourceBundleEntry;
import br.com.maisha.terra.lang.WindApplication;

/**
 * Test cases for {@link AppCfgReader}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class AppCfgReaderTest {

	private AppCfgReader bean = null;

	@Before
	public void before() {
		bean = new AppCfgReader();
	}

	@After
	public void after() {
		bean = null;
	}

	/**
	 * Verifies if the parse is doing well
	 * 
	 * @throws Exception
	 */
	@Test
	public void testRead() throws Exception {
		InputStream is = getClass().getResourceAsStream("/br/com/maisha/wind/lifecycle/mgmt/wind-app.cfg.xml");

		WindApplication app = bean.read(is);

		// app
		assertNotNull(app);
		assertEquals("testApp", app.getAppId());
		assertEquals("Test Wind App", app.getName());
		assertEquals("pt_BR", app.getDefaultLocale());
		assertEquals("DESC", app.getDescription());
		assertEquals("EPL", app.getLicence());
		assertEquals("WIND", app.getCopyright());

		// bundle
		assertEquals(2, app.getResourceBundles().size());
		ResourceBundleEntry rb1 = app.getResourceBundles().get(0);
		ResourceBundleEntry rb2 = app.getResourceBundles().get(1);
		assertEquals("bId", rb1.getId());
		assertEquals("bPath", rb1.getPath());
		assertEquals("bLcl", rb1.getLocale());
		assertEquals("b2Id", rb2.getId());
		assertEquals("b2Path", rb2.getPath());
		assertEquals("b2Lcl", rb2.getLocale());

		// menu
		assertEquals(2, app.getMenuGroup().size());
		MenuGroup g1 = app.getMenuGroup().get(0);
		MenuGroup g2 = app.getMenuGroup().get(1);
		assertEquals("Cadastros", g1.getLabel());
		assertEquals(Integer.valueOf(1), g1.getSequence());
		assertEquals(true, g1.getVisible());
		assertEquals("ic.gif", g1.getIcon());
		assertEquals("Saida", g2.getLabel());
		assertEquals(Integer.valueOf(2), g2.getSequence());

		List<MenuItem> g1Items = g1.getItems();
		assertEquals(3, g1Items.size());
		assertEquals("Funcionario", g1Items.get(0).getDomainObject());
		assertEquals("Funcionário", g1Items.get(0).getLabel());
		assertEquals(true, g1Items.get(0).getVisible());
		assertEquals(MenuType.SEPARATOR, g1Items.get(1).getType());
		assertEquals("basic", g1Items.get(2).getDomainObject());
		assertEquals("Basic", g1Items.get(2).getLabel());
		assertEquals(true, g1Items.get(2).getVisible());
		assertEquals("icon/filter.gif", g1Items.get(2).getIcon());

		List<MenuItem> g2Items = g2.getItems();
		assertEquals(1, g2Items.size());

		// datasource
		Datasource ds = app.getDatasource();
		assertNotNull(ds);
		assertEquals("hsqldburl", ds.getUrl());
		assertEquals("sa", ds.getUsername());
		assertEquals("12345", ds.getPassword());
		assertEquals("hsqldb", ds.getRdbmsVendor());
	}
}
