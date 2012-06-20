package br.com.maisha.wind.app.tooling.wizards;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class NewDmoWizardPage extends WizardPage {

	/** */
	private Text sourceFolder;

	/** */
	private Text packge;

	/** */
	private IStructuredSelection selection;

	/**
	 * Construtor configura objeto selecionado no workbench
	 * 
	 * @param selecion
	 */
	public NewDmoWizardPage(IStructuredSelection selecion) {
		super("NewDmoWizardPage");
		setTitle("Domain Object");
		setDescription("Creates a new Domain Object file");
		this.selection = selecion;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite panel = new Composite(parent, SWT.NONE);
		GridLayout panelLayout = new GridLayout(3, false);
		panel.setLayout(panelLayout);

		GridData srcTextGD = new GridData();
		srcTextGD.grabExcessHorizontalSpace = true;
		srcTextGD.horizontalAlignment = SWT.FILL;

		GridData textGD = new GridData();
		textGD.grabExcessHorizontalSpace = true;
		textGD.horizontalAlignment = SWT.FILL;
		textGD.horizontalSpan = 2;

		GridData sepGD = new GridData();
		sepGD.horizontalAlignment = SWT.FILL;
		sepGD.grabExcessHorizontalSpace = true;
		sepGD.horizontalSpan = 3;

		Label srcFolderLabel = new Label(panel, SWT.NONE);
		srcFolderLabel.setText("Source folder:");
		sourceFolder = new Text(panel, SWT.BORDER);
		sourceFolder.setLayoutData(srcTextGD);

		Button fBrowseButton = new Button(panel, SWT.PUSH);
		fBrowseButton.setText("Browse");
		fBrowseButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				IPackageFragmentRoot srcFolder = chooseContainer();
				String projectName = srcFolder.getJavaProject().getElementName();
				projectName += "/" + srcFolder.getElementName();
				sourceFolder.setText(projectName);
			}
		});

		Label pkgLabel = new Label(panel, SWT.NONE);
		pkgLabel.setText("Package:");
		packge = new Text(panel, SWT.BORDER);
		packge.setLayoutData(srcTextGD);

		Button fBrowsePkgButton = new Button(panel, SWT.PUSH);
		fBrowsePkgButton.setText("Browse");
		fBrowsePkgButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				IPackageFragment srcFolder = choosePackage();
				String projectName = srcFolder.getJavaProject().getElementName();
				projectName += "/" + srcFolder.getElementName();
				sourceFolder.setText(projectName);
			}
		});

		Label sep = new Label(panel, SWT.SEPARATOR | SWT.HORIZONTAL);
		sep.setLayoutData(sepGD);

		Label l4 = new Label(panel, SWT.NONE);
		l4.setText("Name:");
		Text dmoName = new Text(panel, SWT.BORDER);
		dmoName.setLayoutData(textGD);

		setControl(parent);
	}

	/**
	 * Abre o dialogo para escolha do container (src folder)
	 * 
	 * @return Src Folder Selecionado
	 */
	protected IPackageFragmentRoot chooseContainer() {
		PackageFragmentSelectionDialog<IPackageFragmentRoot> dialog = new PackageFragmentSelectionDialog<IPackageFragmentRoot>(
				getShell(), IPackageFragmentRoot.class);
		return dialog.open();
	}

	/**
	 * Abre o dialogo para escolha do container (src folder)
	 * 
	 * @return Src Folder Selecionado
	 */
	protected IPackageFragment choosePackage() {
		PackageFragmentSelectionDialog<IPackageFragment> dialog = new PackageFragmentSelectionDialog<IPackageFragment>(
				getShell(), IPackageFragment.class);
		return dialog.open();
	}
	
}
