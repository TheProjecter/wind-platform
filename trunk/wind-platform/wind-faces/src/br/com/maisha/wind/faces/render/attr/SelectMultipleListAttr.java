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

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateSetStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.jface.databinding.viewers.IViewerObservableSet;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.faces.api.data.IDataProvider;
import br.com.maisha.wind.faces.api.data.Item;

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

		String dataProviderClass = attr.getPropertyValue(PropertyInfo.CONTENT);
		if (StringUtils.isNotBlank(dataProviderClass)) {
			IDataProvider dataProvider = (IDataProvider) attr.getDomainObject().getApplication().getAppCtx()
					.getBean(attr.getRef() + "_DataProvider");
			List<Item> data = dataProvider.getData(attr, modelInstance);

			// configures CheckboxTree
			CheckboxTableViewer checkboxTree = CheckboxTableViewer.newCheckList(container, SWT.NONE);
			RowDataFactory.swtDefaults().applyTo(checkboxTree.getTable());

			// data binding
			DataBindingContext dbctx = new DataBindingContext();
			ViewerSupport.bind(checkboxTree, new WritableList(data, Item.class),
					BeanProperties.value(Item.class, "value"));

			IViewerObservableSet target = ViewerProperties.checkedElements(Item.class).observe(checkboxTree);
			IObservableSet model = BeansObservables.observeSet(modelInstance, attr.getRef());

			UpdateSetStrategy targetToModel = new UpdateSetStrategy();
			targetToModel.setConverter(new ItemToLongConverter());

			UpdateSetStrategy modelToTarget = new UpdateSetStrategy();
			modelToTarget.setConverter(new LongToItemConverter());

			dbctx.bindSet(target, model, targetToModel, modelToTarget);

		}
	}

	/**
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	private final class ItemToLongConverter implements IConverter {
		public Object getToType() {
			return Long.class;
		}

		public Object getFromType() {
			return Item.class;
		}

		public Object convert(Object fromObject) {
			return ((Item) fromObject).getId();
		}
	}

	/**
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	private final class LongToItemConverter implements IConverter {
		public Object getToType() {
			return Item.class;
		}

		public Object getFromType() {
			return Object.class;
		}

		public Object convert(Object fromObject) {
			Item item = null;
			if (fromObject instanceof Long) {
				item = new Item((Long) fromObject, "");
			}
			return item;
		}
	}

}
