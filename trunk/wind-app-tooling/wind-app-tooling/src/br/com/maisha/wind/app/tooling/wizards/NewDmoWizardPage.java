package br.com.maisha.wind.app.tooling.wizards;

import static br.com.maisha.wind.app.tooling.util.Utilities.isNotBlank;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.wind.app.tooling.dialogs.PackageFragmentSelectionDialog;

/**
 * Wizard Page responsavel pela criacao de definicoes de Domain Object (arquivos
 * *.dmo)
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class NewDmoWizardPage extends WizardPage {

	
	/**
	 * Campo de texto que recebe o source folder onde o arquivo *.dmo sera
	 * criado.
	 */
	private Text sourceFolderText;

	/** Campo de texto que recebe o pacote (i.e pkg java) para o Domain Object */
	private Text packageText;

	/** Campo de texto que recebe o nome do Domain Object. */
	private Text dmoNameText;

	/** Selecao do Workbench no momento da abertura do Wizard. */
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
		sourceFolderText = new Text(panel, SWT.BORDER);
		sourceFolderText.setLayoutData(srcTextGD);
		sourceFolderText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(isPageComplete());
			}
		});

		Button fBrowseButton = new Button(panel, SWT.PUSH);
		fBrowseButton.setText("Browse");
		fBrowseButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				IPackageFragmentRoot srcFolder = chooseContainer();
				setSourceFolderText(srcFolder);
			}
		});

		Label pkgLabel = new Label(panel, SWT.NONE);
		pkgLabel.setText("Package:");
		packageText = new Text(panel, SWT.BORDER);
		packageText.setLayoutData(srcTextGD);
		packageText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(isPageComplete());
			}
		});

		Button fBrowsePkgButton = new Button(panel, SWT.PUSH);
		fBrowsePkgButton.setText("Browse");
		fBrowsePkgButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				IPackageFragment pkg = choosePackage();
				setPackageText(pkg);
			}
		});

		Label sep = new Label(panel, SWT.SEPARATOR | SWT.HORIZONTAL);
		sep.setLayoutData(sepGD);

		Label l4 = new Label(panel, SWT.NONE);
		l4.setText("Name:");
		dmoNameText = new Text(panel, SWT.BORDER);
		dmoNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(isPageComplete());
			}
		});
		dmoNameText.setLayoutData(textGD);

		processSelection();
		setControl(parent);
	}

	/**
	 * Processa a selecao corrente no Workbench preenchendo os campos de texto
	 * Source Folder e Package de acordo com o elemento selecionado.
	 */
	private void processSelection() {
		try {
			if (selection.isEmpty() || selection.getFirstElement() == null) {
				return;
			}

			if (selection.getFirstElement() instanceof IFile) {
				IFile file = (IFile) selection.getFirstElement();
				IJavaElement javaPkg = JavaCore.create(file.getParent());
				if (javaPkg != null && javaPkg instanceof IPackageFragment) {
					setPackageText((IPackageFragment) javaPkg);
					setSourceFolderText((IPackageFragmentRoot) javaPkg.getParent());
				}
			}

			if (selection.getFirstElement() instanceof IFolder) {
				IFolder first = (IFolder) selection.getFirstElement();
				IJavaElement javaModel = JavaCore.create(first);

				if (javaModel != null && javaModel instanceof IPackageFragmentRoot) {
					IPackageFragmentRoot fragRoot = (IPackageFragmentRoot) javaModel;
					if (fragRoot.getKind() == IPackageFragmentRoot.K_SOURCE) {
						setSourceFolderText(fragRoot);
					}
				} else if (javaModel != null && javaModel instanceof IPackageFragment) {
					setPackageText((IPackageFragment) javaModel);
					setSourceFolderText((IPackageFragmentRoot) javaModel.getParent());

				}
			}
		} catch (Exception e) {
			// silently ignore
		}

	}

	/**
	 * Configura o valor do campo de texto Source Folder com base no
	 * {@link IPackageFragmentRoot} dado
	 * 
	 * @param fragRoot
	 *            Representacao do Src Folder
	 */
	private void setSourceFolderText(IPackageFragmentRoot fragRoot) {
		String projectName = fragRoot.getJavaProject().getElementName();
		projectName += "/" + fragRoot.getElementName();
		sourceFolderText.setText(projectName);
	}

	/**
	 * Configura o valor do campo de texto Package com base no
	 * {@link IPackageFragment} dado
	 * 
	 * @param pkg
	 *            Representacao do Package
	 */
	private void setPackageText(IPackageFragment pkg) {
		packageText.setText(pkg.getElementName());
	}

	/**
	 * Abre o dialogo para escolha do container (src folder)
	 * 
	 * @return Src Folder Selecionado
	 */
	protected IPackageFragmentRoot chooseContainer() {
		PackageFragmentSelectionDialog<IPackageFragmentRoot> dialog = new PackageFragmentSelectionDialog<IPackageFragmentRoot>(
				getShell(), IPackageFragmentRoot.class);
		dialog.setAcceptedClasses(new Class<?>[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class });
		dialog.setTitle("Source Folder Selection");
		dialog.setMessage("Choose a source folder:");
		return dialog.open();
	}

	/**
	 * Abre o dialogo para escolha do pacote (package)
	 * 
	 * @return Pkg Folder Selecionado
	 */
	protected IPackageFragment choosePackage() {
		PackageFragmentSelectionDialog<IPackageFragment> dialog = new PackageFragmentSelectionDialog<IPackageFragment>(
				getShell(), IPackageFragment.class);
		dialog.setAcceptedClasses(new Class<?>[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class,
				IPackageFragment.class });
		dialog.setTitle("Package Selection");
		dialog.setMessage("Choose a package:");
		return dialog.open();
	}

	/**
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	public boolean isPageComplete() {
		return isNotBlank(getDomainObjectName()) && isNotBlank(getSourceFolderName()) && isNotBlank(getPackageName());
	}

	/**
	 * Obtem o nome do Domain Object informado pelo usuario.
	 * 
	 * @return Nome do Domain Object
	 */
	public String getDomainObjectName() {
		return dmoNameText.getText();
	}

	/**
	 * Obtem o nome do Source Folder onde o Domain Object deve ser criado.
	 * 
	 * @return Nome do source folder.
	 */
	public String getSourceFolderName() {
		return sourceFolderText.getText();
	}

	/**
	 * Obtem o nome do pacote utilizado pelo Domain Object.
	 * 
	 * @return Pacote do Domain Object.
	 */
	public String getPackageName() {
		return packageText.getText();
	}

	
	
}
