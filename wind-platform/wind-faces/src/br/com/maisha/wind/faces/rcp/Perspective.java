package br.com.maisha.wind.faces.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import br.com.maisha.wind.faces.view.EditionView;
import br.com.maisha.wind.faces.view.MessageView;
import br.com.maisha.wind.faces.view.ModuleOverview;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class Perspective implements IPerspectiveFactory {

	/**
	 * 
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);

		// Message
		layout.addView(MessageView.ID, IPageLayout.LEFT, .3f, editorArea);

		// Module
		layout.addView(ModuleOverview.ID, IPageLayout.BOTTOM, .7f,
				MessageView.ID);

		// Edition
		layout.addView(EditionView.ID, IPageLayout.RIGHT, .7f, editorArea);
	}
}
