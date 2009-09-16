package br.com.maisha.wind.faces.view;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.Operation;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.listener.IAppRegistryListener.LevelType;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.action.BaseAction;
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

		// set up layout...
		Map<Point, Attribute> layout = new HashMap<Point, Attribute>();
		int maxX = -1;
		int maxY = -1;
		for (Attribute attr : model.getAtts()) {

			int x = attr.getPropertyValue(PropertyInfo.X);
			int y = attr.getPropertyValue(PropertyInfo.Y);
			int colspan = attr.getPropertyValue(PropertyInfo.COL_SPAN);
			int rowspan = attr.getPropertyValue(PropertyInfo.ROW_SPAN);

			while (colspan > 1) {
				layout.put(new Point((x + colspan) - 1, y),
						createInvisibleAttr());
				colspan--;
			}

			while (rowspan > 1) {
				layout.put(new Point(x, (y + rowspan) - 1),
						createInvisibleAttr());
				rowspan--;
			}

			layout.put(new Point(x, y), attr);

			// max x, max y
			if (attr.getPropertyValue(PropertyInfo.X) > maxX) {
				maxX = attr.getPropertyValue(PropertyInfo.X);
			}
			if (attr.getPropertyValue(PropertyInfo.Y) > maxY) {
				maxY = attr.getPropertyValue(PropertyInfo.Y);
			}
		}

		GridLayout gl = (GridLayout) contents.getLayout();
		gl.numColumns = maxX * 2;

		for (int i = 1; i <= maxY; i++) {
			for (int j = 1; j <= maxX; j++) {
				Attribute attr = layout.get(new Point(j, i));
				if (attr == null) {
					// render empty cell
					createEmptyCell();
				} else {
					// render attr
					if (attr.getPropertyValue(PropertyInfo.VISIBLE)) {
						createAttributeUI(attr);
					}
				}
			}
		}

		// render operations
		final IToolBarManager tbm = getViewSite().getActionBars()
				.getToolBarManager();
		for (Operation op : model.getOperations()) {
			if (op.getPropertyValue(PropertyInfo.VISIBLE)) {
				createOperationUI(op, tbm);
			}
		}
		getViewSite().getActionBars().updateActionBars();
	}

	/**
	 * Creates the visual representation for the given attribute.
	 * 
	 * @param attr
	 *            Attribute to render.
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

	/**
	 * Creates an empty cell to fill layout holes.
	 */
	private void createEmptyCell() {
		Label empty = new Label(this.contents, SWT.NONE);
		empty.setText(" ");

		Label emptyCmpnt = new Label(this.contents, SWT.NONE);
		emptyCmpnt.setText(" ");
	}

	/**
	 * Creates an invisible attribute to hold a colspan or rowspan place.
	 * 
	 * @return Invisible Attribute.
	 */
	private Attribute createInvisibleAttr() {
		Attribute invisible = new Attribute("", "", "Invisible");
		invisible.setProperties(new HashMap<String, Property>());
		Property visibility = new Property(PropertyInfo.VISIBLE.getPropName(),
				false);
		invisible.getProperties().put(visibility.getPropName(), visibility);
		return invisible;
	}

	/**
	 * Creates the visual representation for the given operation.
	 * 
	 * @param op
	 *            Operation to render.
	 */
	private void createOperationUI(Operation op, IToolBarManager tbm) {
		log.debug("Rendering Operation [ " + op + " ]");
		IAction act = new BaseAction(op);
		tbm.add(act);
	}

}
