package br.com.maisha.wind.lifecycle;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.rcp.Activator;
import br.com.maisha.wind.lifecycle.mgmt.IApplicationManager;

/**
 * This class must be inherited by all bundles who wants to become a wind
 * application. By doing this, a bundle will get all it's Wind objects parsed
 * and registered into the platform.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class WindActivator implements BundleActivator {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(WindActivator.class);

	/**
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		log.info(context.getBundle().getSymbolicName() + " ["
				+ context.getBundle().getBundleId() + "] Starting... ");

		IApplicationManager appManager = ServiceProvider.getInstance()
				.getService(IApplicationManager.class, Activator.getDefault().getBundle().getBundleContext());
		appManager.registerApplication(context);

		log.info(context.getBundle().getSymbolicName() + " ["
				+ context.getBundle().getBundleId() + "] Started ");
	}

	/**
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		log.info(context.getBundle().getSymbolicName() + " ["
				+ context.getBundle().getBundleId() + "] Stopping... ");


		log.info(context.getBundle().getSymbolicName() + " ["
				+ context.getBundle().getBundleId() + "] Stopped... ");
	}

}
