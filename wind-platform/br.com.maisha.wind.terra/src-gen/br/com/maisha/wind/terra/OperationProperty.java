/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.OperationProperty#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.OperationProperty#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.OperationProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.maisha.wind.terra.TerraPackage#getOperationProperty()
 * @model
 * @generated
 */
public interface OperationProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link br.com.maisha.wind.terra.OperationPropertyName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see br.com.maisha.wind.terra.OperationPropertyName
   * @see #setName(OperationPropertyName)
   * @see br.com.maisha.wind.terra.TerraPackage#getOperationProperty_Name()
   * @model
   * @generated
   */
  OperationPropertyName getName();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.OperationProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see br.com.maisha.wind.terra.OperationPropertyName
   * @see #getName()
   * @generated
   */
  void setName(OperationPropertyName value);

  /**
   * Returns the value of the '<em><b>Valid Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valid Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valid Values</em>' containment reference.
   * @see #setValidValues(Array)
   * @see br.com.maisha.wind.terra.TerraPackage#getOperationProperty_ValidValues()
   * @model containment="true"
   * @generated
   */
  Array getValidValues();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.OperationProperty#getValidValues <em>Valid Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valid Values</em>' containment reference.
   * @see #getValidValues()
   * @generated
   */
  void setValidValues(Array value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see br.com.maisha.wind.terra.TerraPackage#getOperationProperty_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.OperationProperty#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // OperationProperty
