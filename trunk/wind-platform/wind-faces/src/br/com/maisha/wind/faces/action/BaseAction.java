package br.com.maisha.wind.faces.action;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.model.ExecutionContext;
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

	/** Object on which the operations is performed. */
	private ModelReference model;

	/**
	 * Constructor.
	 * 
	 * @param op
	 *            Operation to run.
	 */
	public BaseAction(Operation op, ModelReference model) {
		this.op = op;
		this.model = model;
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
		final ExecutionContext<ModelReference> exeCtx = new ExecutionContext<ModelReference>();

		try {

			ExecuteOperationJob job = new ExecuteOperationJob(
					"Executing Operation...", exeCtx, Display.getCurrent());
			job.schedule();

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

		log.debug("Action Finished " + op);
	}

	/**
	 * 
	 * @see org.eclipse.ui.actions.ActionFactory.IWorkbenchAction#dispose()
	 */
	public void dispose() {

	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class ExecuteOperationJob extends Job {

		/** */
		private ExecutionContext<ModelReference> ctx;

		private Display display;

		/**
		 * 
		 * @param jobName
		 * @param ctx
		 */
		public ExecuteOperationJob(String jobName,
				ExecutionContext<ModelReference> ctx, Display display) {
			super(jobName);
			this.ctx = ctx;
			this.display = display;
		}

		/**
		 * 
		 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		public IStatus run(IProgressMonitor monitor) {
			try {
				final IApplicationController appCtrl = ServiceProvider
						.getInstance().getService(
								IApplicationController.class,
								Activator.getDefault().getBundle()
										.getBundleContext());

				// configure execution context....
				monitor.beginTask("Configuring context...", 100);

				ctx.setInstance(model);
				ctx.setOperation(op);
				ctx.setMonitor(monitor);
				monitor.worked(10);

				// run operation...
				ctx = appCtrl.runOperation(ctx);

				monitor.done();

				// process the changes ocurred at the execution context...
				display.syncExec(new Runnable() {
					public void run() {
						appCtrl.processExecutionContext(ctx);
					}
				});

				return Status.OK_STATUS;
			} finally {
			}
		}

		/** @see #ctx */
		public ExecutionContext<ModelReference> getCtx() {
			return ctx;
		}

	}

}
