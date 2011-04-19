package br.com.maisha.terra.rcp;

import org.apache.log4j.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static Logger log = Logger.getLogger(Activator.class);

	// The shared instance
	private static Activator plugin;
	
	// bundle ref.
	private static Bundle bundle;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		log.info("		Wind Terra Starting... ");
		plugin = this;
		bundle = context.getBundle();
		log.info("		Wind Terra Started");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		bundle = null;
		log.info("		Wind Terra Stopped");
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Bundle getDefault() {
		return bundle;
	}

}
