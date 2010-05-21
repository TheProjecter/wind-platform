package br.com.maisha.terra.lang;

/**
 * Contains the information of a wind application resource bundle.
 * <p/>
 * 
 * A Resource bundle is not like a OSGi Bundle. It is just some file, image or
 * something else available at the wind application bundle.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ResourceBundleEntry {

	/** Id of this resource bundle. */
	private String id;

	/** Path of this resource bundle. */
	private String path;

	/** */
	private String locale;

	/** @see #id */
	public String getId() {
		return id;
	}

	/** @see #id */
	public void setId(String id) {
		this.id = id;
	}

	/** @see #path */
	public String getPath() {
		return path;
	}

	/** @see #path */
	public void setPath(String path) {
		this.path = path;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

}
