package br.com.maisha.wind.faces.view;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;

public class GridView extends ViewPart implements IRender {

	/** View's ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.gridView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(GridView.class);

	/** */
	private TableViewer viewer;

	/** */
	private IApplicationController appCtrl;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		IPresentationProvider presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presProvider.registerRender(this);

		appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);

		viewer.setContentProvider(new GridViewContentProvider());
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
	public LevelType getModelLevel() {
		return LevelType.Object;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		log.debug("Updating grid view... ");

		if (model instanceof DomainObject) {
			final DomainObject dObj = (DomainObject) model;

			for (TableColumn col : viewer.getTable().getColumns()) {
				col.dispose();
			}

			final Map<Integer, String> map = new HashMap<Integer, String>();
			int i = 0;
			for (Attribute attr : dObj.getAtts()) {
				TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
				col.getColumn().setText(attr.getLabel());
				col.getColumn().setWidth(attr.getPropertyValue(PropertyInfo.WIDTH));
				col.getColumn().setResizable(true);
				col.getColumn().setMoveable(false);

				map.put(i, attr.getRef());

				i++;
			}

			Display.getCurrent().asyncExec(new Runnable() {
				public void run() {
					List<ModelReference> data = appCtrl.filter(dObj);
					List<Map<String, Object>> dataMap = appCtrl.toMap(dObj, data);
					viewer.setLabelProvider(new GridViewLabelProvider(map));
					viewer.setInput(dataMap);
					String totalResults = PlatformMessageRegistry.getInstance().getMessage("wind_faces.gridview.totalResults",
							new Object[] { dataMap.size() });
					setContentDescription(totalResults);
				}
			});

		}
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class GridViewContentProvider implements IStructuredContentProvider {

		/**
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
		 */
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List<?>) {
				return ((List<?>) inputElement).toArray();
			}
			return null;
		}

		/**bb
		 * ScriptEngine juelEngine = engineManager.getEngineByName("juel");
		 * 
		 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
		 */
		public void dispose() {

		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer,
		 *      java.lang.Object, java.lang.Object)
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		}

	}

	class GridViewLabelProvider extends LabelProvider implements ITableLabelProvider {

		private Map<Integer, String> properties;

		public GridViewLabelProvider(Map<Integer, String> properties) {
			this.properties = properties;
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
		 *      int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(final Object element, final int columnIndex) {
			Map<String, Object> dataMap = (Map<String, Object>) element;
			String propName = properties.get(columnIndex);
			Object val = dataMap.get(propName);

			return val != null ? val.toString() : "";
		}

	}
}
