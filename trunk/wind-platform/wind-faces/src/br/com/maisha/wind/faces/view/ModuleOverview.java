package br.com.maisha.wind.faces.view;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;

/**
 * A View for display all Wind Applications currently loaded by the platform.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ModuleOverview extends ViewPart implements IRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(ModuleOverview.class);

	/** View ID */
	public static final String ID = "br.com.maisha.wind.faces.view.moduleOverview";

	/** Tree component to display modules information. */
	private Tree tree;

	/** Presentation Provider Reference. */
	private IPresentationProvider presProvider;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		this.presProvider = ServiceProvider.getInstance().getService(
				IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());

		presProvider.registerRender(this);

		tree = new Tree(parent, SWT.NONE);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		if (tree != null && !tree.isDisposed()) {
			tree.setFocus();
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType getModelLevel() {
		return LevelType.Application;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		if (model != null) {
			if (!(model instanceof WindApplication)) {
				log.error("This render is intended to recieve a "
						+ "WindApplication as model, but [" + model.getClass()
						+ "] was given... ");
				return;
			}

			WindApplication app = (WindApplication) model;
			TreeItem appRoot = new TreeItem(tree, SWT.NONE);
			appRoot.setText(app.getName() + " [" + app.getAppId() + "]");
			for (DomainObject dObj : app.getDomainObjects()) {
				TreeItem dObjNode = new TreeItem(appRoot, SWT.NONE);
				dObjNode.setText(dObj.getLabel() + " [" + dObj.getPckg() + "."
						+ dObj.getRef() + "]");
			}

		}
	}
}
