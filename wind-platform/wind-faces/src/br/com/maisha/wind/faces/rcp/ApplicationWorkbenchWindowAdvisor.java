package br.com.maisha.wind.faces.rcp;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import br.com.maisha.wind.faces.view.GridView;
import br.com.maisha.wind.faces.view.LogView;
import br.com.maisha.wind.faces.view.MessageView;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	private WindFacesActionBarAdvisor actionBarAdvisor;

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		actionBarAdvisor = new WindFacesActionBarAdvisor(configurer);
		return actionBarAdvisor;
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowCoolBar(false);
		configurer.setTitle("Wind");
		configurer.setShellStyle(SWT.NO_TRIM);
		configurer.setShowStatusLine(true);
		configurer.setShowProgressIndicator(true);

	}

	public WindFacesActionBarAdvisor getActionBarAdvisor() {
		return actionBarAdvisor;
	}

	@Override
	public void postWindowCreate() {
		super.postWindowCreate();

		// Shell shell = getWindowConfigurer().getWindow().getShell();
		// shell.setMaximized( true );

		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		Display display = configurer.getWindow().getWorkbench().getDisplay();
		Shell shell = configurer.getWindow().getShell();
		System.out.println("Rectangle: " + display.getBounds());

		// Get the resolution
		Rectangle pDisplayBounds = display.getBounds();

		int nMinWidth = pDisplayBounds.width - 20;
		int nMinHeight = pDisplayBounds.height - 20;

		// This formulae calculate the shell's Left ant Top
		int nLeft = (pDisplayBounds.width - nMinWidth) / 2;
		int nTop = (pDisplayBounds.height - nMinHeight) / 2;

		// Set shell bounds,
		shell.setBounds(nLeft, nTop, nMinWidth, nMinHeight);

		try {
			// Progress View
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView("org.eclipse.ui.views.ProgressView", null, IWorkbenchPage.VIEW_ACTIVATE);

			// Log View
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(LogView.ID, null, IWorkbenchPage.VIEW_ACTIVATE);

			// Message View
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView(MessageView.ID, null, IWorkbenchPage.VIEW_ACTIVATE);

			// Grid View
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(GridView.ID, null, IWorkbenchPage.VIEW_ACTIVATE);

		} catch (Exception e) {
			// silently ignore
		}
	}
}
