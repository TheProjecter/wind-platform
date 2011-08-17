package $packageName$;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import br.com.maisha.wind.lifecycle.WindActivator;

/**
 * 
 * @author Wind Platform
 * 
 */
public class Activator extends WindActivator implements BundleActivator {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "$pluginId$";

	/** The shared instance */
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context, this.getClass().getClassLoader());
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
