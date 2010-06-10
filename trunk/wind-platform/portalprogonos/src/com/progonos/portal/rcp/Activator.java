package com.progonos.portal.rcp;

import org.osgi.framework.BundleContext;

import br.com.maisha.wind.lifecycle.WindActivator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class Activator extends WindActivator {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "portalprogonos";

	/** The shared instance */
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
