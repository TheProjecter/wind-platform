package br.com.maisha.wind.app.tooling.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateTranslator;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import br.com.maisha.wind.app.tooling.Activator;
import br.com.maisha.wind.app.tooling.preferences.template.WindTemplatesContextType;
import br.com.maisha.wind.app.tooling.preferences.template.WindTemplatesVariableResolver;

import com.maisha.wind.editor.preferences.template.TerraCustomTemplateManager;

/**
 * Wizard responsavel pela criacao de novos arquivos de definicao de Domain
 * Object (*.dmo)
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class NewDmoWizard extends Wizard implements INewWizard {

	/** Selecao no momento da abertura do wizard. */
	private IStructuredSelection selection;

	/** Primeira e unica pagina (por enquanto, talvez). */
	private NewDmoWizardPage newDmoWizardPage;

	/**
	 * Construtor default.
	 */
	public NewDmoWizard() {
		setWindowTitle("New Domain Object File");
		setNeedsProgressMonitor(true);
	}

	/**
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	public void addPages() {
		newDmoWizardPage = new NewDmoWizardPage(selection);
		addPage(newDmoWizardPage);
	}

	/**
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		if (newDmoWizardPage.isPageComplete()) {
			final String dmoName = newDmoWizardPage.getDomainObjectName();
			final String pkg = newDmoWizardPage.getPackageName();
			final String container = newDmoWizardPage.getSourceFolderName() + "/" + pkg.replaceAll("\\.", "/");

			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException {
					try {
						doFinish(container, pkg, dmoName, monitor);
					} catch (CoreException e) {
						Platform.getLog(Activator.getDefault().getBundle()).log(e.getStatus());
						throw new InvocationTargetException(e);
					} finally {
						monitor.done();
					}
				}
			};

			try {
				getContainer().run(true, false, op);
			} catch (InterruptedException e) {
				Platform.getLog(Activator.getDefault().getBundle()).log(
						new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
				return false;
			} catch (InvocationTargetException e) {
				Throwable realException = e.getTargetException();
				IStatus status = new Status(Status.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				if (realException instanceof CoreException) {
					status = ((CoreException) realException).getStatus();
				}
				Platform.getLog(Activator.getDefault().getBundle()).log(status);
				return false;
			}

			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param containerName
	 * @param fileName
	 * @param monitor
	 * @throws CoreException
	 */
	private void doFinish(String containerName, String pkg, String fileName, IProgressMonitor monitor)
			throws CoreException {
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName + ".dmo"));
		try {
			InputStream stream = openContentStream(pkg, fileName);
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}

	/**
	 * 
	 * @return
	 * @throws CoreException
	 */
	private InputStream openContentStream(String pkgName, String dmoName) throws CoreException {
		try {
			TemplatePersistenceData dmoClassTD = TerraCustomTemplateManager.getInstance().getTemplateStore()
					.getTemplateData("wind.editor.ui.templates.class");
			Template template = dmoClassTD.getTemplate();

			TemplateContext context = new TemplateContext(new WindTemplatesContextType()) {
				public TemplateBuffer evaluate(Template template) throws BadLocationException, TemplateException {
					TemplateTranslator translator = new TemplateTranslator();
					TemplateBuffer buffer = translator.translate(template);
					getContextType().resolve(buffer, this);
					return buffer;
				}

				public boolean canEvaluate(Template template) {
					return true;
				}
			};

			context.setVariable(WindTemplatesVariableResolver.PKG_VARIABLE, pkgName);
			context.setVariable(WindTemplatesVariableResolver.DMO_NAME_VARIABLE, dmoName);

			return new ByteArrayInputStream(context.evaluate(template).getString().getBytes());
		} catch (Exception e) {
			throwCoreException(e.getMessage());
		}

		return null;
	}

	/**
	 * 
	 * @param message
	 * @throws CoreException
	 */
	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "wind-app-tooling", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

}
