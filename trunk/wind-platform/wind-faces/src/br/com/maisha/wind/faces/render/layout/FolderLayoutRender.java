package br.com.maisha.wind.faces.render.layout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.Container;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class FolderLayoutRender extends BaseLayoutRender {

	/** */
	private TabFolder tab = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maisha.wind.faces.render.layout.BaseLayoutRender#render(br.com.maisha.terra.lang.DomainObject,
	 * org.eclipse.swt.widgets.Composite, br.com.maisha.terra.lang.ModelReference)
	 */
	public Composite render(DomainObject dObj, Composite parent, ModelReference modelInstance) {

		if (tab != null && !tab.isDisposed()) {
			tab.dispose();
			tab = null;
		}

		List<Container> containers = new ArrayList<Container>();
		containers.addAll(dObj.getContainers().values());

		Collections.sort(containers, new Comparator<Container>() {
			public int compare(Container o1, Container o2) {
				return o1.getPropertyValue(PropertyInfo.SEQUENCE).compareTo(o2.getPropertyValue(PropertyInfo.SEQUENCE));
			}
		});

		for (Container c : containers) {
			if (Container.PresentationType.FOLDER.equals(c.getType())) {
				if (tab == null) {
					tab = new TabFolder(parent, SWT.NONE);
					tab.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				}

				TabItem tItem = new TabItem(tab, SWT.NONE);
				tItem.setText(c.getLabel());
				tItem.setText(c.getLabel());

				Composite cmpst = new Composite(tab, SWT.NONE);
				cmpst.setLayout(new GridLayout(1, false));
				cmpst.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

				List<Attribute> atts = new ArrayList<Attribute>();
				for (String attRef : c.getAttributes()) {
					atts.add(dObj.getAttribute(attRef));
				}

				tItem.setControl(layout(atts, cmpst, modelInstance));
			}
		}
		return tab;
	}

}
