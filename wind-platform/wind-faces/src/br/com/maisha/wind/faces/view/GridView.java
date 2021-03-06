package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.action.ExcelPrintAction;
import br.com.maisha.wind.faces.action.PDFPrintAction;
import br.com.maisha.wind.faces.action.PrintAction;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.view.listener.SearchBoxListener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridView extends ViewPart implements IRender, ISelectionListener {

	/** View's ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.gridView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(GridView.class);

	/** */
	private TableViewer viewer;

	/** */
	private IApplicationController appCtrl;

	/** Current Domain Object. */
	private DomainObject dObj;

	/** Action for send content to the printer. */
	private PrintAction printAction;

	/** Action for export content as PDF. */
	private PDFPrintAction exportPDFAction;

	/** Action for export content as Excel. */
	private ExcelPrintAction exportExcelAction;

	/** Text box used to search. */
	private Text searchTextBox;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		setPartProperty("ID", GridView.ID);

		setPartName(PlatformMessageRegistry.getInstance().getMessage("wind_faces.gridView.title"));

		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presProvider.registerRender(this);

		appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		Composite main = new Composite(parent, SWT.NONE);
		main.setLayout(new GridLayout(1, false));

		searchTextBox = new Text(main, SWT.BORDER);
		searchTextBox.setEnabled(false);
		searchTextBox.setLayoutData(GridDataFactory.fillDefaults().create());
		
		viewer = new TableViewer(main, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);
		viewer.getTable().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		viewer.setContentProvider(new GridViewContentProvider());
		viewer.setComparator(new GridViewComparator());

//		GridViewPatternFilter filter = new GridViewPatternFilter();
//		viewer.addFilter(filter);
//		searchTextBox.addTraverseListener(new SearchBoxListener(viewer, filter));		
		
		getSite().setSelectionProvider(viewer);
		getSite().getPage().addSelectionListener(GridView.ID, this);

		createActions(parent);
		IToolBarManager tbManager = getViewSite().getActionBars().getToolBarManager();
		tbManager.add(printAction);
		tbManager.add(exportPDFAction);
		tbManager.add(exportExcelAction);

	}

	public void createActions(Composite parent) {
		printAction = new PrintAction();
		exportPDFAction = new PDFPrintAction(parent);
		exportExcelAction = new ExcelPrintAction(parent);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		searchTextBox.forceFocus();
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.GridData, LevelType.Object };
	}

	@Override
	public void dispose() {
		super.dispose();
		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presProvider.unRegisterRender(this);

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType,
	 *      java.lang.Object)
	 */
	public void render(final LevelType level, final ChangeType ct, final Object model) {
		if (LevelType.Object.equals(level)) {

			if (model instanceof DomainObject) {

				dObj = (DomainObject) model;
				log.debug("dObj: " + dObj);
				new GridViewColumnProvider(dObj, viewer).createColumns();
			}
		}

		if (ct.equals(ChangeType.ObjectOpen)
				|| (LevelType.GridData.equals(level) && ct.equals(ChangeType.ValueChanged))) {
			log.debug("Updating grid view... ");

			// enables search box
			searchTextBox.setEnabled(true);

			// load data to be displayed by the grid.
			LoadGridDataJob job = new LoadGridDataJob(PlatformMessageRegistry.getInstance().getMessage(
					"wind_faces.gridView.loadData"), level, model, Display.getCurrent());
			job.schedule();
		}
	}

	/**
	 * Responsible for load data that will be shown in grid.
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 */
	class LoadGridDataJob extends Job {

		private LevelType level;

		private Object model;

		private Display display;

		/**
		 * Configures Job Name.
		 * 
		 * @param name
		 */
		public LoadGridDataJob(String name, LevelType level, Object model, Display display) {
			super(name);
			this.level = level;
			this.model = model;
			this.display = display;
		}

		/**
		 * Do the thing.
		 * 
		 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		protected IStatus run(final IProgressMonitor monitor) {

			display.asyncExec(new Runnable() {

				public void run() {
					// input data TODO run outside UI Thread
					List<ModelReference> data = null;
					if (LevelType.Object.equals(level)) {
						if (dObj.getPropertyValue(PropertyInfo.OPEN_FILTERING)) {
							IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(
									IUserContext.USER_CONTEXT);
							data = appCtrl.search(userContext, dObj);
						}
					} else if (LevelType.GridData.equals(level)) {
						data = (ArrayList<ModelReference>) model;

					}

					List<Map<String, Object>> dataMap = appCtrl.toMap(dObj, data);
					viewer.setInput(dataMap);

					// updates print action - TODO dont think here it's the best
					// place
					printAction.configure(dataMap, dObj);
					exportPDFAction.configure(dataMap, dObj);
					exportExcelAction.configure(dataMap, dObj);

					// total results
					String contentDescription = "";
					if (dataMap.size() > 0) {
						contentDescription = PlatformMessageRegistry.getInstance().getMessage(
								"wind_faces.gridview.totalResults", new Object[] { dataMap.size() });
					} else {
						contentDescription = PlatformMessageRegistry.getInstance().getMessage(
								"wind_faces.gridview.noResults");
					}
					setContentDescription(contentDescription);

					setFocus();
				}
			});
			return Status.OK_STATUS;
		}

	}

	/**
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		IStructuredSelection ss = (IStructuredSelection) selection;

		if (!ss.isEmpty()) {
			Map<String, Object> map = (Map<String, Object>) ss.getFirstElement();
			IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
			appCtrl.openObjectInstance(userContext, (ModelReference) map.get("REF"));

		}
	}

}
