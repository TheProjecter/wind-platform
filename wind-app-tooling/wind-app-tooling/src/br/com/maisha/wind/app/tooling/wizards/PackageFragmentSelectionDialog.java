package br.com.maisha.wind.app.tooling.wizards;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementComparator;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class PackageFragmentSelectionDialog<T>  {

	/** */
	private Shell shell;

	/** */
	private Class<?> acceptedClass;
	
	/**
	 * 
	 * @param shell
	 */
	public PackageFragmentSelectionDialog(Shell shell, Class<?> acceptedClass) {
		this.shell = shell;
		this.acceptedClass = acceptedClass;
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T open() {
		final Class<?>[] acceptedClasses = new Class<?>[] { IJavaModel.class, IPackageFragmentRoot.class,
				IJavaProject.class, IJavaElement.class };
		
		ViewerFilter filter = new ViewerFilter() {
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if(element instanceof IPackageFragmentRoot){
					try {
						IPackageFragmentRoot pkg = (IPackageFragmentRoot) element;
						return (pkg.getKind() == IPackageFragmentRoot.K_SOURCE);
					} catch (JavaModelException e) {
						return false;
					}
				}

				for (Class<?> acceptedClass : acceptedClasses) {
					if (acceptedClass.isInstance(element)) {
						return true;
					}
				}
				return false;
			}
		};

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);
		dialog.setComparator(new JavaElementComparator());
		dialog.setTitle("Source Folder Selection");
		dialog.setMessage("Select the source folder for your Domain Object");
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);
		dialog.setValidator(new ISelectionStatusValidator() {
			public IStatus validate(Object[] selection) {
				try {
					if (selection != null && selection.length == 1) {
						if (acceptedClass.isAssignableFrom(selection[0].getClass())) {
							return new Status(Status.OK, "unknow", "");			
						}
					}
				} catch (Exception e) {
					return new Status(Status.ERROR, "unknow", e.getLocalizedMessage());
				}
				return new Status(Status.ERROR, "unknow", "");
			}
		});
		dialog.setStatusLineAboveButtons(false);

		if (dialog.open() == Window.OK) {
			return (T) dialog.getFirstResult();
		}
		return null;
	}

}
