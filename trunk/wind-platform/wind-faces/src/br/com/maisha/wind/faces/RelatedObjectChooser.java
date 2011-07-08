package br.com.maisha.wind.faces;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.springframework.util.StringUtils;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.attr.ViewerContentProviderJob;
import br.com.maisha.wind.faces.view.GridViewColumnProvider;
import br.com.maisha.wind.faces.view.GridViewComparator;
import br.com.maisha.wind.faces.view.GridViewContentProvider;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
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
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		contents.setLayoutData(layoutData);

		setTitle(PlatformMessageRegistry.getInstance().getMessage("wind_faces.related.related_object_dialog",
				new Object[] { dObj.getLabel() }));
		setTitleImage(Activator.getImageDescriptor("icons/related_wiz.png").createImage());

		viewer = new TableViewer(contents, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.getTable().setLayoutData(layoutData);
		viewer.setContentProvider(new GridViewContentProvider());
		viewer.setComparator(new GridViewComparator());
		viewer.getTable().setHeaderVisible(true);
		viewer.getTable().setLinesVisible(true);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				Map<String, Object> map = (Map<String, Object>) sel.getFirstElement();
				related = (ModelReference) map.get("ref");
				log.debug("Selected [" + related + "] ");
			}
		});
		new GridViewColumnProvider(dObj, viewer).createColumns();

		String jobName = PlatformMessageRegistry.getInstance().getMessage("wind_faces.gridView.loadData");
		ViewerContentProviderJob job = new ViewerContentProviderJob(jobName, attr, viewer);
		job.schedule();

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
