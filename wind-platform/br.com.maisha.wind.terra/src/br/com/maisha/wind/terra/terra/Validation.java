/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra;

import br.com.maisha.wind.TerraObject;

import java.util.List;

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
 * @extends TerraObject
 * @generated
 */
public interface Validation extends TerraObject {
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
	 * @generated
	 */
	List<ValidationRule> getRules();

} // Validation
