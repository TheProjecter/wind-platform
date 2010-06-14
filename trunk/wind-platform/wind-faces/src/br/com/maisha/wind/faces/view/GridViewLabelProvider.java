package br.com.maisha.wind.faces.view;

import java.util.Map;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewLabelProvider extends LabelProvider implements ITableLabelProvider {

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
	@SuppressWarnings("unchecked")
	public String getColumnText(final Object element, final int columnIndex) {
		Map<String, Object> dataMap = (Map<String, Object>) element;
		String propName = properties.get(columnIndex);
		Object val = dataMap.get(propName);

		return val != null ? val.toString() : "";
	}

}