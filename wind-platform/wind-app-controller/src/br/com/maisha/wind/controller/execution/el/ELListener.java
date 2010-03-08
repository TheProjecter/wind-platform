package br.com.maisha.wind.controller.execution.el;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.apache.log4j.Logger;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.rcp.Activator;

/**
 * When an attribute value change in the model, an event is fired. That event is
 * captured by this ELListener and all expressions of that object are
 * reevaluated. It causes a change of the meta values which are captured by the
 * binding framework.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ELListener implements PropertyChangeListener {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ELListener.class);

	/**
	 * 
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (!(evt.getSource() instanceof ModelReference)) {
			return;
		}
		try {
			log.debug("Property changed [" + evt.getPropertyName() + "]... revaluating meta model expressions");
			IApplicationController appController = ServiceProvider.getInstance().getService(
					IApplicationController.class, Activator.getDefault().getBundle().getBundleContext());

			appController.evalExpressions((ModelReference) evt.getSource());
		} catch (Exception e) {
			e.printStackTrace(); // TODO handle
		}
	}
}
