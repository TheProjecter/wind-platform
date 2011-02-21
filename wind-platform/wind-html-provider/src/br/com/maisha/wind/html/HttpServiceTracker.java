package br.com.maisha.wind.html;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

import br.com.maisha.wind.html.servlet.WindHtmlServlet;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class HttpServiceTracker extends ServiceTracker {

	/**
	 * 
	 * @param context
	 */
	public HttpServiceTracker(BundleContext context) {
		super(context, HttpService.class.getName(), null);
	}

	/**
	 * 
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	public Object addingService(ServiceReference reference) {
		HttpService httpService = (HttpService) super.addingService(reference);
		if (httpService == null)
			return null;

		try {
			System.out.println("Registering servlet at /simple");
			httpService.registerServlet("/wind", new WindHtmlServlet(), null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return httpService;
	}

	/**
	 * 
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference,
	 *      java.lang.Object)
	 */
	public void removedService(ServiceReference reference, Object service) {
		HttpService httpService = (HttpService) service;

		System.out.println("Unregistering /simple");
		httpService.unregister("/wind");

		super.removedService(reference, service);
	}

}
