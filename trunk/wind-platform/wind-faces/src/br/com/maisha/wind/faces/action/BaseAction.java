package br.com.maisha.wind.faces.action;

import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.osgi.framework.Bundle;

import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.rcp.RCPUtil;
import br.com.maisha.wind.faces.util.Constants;
import br.com.maisha.wind.faces.view.GridView;

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
		setDescription(op.getI18nLabel());
		setText(op.getI18nLabel());
		setToolTipText(op.getI18nLabel());

		String iconPath = op.getPropertyValue(PropertyInfo.ICON);
		if (iconPath != null) {
			Bundle bundle = Platform.getBundle(op.getDomainObject().getApplication().getBundleContext().getBundle().getSymbolicName());
			URL imgUrl = bundle.getEntry(iconPath);
			if (imgUrl != null) {
				setImageDescriptor(ImageDescriptor.createFromURL(imgUrl));
			}

		}

		setEnabled(!op.getPropertyValue(PropertyInfo.DISABLED));
	}

	/**
	 * 
	 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(Event event) {
		log.debug("Running Action " + op);

		// AggregateValidationStatus ag = new AggregateValidationStatus(dbctx, AggregateValidationStatus.MAX_SEVERITY);
		// ag.addChangeListener(new IChangeListener() {
		// public void handleChange(ChangeEvent event) {
		// IObservable obs = event.getObservable();
		// for (Object o : dbctx.getBindings()) {
		// Binding binding = (Binding) o;
		// IStatus status = (IStatus) binding.getValidationStatus().getValue();
		// status.toString();
		//
		// if(binding.getTarget() instanceof ISWTObservable){
		// ISWTObservable swtObservable = (ISWTObservable) binding.getTarget();
		// Control control = (Control) swtObservable.getWidget();
		// ControlDecoration decoration = new ControlDecoration(control, SWT.RIGHT | SWT.BOTTOM);
		// FieldDecoration fieldDecoration = FieldDecorationRegistry
		// .getDefault().getFieldDecoration(
		// FieldDecorationRegistry.DEC_ERROR);
		// decoration.setImage(fieldDecoration.getImage());
		// decoration.setDescriptionText("Erro!");
		// }
		// }
		// }
		// });

		final ExecutionContext<ModelReference> exeCtx = new ExecutionContext<ModelReference>();
		exeCtx.setSessid(RWT.getSessionStore().getId());
		try {
			List<?> selection = null;
			ISelectionService selServ = RCPUtil.getWorkbenchWindow().getSelectionService();
			ISelection sel = selServ.getSelection(GridView.ID);
			if (sel != null && sel instanceof IStructuredSelection) {
				selection = ((IStructuredSelection) sel).toList();
			}

			exeCtx.setGridSelection(selection);

			ExecuteOperationJob job = new ExecuteOperationJob(PlatformMessageRegistry.getInstance().getMessage(
					"wind_faces.operation.running"), exeCtx, Display.getCurrent());

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
		public ExecuteOperationJob(String jobName, ExecutionContext<ModelReference> ctx, Display display) {
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
				final IApplicationController appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
						Activator.getDefault().getBundle().getBundleContext());

				// configure execution context....
				monitor.beginTask("Configuring context...", 100);

				ctx.setInstance(model);
				ctx.setMeta(op.getDomainObject());
				ctx.setOperation(op);
				monitor.worked(10);

				// run operation...
				ctx = appCtrl.runOperation(ctx);

				monitor.done();

				// process the changes occurred at the execution context...
				display.syncExec(new Runnable() {
					public void run() {
						ModelReference ref = appCtrl.processExecutionContext(ctx);
						RWT.getSessionStore().setAttribute(Constants.OPENED_INSTANCE, ref);
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
