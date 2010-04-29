package br.com.maisha.wind.faces.view;

import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.IRender;

public class GridView extends ViewPart implements IRender {

	/** View's ID. */
	public static final String ID = "br.com.maisha.wind.faces.view.gridView";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(GridView.class);

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType getModelLevel() {
		return LevelType.Object;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(java.lang.Object)
	 */
	public void render(Object model) {
		log.debug("Updating grid view... ");
	}
}
