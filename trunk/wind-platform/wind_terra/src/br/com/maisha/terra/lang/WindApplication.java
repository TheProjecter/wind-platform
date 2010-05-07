package br.com.maisha.terra.lang;

import java.util.ArrayList;
import java.util.List;
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

	/** Application name. */
	private String name;

	/** Domain Objects living at this application. */
	private List<DomainObject> domainObjects = new ArrayList<DomainObject>();

	/** Applications bundle context reference. */
	private BundleContext bundleContext;

	/** A list of this application resource bundles. */
	private List<ResourceBundleEntry> resourceBundles = new ArrayList<ResourceBundleEntry>();
	
	private List<ResourceBundle> resourceBundle = new ArrayList<ResourceBundle>();

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
	}

	/** @see #resourceBundles */
	public List<ResourceBundleEntry> getResourceBundles() {
		return resourceBundles;
	}

	/** @see #resourceBundles */
	public void setResourceBundles(List<ResourceBundleEntry> resourceBundles) {
		this.resourceBundles = resourceBundles;
	}

	/** @see #resourceBundles */
	public void addResourceBundle(ResourceBundleEntry bundle) {
		this.resourceBundles.add(bundle);
	}

	public List<ResourceBundle> getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(List<ResourceBundle> resourceBundle) {
		this.resourceBundle = resourceBundle;
	}

	
}
