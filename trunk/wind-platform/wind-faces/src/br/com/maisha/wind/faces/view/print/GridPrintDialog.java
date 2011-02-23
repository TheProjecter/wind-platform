package br.com.maisha.wind.faces.view.print;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.controller.message.PlatformMessageRegistry;
import br.com.maisha.wind.faces.rcp.Activator;

/**
 * A Dialog that provides content for printing.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridPrintDialog extends TitleAreaDialog {

	/** Save button id. */
	private static final int SAVE_ID = IDialogConstants.CLIENT_ID + 1;

	/** Content for printing (accepts html). */
	private String data;

	/** Domain Object */
	private DomainObject meta;

	/** */
	private Browser b = null;

	/**
	 * 
	 * @param parentShell
	 */
	public GridPrintDialog(Shell parentShell, DomainObject meta, String data) {
		super(parentShell);
		this.data = data;
		this.meta = meta;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout());
		GridData contentsGd = new GridData(GridData.FILL_BOTH);
		contentsGd.heightHint = 360;
		contentsGd.widthHint = 700;
		contents.setLayoutData(contentsGd);

		b = new Browser(contents, SWT.BORDER);
		b.setLayoutData(contentsGd);
		b.setText(data);

		setTitle(PlatformMessageRegistry.getInstance().getMessage("wind_faces.printDialog.title",
				new Object[] { meta.getLabel() }));
		setMessage(PlatformMessageRegistry.getInstance().getMessage("wind_faces.printDialog.description"));
		setTitleImage(Activator.getImageDescriptor("icons/related_wiz.png").createImage());
		setDialogHelpAvailable(true);
		return contents;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		String printLabel = PlatformMessageRegistry.getInstance().getMessage("wind_faces.printDialog.print");
		String saveLabel = PlatformMessageRegistry.getInstance().getMessage("wind_faces.printDialog.save");
		String cancelLabel = PlatformMessageRegistry.getInstance().getMessage("wind_faces.printDialog.cancel");

		createButton(parent, IDialogConstants.OK_ID, printLabel, true);
		createButton(parent, SAVE_ID, saveLabel, false);
		createButton(parent, IDialogConstants.CANCEL_ID, cancelLabel, false);
	}

	/** @see #data */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed() {
		if (b.execute("window.print()")) {
			super.okPressed();
		}
	}

}
