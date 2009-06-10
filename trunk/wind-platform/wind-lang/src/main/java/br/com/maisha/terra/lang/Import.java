package br.com.maisha.terra.lang;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Import extends TerraClass {

	/** */
	private String path;

	/**
	 * 
	 * @param path
	 */
	public Import(String path) {
		this.path = path;
	}

	/** @see #path */
	public String getPath() {
		return path;
	}

	/** @see #path */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getPath();
	}
}
