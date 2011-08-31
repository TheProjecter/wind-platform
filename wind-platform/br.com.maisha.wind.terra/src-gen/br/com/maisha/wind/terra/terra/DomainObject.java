/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra.terra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getPackage <em>Package</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getImports <em>Imports</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getLabel <em>Label</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getProperties <em>Properties</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.DomainObject#getValidations <em>Validations</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject()
 * @model
 * @generated
 */
public interface DomainObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDeclaration)
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Package()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackage();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.DomainObject#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDeclaration value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.DomainObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.DomainObject#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.ObjectProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ObjectProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Validations</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.Validation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validations</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getDomainObject_Validations()
   * @model containment="true"
   * @generated
   */
  EList<Validation> getValidations();

} // DomainObject
