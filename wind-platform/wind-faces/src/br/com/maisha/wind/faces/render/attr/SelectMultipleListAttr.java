/*******************************************************************************
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Wind Technologies - initial API and implementation
 ******************************************************************************/
package br.com.maisha.wind.faces.render.attr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.IProperty;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.NativePropertyListener;
import org.eclipse.jface.databinding.swt.WidgetListProperty;
import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.faces.api.data.IDataProvider;

/**
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class SelectMultipleListAttr extends BaseAttrRender {

	/** Log ref. */
	private static final Logger log = Logger.getLogger(SelectMultipleListAttr.class);

	/**
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.LIST;
	}

	/**
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite,
	 *      br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(Attribute attr, Composite parent, ModelReference modelInstance) {
		log.debug("Starting render for attr [" + attr + "] ");

		new Label(parent, SWT.NONE); // empty label

		Composite container = new Composite(parent, SWT.NONE);
		RowLayoutFactory.fillDefaults().fill(true).type(SWT.VERTICAL).applyTo(container);

		List<Button> checkboxes = new ArrayList<Button>();
		String dataProviderClass = attr.getPropertyValue(PropertyInfo.CONTENT);
		if (StringUtils.isNotBlank(dataProviderClass)) {
			IDataProvider dataProvider = (IDataProvider) attr.getDomainObject().getApplication().getAppCtx()
					.getBean(attr.getRef() + "_DataProvider");

			final DataBindingContext dbctx = new DataBindingContext();

			Map<Serializable, Object> data = dataProvider.getData(attr, modelInstance);
			for (Map.Entry<Serializable, Object> e : data.entrySet()) {

				Button checkbox = new Button(container, SWT.CHECK);
				checkbox.setData(e.getKey());
				checkbox.setText(String.valueOf(e.getValue()));
				RowDataFactory.swtDefaults().applyTo(checkbox);
				checkboxes.add(checkbox);

			}
			
			container.setData(checkboxes);
			
			// configure value binding
			IObservableList observable = BeansObservables.observeList(modelInstance, attr.getRef());
			dbctx.bindList(new MultipleListWidgetProperty().observe(container), observable);
		}
	}

	class MultipleListWidgetProperty extends WidgetListProperty {

		
		/**
		 * @see org.eclipse.core.databinding.property.list.IListProperty#getElementType()
		 */
		public Object getElementType() {
			return Long.class;
		}

		/**
		 * @see org.eclipse.core.databinding.property.list.SimpleListProperty#doGetList(java.lang.Object)
		 */
		@Override
		protected List<?> doGetList(Object source) {
			List<Long> items = new ArrayList<Long>();
			if(source instanceof Composite){
				List<Button> checkboxes = (List<Button>) ((Composite)source).getData();
				for(Button c : checkboxes){
					if(c.getSelection()){
						items.add((Long) c.getData());
					}
				}
			} 
//			updateList(source, null;)
			return items;
		}

		/**
		 * @see org.eclipse.core.databinding.property.list.SimpleListProperty#doSetList(java.lang.Object,
		 *      java.util.List,
		 *      org.eclipse.core.databinding.observable.list.ListDiff)
		 */
		@Override
		protected void doSetList(Object source, List list, ListDiff diff) {
			// TODO Auto-generated method stub
			System.out.println(source);
		}

		/**
		 * @see org.eclipse.core.databinding.property.list.SimpleListProperty#adaptListener(org.eclipse.core.databinding.property.ISimplePropertyListener)
		 */
		@Override
		public INativePropertyListener adaptListener(ISimplePropertyListener listener) {
			return new MyNativeListener(this, listener);
		}

	}
	
	class MyNativeListener extends NativePropertyListener implements SelectionListener
	{

		/**
		 * @param property
		 * @param listener
		 */
		public MyNativeListener(IProperty property, ISimplePropertyListener listener) {
			super(property, listener);
		}

		/**
		 * @see org.eclipse.core.databinding.property.NativePropertyListener#doAddTo(java.lang.Object)
		 */
		@Override
		protected void doAddTo(Object source) {
			if(source instanceof Composite){
				List<Button> checkboxes = (List<Button>) ((Composite)source).getData();
				for(Button c : checkboxes){
					c.addSelectionListener(this);
				}
			}
			System.out.println(source);
		}

		/**
		 * @see org.eclipse.core.databinding.property.NativePropertyListener#doRemoveFrom(java.lang.Object)
		 */
		@Override
		protected void doRemoveFrom(Object source) {
			if(source instanceof Composite){
				List<Button> checkboxes = (List<Button>) ((Composite)source).getData();
				for(Button c : checkboxes){
					c.removeSelectionListener(this);
				}
			}
			System.out.println(source);
		}
		
	 	/**
	 	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 	 */
	 	@Override
	 	public void widgetSelected(SelectionEvent e) {
	 		System.out.println(e);
	 	}
	 	
	 	/**
	 	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 	 */
	 	@Override
	 	public void widgetDefaultSelected(SelectionEvent e) {
	 		widgetSelected(e);
	 	}
	}
}
