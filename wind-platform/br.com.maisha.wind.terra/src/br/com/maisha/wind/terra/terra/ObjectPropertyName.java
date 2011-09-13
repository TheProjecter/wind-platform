/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Property Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.com.maisha.wind.terra.terra.impl.TerraPackageImpl#getObjectPropertyName()
 * @generated
 */
public enum ObjectPropertyName implements InternalObjectPropertyName {
	/**
	 * The '<em><b>Open filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_FILTERING(0, "open_filtering", "open_filtering"),

	/**
	 * The '<em><b>Event handler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_HANDLER_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_HANDLER(1, "event_handler", "event_handler");

	/**
	 * The '<em><b>Open filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open filtering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_FILTERING
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_FILTERING_VALUE = 0;

	/**
	 * The '<em><b>Event handler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event handler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_HANDLER
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_HANDLER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Object Property Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectPropertyName[] VALUES_ARRAY =
		new ObjectPropertyName[] {
			OPEN_FILTERING,
			EVENT_HANDLER,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Property Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectPropertyName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Property Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectPropertyName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectPropertyName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Property Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectPropertyName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectPropertyName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Property Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectPropertyName get(int value) {
		switch (value) {
			case OPEN_FILTERING_VALUE: return OPEN_FILTERING;
			case EVENT_HANDLER_VALUE: return EVENT_HANDLER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectPropertyName(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ObjectPropertyName

/**
 * A private implementation interface used to hide the inheritance from Enumerator.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
interface InternalObjectPropertyName extends org.eclipse.emf.common.util.Enumerator {
	// Empty 
}
