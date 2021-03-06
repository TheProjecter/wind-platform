package br.com.maisha.wind.faces.rcp;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.service.IServiceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.com.maisha.wind.faces.FileServiceHandler;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
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
		
		IServiceManager manager = RWT.getServiceManager();
		if(manager !=  null){
			manager.registerServiceHandler("downloadServiceHandler", new FileServiceHandler());
		}
		
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

	/**
	 * 
	 * @return
	 */
	public static String getSymbolicName() {
		if (plugin != null) {
			return plugin.getBundle().getSymbolicName();
		}
		return null;
	}
}
