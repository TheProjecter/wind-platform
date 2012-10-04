package br.com.maisha.wind.faces.view.listener;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.wind.faces.view.GridViewPatternFilter;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class SearchBoxListener implements TraverseListener {

	/** */
	private TableViewer viewer;

	/** */
	private GridViewPatternFilter filter;

	/**
	 * @param viewer
	 */
	public SearchBoxListener(TableViewer viewer, GridViewPatternFilter filter) {
		this.viewer = viewer;
		this.filter = filter;
	}

	/**
	 * @see org.eclipse.swt.events.TraverseListener#keyTraversed(org.eclipse.swt.events.TraverseEvent)
	 */
	public void keyTraversed(TraverseEvent e) {
		Text t = (Text) e.widget;
		String searchText = t.getText();

		if (SWT.TRAVERSE_RETURN == e.detail) {
			filter.setPattern(searchText);
			viewer.refresh();
		}
	}

}
