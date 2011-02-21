package br.com.maisha.wind.html;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Activator implements BundleActivator {

	/** */
	private HttpServiceTracker serviceTracker;

	// The shared instance
	private static BundleContext context;

	/**
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext ctx) throws Exception {
		context = ctx;
		serviceTracker = new HttpServiceTracker(context);
		serviceTracker.open();
	}

	/**
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		serviceTracker.close();
		serviceTracker = null;
		context  = null;
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
