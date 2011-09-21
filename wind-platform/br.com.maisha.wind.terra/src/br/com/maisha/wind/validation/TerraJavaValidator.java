package br.com.maisha.wind.validation;

import static com.google.common.collect.Lists.newArrayList;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;

import br.com.maisha.wind.terra.Attribute;
import br.com.maisha.wind.terra.AttributeProperty;
import br.com.maisha.wind.terra.DomainObject;
import br.com.maisha.wind.terra.TerraPackage;
 

public class TerraJavaValidator extends AbstractTerraJavaValidator {

	/** Holds the names of valid properties to use in a Folder declaration. */
	private final static List<String> folderValidProperties = new ArrayList<String>();
	
	static {
		folderValidProperties.add("sequence");
		folderValidProperties.add("visible");
	}
	
	
	/**
	 * Checks whether an attribute ref already been used  by other attribute.
	 * @param dObj
	 */
	@Check
	public void checkDuplicatedAttributeRef(DomainObject dObj){
		EList<Attribute> attributes = dObj.getAttributes();
		for (Attribute attributeA : attributes) {
			int hitCount = 0;
			for (Attribute attributeB : attributes) {
				if(attributeA.getRef().equals(attributeB.getRef())){
					hitCount++;
				}
			}
			
			if(hitCount > 1){
				error("Reference "+attributeA.getRef()+ " already been used", attributeA, TerraPackage.Literals.ATTRIBUTE__REF, -1);
			}
		}
	}
	
	/**
	 * Checks whether a Folder has invalid properties
	 * @param attr Attribute that represents a folder.
	 */
	@Check
	public void checkFolderProperties(Attribute attr) {
		if("Folder".equals(attr.getRef())){
			// folder can only set "visible" and  "sequence" properties
			EList<AttributeProperty> properties = attr.getProperties();
			for (AttributeProperty attributeProperty : properties) {
				if(!folderValidProperties.contains(attributeProperty.getName().getLiteral())){
					error("Property "+attributeProperty.getName()+ " is invalid for Folders", attributeProperty, TerraPackage.Literals.ATTRIBUTE_PROPERTY__NAME, -1);
				}
			}
		}
	}

	@Override
	protected List<EPackage> getEPackages() {
		return newArrayList(TerraPackage.eINSTANCE, XbasePackage.eINSTANCE);
	}
	
}
