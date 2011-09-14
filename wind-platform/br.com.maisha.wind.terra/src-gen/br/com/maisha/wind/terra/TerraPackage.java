/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.com.maisha.wind.terra.TerraFactory
 * @model kind="package"
 * @generated
 */
public interface TerraPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "terra";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.wind-platform.com.br/maisha/wind/Terra";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "terra";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TerraPackage eINSTANCE = br.com.maisha.wind.terra.impl.TerraPackageImpl.init();

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.DomainObjectImpl <em>Domain Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.DomainObjectImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getDomainObject()
   * @generated
   */
  int DOMAIN_OBJECT = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__NAME = 2;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__LABEL = 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__OPERATIONS = 6;

  /**
   * The feature id for the '<em><b>Validations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT__VALIDATIONS = 7;

  /**
   * The number of structural features of the '<em>Domain Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OBJECT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.ImportImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.PackageDeclarationImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.ObjectPropertyImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getObjectProperty()
   * @generated
   */
  int OBJECT_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.AttributeImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__REF = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__LABEL = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.AttributePropertyImpl <em>Attribute Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.AttributePropertyImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttributeProperty()
   * @generated
   */
  int ATTRIBUTE_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY__VALID_VALUES = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Attribute Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.OperationImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LABEL = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.OperationPropertyImpl <em>Operation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.OperationPropertyImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationProperty()
   * @generated
   */
  int OPERATION_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PROPERTY__VALID_VALUES = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Operation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.ValidationImpl <em>Validation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.ValidationImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getValidation()
   * @generated
   */
  int VALIDATION = 8;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION__REF = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION__RULES = 1;

  /**
   * The number of structural features of the '<em>Validation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.ArrayImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 9;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUES = 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.impl.ValidationRuleImpl
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getValidationRule()
   * @generated
   */
  int VALIDATION_RULE = 10;

  /**
   * The feature id for the '<em><b>Message Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE__MESSAGE_KEY = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.OperationType <em>Operation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.OperationType
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationType()
   * @generated
   */
  int OPERATION_TYPE = 11;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.PresentationType <em>Presentation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.PresentationType
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getPresentationType()
   * @generated
   */
  int PRESENTATION_TYPE = 12;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.AttributePropertyName <em>Attribute Property Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.AttributePropertyName
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttributePropertyName()
   * @generated
   */
  int ATTRIBUTE_PROPERTY_NAME = 13;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.OperationPropertyName <em>Operation Property Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.OperationPropertyName
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationPropertyName()
   * @generated
   */
  int OPERATION_PROPERTY_NAME = 14;

  /**
   * The meta object id for the '{@link br.com.maisha.wind.terra.ObjectPropertyName <em>Object Property Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.com.maisha.wind.terra.ObjectPropertyName
   * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getObjectPropertyName()
   * @generated
   */
  int OBJECT_PROPERTY_NAME = 15;


  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.DomainObject <em>Domain Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Object</em>'.
   * @see br.com.maisha.wind.terra.DomainObject
   * @generated
   */
  EClass getDomainObject();

  /**
   * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.DomainObject#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getPackage()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Package();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.DomainObject#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getImports()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Imports();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.DomainObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getName()
   * @see #getDomainObject()
   * @generated
   */
  EAttribute getDomainObject_Name();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.DomainObject#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getLabel()
   * @see #getDomainObject()
   * @generated
   */
  EAttribute getDomainObject_Label();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.DomainObject#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getProperties()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.DomainObject#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getAttributes()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.DomainObject#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getOperations()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Operations();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.DomainObject#getValidations <em>Validations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validations</em>'.
   * @see br.com.maisha.wind.terra.DomainObject#getValidations()
   * @see #getDomainObject()
   * @generated
   */
  EReference getDomainObject_Validations();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see br.com.maisha.wind.terra.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see br.com.maisha.wind.terra.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see br.com.maisha.wind.terra.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see br.com.maisha.wind.terra.ObjectProperty
   * @generated
   */
  EClass getObjectProperty();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.ObjectProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.ObjectProperty#getName()
   * @see #getObjectProperty()
   * @generated
   */
  EAttribute getObjectProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.ObjectProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.com.maisha.wind.terra.ObjectProperty#getValue()
   * @see #getObjectProperty()
   * @generated
   */
  EAttribute getObjectProperty_Value();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see br.com.maisha.wind.terra.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.com.maisha.wind.terra.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Attribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see br.com.maisha.wind.terra.Attribute#getRef()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Ref();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Attribute#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see br.com.maisha.wind.terra.Attribute#getLabel()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Label();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.Attribute#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see br.com.maisha.wind.terra.Attribute#getProperties()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Properties();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.AttributeProperty <em>Attribute Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Property</em>'.
   * @see br.com.maisha.wind.terra.AttributeProperty
   * @generated
   */
  EClass getAttributeProperty();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.AttributeProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.AttributeProperty#getName()
   * @see #getAttributeProperty()
   * @generated
   */
  EAttribute getAttributeProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.AttributeProperty#getValidValues <em>Valid Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valid Values</em>'.
   * @see br.com.maisha.wind.terra.AttributeProperty#getValidValues()
   * @see #getAttributeProperty()
   * @generated
   */
  EReference getAttributeProperty_ValidValues();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.AttributeProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.com.maisha.wind.terra.AttributeProperty#getValue()
   * @see #getAttributeProperty()
   * @generated
   */
  EAttribute getAttributeProperty_Value();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see br.com.maisha.wind.terra.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Operation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.com.maisha.wind.terra.Operation#getType()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Operation#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see br.com.maisha.wind.terra.Operation#getLabel()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Label();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.Operation#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see br.com.maisha.wind.terra.Operation#getProperties()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Properties();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.OperationProperty <em>Operation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Property</em>'.
   * @see br.com.maisha.wind.terra.OperationProperty
   * @generated
   */
  EClass getOperationProperty();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.OperationProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.com.maisha.wind.terra.OperationProperty#getName()
   * @see #getOperationProperty()
   * @generated
   */
  EAttribute getOperationProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.OperationProperty#getValidValues <em>Valid Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valid Values</em>'.
   * @see br.com.maisha.wind.terra.OperationProperty#getValidValues()
   * @see #getOperationProperty()
   * @generated
   */
  EReference getOperationProperty_ValidValues();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.OperationProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.com.maisha.wind.terra.OperationProperty#getValue()
   * @see #getOperationProperty()
   * @generated
   */
  EAttribute getOperationProperty_Value();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.Validation <em>Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation</em>'.
   * @see br.com.maisha.wind.terra.Validation
   * @generated
   */
  EClass getValidation();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.Validation#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see br.com.maisha.wind.terra.Validation#getRef()
   * @see #getValidation()
   * @generated
   */
  EAttribute getValidation_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.Validation#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see br.com.maisha.wind.terra.Validation#getRules()
   * @see #getValidation()
   * @generated
   */
  EReference getValidation_Rules();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see br.com.maisha.wind.terra.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the attribute list '{@link br.com.maisha.wind.terra.Array#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see br.com.maisha.wind.terra.Array#getValues()
   * @see #getArray()
   * @generated
   */
  EAttribute getArray_Values();

  /**
   * Returns the meta object for class '{@link br.com.maisha.wind.terra.ValidationRule <em>Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation Rule</em>'.
   * @see br.com.maisha.wind.terra.ValidationRule
   * @generated
   */
  EClass getValidationRule();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.ValidationRule#getMessageKey <em>Message Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message Key</em>'.
   * @see br.com.maisha.wind.terra.ValidationRule#getMessageKey()
   * @see #getValidationRule()
   * @generated
   */
  EAttribute getValidationRule_MessageKey();

  /**
   * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.ValidationRule#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see br.com.maisha.wind.terra.ValidationRule#getExpression()
   * @see #getValidationRule()
   * @generated
   */
  EAttribute getValidationRule_Expression();

  /**
   * Returns the meta object for enum '{@link br.com.maisha.wind.terra.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Type</em>'.
   * @see br.com.maisha.wind.terra.OperationType
   * @generated
   */
  EEnum getOperationType();

  /**
   * Returns the meta object for enum '{@link br.com.maisha.wind.terra.PresentationType <em>Presentation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Presentation Type</em>'.
   * @see br.com.maisha.wind.terra.PresentationType
   * @generated
   */
  EEnum getPresentationType();

  /**
   * Returns the meta object for enum '{@link br.com.maisha.wind.terra.AttributePropertyName <em>Attribute Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Property Name</em>'.
   * @see br.com.maisha.wind.terra.AttributePropertyName
   * @generated
   */
  EEnum getAttributePropertyName();

  /**
   * Returns the meta object for enum '{@link br.com.maisha.wind.terra.OperationPropertyName <em>Operation Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Property Name</em>'.
   * @see br.com.maisha.wind.terra.OperationPropertyName
   * @generated
   */
  EEnum getOperationPropertyName();

  /**
   * Returns the meta object for enum '{@link br.com.maisha.wind.terra.ObjectPropertyName <em>Object Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Object Property Name</em>'.
   * @see br.com.maisha.wind.terra.ObjectPropertyName
   * @generated
   */
  EEnum getObjectPropertyName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TerraFactory getTerraFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.DomainObjectImpl <em>Domain Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.DomainObjectImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getDomainObject()
     * @generated
     */
    EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__PACKAGE = eINSTANCE.getDomainObject_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__IMPORTS = eINSTANCE.getDomainObject_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_OBJECT__LABEL = eINSTANCE.getDomainObject_Label();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__PROPERTIES = eINSTANCE.getDomainObject_Properties();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__ATTRIBUTES = eINSTANCE.getDomainObject_Attributes();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__OPERATIONS = eINSTANCE.getDomainObject_Operations();

    /**
     * The meta object literal for the '<em><b>Validations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_OBJECT__VALIDATIONS = eINSTANCE.getDomainObject_Validations();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.ImportImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.PackageDeclarationImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.ObjectPropertyImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getObjectProperty()
     * @generated
     */
    EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY__NAME = eINSTANCE.getObjectProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY__VALUE = eINSTANCE.getObjectProperty_Value();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.AttributeImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__REF = eINSTANCE.getAttribute_Ref();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__PROPERTIES = eINSTANCE.getAttribute_Properties();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.AttributePropertyImpl <em>Attribute Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.AttributePropertyImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttributeProperty()
     * @generated
     */
    EClass ATTRIBUTE_PROPERTY = eINSTANCE.getAttributeProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PROPERTY__NAME = eINSTANCE.getAttributeProperty_Name();

    /**
     * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PROPERTY__VALID_VALUES = eINSTANCE.getAttributeProperty_ValidValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PROPERTY__VALUE = eINSTANCE.getAttributeProperty_Value();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.OperationImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__LABEL = eINSTANCE.getOperation_Label();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PROPERTIES = eINSTANCE.getOperation_Properties();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.OperationPropertyImpl <em>Operation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.OperationPropertyImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationProperty()
     * @generated
     */
    EClass OPERATION_PROPERTY = eINSTANCE.getOperationProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_PROPERTY__NAME = eINSTANCE.getOperationProperty_Name();

    /**
     * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_PROPERTY__VALID_VALUES = eINSTANCE.getOperationProperty_ValidValues();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_PROPERTY__VALUE = eINSTANCE.getOperationProperty_Value();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.ValidationImpl <em>Validation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.ValidationImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getValidation()
     * @generated
     */
    EClass VALIDATION = eINSTANCE.getValidation();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION__REF = eINSTANCE.getValidation_Ref();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALIDATION__RULES = eINSTANCE.getValidation_Rules();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.ArrayImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY__VALUES = eINSTANCE.getArray_Values();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.impl.ValidationRuleImpl
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getValidationRule()
     * @generated
     */
    EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

    /**
     * The meta object literal for the '<em><b>Message Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION_RULE__MESSAGE_KEY = eINSTANCE.getValidationRule_MessageKey();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALIDATION_RULE__EXPRESSION = eINSTANCE.getValidationRule_Expression();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.OperationType <em>Operation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.OperationType
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationType()
     * @generated
     */
    EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.PresentationType <em>Presentation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.PresentationType
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getPresentationType()
     * @generated
     */
    EEnum PRESENTATION_TYPE = eINSTANCE.getPresentationType();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.AttributePropertyName <em>Attribute Property Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.AttributePropertyName
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getAttributePropertyName()
     * @generated
     */
    EEnum ATTRIBUTE_PROPERTY_NAME = eINSTANCE.getAttributePropertyName();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.OperationPropertyName <em>Operation Property Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.OperationPropertyName
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getOperationPropertyName()
     * @generated
     */
    EEnum OPERATION_PROPERTY_NAME = eINSTANCE.getOperationPropertyName();

    /**
     * The meta object literal for the '{@link br.com.maisha.wind.terra.ObjectPropertyName <em>Object Property Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.com.maisha.wind.terra.ObjectPropertyName
     * @see br.com.maisha.wind.terra.impl.TerraPackageImpl#getObjectPropertyName()
     * @generated
     */
    EEnum OBJECT_PROPERTY_NAME = eINSTANCE.getObjectPropertyName();

  }

} //TerraPackage
