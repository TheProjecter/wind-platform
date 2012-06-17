package br.com.maisha.wind.app.tooling.wizards;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementComparator;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

public class NewDmoWizardPage extends WizardPage {

	private Text sourceFolder;
	
	public NewDmoWizardPage(IStructuredSelection selecion) {
		super("NewDmoWizardPage");
		setTitle("Domain Object");
		setDescription("Creates a new Domain Object file");
	}

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

		Label l1 = new Label(panel, SWT.NONE);
		l1.setText("Source folder:");
		sourceFolder = new Text(panel, SWT.BORDER);
		sourceFolder.setLayoutData(srcTextGD);

		Button fBrowseButton = new Button(panel, SWT.PUSH);
		fBrowseButton.setText("Browse");
		fBrowseButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				IPackageFragmentRoot srcFolder = chooseContainer();
				String projectName = srcFolder.getJavaProject().getElementName();
				projectName += "/"+ srcFolder.getElementName();
				sourceFolder.setText(projectName);
			}

			public void widgetSelected(SelectionEvent e) {
				IPackageFragmentRoot srcFolder = chooseContainer();
				String projectName = srcFolder.getJavaProject().getElementName();
				projectName += "/"+ srcFolder.getElementName();
				sourceFolder.setText(projectName);
			}
		});

		Label sep = new Label(panel, SWT.SEPARATOR | SWT.HORIZONTAL);
		sep.setLayoutData(sepGD);

		Label l4 = new Label(panel, SWT.NONE);
		l4.setText("Qualified Name:");
		Text dmoName = new Text(panel, SWT.BORDER);
		dmoName.setLayoutData(textGD);



		setControl(parent);
	}

	protected IPackageFragmentRoot chooseContainer() {

		final Class<?>[] acceptedClasses = new Class<?>[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class };
		ViewerFilter filter = new ViewerFilter() {
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IPackageFragmentRoot) {
					try {
						return (((IPackageFragmentRoot) element).getKind() == IPackageFragmentRoot.K_SOURCE);
					} catch (JavaModelException e) {
						return false;
					}
				}
				
				for(Class<?> acceptedClass: acceptedClasses){
					if(acceptedClass.isInstance(element)){
						return true;
					}
				}
				return false;
			}
		};

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), labelProvider, provider);
		dialog.setComparator(new JavaElementComparator());
		dialog.setTitle("Source Folder Selection");
		dialog.setMessage("Select the source folder for your Domain Object");
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);

		if (dialog.open() == Window.OK) {
			Object element = dialog.getFirstResult();
			if (element instanceof IJavaProject) {
				IJavaProject jproject = (IJavaProject) element;
				return jproject.getPackageFragmentRoot(jproject.getProject());
			} else if (element instanceof IPackageFragmentRoot) {
				return (IPackageFragmentRoot) element;
			}
			return null;
		}
		return null;
	}

	
	
}
