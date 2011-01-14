package br.com.maisha.terra.lang;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.osgi.framework.BundleContext;

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

	/** Domain Objects living at this application. */
	private List<DomainObject> domainObjects = new ArrayList<DomainObject>();

	/** Applications bundle context reference. */
	private BundleContext bundleContext;

	/** */
	private List<ResourceBundleEntry> resourceBundles = new ArrayList<ResourceBundleEntry>();

	/** */
	private Map<Locale, List<ResourceBundle>> resourceBundle = new HashMap<Locale, List<ResourceBundle>>();

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
	public List<DomainObject> getDomainObjects() {
		return domainObjects;
	}

	/** @see #domainObjects */
	public void setDomainObjects(List<DomainObject> domainObjects) {
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
		if(bundleContext != null){
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

	/**
	 * Returns either Current or Default localized resources bundles.
	 * The one that is not null, current preferred
	 *  
	 * @return
	 */
	public List<ResourceBundle> getCurrentOrDefaultResourceBundles(){
		List<ResourceBundle> result = getResouceBundle(getCurrentLocale());
		if(result == null){
			result = getResouceBundle(new Locale(getDefaultLocale()));
		}
		return result;
	}
	
}
