package br.com.maisha.wind.lifecycle.mgmt;

import org.osgi.framework.BundleContext;

import br.com.maisha.wind.common.component.Component;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public interface IApplicationManager extends Component {

	/**
	 * 
	 * @return
	 */
	void registerApplication(BundleContext context, ClassLoader classLoader);

	/**
	 * 
	 * @param context
	 */
	void unregisterApplication(BundleContext context);

}
