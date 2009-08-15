package br.com.maisha.wind.faces.view;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.render.IRender;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class EditionView extends ViewPart implements IRender {

	/** View's ID. */
	public static final String ID = "wind_faces.edition_view";

	/** Log ref. */
	private static final Logger log = Logger.getLogger(EditionView.class);

	/** Painel que contem os elementos graficos da area de edicao. */
	private Composite contents;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {

		// main panel
		final Composite editionPanel = new Composite(parent, SWT.NONE);
		editionPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		

		/*
		 * TODO if (getViewSite() != null) { this.titleArea = new
		 * TitleArea(editionPanel, getMessageAreaProvider()); }
		 */

		// object contents panel
		this.contents = new Composite(editionPanel, SWT.NONE);
		this.contents.setLayout(new FillLayout(SWT.HORIZONTAL));

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
		log.debug("Opening [" + model + "] in the EditionView... ");

		DomainObject object = (DomainObject) model;
		setPartName(object.getLabel());

		createUserInterface(object);
	}

	/**
	 * 
	 */
	private void createUserInterface(DomainObject model) {

	}

}
