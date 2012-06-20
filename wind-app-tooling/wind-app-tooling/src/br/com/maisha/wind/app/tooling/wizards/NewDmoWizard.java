package br.com.maisha.wind.app.tooling.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewDmoWizard extends Wizard implements INewWizard {

	private IStructuredSelection selection;
	private NewDmoWizardPage newDmoWizardPage;
	private IWorkbench workbench;

	public NewDmoWizard() {

		setWindowTitle("New Config File");

	}

	@Override
	public void addPages() {
		newDmoWizardPage = new NewDmoWizardPage(selection);
		addPage(newDmoWizardPage);
	}

	@Override
	public boolean performFinish() {

		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

}
