/**
 * <copyright>
 * </copyright>
 *
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
public class TerraFactoryImpl extends EFactoryImpl implements TerraFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TerraFactory init()
  {
    try
    {
      TerraFactory theTerraFactory = (TerraFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.com.br/maisha/wind/terra/Terra"); 
      if (theTerraFactory != null)
      {
        return theTerraFactory;
      }
    }
    catch (Exception exception)
    {
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
  public TerraFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TerraPackage.DOMAIN_OBJECT: return createDomainObject();
      case TerraPackage.IMPORT: return createImport();
      case TerraPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case TerraPackage.OBJECT_PROPERTY: return createObjectProperty();
      case TerraPackage.ATTRIBUTE: return createAttribute();
      case TerraPackage.ATTRIBUTE_PROPERTY: return createAttributeProperty();
      case TerraPackage.OPERATION: return createOperation();
      case TerraPackage.OPERATION_PROPERTY: return createOperationProperty();
      case TerraPackage.VALIDATION: return createValidation();
      case TerraPackage.ARRAY: return createArray();
      case TerraPackage.VALIDATION_RULE: return createValidationRule();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TerraPackage.OPERATION_TYPE:
        return createOperationTypeFromString(eDataType, initialValue);
      case TerraPackage.PRESENTATION_TYPE:
        return createPresentationTypeFromString(eDataType, initialValue);
      case TerraPackage.ATTRIBUTE_PROPERTY_NAME:
        return createAttributePropertyNameFromString(eDataType, initialValue);
      case TerraPackage.OPERATION_PROPERTY_NAME:
        return createOperationPropertyNameFromString(eDataType, initialValue);
      case TerraPackage.OBJECT_PROPERTY_NAME:
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TerraPackage.OPERATION_TYPE:
        return convertOperationTypeToString(eDataType, instanceValue);
      case TerraPackage.PRESENTATION_TYPE:
        return convertPresentationTypeToString(eDataType, instanceValue);
      case TerraPackage.ATTRIBUTE_PROPERTY_NAME:
        return convertAttributePropertyNameToString(eDataType, instanceValue);
      case TerraPackage.OPERATION_PROPERTY_NAME:
        return convertOperationPropertyNameToString(eDataType, instanceValue);
      case TerraPackage.OBJECT_PROPERTY_NAME:
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
  public DomainObject createDomainObject()
  {
    DomainObjectImpl domainObject = new DomainObjectImpl();
    return domainObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProperty createObjectProperty()
  {
    ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeProperty createAttributeProperty()
  {
    AttributePropertyImpl attributeProperty = new AttributePropertyImpl();
    return attributeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationProperty createOperationProperty()
  {
    OperationPropertyImpl operationProperty = new OperationPropertyImpl();
    return operationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validation createValidation()
  {
    ValidationImpl validation = new ValidationImpl();
    return validation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationRule createValidationRule()
  {
    ValidationRuleImpl validationRule = new ValidationRuleImpl();
    return validationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue)
  {
    OperationType result = OperationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresentationType createPresentationTypeFromString(EDataType eDataType, String initialValue)
  {
    PresentationType result = PresentationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPresentationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePropertyName createAttributePropertyNameFromString(EDataType eDataType, String initialValue)
  {
    AttributePropertyName result = AttributePropertyName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributePropertyNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationPropertyName createOperationPropertyNameFromString(EDataType eDataType, String initialValue)
  {
    OperationPropertyName result = OperationPropertyName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationPropertyNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyName createObjectPropertyNameFromString(EDataType eDataType, String initialValue)
  {
    ObjectPropertyName result = ObjectPropertyName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertObjectPropertyNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerraPackage getTerraPackage()
  {
    return (TerraPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TerraPackage getPackage()
  {
    return TerraPackage.eINSTANCE;
  }

} //TerraFactoryImpl
