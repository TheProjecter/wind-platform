package br.com.maisha.wind.app.tooling;

import java.net.URL;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.com.maisha.wind.app.tooling.editor.TerraDocumentPartitionScanner;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "br.com.maisha.wind.app.tooling"; //$NON-NLS-1$

	public final static String TERRA_PARTITIONING = "___terra__partitioning____";

	// The shared instance
	private static Activator plugin;

	private TerraDocumentPartitionScanner fPartitionScanner;

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
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public URL getInstallURL() {
		return getDefault().getBundle().getEntry("/"); //$NON-NLS-1$
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public TerraDocumentPartitionScanner getTerraDocumentPartitionScanner() {
		if (fPartitionScanner == null)
			fPartitionScanner = new TerraDocumentPartitionScanner();
		return fPartitionScanner;
	}

}
