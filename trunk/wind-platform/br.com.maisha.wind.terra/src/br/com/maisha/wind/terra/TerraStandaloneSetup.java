
package br.com.maisha.wind.terra;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TerraStandaloneSetup extends TerraStandaloneSetupGenerated{

	public static void doSetup() {
		new TerraStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

