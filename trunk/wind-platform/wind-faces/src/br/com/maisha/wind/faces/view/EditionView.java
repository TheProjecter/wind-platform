package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;
import org.springframework.beans.BeanUtils;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.common.user.IUserContext.UserData;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.model.Breadcrumb;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.action.BaseAction;
import br.com.maisha.wind.faces.action.ClearEditionViewAction;
import br.com.maisha.wind.faces.action.FowardNavigationAction;
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
public class EditionView extends ViewPart implements IRender, ISelectionListener {

	/** View's ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.editionView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(EditionView.class);

	/** Parent composite that holds contents and folders. */
	private Composite parent;

	/** Form */
	private ScrolledForm form;

	/** Eclipse Forms Toolkit. */
	private FormToolkit toolkit;

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

	private FowardNavigationAction forwardAction;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	public void dispose() {
		super.dispose();
		IPresentationProvider presentation = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presentation.unRegisterRender(this);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(final Composite parent) {
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);

		this.parent = form.getBody();
		this.parent.setLayout(new GridLayout(1, true));

		this.presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());

		this.appController = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		baseLayoutRender = new BaseLayoutRender();
		folderLayoutRender = new FolderLayoutRender();

		presProvider.registerRender(this);

		// add this view as a selection listener to the workbench page
		getSite().getPage().addSelectionListener(GridView.ID, (ISelectionListener) this);

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

				IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
				modelInstance = appController.createNewInstance(userContext, object);

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
		form.setText(model.getLabel());

		// set up head client
		createHeadClient(model);

		// set up layout...
		baseLayoutRender.render(model, this.parent, this.modelInstance);

		// set up tabs
		folderLayoutRender.render(model, this.parent, this.modelInstance);

		// render operations
		form.getToolBarManager().removeAll();
		for (Operation op : model.getOperations()) {
			if (op.getPropertyValue(PropertyInfo.VISIBLE_OP)) {
				createOperationUI(op, model, form.getToolBarManager());
			}
		}

		parent.layout();
		toolkit.decorateFormHeading(form.getForm());
	}

	/**
	 * Sets up Head Client area with breadcrumb and navigation action.
	 * 
	 * @param model
	 *            Domain Object being rendered.
	 */
	private void createHeadClient(DomainObject model) {
		// get attributes with navigation as presentation type
		List<Attribute> attrsToNavigate = new ArrayList<Attribute>();
		for (Attribute attr : model.getAtts()) {
			if (Property.PresentationType.NAVIGATION.getValue().equals(
					attr.getPropertyValue(PropertyInfo.PRESENTATION_TYPE))) {
				attrsToNavigate.add(attr);
			}
		}

		if (form.getForm().getHeadClient() != null) {
			form.getForm().getHeadClient().dispose();
		}

		Composite headClient = toolkit.createComposite(form.getForm().getHead());
		headClient.setBackground(null);
		headClient.setLayout(new GridLayout(2, false));

		IUserContext userCtx = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
		Breadcrumb navTrail = userCtx.getUserData(UserData.NAVIGATION_TRAIL);

		if (navTrail != null) {
			Composite breadComposite = toolkit.createComposite(headClient, SWT.BORDER);
			breadComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

			List<Breadcrumb> breadCrumbs = new ArrayList<Breadcrumb>();
			breadCrumbs.add(navTrail);

			Breadcrumb previous = navTrail.getPrevious();
			while (previous != null) {
				breadCrumbs.add(previous);
				previous = previous.getPrevious();
			}

			Collections.reverse(breadCrumbs);
			for (Iterator<Breadcrumb> i = breadCrumbs.iterator(); i.hasNext();) {
				Breadcrumb breadcrumb = i.next();
				createBreadcrumb(breadcrumb, breadComposite, i.hasNext());
			}

		}

		if (attrsToNavigate != null && attrsToNavigate.size() > 0) {
			ToolBar navigationToolbar = new ToolBar(headClient, SWT.NONE);
			ToolBarManager tbm = new ToolBarManager(navigationToolbar);
			forwardAction = new FowardNavigationAction(attrsToNavigate);
			forwardAction.setEnabled(false);
			tbm.add(forwardAction);
			tbm.update(true);
		}

		form.setHeadClient(headClient);
	}

	/**
	 * @param navTrail
	 * @param bread
	 * @param addSlash
	 */
	private void createBreadcrumb(final Breadcrumb navTrail, Composite bread, boolean addSlash) {
		String label = navTrail.getOriginatingAttribute().getDomainObject().getLabel();

		final Hyperlink hyperlink = toolkit.createHyperlink(bread, label, SWT.NONE);
		hyperlink.setBackground(null);
		if (addSlash) {
			toolkit.createLabel(bread, "/").setBackground(null);
		}
		
		//hyperlink action
		hyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkExited(HyperlinkEvent e) {
			}

			public void linkEntered(HyperlinkEvent e) {
			}

			public void linkActivated(HyperlinkEvent e) {
				IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
				appController.navigateBackward(userContext, navTrail.getOriginatingAttribute(), navTrail.getOriginatingModelRef());
			}
		});
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
		tbm.update(true);
	}

	/**
	 * 
	 */
	private void configureDefaultToolBar(DomainObject object) {
		IToolBarManager tbm = form.getToolBarManager();
		IAction clearEditionView = new ClearEditionViewAction(object);
		tbm.add(clearEditionView);
		tbm.update(true);
	}

	/**
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// if there is a selection at grid view, then we must enable forward
		// action
		if (!selection.isEmpty()) {
			forwardAction.setEnabled(true);
		}
	}

}
