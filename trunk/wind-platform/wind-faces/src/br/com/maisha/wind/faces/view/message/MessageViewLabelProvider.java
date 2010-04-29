package br.com.maisha.wind.faces.view.message;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import br.com.maisha.wind.controller.model.UserMessage;
import br.com.maisha.wind.controller.model.UserMessage.MessageKind;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * 
 * @author Paulo Freitas (paulo.freitas@progonos.com)
 * 
 */
public class MessageViewLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	private static final Image ERROR = Activator.getImageDescriptor(
			"icons/error_tsk.gif").createImage();
	private static final Image INFO = Activator.getImageDescriptor(
			"icons/info_tsk.gif").createImage();
	private static final Image WARN = Activator.getImageDescriptor(
			"icons/warn_tsk.gif").createImage();

	/**
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
	 *      int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		Image icon = null;
		if (element instanceof UserMessage && columnIndex == 0) {
			UserMessage msg = (UserMessage) element;
			if (MessageKind.ERROR.equals(msg.getKind())) {
				return ERROR;
			} else if (MessageKind.INFO.equals(msg.getKind())) {
				return INFO;
			} else if (MessageKind.WARNING.equals(msg.getKind())) {
				return WARN;
			}
		}
		return icon;
	}

	/**
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
	 *      int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		String ret = null;
		if (element instanceof UserMessage) {
			UserMessage msg = (UserMessage) element;

			if (columnIndex == 1) {
				ret = msg.getI18nMessage();
			}
		}
		return ret;
	}

}
