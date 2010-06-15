package br.com.maisha.wind.faces.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import br.com.maisha.wind.controller.message.PlatformMessageRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewLabelProvider extends LabelProvider implements ITableLabelProvider {

	/** */
	private Map<Integer, String> properties;

	/** */
	private ValueWriter writer = new ValueWriter();

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

		return val != null ? writer.write(val) : "";
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class ValueWriter {

		public String write(Object val) {
			if (val instanceof Date) {
				return write((Date) val);
			}

			return val.toString();
		}

		/**
		 * 
		 * @param date
		 * @return
		 */
		public String write(Date date) {
			Locale loc = PlatformMessageRegistry.getInstance().getCurrentLocale();
			String pattern = PlatformMessageRegistry.getInstance().getPreference("datePattern", "dd/MM/yyyy");
			SimpleDateFormat sdf = new SimpleDateFormat(pattern, loc);
			return sdf.format(date);

		}

	}
}