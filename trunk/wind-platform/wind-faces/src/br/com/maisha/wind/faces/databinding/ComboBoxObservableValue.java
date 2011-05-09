package br.com.maisha.wind.faces.databinding;

import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.ValidValue;

public class ComboBoxObservableValue extends AbstractObservableValue {

	private Combo combo;

	private Attribute attr;

	protected Object oldValue;

	/**
	 * 
	 * @param combo
	 */
	public ComboBoxObservableValue(Attribute attr, Combo combo) {
		this.combo = combo;
		this.attr = attr;
		this.combo.addSelectionListener(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue#getValueType ()
	 */
	public Object getValueType() {
		return ValidValue.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue #doGetValue()
	 */
	protected Object doGetValue() {
		int selIdx = combo.getSelectionIndex();
		ValidValue vv = null;
		Property validValuesProp = attr.getProperty(PropertyInfo.VALID_VALUES.getPropName());
		if (validValuesProp != null) {
			List<ValidValue> vList = validValuesProp.getValidValues();
			if (vList != null && selIdx < vList.size()) {
				vv = vList.get(selIdx);
			}
		}

		return vv != null ? vv.getValue() : null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.databinding.observable.value.AbstractObservableValue #doSetValue(java.lang.Object)
	 */
	protected void doSetValue(Object value) {

		Property validValuesProp = attr.getProperty(PropertyInfo.VALID_VALUES.getPropName());
		if (validValuesProp != null) {
			List<ValidValue> vList = validValuesProp.getValidValues();
			int i = 0;
			for (ValidValue v : vList) {
				if (v.getValue().equals(value)) {
					combo.select(i);
					break;
				}
				i++;
			}
		}
	}

	/**
	 * 
	 */
	SelectionListener listener = new SelectionListener() {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse .swt.events.SelectionEvent)
		 */
		public void widgetSelected(SelectionEvent e) {
			System.out.println("Catched by ComboxBox Obvervable Value");

			Object newValue = doGetValue();
			fireValueChange(Diffs.createValueDiff(ComboBoxObservableValue.this.oldValue, newValue));

		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org .eclipse.swt.events.SelectionEvent)
		 */
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};

}
