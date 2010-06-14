package br.com.maisha.wind.faces.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
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

		setPartName(PlatformMessageRegistry.getInstance().getMessage("wind_faces.gridView.title"));

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
					String totalResults = PlatformMessageRegistry.getInstance().getMessage(
							"wind_faces.gridview.totalResults", new Object[] { dataMap.size() });
					setContentDescription(totalResults);
				}
			});

		}
	}

}
