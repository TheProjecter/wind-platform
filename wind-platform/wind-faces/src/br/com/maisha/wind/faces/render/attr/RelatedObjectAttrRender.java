package br.com.maisha.wind.faces.render.attr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.Property;
import br.com.maisha.terra.lang.Property.PresentationType;
import br.com.maisha.terra.lang.PropertyInfo;
import br.com.maisha.terra.lang.ValidValue;
import br.com.maisha.wind.faces.RelatedObjectChooser;
import br.com.maisha.wind.faces.rcp.Activator;
import br.com.maisha.wind.lifecycle.registry.IApplicationRegistry;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class RelatedObjectAttrRender extends BaseAttrRender {

	/** application registry... */
	private IApplicationRegistry registry;

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#getPresentationType()
	 */
	public PresentationType getPresentationType() {
		return PresentationType.RELATED;
	}

	/**
	 * 
	 * @see br.com.maisha.wind.faces.render.attr.IAttributeRender#render(br.com.maisha.terra.lang.Attribute,
	 *      org.eclipse.swt.widgets.Composite, br.com.maisha.terra.lang.ModelReference)
	 */
	public void render(final Attribute attr, Composite parent, final ModelReference modelInstance) {
		// queries app registry for the related object...
		final DomainObject related = registry.getObject(attr.getDomainObject().getApplication().getAppId(), attr.getType());

		List<Attribute> relatedAttrs = new ArrayList<Attribute>();
		Property presType = attr.getProperty(PropertyInfo.PRESENTATION_TYPE.getPropName());
		for (ValidValue vv : presType.getValidValues()) {
			relatedAttrs.add(related.getAttribute(vv.getValue()));
		}

		createLabel(parent, attr);

		Composite composite = new Composite(parent, SWT.NONE);
		GridData gd = getLayoutData();
		setColspan(gd, attr);
		setRowspan(gd, attr);
		composite.setLayoutData(gd);

		GridLayout layout = new GridLayout(relatedAttrs.size() + 1, false);

		layout.horizontalSpacing = 5;
		composite.setLayout(layout);

		for (Attribute a : relatedAttrs) {
			Text text = new Text(composite, SWT.BORDER | SWT.SINGLE);
			text.setEditable(false);

			// dimensions
			GridData relGd = getLayoutData();
			setWidth(relGd, a);
			relGd.heightHint = 13;
			text.setLayoutData(relGd);
		}

		Button bt = new Button(composite, SWT.NONE);
		bt.setImage(Activator.getImageDescriptor("icons/find.gif").createImage());
		bt.setSize(15, 15);
		bt.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {

				// opens the dialog for choosing...
				RelatedObjectChooser chooser = new RelatedObjectChooser(attr, modelInstance, related, e.widget.getDisplay()
						.getActiveShell());
				chooser.setBlockOnOpen(true);
				int retCode = chooser.open();
				if (Window.OK == retCode) {
					ModelReference relatedRef = chooser.getRelated();
					if (related != null) {
						// text.setText(related.toString());
					}
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		bt.setEnabled(!attr.getPropertyValue(PropertyInfo.DISABLED));
	}

	public IApplicationRegistry getRegistry() {
		return registry;
	}

	public void setRegistry(IApplicationRegistry registry) {
		this.registry = registry;
	}

}
