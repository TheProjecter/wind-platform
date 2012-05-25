package com.maisha.wind.editor.editors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Color Manager cria objetos Color a partir de um RGB.
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class ColorManager {

	/** Color Table. */
	protected Map<RGB, Color> fColorTable = new HashMap<RGB, Color>(10);

	/** Dispose Colors. */
	public void dispose() {
		Iterator<Color> e = fColorTable.values().iterator();
		while (e.hasNext())
			e.next().dispose();
	}

	/**
	 * Obtem Color dado RGB
	 * 
	 * @param rgb
	 *            RGB
	 * @return Color.
	 */
	public Color getColor(RGB rgb) {
		Color color = (Color) fColorTable.get(rgb);
		if (color == null) {
			color = new Color(Display.getCurrent(), rgb);
			fColorTable.put(rgb, color);
		}
		return color;
	}
}
