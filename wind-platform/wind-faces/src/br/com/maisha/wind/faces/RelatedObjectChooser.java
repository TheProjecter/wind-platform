package br.com.maisha.wind.faces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.springframework.util.StringUtils;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.view.GridViewContentProvider;
import br.com.maisha.wind.faces.view.GridViewLabelProvider;

public class RelatedObjectChooser extends TitleAreaDialog {

	/** Log Reference. */
	private static final Logger log = Logger.getLogger(RelatedObjectChooser.class);

	/** */
	private DomainObject dObj;

	/** */
	private Attribute attr;

	/** */
	private TableViewer viewer;

	/** */
	private IApplicationController appCtrl;

	/** */
	private ModelReference related;

	/** */
	private ModelReference instance;

	/**
	 * 
	 * @param parentShell
	 *            Parent
	 */
	public RelatedObjectChooser(Attribute attr, ModelReference instance, DomainObject dObj, Shell parentShell) {
		super(parentShell);
		this.attr = attr;
		this.instance = instance;
		this.dObj = dObj;
		appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout());

		GridData contentsGd = new GridData(GridData.FILL_BOTH);
		contents.setLayoutData(contentsGd);

		viewer = new TableViewer(contents, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

		final Map<Integer, String> map = new HashMap<Integer, String>();
		int i = 0;
		for (Attribute attr : dObj.getAtts()) {
			TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
			col.getColumn().setText(attr.getLabel());
			col.getColumn().setWidth(attr.getPropertyValue(PropertyInfo.WIDTH));
			col.getColumn().setResizable(false);
			col.getColumn().setMoveable(false);

			map.put(i, attr.getRef());

			i++;
		}

		viewer.setContentProvider(new GridViewContentProvider());
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				Map<String, Object> map =  (Map<String, Object>) sel.getFirstElement();
				related = (ModelReference) map.get("ref");
				log.debug("Selected [" + related + "] ");
			}
		});

		Label titleBarSeparator = new Label(contents, SWT.HORIZONTAL | SWT.SEPARATOR);
		titleBarSeparator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Display.getCurrent().asyncExec(new Runnable() {
			public void run() {
				List<ModelReference> data = appCtrl.filter(dObj);
				List<Map<String, Object>> dataMap = appCtrl.toMap(dObj, data);
				viewer.setLabelProvider(new GridViewLabelProvider(map));
				viewer.setInput(dataMap);
			}
		});

		setTitle("Select related " + dObj.getLabel()); // TODO NLS
		setTitleImage(Activator.getImageDescriptor("icons/related_wiz.png").createImage());
		return contents;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed() {
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("related", this.related);
		context.put("dObj", this.instance);

		appCtrl.runScript(" ${dObj.set" + StringUtils.capitalize(attr.getRef()) + "(related) }", context);

		super.okPressed();
	}

	public ModelReference getRelated() {
		return related;
	}

	
}
