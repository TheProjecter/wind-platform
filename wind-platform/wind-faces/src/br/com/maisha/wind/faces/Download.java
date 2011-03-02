package br.com.maisha.wind.faces;

import java.io.InputStream;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Download extends MessageDialog {

	private InputStream inputStream;

	private Browser browser;

	/**
	 * 
	 * @param parentShell
	 */
	public Download(Shell parentShell) {
		super(parentShell, "Download", null, "Confirm Download??", QUESTION, new String[] {
				IDialogConstants.get().YES_LABEL, IDialogConstants.get().NO_LABEL }, 0);
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.MessageDialog#createCustomArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createCustomArea(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		browser.setVisible(false);
		Object b = browser.getWebBrowser();
		browser.addProgressListener(new ProgressListener() {

			/**
			 * 
			 * @see org.eclipse.swt.browser.ProgressListener#completed(org.eclipse.swt.browser.ProgressEvent)
			 */
			public void completed(ProgressEvent event) {
				close();

			}

			/**
			 * 
			 * @see org.eclipse.swt.browser.ProgressListener#changed(org.eclipse.swt.browser.ProgressEvent)
			 */
			public void changed(ProgressEvent event) {
				System.out.println(event);
				return;
				
			}
		});

		return browser;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.MessageDialog#buttonPressed(int)
	 */
	protected void buttonPressed(int buttonId) {
		if (buttonId == 0) {
			startDownload();
		}
	}

	/**
	 * 
	 */
	private void startDownload() {
		browser
				//.setUrl("http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/helios/SR2/eclipse-java-helios-SR2-linux-gtk.tar.gz&url=http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/helios/SR2/eclipse-java-helios-SR2-linux-gtk.tar.gz&mirror_id=576");
		.setUrl("http://www.eclipse.org");

	}

	/** @see #inputStream */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;

		// stores data in the session.
		RWT.getSessionStore().setAttribute("doxo", this.inputStream);
	}

}
