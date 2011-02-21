package br.com.maisha.wind.about;

import org.osgi.framework.BundleContext;

import br.com.maisha.wind.lifecycle.WindActivator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Activator extends WindActivator {

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.WindActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.lifecycle.WindActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

}
