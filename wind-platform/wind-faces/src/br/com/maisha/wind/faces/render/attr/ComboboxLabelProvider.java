package br.com.maisha.wind.faces.render.attr;

import org.eclipse.jface.viewers.LabelProvider;

import br.com.maisha.terra.lang.ValidValue;

/**
 * Provides labels for the objects contained in a combobox.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ComboboxLabelProvider extends LabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {

		if (element instanceof ValidValue) {
			return ((ValidValue) element).getValue();
		}
		
		return super.getText(element);
	}

}
