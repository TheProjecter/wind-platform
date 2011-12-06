package com.maisha.wind.faces.rap.internal.mask.maskedtextkit;

import java.io.IOException;

import org.eclipse.rwt.lifecycle.AbstractWidgetLCA;
import org.eclipse.rwt.lifecycle.ControlLCAUtil;
import org.eclipse.rwt.lifecycle.IWidgetAdapter;
import org.eclipse.rwt.lifecycle.JSWriter;
import org.eclipse.rwt.lifecycle.WidgetLCAUtil;
import org.eclipse.rwt.lifecycle.WidgetUtil;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;

import com.maisha.wind.faces.rap.mask.MaskedText;

public final class MaskedTextLCA extends AbstractWidgetLCA {

	private static final String PARAM_CENTER = "centerLocation";
	private static final String JS_PROP_MASK = "mask";
	private static final String PROP_MASK = "mask";
	private static final String JS_PROP_TYPE = "type";
	private static final String PROP_TYPE = "type";

	public void preserveValues(final Widget widget) {
		ControlLCAUtil.preserveValues((Control) widget);
		IWidgetAdapter adapter = WidgetUtil.getAdapter(widget);
		adapter.preserve(PROP_MASK, ((MaskedText) widget).getMask());
		adapter.preserve(PROP_TYPE, ((MaskedText) widget).getType());
		// only needed for custom variants (theming)
		WidgetLCAUtil.preserveCustomVariant(widget);
	}

	/*
	 * Read the parameters transfered from the client
	 */
	public void readData(final Widget widget) {
		// MaskedText map = ( MaskedText )widget;
		// String location = WidgetLCAUtil.readPropertyValue( map, PARAM_CENTER
		// );
		// map.setCenterLocation( location );
	}

	/*
	 * Initial creation procedure of the widget
	 */
	public void renderInitialization(final Widget widget) throws IOException {
		JSWriter writer = JSWriter.getWriterFor(widget);
		String id = WidgetUtil.getId(widget);
		writer.newWidget("com.maisha.wind.faces.rap.mask.MaskedText", new Object[] { id });
		writer.set("appearance", "composite");
		writer.set("overflow", "hidden");
		ControlLCAUtil.writeStyleFlags((MaskedText) widget);
	}

	public void renderChanges(final Widget widget) throws IOException {
		MaskedText gmap = (MaskedText) widget;
		ControlLCAUtil.writeChanges(gmap);
		JSWriter writer = JSWriter.getWriterFor(widget);
		writer.set(PROP_MASK, JS_PROP_MASK, gmap.getMask());
		writer.set(PROP_TYPE, JS_PROP_TYPE, gmap.getType());

		// only needed for custom variants (theming)
		WidgetLCAUtil.writeCustomVariant(widget);
	}

	public void renderDispose(final Widget widget) throws IOException {
		JSWriter writer = JSWriter.getWriterFor(widget);
		writer.dispose();
	}
}
