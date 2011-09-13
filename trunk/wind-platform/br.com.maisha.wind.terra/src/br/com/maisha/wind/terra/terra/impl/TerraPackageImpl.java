/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra.impl;

import br.com.maisha.wind.terra.terra.Array;
import br.com.maisha.wind.terra.terra.Attribute;
import br.com.maisha.wind.terra.terra.AttributeProperty;
import br.com.maisha.wind.terra.terra.AttributePropertyName;
import br.com.maisha.wind.terra.terra.DomainObject;
import br.com.maisha.wind.terra.terra.Import;
import br.com.maisha.wind.terra.terra.ObjectProperty;
import br.com.maisha.wind.terra.terra.ObjectPropertyName;
import br.com.maisha.wind.terra.terra.Operation;
import br.com.maisha.wind.terra.terra.OperationProperty;
import br.com.maisha.wind.terra.terra.OperationPropertyName;
import br.com.maisha.wind.terra.terra.OperationType;
import br.com.maisha.wind.terra.terra.PackageDeclaration;
import br.com.maisha.wind.terra.terra.PresentationType;
import br.com.maisha.wind.terra.terra.TerraFactory;
import br.com.maisha.wind.terra.terra.Validation;
import br.com.maisha.wind.terra.terra.ValidationRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see br.com.maisha.wind.terra.terra.TerraFactory
 * @generated
 */
