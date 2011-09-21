package br.com.maisha.wind.ui.hovering;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import br.com.maisha.wind.terra.AttributeProperty;
import br.com.maisha.wind.terra.ObjectProperty;
import br.com.maisha.wind.terra.OperationProperty;

/**
 * Provides information about the object being hovered.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class TerraTextHover extends DefaultEObjectHoverProvider {

	private ResourceBundle rb;

	public TerraTextHover() {
		rb = ResourceBundle.getBundle("hover-info");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#hasHover
	 * (org.eclipse.emf.ecore.EObject)
	 */
	protected boolean hasHover(EObject o) {
		return o instanceof AttributeProperty || o instanceof ObjectProperty
				|| o instanceof OperationProperty;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#
	 * getFirstLine(org.eclipse.emf.ecore.EObject)
	 */
	protected String getFirstLine(EObject o) {
		StringBuffer sb = new StringBuffer();
		try {
			String ref = "";
			if (o instanceof AttributeProperty) {
				AttributeProperty ap = (AttributeProperty) o;
				ref = ap.getName().getLiteral();
			}
			
			if (o instanceof OperationProperty) {
				OperationProperty op = (OperationProperty) o;
				ref = op.getName().getLiteral();
			}
			
			
			if (o instanceof ObjectProperty) {
				ObjectProperty op = (ObjectProperty) o;
				ref = op.getName().getLiteral();
			}
			
			sb.append(rb.getString(ref));
		} catch (MissingResourceException mre) {
			// silently ignore
		}
		return sb.toString();
	}

}
