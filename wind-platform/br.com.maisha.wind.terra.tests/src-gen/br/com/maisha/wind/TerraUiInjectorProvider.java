/*
* generated by Xtext
*/
package br.com.maisha.wind;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TerraUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return br.com.maisha.wind.ui.internal.TerraActivator.getInstance().getInjector("br.com.maisha.wind.Terra");
	}
	
}
