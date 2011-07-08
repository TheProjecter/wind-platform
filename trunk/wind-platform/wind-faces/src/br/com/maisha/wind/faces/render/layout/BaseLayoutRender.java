package br.com.maisha.wind.faces.render.layout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.faces.render.attr.IAttributeRender;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class BaseLayoutRender implements ILayoutRender {

	/** LOG ref. */
	private static final Logger log = Logger.getLogger(BaseLayoutRender.class);

	/** */
	protected IPresentationProvider presProvider = null;

	/** */
	protected Composite contents = null;

	/**
	 * 
	 */
	public BaseLayoutRender() {
		presProvider = ServiceProvider.getInstance().getService(IPresentationProvider.class,
				Activator.getDefault().getBundle().getBundleContext());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.faces.render.layout.ILayoutRender#render(br.com.maisha.terra.lang.DomainObject,
	 * org.eclipse.swt.widgets.Composite, br.com.maisha.terra.lang.ModelReference)
	 */
	public Composite render(DomainObject dObj, Composite parent, ModelReference modelInstance) {
		if (contents != null && !contents.isDisposed()) {
			contents.dispose();
			contents = null;
		}

		contents = new Composite(parent, SWT.NONE);
		contents.setLayout(new GridLayout(1, false));
		contents.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

		List<Attribute> atts = new ArrayList<Attribute>();
		for (Attribute a : dObj.getAtts()) {
			if (StringUtils.isBlank(a.getPropertyValue(PropertyInfo.FOLDER)) && StringUtils.isBlank(a.getPropertyValue(PropertyInfo.GROUP))) {
				atts.add(a);
			}
		}

		return layout(atts, contents, modelInstance);
	}

	protected Composite layout(List<Attribute> atts, Composite parent, ModelReference modelInstance) {
		// sort by x,y position
		Collections.sort(atts, new Comparator<Attribute>() {

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
		for (Attribute attr : atts) {

			int x = attr.getPropertyValue(PropertyInfo.X);
			int y = attr.getPropertyValue(PropertyInfo.Y);
			int colspan = attr.getPropertyValue(PropertyInfo.COL_SPAN);
			int rowspan = attr.getPropertyValue(PropertyInfo.ROW_SPAN);

			while (colspan > 1) {
				layout.put(new Point((x + colspan) - 1, y), createInvisibleAttr());
				colspan--;
			}

			while (rowspan > 1) {
				layout.put(new Point(x, (y + rowspan) - 1), createInvisibleAttr());
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

		GridLayout gl = (GridLayout) parent.getLayout();
		gl.numColumns = maxX * 2;

		for (int i = 1; i <= maxY; i++) {
			for (int j = 1; j <= maxX; j++) {
				Attribute attr = layout.get(new Point(j, i));
				if (attr == null) {
					// render empty cell
					createEmptyCell(parent);
				} else {
					// render attr
					if (attr.getRef() != null) {
						createAttributeUI(attr, parent, modelInstance);
					}
				}
			}
		}

		parent.layout();
		return parent;

	}

	/**
	 * Creates an empty cell to fill layout holes.
	 */
	private void createEmptyCell(Composite parent) {
		Label empty = new Label(parent, SWT.NONE);
		empty.setText(" ");

		Label emptyCmpnt = new Label(parent, SWT.NONE);
		emptyCmpnt.setText(" ");
	}

	/**
	 * Creates an invisible attribute to hold a colspan or rowspan place.
	 * 
	 * @return Invisible Attribute.
	 */
	private Attribute createInvisibleAttr() {
		Attribute invisible = new Attribute(null, null, "Invisible");
		invisible.setProperties(new HashMap<String, Property>());
		Property visibility = new Property(PropertyInfo.VISIBLE_IN_EDITION.getPropName(), false);
		invisible.getProperties().put(visibility.getPropName(), visibility);
		return invisible;
	}

	/**
	 * Creates the visual representation for the given attribute.
	 * 
	 * @param attr
	 *            Attribute to render.
	 */
	private void createAttributeUI(Attribute attr, Composite parent, ModelReference modelInstance) {
		String presentationType = attr.getPropertyValue(PropertyInfo.PRESENTATION_TYPE);

		IAttributeRender attrRender = presProvider.getAttributeRender(presentationType);
		if (attrRender == null) {
			// try to use TEXT as default...
			log.debug("Render for the given representation type [" + presentationType + "] not found... " + "trying to use default...");
			attrRender = presProvider.getAttributeRender(Property.PresentationType.TEXT.getValue());

			if (attrRender == null) {
				log.error("None render found... the attribute [" + attr + "]  will not be rendered!");
				return;
			}
		}

		attrRender.render(attr, parent, modelInstance);

	}
}
