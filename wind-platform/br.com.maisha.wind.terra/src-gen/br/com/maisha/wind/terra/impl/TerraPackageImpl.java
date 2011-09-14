/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra.impl;

import br.com.maisha.wind.terra.Array;
import br.com.maisha.wind.terra.Attribute;
import br.com.maisha.wind.terra.AttributeProperty;
import br.com.maisha.wind.terra.AttributePropertyName;
import br.com.maisha.wind.terra.DomainObject;
import br.com.maisha.wind.terra.Import;
import br.com.maisha.wind.terra.ObjectProperty;
import br.com.maisha.wind.terra.ObjectPropertyName;
import br.com.maisha.wind.terra.Operation;
import br.com.maisha.wind.terra.OperationProperty;
import br.com.maisha.wind.terra.OperationPropertyName;
import br.com.maisha.wind.terra.OperationType;
import br.com.maisha.wind.terra.PackageDeclaration;
import br.com.maisha.wind.terra.PresentationType;
import br.com.maisha.wind.terra.TerraFactory;
import br.com.maisha.wind.terra.TerraPackage;
import br.com.maisha.wind.terra.Validation;
import br.com.maisha.wind.terra.ValidationRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerraPackageImpl extends EPackageImpl implements TerraPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validationRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum presentationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributePropertyNameEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationPropertyNameEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum objectPropertyNameEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.com.maisha.wind.terra.TerraPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TerraPackageImpl()
  {
    super(eNS_URI, TerraFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TerraPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TerraPackage init()
  {
    if (isInited) return (TerraPackage)EPackage.Registry.INSTANCE.getEPackage(TerraPackage.eNS_URI);

    // Obtain or create and register package
    TerraPackageImpl theTerraPackage = (TerraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TerraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TerraPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTerraPackage.createPackageContents();

    // Initialize created meta-data
    theTerraPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTerraPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TerraPackage.eNS_URI, theTerraPackage);
    return theTerraPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainObject()
  {
    return domainObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Package()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Imports()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainObject_Name()
  {
    return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainObject_Label()
  {
    return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Properties()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Attributes()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Operations()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainObject_Validations()
  {
    return (EReference)domainObjectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectProperty()
  {
    return objectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectProperty_Name()
  {
    return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectProperty_Value()
  {
    return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Ref()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Label()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Properties()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeProperty()
  {
    return attributePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeProperty_Name()
  {
    return (EAttribute)attributePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeProperty_ValidValues()
  {
    return (EReference)attributePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeProperty_Value()
  {
    return (EAttribute)attributePropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Type()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Label()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Properties()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationProperty()
  {
    return operationPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationProperty_Name()
  {
    return (EAttribute)operationPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationProperty_ValidValues()
  {
    return (EReference)operationPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationProperty_Value()
  {
    return (EAttribute)operationPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidation()
  {
    return validationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidation_Ref()
  {
    return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValidation_Rules()
  {
    return (EReference)validationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray()
  {
    return arrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArray_Values()
  {
    return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidationRule()
  {
    return validationRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidationRule_MessageKey()
  {
    return (EAttribute)validationRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidationRule_Expression()
  {
    return (EAttribute)validationRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationType()
  {
    return operationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPresentationType()
  {
    return presentationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributePropertyName()
  {
    return attributePropertyNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationPropertyName()
  {
    return operationPropertyNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getObjectPropertyName()
  {
    return objectPropertyNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerraFactory getTerraFactory()
  {
    return (TerraFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainObjectEClass = createEClass(DOMAIN_OBJECT);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__PACKAGE);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__IMPORTS);
    createEAttribute(domainObjectEClass, DOMAIN_OBJECT__NAME);
    createEAttribute(domainObjectEClass, DOMAIN_OBJECT__LABEL);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__PROPERTIES);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__ATTRIBUTES);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__OPERATIONS);
    createEReference(domainObjectEClass, DOMAIN_OBJECT__VALIDATIONS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);

    objectPropertyEClass = createEClass(OBJECT_PROPERTY);
    createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__NAME);
    createEAttribute(objectPropertyEClass, OBJECT_PROPERTY__VALUE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__REF);
    createEAttribute(attributeEClass, ATTRIBUTE__LABEL);
    createEReference(attributeEClass, ATTRIBUTE__PROPERTIES);

    attributePropertyEClass = createEClass(ATTRIBUTE_PROPERTY);
    createEAttribute(attributePropertyEClass, ATTRIBUTE_PROPERTY__NAME);
    createEReference(attributePropertyEClass, ATTRIBUTE_PROPERTY__VALID_VALUES);
    createEAttribute(attributePropertyEClass, ATTRIBUTE_PROPERTY__VALUE);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__TYPE);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEAttribute(operationEClass, OPERATION__LABEL);
    createEReference(operationEClass, OPERATION__PROPERTIES);

    operationPropertyEClass = createEClass(OPERATION_PROPERTY);
    createEAttribute(operationPropertyEClass, OPERATION_PROPERTY__NAME);
    createEReference(operationPropertyEClass, OPERATION_PROPERTY__VALID_VALUES);
    createEAttribute(operationPropertyEClass, OPERATION_PROPERTY__VALUE);

    validationEClass = createEClass(VALIDATION);
    createEAttribute(validationEClass, VALIDATION__REF);
    createEReference(validationEClass, VALIDATION__RULES);

    arrayEClass = createEClass(ARRAY);
    createEAttribute(arrayEClass, ARRAY__VALUES);

    validationRuleEClass = createEClass(VALIDATION_RULE);
    createEAttribute(validationRuleEClass, VALIDATION_RULE__MESSAGE_KEY);
    createEAttribute(validationRuleEClass, VALIDATION_RULE__EXPRESSION);

    // Create enums
    operationTypeEEnum = createEEnum(OPERATION_TYPE);
    presentationTypeEEnum = createEEnum(PRESENTATION_TYPE);
    attributePropertyNameEEnum = createEEnum(ATTRIBUTE_PROPERTY_NAME);
    operationPropertyNameEEnum = createEEnum(OPERATION_PROPERTY_NAME);
    objectPropertyNameEEnum = createEEnum(OBJECT_PROPERTY_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(domainObjectEClass, DomainObject.class, "DomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainObject_Package(), this.getPackageDeclaration(), null, "package", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainObject_Imports(), this.getImport(), null, "imports", null, 0, -1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainObject_Label(), ecorePackage.getEString(), "label", null, 0, 1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainObject_Properties(), this.getObjectProperty(), null, "properties", null, 0, -1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainObject_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainObject_Operations(), this.getOperation(), null, "operations", null, 0, -1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainObject_Validations(), this.getValidation(), null, "validations", null, 0, -1, DomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectProperty_Name(), this.getObjectPropertyName(), "name", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, ObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Label(), ecorePackage.getEString(), "label", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Properties(), this.getAttributeProperty(), null, "properties", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributePropertyEClass, AttributeProperty.class, "AttributeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeProperty_Name(), this.getAttributePropertyName(), "name", null, 0, 1, AttributeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeProperty_ValidValues(), this.getArray(), null, "validValues", null, 0, 1, AttributeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Type(), this.getOperationType(), "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Label(), ecorePackage.getEString(), "label", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Properties(), this.getOperationProperty(), null, "properties", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationPropertyEClass, OperationProperty.class, "OperationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationProperty_Name(), this.getOperationPropertyName(), "name", null, 0, 1, OperationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationProperty_ValidValues(), this.getArray(), null, "validValues", null, 0, 1, OperationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperationProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, OperationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validationEClass, Validation.class, "Validation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValidation_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValidation_Rules(), this.getValidationRule(), null, "rules", null, 0, -1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArray_Values(), ecorePackage.getEString(), "values", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validationRuleEClass, ValidationRule.class, "ValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValidationRule_MessageKey(), ecorePackage.getEString(), "messageKey", null, 0, 1, ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidationRule_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
    addEEnumLiteral(operationTypeEEnum, OperationType.GROOVY);

    initEEnum(presentationTypeEEnum, PresentationType.class, "PresentationType");
    addEEnumLiteral(presentationTypeEEnum, PresentationType.TEXT);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.RADIO);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.CHECKBOX);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.COMBO);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.LIST);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.TEXTAREA);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.DATE);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.RELATED);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.EMBEDDED_OBJECT);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.GROUP);
    addEEnumLiteral(presentationTypeEEnum, PresentationType.FOLDER);

    initEEnum(attributePropertyNameEEnum, AttributePropertyName.class, "AttributePropertyName");
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.X);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.Y);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.COLSPAN);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.ROWSPAN);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.DISABLED);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.ICON);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.WIDTH);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.HEIGHT);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.TOOLTIP);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.GROUP);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.VISIBLE_IN_EDITION);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.VISIBLE_IN_GRID);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.CONTENT);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.VALUE);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.VALID_VALUES);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.VALIDATION);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.REQUIRED);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.MAX_LENGTH);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.MIN_LENGTH);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.RANGE);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.MASK);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.EVENT);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.TO_STRING);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.ONETOMANY);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.MANYTOONE);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.TRANSIENT);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.FOLDER);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.PRESENTATION_TYPE);
    addEEnumLiteral(attributePropertyNameEEnum, AttributePropertyName.SEQUENCE);

    initEEnum(operationPropertyNameEEnum, OperationPropertyName.class, "OperationPropertyName");
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.DISABLED);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.ICON);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.TOOLTIP);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.VISIBLE);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.FILE);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.VALID_WHEN);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.IS_FILTER);
    addEEnumLiteral(operationPropertyNameEEnum, OperationPropertyName.VALIDATE);

    initEEnum(objectPropertyNameEEnum, ObjectPropertyName.class, "ObjectPropertyName");
    addEEnumLiteral(objectPropertyNameEEnum, ObjectPropertyName.OPEN_FILTERING);
    addEEnumLiteral(objectPropertyNameEEnum, ObjectPropertyName.EVENT_HANDLER);

    // Create resource
    createResource(eNS_URI);
  }

} //TerraPackageImpl
