package br.com.maisha.wind.lifecycle.mgmt;

import java.io.InputStream;

import br.com.maisha.terra.ITerraCompiler;
import br.com.maisha.wind.lifecycle.model.WindApplication;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ApplicationManager implements IApplicationManager {

	/** */
	private ITerraCompiler langCompiler;

	/** */
	private IApplicationRegistry registry;

	/** */
	private IAppCfgReader appCfgReader;

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.mgmt.IApplicationManager#loadApplication()
	 */
	public void registerApplication(InputStream appCfg) {
		try {
			WindApplication app = appCfgReader.read(appCfg);
			registry.register(app);
		} catch (Exception e) {
			e.printStackTrace(); // TODO
		}

	}

	/** @see #appCfgReader */
	public void setAppCfgReader(IAppCfgReader appCfgReader) {
		this.appCfgReader = appCfgReader;
	}

	/** @see #langCompiler */
	public void setLangCompiler(ITerraCompiler langCompiler) {
		this.langCompiler = langCompiler;
	}

	/** @see #registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}
}
