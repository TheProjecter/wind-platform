/**
 * 
 */
package br.com.maisha.wind.faces.view;

import java.util.Map;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GridViewPatternFilter extends ViewerFilter {

	private String pattern = ".*";

	/** @see GridViewPatternFilter#pattern */
	public void setPattern(String pattern) {
		this.pattern = ".*" + pattern + ".*";
		;
	}

	/**
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
	 *      java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		boolean matches = false;

		Map<String, Object> entry = (Map<String, Object>) element;
		for (Map.Entry<String, Object> e : entry.entrySet()) {
			if (e.getValue() != null && !"REF".equals(e.getKey())) {
				if (e.getValue().toString().matches(pattern)) {
					matches = true;
					break;
				}
			}
		}

		return matches;
	}

}
