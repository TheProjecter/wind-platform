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
 * A representation of the model object '<em><b>Attribute Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.AttributeProperty#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @extends TerraObject
 * @generated
 */
public interface AttributeProperty extends TerraObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.maisha.wind.terra.terra.AttributePropertyName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.AttributePropertyName
	 * @see #setName(AttributePropertyName)
	 * @generated
	 */
	AttributePropertyName getName();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.AttributePropertyName
	 * @see #getName()
	 * @generated
	 */
	void setName(AttributePropertyName value);

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
	 * @generated
	 */
	Array getValidValues();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValidValues <em>Valid Values</em>}' containment reference.
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
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.AttributeProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AttributeProperty
