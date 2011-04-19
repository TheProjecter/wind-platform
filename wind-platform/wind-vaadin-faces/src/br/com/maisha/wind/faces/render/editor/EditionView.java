package br.com.maisha.wind.faces.render.editor;

import java.util.Collections;
import java.util.Comparator;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.faces.Activator;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.render.IRender;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class EditionView extends Panel implements IRender {

	/** */
	private Label objectNameLabel = new Label("Domain Object Label");

	/** */
	private GridLayout content;

	/** Presentantion Provider */
	private IPresentationProvider presProvider;

	/** Application Controller */
	private IApplicationController appController;

	/**
	 * 
	 */
	public EditionView() {

		setSizeFull();
		VerticalLayout mainVerticalLayout = (VerticalLayout) getContent();
		mainVerticalLayout.setMargin(false);

		CssLayout vl = new CssLayout();
		vl.setStyleName(Reindeer.LAYOUT_BLUE);
		vl.setMargin(false);
		vl.setSizeFull();
		vl.setHeight("45px");
		addComponent(vl);

		CssLayout objectNameLayout = new CssLayout();
		objectNameLayout.setMargin(true);

		objectNameLabel.setStyleName(Reindeer.LABEL_H2);
		objectNameLayout.addComponent(objectNameLabel);

		vl.addComponent(objectNameLayout);

		content = new GridLayout();
		content.setMargin(true);
		addComponent(content);

		this.presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getContext());

		this.appController = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getContext());

		presProvider.registerRender(this);
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#render(br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType,
	 *      br.com.maisha.wind.common.listener.IAppRegistryListener.ChangeType,
	 *      java.lang.Object)
	 */
	public void render(LevelType level, ChangeType ct, Object model) {
		if (LevelType.Object.equals(level) && ChangeType.ObjectOpen.equals(ct)) {
			DomainObject dObj = (DomainObject) model;
			setPartName(dObj);

			content.removeAllComponents();

			createUserInterface(dObj);
		}

	}

	/*
	 * 
	 */
	private void setPartName(DomainObject dObj) {
		objectNameLabel.setValue(dObj.getLabel());
	}

	/**
	 * 
	 * @param dObj
	 */
	private void createUserInterface(DomainObject dObj) {
		// sort by x,y position
		Collections.sort(dObj.getAtts(), new Comparator<Attribute>() {

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

		int maxX = -1;
		int maxY = -1;
		for (Attribute attr : dObj.getAtts()) {
			// max x, max y
			if (attr.getPropertyValue(PropertyInfo.X) > maxX) {
				maxX = attr.getPropertyValue(PropertyInfo.X);
			}
			if (attr.getPropertyValue(PropertyInfo.Y) > maxY) {
				maxY = attr.getPropertyValue(PropertyInfo.Y);
			}
		}

		content.setSpacing(true);
		content.setRows(maxY);
		content.setColumns(maxX);

		for (Attribute attr : dObj.getAtts()) {
			int x = attr.getPropertyValue(PropertyInfo.X) - 1;
			int y = attr.getPropertyValue(PropertyInfo.Y) - 1;
			int colspan = attr.getPropertyValue(PropertyInfo.COL_SPAN);
			int rowspan = attr.getPropertyValue(PropertyInfo.ROW_SPAN);

			content.addComponent(new TextField(attr.getLabel()), x, y);

		}

	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.IRender#getModelLevel()
	 */
	public LevelType[] getModelLevel() {
		return new LevelType[] { LevelType.Object };
	}

}
