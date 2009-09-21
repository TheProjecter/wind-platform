package br.com.maisha.wind.faces.action;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class BaseAction extends Action implements IWorkbenchAction {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(BaseAction.class);

	/** Operation to run. */
	private Operation op;

	/**
	 * Constructor.
	 * 
	 * @param op
	 *            Operation to run.
	 */
	public BaseAction(Operation op) {
		this.op = op;
		setId(op.getRef());
		setDescription(op.getLabel());
		setText(op.getLabel());
		setToolTipText(op.getLabel());

		String iconPath = op.getPropertyValue(PropertyInfo.ICON);
		if (iconPath != null) {
			setImageDescriptor(Activator.getImageDescriptor(iconPath));
		}

		setEnabled(!op.getPropertyValue(PropertyInfo.DISABLED));
	}

	/**
	 * 
	 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(Event event) {
		log.debug("Running Action " + op);

		//TODO call application controller...
		
		log.debug("Action Finished " + op);
	}

	/**
	 * 
	 * @see org.eclipse.ui.actions.ActionFactory.IWorkbenchAction#dispose()
	 */
	public void dispose() {
		
	}

}
