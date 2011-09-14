
package br.com.maisha.wind;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TerraStandaloneSetup extends TerraStandaloneSetupGenerated{

	public static void doSetup() {
		new TerraStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

