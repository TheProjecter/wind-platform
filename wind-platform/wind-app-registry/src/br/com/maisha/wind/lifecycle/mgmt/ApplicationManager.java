package br.com.maisha.wind.lifecycle.mgmt;

import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.wind.lifecycle.model.WindApplication;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManager implements IApplicationManager {

	/** */
	private ITerraCompiler langCompiler;

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#loadApplication()
	 */
	public WindApplication loadApplication() {
		System.out.println(langCompiler);
		System.out.println(langCompiler.toString());
		return null;
	}

	/** @see #langCompiler */
	public void setLangCompiler(ITerraCompiler langCompiler) {
		this.langCompiler = langCompiler;
	}

}
