package br.com.maisha.wind.faces.rcp;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.faces.FacesAppModelListener;
import br.com.maisha.wind.lifecycle.registry.IAppModelListenerRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(Activator.class);

	// The plug-in ID
	public static final String PLUGIN_ID = "wind_faces";

	// The shared instance
	private static Activator plugin;

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
	public void start(BundleContext context) throws Exception {
		log.info("		Wind Faces Starting... ");
		super.start(context);
		plugin = this;

		// register app model listener when framework got started...
		IAppModelListenerRegistry modelListenerReg = ServiceProvider
				.getInstance().getService(IAppModelListenerRegistry.class,
						getBundle().getBundleContext());
		modelListenerReg.registerAppModelListener(new FacesAppModelListener());
		
		log.info("		Wind Faces Started ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		log.info("		Wind Faces Stopping... ");
		plugin = null;
		super.stop(context);
		log.info("		Wind Faces Stopped ");
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
