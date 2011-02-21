package br.com.maisha.wind.faces.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * About view for Wind Platform.
 * <p/>
 * Shows informations about the platform and the current installed Wind
 * Applications.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class AboutView extends ViewPart {

	public static final String ID = "br.com.maisha.wind.faces.view.AboutView";
	
	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());

		Browser browser = new Browser(container, SWT.NONE);
		browser.setUrl("wind/about/about.html");
		

	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {

	}

}
