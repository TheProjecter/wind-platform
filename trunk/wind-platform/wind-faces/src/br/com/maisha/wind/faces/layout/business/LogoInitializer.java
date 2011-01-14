package br.com.maisha.wind.faces.layout.business;

import org.eclipse.rap.ui.interactiondesign.layout.model.ILayoutSetInitializer;
import org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;

/**
 * Customizes the layout default logo.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 *
 */
public class LogoInitializer implements ILayoutSetInitializer {

	/**
	 * 
	 * @see org.eclipse.rap.ui.interactiondesign.layout.model.ILayoutSetInitializer#initializeLayoutSet(org.eclipse.rap.ui.interactiondesign.layout.model.LayoutSet)
	 */
	public void initializeLayoutSet(final LayoutSet layoutSet) {
		String path = "icons/";
		layoutSet.addImagePath("header.logo", path + "logo.png");

		// positions
		FormData fdLogo = new FormData();
		fdLogo.right = new FormAttachment(100, -75);
		fdLogo.top = new FormAttachment(0, 32);
		layoutSet.addPosition("header.logo.position", fdLogo);
	}

}