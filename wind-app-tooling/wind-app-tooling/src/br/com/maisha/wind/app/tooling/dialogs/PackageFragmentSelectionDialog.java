package br.com.maisha.wind.app.tooling.dialogs;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
 * Dialogo para escolha elementos Java (src folder, package, etc)
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class PackageFragmentSelectionDialog<T> {

	/** Classes aceitas para filtro. */
	private Class<?>[] acceptedClasses;

	/** Tipo esperado como retorno do dialogo. */
	private Class<?> expectedType;

	/** Dialog. */
	private ElementTreeSelectionDialog dialog;

	/**
	 * Construtor
	 * 
	 * @param shell
	 * @param expectedType
	 */
	public PackageFragmentSelectionDialog(Shell shell, Class<?> expectedType) {
		this.expectedType = expectedType;

		StandardJavaElementContentProvider provider = new StandardJavaElementContentProvider();
		ILabelProvider labelProvider = new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
		dialog = new ElementTreeSelectionDialog(shell, labelProvider, provider);
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T open() {

		ViewerFilter filter = new ViewerFilter() {
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IPackageFragmentRoot) {
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

		dialog.setComparator(new JavaElementComparator());
		dialog.setInput(JavaCore.create(ResourcesPlugin.getWorkspace().getRoot()));
		dialog.addFilter(filter);
		dialog.setHelpAvailable(false);
		dialog.setValidator(new ISelectionStatusValidator() {
			public IStatus validate(Object[] selection) {
				try {
					if (selection != null && selection.length == 1) {
						if (expectedType.isAssignableFrom(selection[0].getClass())) {
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

	/**
	 * 
	 * @param acceptedClasses
	 */
	public void setAcceptedClasses(Class<?>[] acceptedClasses) {
		this.acceptedClasses = acceptedClasses;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title){
		dialog.setTitle(title);
	}
	
	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message){
		dialog.setMessage(message);
	}

}
