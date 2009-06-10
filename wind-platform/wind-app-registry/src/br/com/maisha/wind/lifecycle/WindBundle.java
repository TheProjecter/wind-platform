package br.com.maisha.wind.lifecycle;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * This class must be inherited by all bundles who wants to become a wind
 * application. By doing this, a bundle will get all it's Wind objects parsed
 * and registered into the platform.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindBundle extends AbstractUIPlugin {

	/**
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}
}
