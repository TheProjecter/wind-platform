package br.com.maisha.wind.faces.render.attr;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.rwt.RWT;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.model.ExecutionContext;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * A Job to obtain content for a JFace Viewer running an indicated rule.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ViewerContentProviderJob extends Job {

	/** Name of the job property that holds the resulting content. */
	public static final QualifiedName CONTENT = new QualifiedName(ViewerContentProviderJob.class.getSimpleName(), "result");

	/** Attribute represented by a combo */
	private Attribute attribute;

	/** Application Controller ref. */
	private IApplicationController appCtrl;

	private Serializable sessid;

	/**
	 * Constructor configures job name.
	 * 
	 * @param name
	 *            Job name.
	 */
	public ViewerContentProviderJob(String name, Attribute attribute) {
		super(name);
		this.attribute = attribute;
		sessid = RWT.getSessionStore().getId();
		appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus run(IProgressMonitor monitor) {
		DomainObject dObj = attribute.getDomainObject();

		// get operation to provide content
		String contentOp = attribute.getPropertyValue(PropertyInfo.CONTENT);
		if (StringUtils.isBlank(contentOp)) {
			// TODO i18n
			return new Status(Status.ERROR, dObj.getLabel(), "Operation [" + contentOp + "] not found!");
		}

		Operation op = dObj.getOperation(contentOp);
		if (op == null) {
			// TODO i18n
			return new Status(Status.ERROR, dObj.getLabel(), "Operation [" + contentOp + "] not found!");
		}

		ExecutionContext<ModelReference> ctx = new ExecutionContext<ModelReference>();
		ctx.setMeta(attribute.getDomainObject());
		ctx.setOperation(op);
		ctx.setSessid(sessid);
		ctx = appCtrl.runOperation(ctx);

		setProperty(CONTENT, ctx.getGridData());
		return Status.OK_STATUS;
	}
}
