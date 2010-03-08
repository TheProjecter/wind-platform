package br.com.maisha.wind.faces.databinding;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.rwt.graphics.Graphics;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RequiredObservableValue extends AbstractObservableValue {

	/** Binded label. */
	private Label label;

	/** Current (old sometimes) value. */
	private Object oldValue;

	/**
	 * Constructor configures the label to watch...
	 * 
	 * @param lb
	 */
	public RequiredObservableValue(Label lb) {
		this.label = lb;
		this.label.addListener(SWT.Activate, new Listener() {

			@Override
			public void handleEvent(Event event) {
				Object newValue = label.getData();

				if (!newValue.equals(oldValue)) {
					fireValueChange(Diffs.createValueDiff(oldValue, newValue));
					oldValue = newValue;

				}

			}
		});
	}

	/**
	 * 
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doSetValue(java.lang.Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		if (!label.isDisposed()) {
			if (Boolean.valueOf(value.toString())) {
				FontData fd = label.getFont().getFontData()[0];
				Font f = Graphics.getFont(fd.getName(), fd.getHeight(), fd.getStyle() | SWT.BOLD);
				label.setFont(f);
			}else{
				FontData fd = label.getFont().getFontData()[0];
				Font f = Graphics.getFont(fd.getName(), fd.getHeight(), SWT.NONE);
				label.setFont(f);
			}
			label.setData(value);
		}
	}

	/**
	 * 
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		if (!label.isDisposed()) {
			return label.getData();
		}
		return null;
	}

	/**
	 * 
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue#getValueType()
	 */
	@Override
	public Object getValueType() {
		return Object.class;
	}

}
