package br.com.maisha.terra.lang;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import org.osgi.framework.BundleContext;
import org.springframework.context.ApplicationContext;

/**
 * Represents a application running on the platform.
 * 
 * TODO i really didn't like this name...
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindApplication {

	/** Application identifier. */
	private String appId;

	/** OSGi Bundle Id for this application. */
	private Long bundleId;

	/** Application name. */
	private String name;

	/** Default locale for app internationalization. */
	private String defaultLocale;

	/** Default locale for app internationalization. */
	private Locale currentLocale;

	private String description = "";

	private String licence = "";

	private String copyright = "";

	/** Domain Objects living at this application. */
	private Set<DomainObject> domainObjects = new HashSet<DomainObject>();

	/** Applications bundle context reference. */
	private BundleContext bundleContext;

	/** This application classloader. */
	private ClassLoader classLoader;

	/** Spring Application Context for this app. */
	private ApplicationContext appCtx;
	
	/** */
	private List<ResourceBundleEntry> resourceBundles = new ArrayList<ResourceBundleEntry>();

	/** */
	private Map<Locale, List<ResourceBundle>> resourceBundle = new HashMap<Locale, List<ResourceBundle>>();

	/** */
	private List<MenuGroup> menuGroup = new ArrayList<MenuGroup>();

	/** Hibernate configuration file. */
	private URL hibernateConfig;

	/** @see #appId */
	public String getAppId() {
		return appId;
	}

	/** @see #appId */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/** @see #domainObjects */
	public Set<DomainObject> getDomainObjects() {
		return domainObjects;
	}

	/** @see #domainObjects */
	public void setDomainObjects(Set<DomainObject> domainObjects) {
		this.domainObjects = domainObjects;
	}

	/** @see #domainObjects */
	public void addDomainObject(DomainObject dObj) {
		this.domainObjects.add(dObj);
	}

	/** @see #name */
	public String getName() {
		return name;
	}

	/** @see #name */
	public void setName(String name) {
		this.name = name;
	}

	/** @see #bundleContext */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/** @see #bundleContext */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		if (bundleContext != null) {
			setBundleId(bundleContext.getBundle().getBundleId());
		}
	}

	public List<ResourceBundleEntry> getResourceBundles() {
		return resourceBundles;
	}

	public List<ResourceBundle> getResouceBundle(Locale loc) {
		return this.resourceBundle.get(loc);
	}

	public List<ResourceBundle> getResouceBundle() {
		return this.resourceBundle.get(currentLocale);
	}

	public void addResourceBundle(Locale loc, ResourceBundle rb) {
		List<ResourceBundle> list = this.resourceBundle.get(loc);
		if (list == null) {
			list = new ArrayList<ResourceBundle>();
		}
		list.add(rb);
		this.resourceBundle.put(loc, list);
	}

	public Map<Locale, List<ResourceBundle>> getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(Map<Locale, List<ResourceBundle>> resourceBundle) {
		this.resourceBundle = resourceBundle;
	}

	public void addResourceBundle(ResourceBundleEntry entry) {
		this.resourceBundles.add(entry);
	}

	/** @see #defaultLocale */
	public String getDefaultLocale() {
		return defaultLocale;
	}

	/** @see #defaultLocale */
	public void setDefaultLocale(String defaultLocale) {
		this.defaultLocale = defaultLocale;
		String[] loc = defaultLocale.split("_");
		currentLocale = new Locale(loc[0], loc[1]);
	}

	public Locale getCurrentLocale() {
		return currentLocale;
	}

	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}

	/** @see #hibernateConfig */
	public URL getHibernateConfig() {
		return hibernateConfig;
	}

	/** @see #hibernateConfig */
	public void setHibernateConfig(URL hibernateConfig) {
		this.hibernateConfig = hibernateConfig;
	}

	/** @see #bundleId */
	public Long getBundleId() {
		return bundleId;
	}

	/** @see #bundleId */
	public void setBundleId(Long bundleId) {
		this.bundleId = bundleId;
	}

	/** @see #description */
	public String getDescription() {
		return description;
	}

	/** @see #description */
	public void setDescription(String description) {
		this.description = description;
	}

	/** @see #licence */
	public String getLicence() {
		return licence;
	}

	/** @see #licence */
	public void setLicence(String licence) {
		this.licence = licence;
	}

	/** @see #copyright */
	public String getCopyright() {
		return copyright;
	}

	/** @see #copyright */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/** @see #classLoader */
	public ClassLoader getClassLoader() {
		return classLoader;
	}

	/** @see #classLoader */
	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public void addMenuGroup(MenuGroup mg) {
		menuGroup.add(mg);
	}

	public List<MenuGroup> getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(List<MenuGroup> menuGroup) {
		this.menuGroup = menuGroup;
	}

	/**
	 * Returns either Current or Default localized resources bundles. The one that is not null, current preferred
	 * 
	 * @return
	 */
	public List<ResourceBundle> getCurrentOrDefaultResourceBundles() {
		List<ResourceBundle> result = getResouceBundle(getCurrentLocale());
		if (result == null) {
			result = getResouceBundle(new Locale(getDefaultLocale()));
		}
		return result;
	}

	public ApplicationContext getAppCtx() {
		return appCtx;
	}

	public void setAppCtx(ApplicationContext appCtx) {
		this.appCtx = appCtx;
	}

	
	
}
