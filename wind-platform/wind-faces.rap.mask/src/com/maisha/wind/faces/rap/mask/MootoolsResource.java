package com.maisha.wind.faces.rap.mask;

import org.eclipse.rwt.resources.IResource;
import org.eclipse.rwt.resources.IResourceManager.RegisterOptions;

public final class MootoolsResource implements IResource {

	public String getCharset() {
		return "UTF-8";
	}

	public ClassLoader getLoader() {
		return this.getClass().getClassLoader();
	}

	public RegisterOptions getOptions() {
		return RegisterOptions.VERSION_AND_COMPRESS;
	}

	public String getLocation() {
		return "com/maisha/wind/faces/rap/mask/mootools1.3.2.js";
	}

	public boolean isJSLibrary() {
		return true;
	}

	public boolean isExternal() {
		return false;
	}
}
