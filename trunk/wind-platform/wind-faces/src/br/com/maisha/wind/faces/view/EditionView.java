package br.com.maisha.wind.faces.view;

import java.util.Collections;
import java.util.Comparator;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.IRender;
import br.com.maisha.wind.faces.render.attr.IAttributeRender;

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

	private IPresentationProvider presProvider;

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(final Composite parent) {
		// main panel
		final Composite editionPanel = new Composite(parent, SWT.NONE);
		editionPanel.setLayout(new FillLayout(SWT.HORIZONTAL));

		/*
		 * TODO if (getViewSite() != null) { this.titleArea = new
		 * TitleArea(editionPanel, getMessageAreaProvider()); }
		 */

		// object contents panel
		this.contents = new Composite(editionPanel, SWT.NONE);
		this.contents.setLayout(new GridLayout(2, false));

		this.presProvider = ServiceProvider.getInstance().getService(
				IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());

		presProvider.registerRender(this);
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

		// sort by x,y position
		Collections.sort(model.getAtts(), new Comparator<Attribute>() {

			public int compare(Attribute one, Attribute other) {
				Integer xOne = one.getPropertyValue(PropertyInfo.X);
				Integer xOther = other.getPropertyValue(PropertyInfo.X);

				Integer yOne = one.getPropertyValue(PropertyInfo.Y);
				Integer yOther = other.getPropertyValue(PropertyInfo.Y);

				if (yOne.compareTo(yOther) == 0) {
					return xOne.compareTo(xOther);
				}
				return yOne.compareTo(yOther);

			}
		});

		// render
		for (Attribute attr : model.getAtts()) {
			if (attr.getPropertyValue(PropertyInfo.VISIBLE)) {
				createAttributeUI(attr);
			}
		}
	}

	/**
	 * 
	 * @param attr
	 */
	private void createAttributeUI(Attribute attr) {
		String presentationType = attr
				.getPropertyValue(PropertyInfo.PRESENTATION_TYPE);

		IAttributeRender attrRender = presProvider
				.getAttributeRender(presentationType);
		if (attrRender == null) {
			// try to use TEXT as default...
			log.debug("Render for the given representation type ["
					+ presentationType + "] not found... "
					+ "trying to use default...");
			attrRender = presProvider
					.getAttributeRender(Property.PresentationType.TEXT
							.getValue());

			if (attrRender == null) {
				log.error("None render found... the attribute [" + attr
						+ "]  will not be rendered!");
				return;
			}
		}

		attrRender.render(attr, this.contents);
	}

}
