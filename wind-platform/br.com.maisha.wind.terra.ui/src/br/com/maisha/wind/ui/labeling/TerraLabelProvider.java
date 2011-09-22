/*
 * generated by Xtext
 */
package br.com.maisha.wind.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import br.com.maisha.wind.terra.Array;
import br.com.maisha.wind.terra.Attribute;
import br.com.maisha.wind.terra.AttributeProperty;
import br.com.maisha.wind.terra.DomainObject;
import br.com.maisha.wind.terra.Import;
import br.com.maisha.wind.terra.ObjectProperty;
import br.com.maisha.wind.terra.Operation;
import br.com.maisha.wind.terra.OperationProperty;
import br.com.maisha.wind.terra.PackageDeclaration;
import br.com.maisha.wind.terra.Validation;
import br.com.maisha.wind.terra.ValidationRule;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class TerraLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public TerraLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public Object text(Attribute element) {
		return element.getLabel();
	}

	public Object text(DomainObject element) {
		return element.getLabel();
	}

	public Object text(AttributeProperty element) {
		return element.getName()
				+ (element.getValue() == null ? "" : ": " + element.getValue());
	}

	public Object text(ObjectProperty element) {
		return element.getName()
				+ (element.getValue() == null ? "" : ": " + element.getValue());
	}

	public Object text(OperationProperty element) {
		return element.getName()
				+ (element.getValue() == null ? "" : ": " + element.getValue());
	}

	public Object text(Array element) {
		return element.getValues().isEmpty() ? "" : element.getValues().get(0)
				+ (element.getValues().size() > 1 ? ", ..." : "");
	}

	public Object text(Operation element) {
		return element.getLabel();
	}

	public Object image(Attribute element) {
		if (element.getType().equals("Folder")) {
			return "folder.png";
		}
		return "attr.png";
	}

	public Object image(DomainObject element) {
		return "domain.png";
	}

	public Object image(AttributeProperty element) {
		return "property.png";
	}

	public Object image(OperationProperty element) {
		return "property.png";
	}

	public Object image(ObjectProperty element) {
		return "property.png";
	}

	public Object image(Operation element) {
		return "operation.png";
	}

	public Object image(PackageDeclaration element) {
		return "thing.png";
	}

	public Object image(Import element) {
		return "thing.png";
	}

	public Object image(Array element) {
		return "thing.png";
	}

	public Object image(Validation element) {
		return "thing.png";
	}

	public Object image(ValidationRule element) {
		return "thing.png";
	}
}
