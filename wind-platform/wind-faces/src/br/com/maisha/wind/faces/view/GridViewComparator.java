package br.com.maisha.wind.faces.view;

import java.util.Map;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;

import br.com.maisha.terra.lang.Attribute;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewComparator extends ViewerComparator {

	/**
	 * 
	 * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public int compare(Viewer viewer, Object e1, Object e2) {
		int ret = 0;
		if (viewer instanceof TableViewer) {

			TableViewer tableViewer = (TableViewer) viewer;
			TableColumn col = tableViewer.getTable().getSortColumn();
			int direction = tableViewer.getTable().getSortDirection();
			int dirMultiplier = direction == SWT.UP ? 1 : -1;

			if (col != null && col.getData(GridViewColumnProvider.ATTRIBUTE_COLUMN_DATA_KEY) != null) {
				Attribute attr = (Attribute) col.getData(GridViewColumnProvider.ATTRIBUTE_COLUMN_DATA_KEY);

				Map<String, Object> map1 = (Map<String, Object>) e1;
				Map<String, Object> map2 = (Map<String, Object>) e2;

				Object one = map1.get(attr.getRef());
				Object another = map2.get(attr.getRef());

				if (one != null && another != null) {
					if (one instanceof Comparable && another instanceof Comparable) {
						ret = ((Comparable<Object>) one).compareTo(another);
					} else {
						ret = one.toString().compareTo(another.toString());
					}
					ret = dirMultiplier * ret;
				}
			}
		}

		return ret;
	}

}
