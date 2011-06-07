package br.com.maisha.wind.faces.render.attr;

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * This is a content provider for combo rendered attributes.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ComboboxContentProvider implements IStructuredContentProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {

		// accept only lists of elements...
		if (inputElement instanceof Collection) {
			return ((Collection<?>) inputElement).toArray(new Object[] {});
		}
		
		return null;
	}

}
