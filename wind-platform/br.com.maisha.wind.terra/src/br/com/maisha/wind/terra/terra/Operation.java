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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.Operation#getType <em>Type</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Operation#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Operation#getLabel <em>Label</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.Operation#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @extends TerraObject
 * @generated
 */
public interface Operation extends TerraObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.maisha.wind.terra.terra.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.OperationType
	 * @see #setType(OperationType)
	 * @generated
	 */
	OperationType getType();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.com.maisha.wind.terra.terra.OperationType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperationType value);

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
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Operation#getName <em>Name</em>}' attribute.
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
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link br.com.maisha.wind.terra.terra.Operation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.maisha.wind.terra.terra.OperationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @generated
	 */
	List<OperationProperty> getProperties();

} // Operation
