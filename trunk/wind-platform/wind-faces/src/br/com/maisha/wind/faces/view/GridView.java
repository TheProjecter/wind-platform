package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.action.ExcelPrintAction;
import br.com.maisha.wind.faces.action.PDFPrintAction;
import br.com.maisha.wind.faces.action.PrintAction;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;

public class GridView extends ViewPart implements IRender {

	public static final String ATTRIBUTE_COLUMN_DATA_KEY = "attr";

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

	/** Grid View Column Map (Used to configure labels). */
	private Map<Integer, String> map;

	/** Action for send content to the printer. */
	private PrintAction printAction;

	/** Action for export content as PDF. */
	private PDFPrintAction exportPDFAction;

	/** Action for export content as Excel. */
	private ExcelPrintAction exportExcelAction;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		setPartName(PlatformMessageRegistry.getInstance().getMessage("wind_faces.gridView.title"));

		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presProvider.registerRender(this);

		appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				if (!sel.isEmpty()) {
					Map<String, Object> map = (Map<String, Object>) sel.getFirstElement();
					appCtrl.openObjectInstance((ModelReference) map.get("ref"));
				}
			}
		});

		viewer.setContentProvider(new GridViewContentProvider());
		viewer.setComparator(new GridViewComparator());

		getSite().setSelectionProvider(viewer);

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

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.GridData, LevelType.Object };
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType,
	 *      java.lang.Object)
	 */
	public void render(final LevelType level, final ChangeType ct, final Object model) {
		if (LevelType.Object.equals(level)) {
			// objeto aberto...

			if (model instanceof DomainObject) {
				dObj = (DomainObject) model;

				for (TableColumn col : viewer.getTable().getColumns()) {
					col.dispose();
				}

				map = new HashMap<Integer, String>();
				int i = 0;
				for (Attribute attr : dObj.getAtts()) {
					TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
					col.getColumn().setText(attr.getI18nLabel());
					col.getColumn().setResizable(true);
					col.getColumn().setMoveable(false);
					col.getColumn().setData(ATTRIBUTE_COLUMN_DATA_KEY, attr);

					GC gc = new GC(col.getColumn().getParent());
					Point pt = gc.textExtent(attr.getLabel());

					int width = pt.x + 20;
					int attrWidth = attr.getPropertyValue(PropertyInfo.WIDTH) / 2;
					if (attrWidth > width) {
						width = attrWidth;
					}
					col.getColumn().setWidth(width);

					col.getColumn().addSelectionListener(new SelectionListener() {

						public void widgetSelected(SelectionEvent e) {
							viewer.getTable().setSortColumn((TableColumn) e.getSource());
							int sortDir = viewer.getTable().getSortDirection();
							viewer.getTable().setSortDirection(sortDir == SWT.UP ? SWT.DOWN : SWT.UP);
							viewer.refresh();
						}

						public void widgetDefaultSelected(SelectionEvent e) {
							widgetSelected(e);
						}
					});

					map.put(i, attr.getRef());

					i++;
				}

				// configures label provider
				viewer.setLabelProvider(new GridViewLabelProvider(map));
			}
		}

		if (ct.equals(ChangeType.ObjectOpen)
				|| (LevelType.GridData.equals(level) && ct.equals(ChangeType.ValueChanged))) {
			log.debug("Updating grid view... ");
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
					// input data
					List<ModelReference> data = null;
					if (LevelType.Object.equals(level)) {
						if (dObj.getPropertyValue(PropertyInfo.OPEN_FILTERING)) {
							data = appCtrl.filter(dObj, monitor);
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

}
