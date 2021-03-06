package br.com.maisha.wind.faces.render.attr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.springframework.beans.BeanUtils;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.wind.common.exception.ExceptionHandler;
import br.com.maisha.wind.common.factory.ServiceProvider;
import br.com.maisha.wind.common.user.IUserContext;
import br.com.maisha.wind.controller.IApplicationController;
import br.com.maisha.wind.controller.execution.IScriptExecutor;
import br.com.maisha.wind.faces.IPresentationProvider;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class EmbeddedObjectAttrRender extends BaseAttrRender {

	/** Log Reference. */
	private static final Logger log = Logger.getLogger(EmbeddedObjectAttrRender.class);

	/** Current item reference. */
	private ModelReference ref;

	/** Table Viewer for this embeded object. */
	private TableViewer grid;

	/** */
	private Object seletedObject;

	/** */
	private HashSet<Object> set = new HashSet<Object>();

	/** */
	private IObservableSet gridSet = null;

	/** Metamodel registry. */
	private IApplicationRegistry registry;

	/** The name says every thing. */
	private IPresentationProvider presentationProvider;

	/** Controller. */
	private IApplicationController controller;
	
	private IScriptExecutor  se;

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.EMBEDDEDOBJECT;
	}

	public EmbeddedObjectAttrRender() {
		// for some reason, in order to get runScript working, we must get a reference to controller this way. If we wire this using
		// spring-beans.xml it fails to get a instance of juel script engine
		this.controller = ServiceProvider.getInstance().getService(IApplicationController.class,
				Activator.getDefault().getBundle().getBundleContext());
		
		this.se = ServiceProvider.getInstance().getService(IScriptExecutor.class,
				Activator.getDefault().getBundle().getBundleContext());
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite, br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(final Attribute attr, Composite parent, final ModelReference modelInstance) {
		try {
			final IUserContext userContext = (IUserContext) RWT.getSessionStore().getAttribute(IUserContext.USER_CONTEXT);
			final DomainObject related = registry.getObject(attr.getDomainObject().getApplication().getAppId(), attr.getType());

			new Label(parent, SWT.NONE);

			Group group = new Group(parent, SWT.SHADOW_IN);
			group.setText(attr.getLabel());
			group.setLayout(new GridLayout(1, true));

			GridData gd = getLayoutData(GridData.FILL_HORIZONTAL);
			group.setLayoutData(gd);
			setColspan(gd, attr);
			setRowspan(gd, attr);

			Composite fields = new Composite(group, SWT.NONE);
			GridLayout layout = new GridLayout(6, false);
			fields.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			fields.setLayout(layout);

			Composite spacer = new Composite(group, SWT.NONE);
			spacer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			spacer.setLayout(new GridLayout(3, false));

			Label separator = new Label(spacer, SWT.HORIZONTAL | SWT.SEPARATOR);
			GridData sepGd = new GridData(GridData.FILL_HORIZONTAL);
			separator.setLayoutData(sepGd);

			Button addBt = new Button(spacer, SWT.PUSH);
			addBt.setImage(Activator.getImageDescriptor("icons/add.png").createImage());
			addBt.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					try {
						ModelReference input = controller.createNewInstance(userContext, related);
						BeanUtils.copyProperties(ref, input);

						// do the relationship
						String relatedPropertyName = attr.getPropertyValue(PropertyInfo.ONTOMANY);
						Map<String, Object> context = new HashMap<String, Object>();
						context.put("related", input);
						context.put("parent", modelInstance);
						context.put("relatedPropertyName", relatedPropertyName);
						se.runScript("${related.set" + StringUtils.capitalize(relatedPropertyName) + "(parent)}", context);

						gridSet.add(input);
						grid.setInput(gridSet);

						// clear
						ModelReference clearedInstance = controller.createNewInstance(userContext, related);
						BeanUtils.copyProperties(clearedInstance, ref);

					} catch (Exception ex) {
						ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), ex, log);
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});

			Button remBt = new Button(spacer, SWT.PUSH);
			remBt.setImage(Activator.getImageDescriptor("icons/rem.png").createImage());
			remBt.addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					if (seletedObject != null) {
						gridSet.remove(seletedObject);
						grid.setInput(gridSet);
					}
				}

				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});

			Composite gridComposite = new Composite(group, SWT.NONE);
			gridComposite.setLayout(new GridLayout());
			gridComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

			grid = new TableViewer(gridComposite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
			grid.getTable().setHeaderVisible(true);
			grid.getTable().setLinesVisible(true);
			GridData gGridData = new GridData(GridData.FILL_BOTH);
			gGridData.heightHint = 80;
			grid.getTable().setLayoutData(gGridData);

			// render attribute fields
			Map<Integer, String> attNames = new HashMap<Integer, String>();
			ref = controller.createNewInstance(userContext, related);
			int i = 0;
			for (Attribute rAttr : related.getAtts()) {
				String presentationType = rAttr.getPropertyValue(PropertyInfo.PRESENTATION_TYPE);

				IAttributeRender render = presentationProvider.getAttributeRender(presentationType);
				if (render == null) {
					// try to use TEXT as default...
					log.debug("Render for the given representation type [" + presentationType + "] not found... "
							+ "trying to use default...");
					render = presentationProvider.getAttributeRender(Property.PresentationType.TEXT.getValue());

					if (render == null) {
						log.error("None render found... the attribute [" + attr + "]  will not be rendered!");
						return;
					}
				}

				if (rAttr.getPropertyValue(PropertyInfo.VISIBLE_IN_GRID)) {
					render.render(rAttr, fields, ref);

					// create grid columns
					TableViewerColumn col = new TableViewerColumn(grid, SWT.NONE);
					col.getColumn().setText(rAttr.getLabel());
					col.getColumn().setWidth(rAttr.getPropertyValue(PropertyInfo.WIDTH));
					col.getColumn().setResizable(true);
					col.getColumn().setMoveable(false);

					attNames.put(i, rAttr.getRef());
					i++;
				}
			}

			grid.setLabelProvider(new EmbeddedObjectLabelProvider(attNames));

			grid.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection sel = (IStructuredSelection) event.getSelection();
					if (sel != null && sel.size() > 0) {
						seletedObject = sel.getFirstElement();
						BeanUtils.copyProperties(seletedObject, ref);
					}
				}
			});

			DataBindingContext dbctx = configureDataBindings(grid.getTable(), null, attr);

			IObservableSet beanSet = BeansObservables.observeSet(modelInstance, attr.getRef());
			gridSet = new WritableSet(set, Object.class);
			dbctx.bindSet(gridSet, beanSet);

			ObservableSetContentProvider contentProvider = new ObservableSetContentProvider();
			grid.setContentProvider(contentProvider);
			grid.setInput(gridSet);

		} catch (Exception e) {
			ExceptionHandler.getInstance().handle(Activator.getSymbolicName(), e, log);
		}
	}

	/**
	 * 
	 * @author Paulo Freitas (pfreitas1@gmail.com)
	 * 
	 */
	class EmbeddedObjectLabelProvider extends LabelProvider implements ITableLabelProvider {

		/** */
		private Map<Integer, String> attNames;

		/** */
		private IApplicationController appCtrl;

		/**
		 * 
		 * @param attNames
		 */
		public EmbeddedObjectLabelProvider(Map<Integer, String> attNames) {
			this.attNames = attNames;
			this.appCtrl = ServiceProvider.getInstance().getService(IApplicationController.class,
					Activator.getDefault().getBundle().getBundleContext());
		}

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		/**
		 * 
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			return se.getObjectValue(element, attNames.get(columnIndex)) + "";
		}

	}

	/** @see EmbeddedObjectAttrRender#registry */
	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}

	/** @see EmbeddedObjectAttrRender#presentationProvider */
	public void setPresentationProvider(IPresentationProvider presentationProvider) {
		this.presentationProvider = presentationProvider;
	}

}
