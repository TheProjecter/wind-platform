package br.com.maisha.wind.common;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(Activator.class);

	// The plug-in ID
	public static final String PLUGIN_ID = "wind_common";

	// The shared instance
	private static BundleContext context;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext ctx) throws Exception {
		log.info("Wind Common Starting... ");
		context = ctx;
		log.info("Wind Common Started ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext ctx) throws Exception {
		log.info("Wind Common Stopping... ");
		context = ctx;
		log.info("Wind Common Stopped ");
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static BundleContext getDefault() {
		return context;
	}

}
