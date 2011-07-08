package br.com.maisha.wind.faces.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewLabelProvider extends CellLabelProvider implements ITableLabelProvider {

	/** */
	private Map<Integer, String> properties;

	/** */
	private ValueWriter writer = new ValueWriter();

	/** */
	private IApplicationController appCtrl;

	/** */
	private IApplicationRegistry registry;

	public GridViewLabelProvider(Map<Integer, String> properties) {
		this.properties = properties;
		this.appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
		this.registry = ServiceProvider.getInstance().getService(IApplicationRegistry.class,
				Activator.getDefault().getBundle().getBundleContext());
	}

	/**
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	/**
	 * CellLabelProvider
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
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
			} else if (val instanceof ModelReference) {
				return write((ModelReference) val);
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

		/**
		 * 
		 * @param ref
		 * @return
		 */
		public String write(ModelReference ref) {

			String appId = appCtrl.getObjectValue(ref, "appId") + "";
			String objId = appCtrl.getObjectValue(ref, "objId") + "";

			DomainObject meta = registry.getObject(appId, objId);
			StringBuffer sb = new StringBuffer();
			if (meta != null) {
				for (Attribute attr : meta.getAtts()) {
					if (attr.getPropertyValue(PropertyInfo.TOSTRING)) {
						sb.append(write(appCtrl.getObjectValue(ref, attr.getRef())));
					}
				}
			}
			return sb.toString();
		}
	}

	@Override
	public void update(ViewerCell cell) {
		cell.toString();
		// TODO Auto-generated method stub

	}
}