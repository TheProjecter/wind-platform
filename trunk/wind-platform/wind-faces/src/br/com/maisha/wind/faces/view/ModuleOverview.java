package br.com.maisha.wind.faces.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ModuleOverview extends ViewPart {

	/** */
	public static final String ID = "br.com.maisha.wind.faces.view.ModuleOverview";

	/** */
	private TreeViewer viewer;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		int style = SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL;
		viewer = new TreeViewer(parent, style);
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setInput(getViewSite());

	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		viewer.getControl().setFocus();

	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
		 *      int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class ViewContentProvider implements ITreeContentProvider {

		private Map<String, List<DomainObject>> map = null;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			map = new HashMap<String, List<DomainObject>>();
		}

		public void dispose() {
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
		 */
		public Object[] getElements(Object parent) {
			List<DomainObject> ret = new ArrayList<DomainObject>();
			for (Map.Entry<String, List<DomainObject>> entry : map.entrySet()) {
				for (DomainObject tc : entry.getValue()) {
					ret.add(tc);
				}
			}
			return ret.toArray();
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
		 */
		public Object[] getChildren(Object parentElement) {
			List<Object> ret = new ArrayList<Object>();
			if (parentElement instanceof DomainObject) {
				DomainObject obj = (DomainObject) parentElement;
				ret.addAll(obj.getImports());
				ret.addAll(obj.getAtts());
			} else if (parentElement instanceof Attribute) {
				Attribute attr = (Attribute) parentElement;
				ret.addAll(attr.getProps());
			}
			return ret.toArray();
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
		 */
		public Object getParent(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
		 */
		public boolean hasChildren(Object element) {
			if (element instanceof DomainObject) {
				DomainObject obj = (DomainObject) element;
				return obj.getAtts() != null && !obj.getAtts().isEmpty();
			} else if (element instanceof Attribute) {
				Attribute attr = (Attribute) element;
				return attr.getProps() != null && !attr.getProps().isEmpty();
			}
			return false;
		}

	}
}
