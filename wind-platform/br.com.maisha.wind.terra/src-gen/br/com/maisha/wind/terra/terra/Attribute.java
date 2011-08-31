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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Attribute#getRef <em>Ref</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Attribute#getLabel <em>Label</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Attribute#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttribute_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttribute_Ref()
   * @model
   * @generated
   */
  String getRef();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Attribute#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
  void setRef(String value);

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
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttribute_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Attribute#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.AttributeProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttribute_Properties()
   * @model containment="true"
   * @generated
   */
  EList<AttributeProperty> getProperties();

} // Attribute
