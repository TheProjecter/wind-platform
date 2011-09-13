/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra.impl;

import br.com.maisha.wind.terra.terra.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerraFactoryImpl extends EFactoryImpl implements TerraFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TerraFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TerraFactoryImpl init() {
		try {
			TerraFactoryImpl theTerraFactory = (TerraFactoryImpl)EPackage.Registry.INSTANCE.getEFactory("http://www.com.br/maisha/wind/terra/Terra"); 
			if (theTerraFactory != null) {
				return theTerraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TerraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TerraPackageImpl.DOMAIN_OBJECT: return (EObject)createDomainObject();
			case TerraPackageImpl.IMPORT: return (EObject)createImport();
			case TerraPackageImpl.PACKAGE_DECLARATION: return (EObject)createPackageDeclaration();
			case TerraPackageImpl.OBJECT_PROPERTY: return (EObject)createObjectProperty();
			case TerraPackageImpl.ATTRIBUTE: return (EObject)createAttribute();
			case TerraPackageImpl.ATTRIBUTE_PROPERTY: return (EObject)createAttributeProperty();
			case TerraPackageImpl.OPERATION: return (EObject)createOperation();
			case TerraPackageImpl.OPERATION_PROPERTY: return (EObject)createOperationProperty();
			case TerraPackageImpl.VALIDATION: return (EObject)createValidation();
			case TerraPackageImpl.ARRAY: return (EObject)createArray();
			case TerraPackageImpl.VALIDATION_RULE: return (EObject)createValidationRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TerraPackageImpl.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case TerraPackageImpl.PRESENTATION_TYPE:
				return createPresentationTypeFromString(eDataType, initialValue);
			case TerraPackageImpl.ATTRIBUTE_PROPERTY_NAME:
				return createAttributePropertyNameFromString(eDataType, initialValue);
			case TerraPackageImpl.OPERATION_PROPERTY_NAME:
				return createOperationPropertyNameFromString(eDataType, initialValue);
			case TerraPackageImpl.OBJECT_PROPERTY_NAME:
				return createObjectPropertyNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TerraPackageImpl.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case TerraPackageImpl.PRESENTATION_TYPE:
				return convertPresentationTypeToString(eDataType, instanceValue);
			case TerraPackageImpl.ATTRIBUTE_PROPERTY_NAME:
				return convertAttributePropertyNameToString(eDataType, instanceValue);
			case TerraPackageImpl.OPERATION_PROPERTY_NAME:
				return convertOperationPropertyNameToString(eDataType, instanceValue);
			case TerraPackageImpl.OBJECT_PROPERTY_NAME:
				return convertObjectPropertyNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject createDomainObject() {
		DomainObjectImpl domainObject = new DomainObjectImpl();
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration createPackageDeclaration() {
		PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
		return packageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeProperty createAttributeProperty() {
		AttributePropertyImpl attributeProperty = new AttributePropertyImpl();
		return attributeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProperty createOperationProperty() {
		OperationPropertyImpl operationProperty = new OperationPropertyImpl();
		return operationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Validation createValidation() {
		ValidationImpl validation = new ValidationImpl();
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRule createValidationRule() {
		ValidationRuleImpl validationRule = new ValidationRuleImpl();
		return validationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createPresentationTypeFromString(EDataType eDataType, String initialValue) {
		PresentationType result = PresentationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePropertyName createAttributePropertyNameFromString(EDataType eDataType, String initialValue) {
		AttributePropertyName result = AttributePropertyName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributePropertyNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPropertyName createOperationPropertyNameFromString(EDataType eDataType, String initialValue) {
		OperationPropertyName result = OperationPropertyName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationPropertyNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyName createObjectPropertyNameFromString(EDataType eDataType, String initialValue) {
		ObjectPropertyName result = ObjectPropertyName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectPropertyNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerraPackageImpl getTerraPackage() {
		return (TerraPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TerraPackageImpl getPackage() {
		return TerraPackageImpl.eINSTANCE;
	}

} //TerraFactoryImpl
