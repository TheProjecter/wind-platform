/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Property Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.com.maisha.wind.terra.TerraPackage#getOperationPropertyName()
 * @model
 * @generated
 */
public enum OperationPropertyName implements Enumerator
{
  /**
   * The '<em><b>Disabled</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISABLED_VALUE
   * @generated
   * @ordered
   */
  DISABLED(0, "disabled", "disabled"),

  /**
   * The '<em><b>Icon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ICON_VALUE
   * @generated
   * @ordered
   */
  ICON(1, "icon", "icon"),

  /**
   * The '<em><b>Tooltip</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOOLTIP_VALUE
   * @generated
   * @ordered
   */
  TOOLTIP(2, "tooltip", "tooltip"),

  /**
   * The '<em><b>Visible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_VALUE
   * @generated
   * @ordered
   */
  VISIBLE(3, "visible", "visible"),

  /**
   * The '<em><b>File</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FILE_VALUE
   * @generated
   * @ordered
   */
  FILE(4, "file", "file"),

  /**
   * The '<em><b>Valid When</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALID_WHEN_VALUE
   * @generated
   * @ordered
   */
  VALID_WHEN(5, "validWhen", "validWhen"),

  /**
   * The '<em><b>Is filter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IS_FILTER_VALUE
   * @generated
   * @ordered
   */
  IS_FILTER(6, "is_filter", "is_filter"),

  /**
   * The '<em><b>Validate</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALIDATE_VALUE
   * @generated
   * @ordered
   */
  VALIDATE(7, "validate", "validate");

  /**
   * The '<em><b>Disabled</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Disabled</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISABLED
   * @model name="disabled"
   * @generated
   * @ordered
   */
  public static final int DISABLED_VALUE = 0;

  /**
   * The '<em><b>Icon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Icon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ICON
   * @model name="icon"
   * @generated
   * @ordered
   */
  public static final int ICON_VALUE = 1;

  /**
   * The '<em><b>Tooltip</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tooltip</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOOLTIP
   * @model name="tooltip"
   * @generated
   * @ordered
   */
  public static final int TOOLTIP_VALUE = 2;

  /**
   * The '<em><b>Visible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Visible</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISIBLE
   * @model name="visible"
   * @generated
   * @ordered
   */
  public static final int VISIBLE_VALUE = 3;

  /**
   * The '<em><b>File</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>File</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FILE
   * @model name="file"
   * @generated
   * @ordered
   */
  public static final int FILE_VALUE = 4;

  /**
   * The '<em><b>Valid When</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Valid When</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALID_WHEN
   * @model name="validWhen"
   * @generated
   * @ordered
   */
  public static final int VALID_WHEN_VALUE = 5;

  /**
   * The '<em><b>Is filter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Is filter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IS_FILTER
   * @model name="is_filter"
   * @generated
   * @ordered
   */
  public static final int IS_FILTER_VALUE = 6;

  /**
   * The '<em><b>Validate</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Validate</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALIDATE
   * @model name="validate"
   * @generated
   * @ordered
   */
  public static final int VALIDATE_VALUE = 7;

  /**
   * An array of all the '<em><b>Operation Property Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OperationPropertyName[] VALUES_ARRAY =
    new OperationPropertyName[]
    {
      DISABLED,
      ICON,
      TOOLTIP,
      VISIBLE,
      FILE,
      VALID_WHEN,
      IS_FILTER,
      VALIDATE,
    };

  /**
   * A public read-only list of all the '<em><b>Operation Property Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OperationPropertyName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Operation Property Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationPropertyName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperationPropertyName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operation Property Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationPropertyName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperationPropertyName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operation Property Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationPropertyName get(int value)
  {
    switch (value)
    {
      case DISABLED_VALUE: return DISABLED;
      case ICON_VALUE: return ICON;
      case TOOLTIP_VALUE: return TOOLTIP;
      case VISIBLE_VALUE: return VISIBLE;
      case FILE_VALUE: return FILE;
      case VALID_WHEN_VALUE: return VALID_WHEN;
      case IS_FILTER_VALUE: return IS_FILTER;
      case VALIDATE_VALUE: return VALIDATE;
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
  private OperationPropertyName(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OperationPropertyName
