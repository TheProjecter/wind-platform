package br.com.maisha.wind.common.factory;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ServiceProvider {

	/** */
	private static final ServiceProvider instance = new ServiceProvider();

	/**
	 * 
	 * @param <T>
	 * @param itf
	 * @param ctx
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getService(Class<T> itf, BundleContext ctx) {
		ServiceReference ref = ctx.getServiceReference(itf.getName());
		return (T) ctx.getService(ref);
	}

	/**
	 * 
	 * @return
	 */
	public static ServiceProvider getInstance() {
		return instance;
	}

}
