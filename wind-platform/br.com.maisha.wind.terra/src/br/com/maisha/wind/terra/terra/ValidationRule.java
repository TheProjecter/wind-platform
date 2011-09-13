/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra;

import br.com.maisha.wind.TerraObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.ValidationRule#getMessageKey <em>Message Key</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.ValidationRule#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @extends TerraObject
 * @generated
 */
public interface ValidationRule extends TerraObject {
	/**
	 * Returns the value of the '<em><b>Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Key</em>' attribute.
	 * @see #setMessageKey(String)
	 * @generated
	 */
	String getMessageKey();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.ValidationRule#getMessageKey <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Key</em>' attribute.
	 * @see #getMessageKey()
	 * @generated
	 */
	void setMessageKey(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.ValidationRule#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // ValidationRule
