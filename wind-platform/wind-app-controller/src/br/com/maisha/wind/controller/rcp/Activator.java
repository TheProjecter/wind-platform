package br.com.maisha.wind.controller.rcp;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Activator implements BundleActivator {

	private static Logger log = Logger.getLogger(Activator.class);

	// The shared instance
	private static BundleContext context;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext ctx) throws Exception {
		log.info("		Wind Application Controller Starting... ");
		context = ctx;
		log.info("		Wind Application Controller Started... ");
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static BundleContext getDefault() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		log.info("		Wind Application Controller Stopping... ");
		context = null;
		log.info("		Wind Application Controller Stopped... ");
	}

	/**
	 * 
	 * @return
	 */
	public static String getSymbolicName(){
		if(context != null){
			return context.getBundle().getSymbolicName();
		}
		return null;
	}
}
