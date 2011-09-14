/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.Array#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.maisha.wind.terra.TerraPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see br.com.maisha.wind.terra.TerraPackage#getArray_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // Array
