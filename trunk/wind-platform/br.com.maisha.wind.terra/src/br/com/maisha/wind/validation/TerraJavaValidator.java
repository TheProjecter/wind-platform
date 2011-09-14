package br.com.maisha.wind.validation;

import javax.management.Attribute;

import org.eclipse.xtext.validation.Check;

import br.com.maisha.wind.terra.TerraPackage;
 

public class TerraJavaValidator extends AbstractTerraJavaValidator {

	@Check
	public void checkFolderAttrs(Attribute attr) {
		if("Folder".equals(attr.getName())){
			warning("Name should start with a capital", TerraPackage.Literals.ATTRIBUTE_PROPERTY__NAME);
		}
	}

}
