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
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.ObjectProperty#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.ObjectProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @extends TerraObject
 * @generated
 */
public interface ObjectProperty extends TerraObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.maisha.wind.terra.terra.ObjectPropertyName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.ObjectPropertyName
	 * @see #setName(ObjectPropertyName)
	 * @generated
	 */
	ObjectPropertyName getName();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.ObjectProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.ObjectPropertyName
	 * @see #getName()
	 * @generated
	 */
	void setName(ObjectPropertyName value);

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
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.ObjectProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ObjectProperty
