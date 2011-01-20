package br.com.maisha.wind.faces.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.wind.common.exception.ErrorLog;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;

public class LogView extends ViewPart implements IRender {

	/** View Part ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.logView";

	/** Log Reference. */
	private static final Logger log = Logger.getLogger(LogView.class);

	/** */
	private static final Image ERROR = Activator.getImageDescriptor("icons/error_tsk.gif").createImage();

	/** TODO i18n */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	/** */
	private TableViewer viewer;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		setPartName(PlatformMessageRegistry.getInstance().getMessage("wind_faces.logView.title"));
		
		IPresentationProvider presentation = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
		presentation.registerRender(this);

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		TableViewerColumn msgCol = new TableViewerColumn(viewer, SWT.NONE);
		msgCol.getColumn().setText(PlatformMessageRegistry.getInstance().getMessage("wind_faces.logView.message"));
		msgCol.getColumn().setWidth(350);
		msgCol.getColumn().setResizable(true);
		msgCol.getColumn().setMoveable(false);

		TableViewerColumn dateCol = new TableViewerColumn(viewer, SWT.NONE);
		dateCol.getColumn().setText(PlatformMessageRegistry.getInstance().getMessage("wind_faces.logView.date")); 
		dateCol.getColumn().setWidth(120);
		dateCol.getColumn().setResizable(true);
		dateCol.getColumn().setMoveable(false);

		TableViewerColumn bundleIdCol = new TableViewerColumn(viewer, SWT.NONE);
		bundleIdCol.getColumn().setText(PlatformMessageRegistry.getInstance().getMessage("wind_faces.logView.bundle"));
		bundleIdCol.getColumn().setWidth(145);
		bundleIdCol.getColumn().setResizable(true);
		bundleIdCol.getColumn().setMoveable(false);

		viewer.setContentProvider(new LogViewContentProvider());
		viewer.setLabelProvider(new LogViewLabelProvider());
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);

		viewer.setInput(new ArrayList<ErrorLog>());

	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages()[0].showView(LogView.ID, null,
					IWorkbenchPage.VIEW_ACTIVATE);
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[]{ LevelType.Exception };
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public void render(LevelType level, ChangeType ct, Object model) {
		log.debug("Rendering Log View...");

		if (model instanceof ErrorLog) {
			List<ErrorLog> curr = (List<ErrorLog>) viewer.getInput();
			curr.add((ErrorLog) model);
			viewer.setInput(curr);
			this.setFocus();
		}
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class LogViewContentProvider implements IStructuredContentProvider {

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

		/**
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

	class LogViewLabelProvider extends LabelProvider implements ITableLabelProvider {

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
		 *      int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex == 0) {
				return ERROR;
			}
			return null;
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {

			if (element instanceof ErrorLog) {
				ErrorLog error = (ErrorLog) element;

				if (columnIndex == 0) {
					return error.getThrowable().getMessage();
				} else if (columnIndex == 1) {
					return sdf.format(error.getCreationDate());
				} else if (columnIndex == 2) {
					return error.getBundleId();
				}
			}

			return null;
		}

	}
}
