package br.com.maisha.wind.faces.render.layout;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import br.com.maisha.terra.lang.Attribute;
import br.com.maisha.terra.lang.DomainObject;
import br.com.maisha.terra.lang.ModelReference;
import br.com.maisha.terra.lang.PropertyInfo;

/**
 * 
 * @author Paulo Freitas (pfreitas1@gmail.com)
 * 
 */
public class GroupLayoutRender extends BaseLayoutRender {

	/** Reference to the group to be rendered. */
	private Attribute groupAttr;

	/**
	 * 
	 */
	public GroupLayoutRender(Attribute groupAttr) {
		super();
		this.groupAttr = groupAttr;
	}

	/**
	 * 
	 */
	public Composite render(DomainObject dObj, Composite parent, ModelReference modelInstance) {

		// filter all attributes having a property "group" that refers to this
		String groupRef = groupAttr.getRef();
		List<Attribute> groupAtts = new ArrayList<Attribute>();
		for (Attribute a : dObj.getAtts()) {
			if (groupRef.equals(a.getPropertyValue(PropertyInfo.GROUP))) {
				groupAtts.add(a);
			}
		}

		Group group = new Group(parent, SWT.SHADOW_IN);
		group.setText(groupAttr.getLabel());
		group.setLayout(new GridLayout(1, false));
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalAlignment = GridData.BEGINNING;
		gd.grabExcessHorizontalSpace = true;
		group.setLayoutData(gd);

		return super.layout(groupAtts, group, modelInstance);
	}

}
