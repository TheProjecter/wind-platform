package br.com.maisha.wind.faces.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import br.com.maisha.wind.faces.view.ModuleOverview;
import br.com.maisha.wind.faces.view.View;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);

		layout.addStandaloneView(View.ID, false, IPageLayout.LEFT, .5f,
				editorArea);

		layout.addView(ModuleOverview.ID, IPageLayout.RIGHT, .5f, editorArea);
	}
}
