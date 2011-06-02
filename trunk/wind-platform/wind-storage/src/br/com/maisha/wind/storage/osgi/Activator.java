package br.com.maisha.wind.storage.osgi;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class Activator implements BundleActivator {

	/** Log ref */
	private static Logger log = Logger.getLogger(Activator.class);
	
	/** */
	private static BundleContext context;

	/**
	 * 
	 * @return
	 */
	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		log.info("		Wind Storage Starting... ");
		Activator.context = bundleContext;
		log.info("		Wind Storage Started... ");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		log.info("		Wind Storage Stoping... ");
		Activator.context = null;
		log.info("		Wind Storage Stopped... ");
	}

}
