package br.com.maisha.wind.faces.view;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.WindApplication;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * About view for Wind Platform.
 * <p/>
 * Shows informations about the platform and the current installed Wind
 * Applications.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AboutView extends ViewPart {

	/** View ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.AboutView";

	/** Eclipse forms toolkit. */
	private FormToolkit toolkit;

	/** Wind platform application registry. */
	private IApplicationRegistry registry;

	private ScrolledForm sform;

	private CTabFolder tabFolder;

	/** */
	private Text text;

	/** */
	private WindApplication currentApp;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		registry = ServiceProvider.getInstance().getService(IApplicationRegistry.class,
				Activator.getDefault().getBundle().getBundleContext());

		toolkit = new FormToolkit(parent.getDisplay());
		sform = toolkit.createScrolledForm(parent);

		toolkit.decorateFormHeading(sform.getForm());
		sform.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE));
		sform.setText("About Wind Platform");

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 10;
		layout.marginWidth = 6;
		layout.horizontalSpacing = 20;
		sform.getBody().setLayout(layout);

		// installed applications section...
		Section section = toolkit.createSection(sform.getBody(), ExpandableComposite.TITLE_BAR
				| ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED);
		Composite client = toolkit.createComposite(section);
		section.setClient(client);
		section.setText("Installed Applications");
		section.setDescription("Use the switches below to control basic heading parameters.");
		GridData gd = new GridData(GridData.FILL_BOTH);
		section.setLayoutData(gd);
		layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		client.setLayout(layout);

		// installed applications list...
		List<WindApplication> apps = registry.retrieve();
		for (WindApplication app : apps) {
			Hyperlink h = toolkit.createHyperlink(client, app.getName(), SWT.WRAP);
			h.setData(app);
			h.addHyperlinkListener(new IHyperlinkListener() {
				public void linkExited(HyperlinkEvent e) {
				}

				public void linkEntered(HyperlinkEvent e) {
					Hyperlink h = (Hyperlink) e.getSource();
					currentApp = (WindApplication) h.getData();
					updateSelection();
				}

				public void linkActivated(HyperlinkEvent e) {

				}
			});
		}
		currentApp = apps.get(0);

		// description, licence
		Section sectionDescription = toolkit.createSection(sform.getBody(), ExpandableComposite.TITLE_BAR
				| ExpandableComposite.TWISTIE | ExpandableComposite.EXPANDED);
		client = toolkit.createComposite(sectionDescription);
		sectionDescription.setClient(client);
		sectionDescription.setText("Description, License...");
		gd = new GridData(GridData.FILL_BOTH);
		sectionDescription.setLayoutData(gd);
		layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		client.setLayout(layout);

		tabFolder = new CTabFolder(client, SWT.FLAT | SWT.TOP);
		toolkit.adapt(tabFolder, true, true);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 0;
		tabFolder.setLayoutData(gd);
		createText(toolkit, client);
		createTab(toolkit, "Description");
		createTab(toolkit, "License");
		createTab(toolkit, "Copyright");
		
		tabFolder.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateSelection();
			}
		});
		
		tabFolder.setSelection(0);
		updateSelection();
	}

	/**
	 * 
	 */
	private  void updateSelection(){
		int tabIndex = tabFolder.getSelectionIndex();
		switch (tabIndex) {
		case 0:
			text.setText(currentApp.getAppId());
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		default:
			break;
		}
	}
	
	/**
	 * 
	 * @param toolkit
	 * @param title
	 * @param content
	 */
	private void createTab(FormToolkit toolkit, String title) {
		CTabItem item = new CTabItem(tabFolder, SWT.NULL);
		item.setText(title);
	}

	/**
	 * 
	 * @param toolkit
	 * @param parent
	 */
	private void createText(FormToolkit toolkit, Composite parent) {
		Composite tabContent = toolkit.createComposite(parent);
		tabContent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		tabContent.setLayout(layout);
		layout.numColumns = 2;
		layout.marginWidth = 0;
		GridData gd;
		text = toolkit.createText(tabContent, "", SWT.MULTI | SWT.WRAP);
		gd = new GridData(GridData.FILL_BOTH);
		gd.verticalSpan = 2;
		text.setLayoutData(gd);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {

	}

}
