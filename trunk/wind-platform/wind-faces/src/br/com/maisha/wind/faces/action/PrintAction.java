package br.com.maisha.wind.faces.action;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.osgi.framework.Bundle;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.dataexporter.IDataExporter;
import br.com.maisha.wind.dataexporter.IDataExporter.ExporterType;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.view.print.GridPrintDialog;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PrintAction extends Action implements IWorkbenchAction {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(PrintAction.class);

	/** */
	private static final String PRINT_GRID_TEMPLATE = "/bin/grid.freemarker";

	/** Grid contents. */
	private List<Map<String, Object>> gridData;

	/** Domain Object. */
	private DomainObject meta;

	/** Data exporter service. */
	private IDataExporter exporter;

	/** Text template (ftl) */
	private URL template;

	/**
	 * This action is created disabled by default. Clients must call
	 * {@link #configure(List, DomainObject)} before.
	 * 
	 */
	public PrintAction() {
		Bundle b = Activator.getDefault().getBundle();
		this.exporter = ServiceProvider.getInstance().getService(IDataExporter.class, b.getBundleContext());
		this.template = b.getEntry(PRINT_GRID_TEMPLATE);

		setText("Print");
		setToolTipText("Send grid content to the printer...");
		setDescription("Send grid content to the printer...");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ETOOL_PRINT_EDIT));
		setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ETOOL_PRINT_EDIT_DISABLED));

		// disabled by default... should call configure();
		setEnabled(false);
	}

	/**
	 * 
	 * @param input
	 * @param meta
	 */
	public void configure(List<Map<String, Object>> input, DomainObject meta) {
		this.gridData = input;
		this.meta = meta;

		this.setEnabled(gridData != null && !gridData.isEmpty());
	}

	/**
	 * 
	 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
	 */
	public void runWithEvent(Event event) {
		try {
			if (template != null) {
				Map<String, Object> d = new HashMap<String, Object>();
				d.put("root", gridData);
				d.put("meta", meta);

				InputStream tmplStream = template.openStream();
				InputStream is = exporter.export(d, tmplStream, ExporterType.TEXT);

				if (is != null) {
					try {
						String text = IOUtils.toString(is);

						GridPrintDialog dialog = new GridPrintDialog(Display.getCurrent().getActiveShell(), meta, text);
						dialog.setBlockOnOpen(true);
						dialog.open();
					} finally {
						IOUtils.closeQuietly(is);
						IOUtils.closeQuietly(tmplStream);
					}
				}
			}
		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}

	}

	/**
	 * 
	 * @see org.eclipse.ui.actions.ActionFactory.IWorkbenchAction#dispose()
	 */
	public void dispose() {

	}

}
