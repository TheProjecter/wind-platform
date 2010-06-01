package br.com.maisha.wind.faces.rcp;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import br.com.maisha.wind.faces.view.EditionView;
import br.com.maisha.wind.faces.view.GridView;
import br.com.maisha.wind.faces.view.LogView;
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

		// Module
		layout.addView(ModuleOverview.ID, IPageLayout.LEFT, .3f,
				editorArea);

		// Edition
		layout.addView(EditionView.ID, IPageLayout.TOP, .7f, editorArea);

		// Bottom Folder (Grid, Messages)
		IFolderLayout bottomFolder = layout.createFolder("bottomFolder",
				IPageLayout.BOTTOM, .6f, editorArea);
		bottomFolder.addView(GridView.ID);
		bottomFolder.addView(MessageView.ID);
		bottomFolder.addView(LogView.ID);
		bottomFolder.addView("org.eclipse.ui.views.ProgressView");
		
	}
}