public class TerraPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "terra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.com.br/maisha/wind/terra/Terra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "terra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TerraPackageImpl eINSTANCE = br.com.maisha.wind.terra.terra.impl.TerraPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.DomainObjectImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getDomainObject()
	 * @generated
	 */
	public static final int DOMAIN_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__OPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT__VALIDATIONS = 7;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_OBJECT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.ImportImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getImport()
	 * @generated
	 */
	public static final int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.PackageDeclarationImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getPackageDeclaration()
	 * @generated
	 */
	public static final int PACKAGE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.ObjectPropertyImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getObjectProperty()
	 * @generated
	 */
	public static final int OBJECT_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Object Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.AttributeImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttribute()
	 * @generated
	 */
	public static final int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__REF = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.AttributePropertyImpl <em>Attribute Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.AttributePropertyImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttributeProperty()
	 * @generated
	 */
	public static final int ATTRIBUTE_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_PROPERTY__VALID_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.OperationImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperation()
	 * @generated
	 */
	public static final int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.OperationPropertyImpl <em>Operation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.OperationPropertyImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationProperty()
	 * @generated
	 */
	public static final int OPERATION_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_PROPERTY__VALID_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Operation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.ValidationImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getValidation()
	 * @generated
	 */
	public static final int VALIDATION = 8;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION__REF = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION__RULES = 1;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.ArrayImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getArray()
	 * @generated
	 */
	public static final int ARRAY = 9;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getValidationRule()
	 * @generated
	 */
	public static final int VALIDATION_RULE = 10;

	/**
	 * The feature id for the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_RULE__MESSAGE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_RULE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.OperationType
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationType()
	 * @generated
	 */
	public static final int OPERATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.PresentationType <em>Presentation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.PresentationType
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getPresentationType()
	 * @generated
	 */
	public static final int PRESENTATION_TYPE = 12;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.AttributePropertyName <em>Attribute Property Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.AttributePropertyName
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttributePropertyName()
	 * @generated
	 */
	public static final int ATTRIBUTE_PROPERTY_NAME = 13;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.OperationPropertyName <em>Operation Property Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.OperationPropertyName
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationPropertyName()
	 * @generated
	 */
	public static final int OPERATION_PROPERTY_NAME = 14;

	/**
	 * The meta object id for the '{@link br.com.maisha.wind.terra.terra.ObjectPropertyName <em>Object Property Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.maisha.wind.terra.terra.ObjectPropertyName
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getObjectPropertyName()
	 * @generated
	 */
	public static final int OBJECT_PROPERTY_NAME = 15;

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
	 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TerraPackageImpl() {
		super(eNS_URI, ((EFactory)TerraFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link TerraPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TerraPackageImpl init() {
		if (isInited) return (TerraPackageImpl)EPackage.Registry.INSTANCE.getEPackage(TerraPackageImpl.eNS_URI);

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
		EPackage.Registry.INSTANCE.put(TerraPackageImpl.eNS_URI, theTerraPackage);
		return theTerraPackage;
	}


	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject
	 * @generated
	 */
	public EClass getDomainObject() {
		return domainObjectEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.terra.DomainObject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getPackage()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Package() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.DomainObject#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getImports()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Imports() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EAttribute getDomainObject_Name() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.DomainObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getLabel()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EAttribute getDomainObject_Label() {
		return (EAttribute)domainObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.DomainObject#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getProperties()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Properties() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.DomainObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getAttributes()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Attributes() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getOperations()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Operations() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.DomainObject#getValidations <em>Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validations</em>'.
	 * @see br.com.maisha.wind.terra.terra.DomainObject#getValidations()
	 * @see #getDomainObject()
	 * @generated
	 */
	public EReference getDomainObject_Validations() {
		return (EReference)domainObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see br.com.maisha.wind.terra.terra.Import
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see br.com.maisha.wind.terra.terra.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Declaration</em>'.
	 * @see br.com.maisha.wind.terra.terra.PackageDeclaration
	 * @generated
	 */
	public EClass getPackageDeclaration() {
		return packageDeclarationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.PackageDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.PackageDeclaration#getName()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	public EAttribute getPackageDeclaration_Name() {
		return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Property</em>'.
	 * @see br.com.maisha.wind.terra.terra.ObjectProperty
	 * @generated
	 */
	public EClass getObjectProperty() {
		return objectPropertyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.ObjectProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.ObjectProperty#getName()
	 * @see #getObjectProperty()
	 * @generated
	 */
	public EAttribute getObjectProperty_Name() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.ObjectProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.com.maisha.wind.terra.terra.ObjectProperty#getValue()
	 * @see #getObjectProperty()
	 * @generated
	 */
	public EAttribute getObjectProperty_Value() {
		return (EAttribute)objectPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see br.com.maisha.wind.terra.terra.Attribute
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.com.maisha.wind.terra.terra.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Attribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see br.com.maisha.wind.terra.terra.Attribute#getRef()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Ref() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Attribute#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.com.maisha.wind.terra.terra.Attribute#getLabel()
	 * @see #getAttribute()
	 * @generated
	 */
	public EAttribute getAttribute_Label() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.Attribute#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see br.com.maisha.wind.terra.terra.Attribute#getProperties()
	 * @see #getAttribute()
	 * @generated
	 */
	public EReference getAttribute_Properties() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.AttributeProperty <em>Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Property</em>'.
	 * @see br.com.maisha.wind.terra.terra.AttributeProperty
	 * @generated
	 */
	public EClass getAttributeProperty() {
		return attributePropertyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.AttributeProperty#getName()
	 * @see #getAttributeProperty()
	 * @generated
	 */
	public EAttribute getAttributeProperty_Name() {
		return (EAttribute)attributePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see br.com.maisha.wind.terra.terra.AttributeProperty#getValidValues()
	 * @see #getAttributeProperty()
	 * @generated
	 */
	public EReference getAttributeProperty_ValidValues() {
		return (EReference)attributePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.com.maisha.wind.terra.terra.AttributeProperty#getValue()
	 * @see #getAttributeProperty()
	 * @generated
	 */
	public EAttribute getAttributeProperty_Value() {
		return (EAttribute)attributePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see br.com.maisha.wind.terra.terra.Operation
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.com.maisha.wind.terra.terra.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	public EAttribute getOperation_Type() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Operation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.com.maisha.wind.terra.terra.Operation#getLabel()
	 * @see #getOperation()
	 * @generated
	 */
	public EAttribute getOperation_Label() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.Operation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see br.com.maisha.wind.terra.terra.Operation#getProperties()
	 * @see #getOperation()
	 * @generated
	 */
	public EReference getOperation_Properties() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.OperationProperty <em>Operation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Property</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationProperty
	 * @generated
	 */
	public EClass getOperationProperty() {
		return operationPropertyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.OperationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationProperty#getName()
	 * @see #getOperationProperty()
	 * @generated
	 */
	public EAttribute getOperationProperty_Name() {
		return (EAttribute)operationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link br.com.maisha.wind.terra.terra.OperationProperty#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationProperty#getValidValues()
	 * @see #getOperationProperty()
	 * @generated
	 */
	public EReference getOperationProperty_ValidValues() {
		return (EReference)operationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.OperationProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationProperty#getValue()
	 * @see #getOperationProperty()
	 * @generated
	 */
	public EAttribute getOperationProperty_Value() {
		return (EAttribute)operationPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see br.com.maisha.wind.terra.terra.Validation
	 * @generated
	 */
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.Validation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see br.com.maisha.wind.terra.terra.Validation#getRef()
	 * @see #getValidation()
	 * @generated
	 */
	public EAttribute getValidation_Ref() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.maisha.wind.terra.terra.Validation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see br.com.maisha.wind.terra.terra.Validation#getRules()
	 * @see #getValidation()
	 * @generated
	 */
	public EReference getValidation_Rules() {
		return (EReference)validationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see br.com.maisha.wind.terra.terra.Array
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * Returns the meta object for the attribute list '{@link br.com.maisha.wind.terra.terra.Array#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see br.com.maisha.wind.terra.terra.Array#getValues()
	 * @see #getArray()
	 * @generated
	 */
	public EAttribute getArray_Values() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link br.com.maisha.wind.terra.terra.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see br.com.maisha.wind.terra.terra.ValidationRule
	 * @generated
	 */
	public EClass getValidationRule() {
		return validationRuleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.ValidationRule#getMessageKey <em>Message Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Key</em>'.
	 * @see br.com.maisha.wind.terra.terra.ValidationRule#getMessageKey()
	 * @see #getValidationRule()
	 * @generated
	 */
	public EAttribute getValidationRule_MessageKey() {
		return (EAttribute)validationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link br.com.maisha.wind.terra.terra.ValidationRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see br.com.maisha.wind.terra.terra.ValidationRule#getExpression()
	 * @see #getValidationRule()
	 * @generated
	 */
	public EAttribute getValidationRule_Expression() {
		return (EAttribute)validationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link br.com.maisha.wind.terra.terra.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationType
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link br.com.maisha.wind.terra.terra.PresentationType <em>Presentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Presentation Type</em>'.
	 * @see br.com.maisha.wind.terra.terra.PresentationType
	 * @generated
	 */
	public EEnum getPresentationType() {
		return presentationTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link br.com.maisha.wind.terra.terra.AttributePropertyName <em>Attribute Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Property Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.AttributePropertyName
	 * @generated
	 */
	public EEnum getAttributePropertyName() {
		return attributePropertyNameEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link br.com.maisha.wind.terra.terra.OperationPropertyName <em>Operation Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Property Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.OperationPropertyName
	 * @generated
	 */
	public EEnum getOperationPropertyName() {
		return operationPropertyNameEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link br.com.maisha.wind.terra.terra.ObjectPropertyName <em>Object Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Property Name</em>'.
	 * @see br.com.maisha.wind.terra.terra.ObjectPropertyName
	 * @generated
	 */
	public EEnum getObjectPropertyName() {
		return objectPropertyNameEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TerraFactory getTerraFactory() {
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
	public void createPackageContents() {
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
	public void initializePackageContents() {
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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.DomainObjectImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getDomainObject()
		 * @generated
		 */
		public static final EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__PACKAGE = eINSTANCE.getDomainObject_Package();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__IMPORTS = eINSTANCE.getDomainObject_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOMAIN_OBJECT__LABEL = eINSTANCE.getDomainObject_Label();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__PROPERTIES = eINSTANCE.getDomainObject_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__ATTRIBUTES = eINSTANCE.getDomainObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__OPERATIONS = eINSTANCE.getDomainObject_Operations();

		/**
		 * The meta object literal for the '<em><b>Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOMAIN_OBJECT__VALIDATIONS = eINSTANCE.getDomainObject_Validations();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.ImportImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getImport()
		 * @generated
		 */
		public static final EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.PackageDeclarationImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getPackageDeclaration()
		 * @generated
		 */
		public static final EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.ObjectPropertyImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getObjectProperty()
		 * @generated
		 */
		public static final EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OBJECT_PROPERTY__NAME = eINSTANCE.getObjectProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OBJECT_PROPERTY__VALUE = eINSTANCE.getObjectProperty_Value();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.AttributeImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttribute()
		 * @generated
		 */
		public static final EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__REF = eINSTANCE.getAttribute_Ref();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE__LABEL = eINSTANCE.getAttribute_Label();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTE__PROPERTIES = eINSTANCE.getAttribute_Properties();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.AttributePropertyImpl <em>Attribute Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.AttributePropertyImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttributeProperty()
		 * @generated
		 */
		public static final EClass ATTRIBUTE_PROPERTY = eINSTANCE.getAttributeProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE_PROPERTY__NAME = eINSTANCE.getAttributeProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTRIBUTE_PROPERTY__VALID_VALUES = eINSTANCE.getAttributeProperty_ValidValues();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTRIBUTE_PROPERTY__VALUE = eINSTANCE.getAttributeProperty_Value();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.OperationImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperation()
		 * @generated
		 */
		public static final EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATION__LABEL = eINSTANCE.getOperation_Label();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATION__PROPERTIES = eINSTANCE.getOperation_Properties();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.OperationPropertyImpl <em>Operation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.OperationPropertyImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationProperty()
		 * @generated
		 */
		public static final EClass OPERATION_PROPERTY = eINSTANCE.getOperationProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATION_PROPERTY__NAME = eINSTANCE.getOperationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATION_PROPERTY__VALID_VALUES = eINSTANCE.getOperationProperty_ValidValues();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATION_PROPERTY__VALUE = eINSTANCE.getOperationProperty_Value();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.ValidationImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getValidation()
		 * @generated
		 */
		public static final EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALIDATION__REF = eINSTANCE.getValidation_Ref();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VALIDATION__RULES = eINSTANCE.getValidation_Rules();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.ArrayImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getArray()
		 * @generated
		 */
		public static final EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARRAY__VALUES = eINSTANCE.getArray_Values();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getValidationRule()
		 * @generated
		 */
		public static final EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '<em><b>Message Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALIDATION_RULE__MESSAGE_KEY = eINSTANCE.getValidationRule_MessageKey();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALIDATION_RULE__EXPRESSION = eINSTANCE.getValidationRule_Expression();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.OperationType
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationType()
		 * @generated
		 */
		public static final EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.PresentationType <em>Presentation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.PresentationType
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getPresentationType()
		 * @generated
		 */
		public static final EEnum PRESENTATION_TYPE = eINSTANCE.getPresentationType();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.AttributePropertyName <em>Attribute Property Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.AttributePropertyName
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getAttributePropertyName()
		 * @generated
		 */
		public static final EEnum ATTRIBUTE_PROPERTY_NAME = eINSTANCE.getAttributePropertyName();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.OperationPropertyName <em>Operation Property Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.OperationPropertyName
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getOperationPropertyName()
		 * @generated
		 */
		public static final EEnum OPERATION_PROPERTY_NAME = eINSTANCE.getOperationPropertyName();

		/**
		 * The meta object literal for the '{@link br.com.maisha.wind.terra.terra.ObjectPropertyName <em>Object Property Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.maisha.wind.terra.terra.ObjectPropertyName
		 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getObjectPropertyName()
		 * @generated
		 */
		public static final EEnum OBJECT_PROPERTY_NAME = eINSTANCE.getObjectPropertyName();

	}

} //TerraPackageImpl
