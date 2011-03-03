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
public class DownloadDialog extends MessageDialog {

	/** */
	private static final String FILE_KEY = "downloadServiceFile";

	/** */
	private InputStream inputStream;

	/** */
	private Browser browser;

	/** */
	private String extension;

	/**
	 * 
	 * @param parentShell
	 */
	public DownloadDialog(Shell parentShell, String extension) {
		super(parentShell, "Download", null, "Confirm Download??", QUESTION, new String[] {
				IDialogConstants.get().YES_LABEL, IDialogConstants.get().NO_LABEL }, 0);
		this.extension = extension;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.MessageDialog#createCustomArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createCustomArea(Composite parent) {
		browser = new Browser(parent, SWT.BORDER);
		browser.addDisposeListener(new DisposeListener() {
			/**
			 * @see org.eclipse.swt.events.DisposeListener#widgetDisposed(org.eclipse.swt.events.DisposeEvent)
			 */
			public void widgetDisposed(DisposeEvent event) {
				do {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// silently ignore
					}
				} while (RWT.getSessionStore().getAttribute(FILE_KEY) != null);

			}
		});

		browser.setVisible(false);
		return browser;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.MessageDialog#buttonPressed(int)
	 */
	protected void buttonPressed(int buttonId) {
		if (buttonId == 0) {
			startDownload();
		} else {
			RWT.getSessionStore().setAttribute(FILE_KEY, null);
			close();
		}
	}

	/**
	 * 
	 * @return
	 */
	private String createDownloadUrl() {
		StringBuilder url = new StringBuilder();
		url.append(RWT.getRequest().getContextPath());
		url.append(RWT.getRequest().getServletPath());
		url.append("?");
		url.append(IServiceHandler.REQUEST_PARAM);
		url.append("=downloadServiceHandler");
		url.append("&filename=").append(FILE_KEY);
		url.append("&extension=").append(extension);

		String encodedURL = RWT.getResponse().encodeURL(url.toString());
		return encodedURL;
	}

	/**
	 * 
	 */
	private void startDownload() {
		boolean k = browser.execute(" window.location = \"" + createDownloadUrl() + "\"");
		if (k) {
			close();
		}
	}

	/** @see #inputStream */
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;

		// stores data in the session.
		RWT.getSessionStore().setAttribute(FILE_KEY, this.inputStream);
	}

}
