package br.com.maisha.wind.faces.view.print;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import br.com.maisha.wind.faces.rcp.Activator;

/**
 * A Dialog that provides content for printing.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridPrintDialog extends TitleAreaDialog {

	/** Content for printing (accepts html). */
	private String data;
	
	private Browser b = null;

	/**
	 * 
	 * @param parentShell
	 */
	public GridPrintDialog(Shell parentShell, String data) {
		super(parentShell);
		this.data = data;
	}

	/**
	 * 
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout());
		GridData contentsGd = new GridData(GridData.FILL_BOTH);
		contentsGd.heightHint = 380;
		contents.setLayoutData(contentsGd);

		b = new Browser(contents, SWT.BORDER);
		b.setLayoutData(contentsGd);
		b.setText(data);
		
		
		setTitle("Print Grid"); // TODO NLS
		setMessage("Prints the content...");
		setTitleImage(Activator.getImageDescriptor("icons/related_wiz.png").createImage());
		setDialogHelpAvailable(true);
		return contents;
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
		if(b.execute("window.print()")){
			super.okPressed();
		}
	}

}
