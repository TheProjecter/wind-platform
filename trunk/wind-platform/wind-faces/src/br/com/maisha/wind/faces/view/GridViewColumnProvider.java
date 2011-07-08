package br.com.maisha.wind.faces.view;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.TableColumn;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.PropertyInfo;

/**
 * Provides column creation for {@link TableViewer}
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewColumnProvider {

	/** Key used to store a reference for the {@link Attribute} in respective column */
	public static final String ATTRIBUTE_COLUMN_DATA_KEY = "attr";

	/** Domain Object */
	private DomainObject dObj;

	/** TableViewer */
	private TableViewer viewer;

	/**
	 * 
	 * @param dObj
	 * @param viewer
	 */
	public GridViewColumnProvider(DomainObject dObj, TableViewer viewer) {
		super();
		this.dObj = dObj;
		this.viewer = viewer;
	}

	/**
	 * Do column creation
	 */
	public void createColumns() {

		for (TableColumn col : viewer.getTable().getColumns()) {
			if (!col.isDisposed()) {
				col.dispose();
			}
		}

		Map<Integer, String> map = new HashMap<Integer, String>();
		int i = 0;
		for (Attribute attr : dObj.getAtts()) {
			if (!attr.getPropertyValue(PropertyInfo.VISIBLE_IN_GRID) || attr.isGroupAttribute()) {
				continue;
			}

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
