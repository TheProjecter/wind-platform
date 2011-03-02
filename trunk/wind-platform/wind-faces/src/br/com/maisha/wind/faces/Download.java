package br.com.maisha.wind.faces;

import java.io.InputStream;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.service.IServiceHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
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

		browser.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent event) {
				boolean stop = false;
				do {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} while (RWT.getSessionStore().getAttribute("doxo") != null);

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
	 * @param filename
	 * @return
	 */
	private String createDownloadUrl(String filename) {
		StringBuilder url = new StringBuilder();
		// url.append("<a href=\"");
		url.append(RWT.getRequest().getContextPath());
		url.append(RWT.getRequest().getServletPath());
		url.append("?");
		url.append(IServiceHandler.REQUEST_PARAM);
		url.append("=downloadServiceHandler");
		url.append("&filename=");
		url.append(filename);
		// url.append("\">ddd</a> ");
		String encodedURL = RWT.getResponse().encodeURL(url.toString());
		return encodedURL;
	}

	/**
	 * 
	 */
	private void startDownload() {
		boolean k = false;
		k = browser.execute(" window.location = \"" + createDownloadUrl("doxo") + "\"");
		if (k) {
			close();
		}
	}

	/** @see #inputStream */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;

		// stores data in the session.
		RWT.getSessionStore().setAttribute("doxo", this.inputStream);
	}

}
