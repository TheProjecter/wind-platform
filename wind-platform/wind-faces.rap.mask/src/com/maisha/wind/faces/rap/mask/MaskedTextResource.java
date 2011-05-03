package com.maisha.wind.faces.rap.mask;

import org.eclipse.rwt.resources.IResource;
import org.eclipse.rwt.resources.IResourceManager.RegisterOptions;

public final class MaskedTextResource implements IResource {

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
		return "com/maisha/wind/faces/rap/mask/MaskedText.js";
	}

	public boolean isJSLibrary() {
		return true;
	}

	public boolean isExternal() {
		return false;
	}
}
