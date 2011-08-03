package br.com.maisha.wind.faces.view;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.springframework.beans.BeanUtils;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.action.BaseAction;
import br.com.maisha.wind.faces.action.ClearEditionViewAction;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.render.layout.BaseLayoutRender;
import br.com.maisha.wind.faces.render.layout.FolderLayoutRender;
import br.com.maisha.wind.faces.render.layout.ILayoutRender;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class EditionView extends ViewPart implements IRender {

	/** View's ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.editionView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(EditionView.class);

	/** Parent composite that holds contents and folders. */
	private Composite parent;

	/** Presentantion Provider */
	private IPresentationProvider presProvider;

	/** Application Controller */
	private IApplicationController appController;

	/** Current model instance. */
	private ModelReference modelInstance;

	/** Base layout */
	private ILayoutRender baseLayoutRender;

	/** This one renders as Folder. */
	private ILayoutRender folderLayoutRender;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(final Composite parent) {
		this.parent = parent;
		this.parent.setLayout(new GridLayout(1, true));

		this.presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());

		this.appController = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		baseLayoutRender = new BaseLayoutRender();
		folderLayoutRender = new FolderLayoutRender();

		presProvider.registerRender(this);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		parent.setFocus();
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.Object };
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(LevelType level, ChangeType ct, Object model) {
		if (model == null)
			return;

		if (LevelType.Object.equals(level) && ChangeType.InstanceOpened.equals(ct)) {
			log.debug("Loading instance in the EditionView... ");

			BeanUtils.copyProperties(model, modelInstance);
		} else if (LevelType.Object.equals(level) && ChangeType.ObjectOpen.equals(ct)) {
			try {
				log.debug("Opening [" + model + "] in the EditionView... ");

				final DomainObject object = (DomainObject) model;
				setPartName(object.getLabel());

				modelInstance = appController.createNewCurrentInstance(object);

				createUserInterface(object);
				configureDefaultToolBar(object);
			} catch (Exception e) {
				ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
			}
		}

	}

	/**
	 * Sets up the user interface for the given domain object.
	 * 
	 * @param model
	 *            DomainObject to render.
	 * @throws PartInitException
	 */
	private void createUserInterface(DomainObject model) throws PartInitException {

		// set up layout...
		baseLayoutRender.render(model, this.parent, this.modelInstance);

		// set up tabs
		folderLayoutRender.render(model, this.parent, this.modelInstance);

		// render operations
		final IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
		tbm.removeAll();
		for (Operation op : model.getOperations()) {
			if (op.getPropertyValue(PropertyInfo.VISIBLE_OP)) {
				createOperationUI(op, model, tbm);
			}
		}
		getViewSite().getActionBars().updateActionBars();

		parent.layout();
	}

	/**
	 * Creates the visual representation for the given operation.
	 * 
	 * @param op
	 *            Operation to render.
	 */
	private void createOperationUI(Operation op, DomainObject model, IToolBarManager tbm) {
		log.debug("Rendering Operation [ " + op + " ]");
		IAction act = new BaseAction(op, modelInstance);
		tbm.add(act);
	}

	/**
	 * 
	 */
	private void configureDefaultToolBar(DomainObject object) {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
		IAction clearEditionView = new ClearEditionViewAction(object);
		tbm.add(clearEditionView);
		getViewSite().getActionBars().updateActionBars();
	}

}
