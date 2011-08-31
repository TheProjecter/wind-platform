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
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.Validation#getRef <em>Ref</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Validation#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.maisha.wind.terra.terra.TerraPackage#getValidation()
 * @model
 * @generated
 */
public interface Validation extends EObject
{
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
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getValidation_Ref()
   * @model
   * @generated
   */
  String getRef();

  /**
   * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Validation#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
  void setRef(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link br.com.maisha.wind.terra.terra.ValidationRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see br.com.maisha.wind.terra.terra.TerraPackage#getValidation_Rules()
   * @model containment="true"
   * @generated
   */
  EList<ValidationRule> getRules();

} // Validation
