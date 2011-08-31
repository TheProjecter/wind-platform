/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra.terra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Property Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.com.maisha.wind.terra.terra.TerraPackage#getAttributePropertyName()
 * @model
 * @generated
 */
public enum AttributePropertyName implements Enumerator
{
  /**
   * The '<em><b>X</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #X_VALUE
   * @generated
   * @ordered
   */
  X(0, "x", "x"),

  /**
   * The '<em><b>Y</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #Y_VALUE
   * @generated
   * @ordered
   */
  Y(1, "y", "y"),

  /**
   * The '<em><b>Colspan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLSPAN_VALUE
   * @generated
   * @ordered
   */
  COLSPAN(2, "colspan", "colspan"),

  /**
   * The '<em><b>Rowspan</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROWSPAN_VALUE
   * @generated
   * @ordered
   */
  ROWSPAN(3, "rowspan", "rowspan"),

  /**
   * The '<em><b>Disabled</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISABLED_VALUE
   * @generated
   * @ordered
   */
  DISABLED(4, "disabled", "disabled"),

  /**
   * The '<em><b>Icon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ICON_VALUE
   * @generated
   * @ordered
   */
  ICON(5, "icon", "icon"),

  /**
   * The '<em><b>Width</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WIDTH_VALUE
   * @generated
   * @ordered
   */
  WIDTH(6, "width", "width"),

  /**
   * The '<em><b>Height</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEIGHT_VALUE
   * @generated
   * @ordered
   */
  HEIGHT(7, "height", "height"),

  /**
   * The '<em><b>Tooltip</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOOLTIP_VALUE
   * @generated
   * @ordered
   */
  TOOLTIP(8, "tooltip", "tooltip"),

  /**
   * The '<em><b>Group</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GROUP_VALUE
   * @generated
   * @ordered
   */
  GROUP(9, "group", "group"),

  /**
   * The '<em><b>Visible In Edition</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_IN_EDITION_VALUE
   * @generated
   * @ordered
   */
  VISIBLE_IN_EDITION(10, "visibleInEdition", "visibleInEdition"),

  /**
   * The '<em><b>Visible In Grid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_IN_GRID_VALUE
   * @generated
   * @ordered
   */
  VISIBLE_IN_GRID(11, "visibleInGrid", "visibleInGrid"),

  /**
   * The '<em><b>Content</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTENT_VALUE
   * @generated
   * @ordered
   */
  CONTENT(12, "content", "content"),

  /**
   * The '<em><b>Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALUE_VALUE
   * @generated
   * @ordered
   */
  VALUE(13, "value", "value"),

  /**
   * The '<em><b>Valid Values</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALID_VALUES_VALUE
   * @generated
   * @ordered
   */
  VALID_VALUES(14, "validValues", "validValues"),

  /**
   * The '<em><b>Validation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VALIDATION_VALUE
   * @generated
   * @ordered
   */
  VALIDATION(15, "validation", "validation"),

  /**
   * The '<em><b>Required</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIRED_VALUE
   * @generated
   * @ordered
   */
  REQUIRED(16, "required", "required"),

  /**
   * The '<em><b>Max length</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAX_LENGTH_VALUE
   * @generated
   * @ordered
   */
  MAX_LENGTH(17, "max_length", "max_length"),

  /**
   * The '<em><b>Min length</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIN_LENGTH_VALUE
   * @generated
   * @ordered
   */
  MIN_LENGTH(18, "min_length", "min_length"),

  /**
   * The '<em><b>Range</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANGE_VALUE
   * @generated
   * @ordered
   */
  RANGE(19, "range", "range"),

  /**
   * The '<em><b>Mask</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MASK_VALUE
   * @generated
   * @ordered
   */
  MASK(20, "mask", "mask"),

  /**
   * The '<em><b>Event</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVENT_VALUE
   * @generated
   * @ordered
   */
  EVENT(21, "event", "event"),

  /**
   * The '<em><b>To String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TO_STRING_VALUE
   * @generated
   * @ordered
   */
  TO_STRING(22, "toString", "toString"),

  /**
   * The '<em><b>Onetomany</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONETOMANY_VALUE
   * @generated
   * @ordered
   */
  ONETOMANY(23, "onetomany", "onetomany"),

  /**
   * The '<em><b>Manytoone</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANYTOONE_VALUE
   * @generated
   * @ordered
   */
  MANYTOONE(24, "manytoone", "manytoone"),

  /**
   * The '<em><b>Transient</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRANSIENT_VALUE
   * @generated
   * @ordered
   */
  TRANSIENT(25, "transient", "transient"),

  /**
   * The '<em><b>Folder</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOLDER_VALUE
   * @generated
   * @ordered
   */
  FOLDER(26, "folder", "folder"),

  /**
   * The '<em><b>Presentation type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRESENTATION_TYPE_VALUE
   * @generated
   * @ordered
   */
  PRESENTATION_TYPE(27, "presentation_type", "presentation_type"),

  /**
   * The '<em><b>Sequence</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEQUENCE_VALUE
   * @generated
   * @ordered
   */
  SEQUENCE(28, "sequence", "sequence");

  /**
   * The '<em><b>X</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>X</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #X
   * @model name="x"
   * @generated
   * @ordered
   */
  public static final int X_VALUE = 0;

  /**
   * The '<em><b>Y</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Y</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #Y
   * @model name="y"
   * @generated
   * @ordered
   */
  public static final int Y_VALUE = 1;

  /**
   * The '<em><b>Colspan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Colspan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLSPAN
   * @model name="colspan"
   * @generated
   * @ordered
   */
  public static final int COLSPAN_VALUE = 2;

  /**
   * The '<em><b>Rowspan</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rowspan</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROWSPAN
   * @model name="rowspan"
   * @generated
   * @ordered
   */
  public static final int ROWSPAN_VALUE = 3;

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
  public static final int DISABLED_VALUE = 4;

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
  public static final int ICON_VALUE = 5;

  /**
   * The '<em><b>Width</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Width</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WIDTH
   * @model name="width"
   * @generated
   * @ordered
   */
  public static final int WIDTH_VALUE = 6;

  /**
   * The '<em><b>Height</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Height</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEIGHT
   * @model name="height"
   * @generated
   * @ordered
   */
  public static final int HEIGHT_VALUE = 7;

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
  public static final int TOOLTIP_VALUE = 8;

  /**
   * The '<em><b>Group</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GROUP
   * @model name="group"
   * @generated
   * @ordered
   */
  public static final int GROUP_VALUE = 9;

  /**
   * The '<em><b>Visible In Edition</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Visible In Edition</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISIBLE_IN_EDITION
   * @model name="visibleInEdition"
   * @generated
   * @ordered
   */
  public static final int VISIBLE_IN_EDITION_VALUE = 10;

  /**
   * The '<em><b>Visible In Grid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Visible In Grid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VISIBLE_IN_GRID
   * @model name="visibleInGrid"
   * @generated
   * @ordered
   */
  public static final int VISIBLE_IN_GRID_VALUE = 11;

  /**
   * The '<em><b>Content</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Content</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTENT
   * @model name="content"
   * @generated
   * @ordered
   */
  public static final int CONTENT_VALUE = 12;

  /**
   * The '<em><b>Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE
   * @model name="value"
   * @generated
   * @ordered
   */
  public static final int VALUE_VALUE = 13;

  /**
   * The '<em><b>Valid Values</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Valid Values</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALID_VALUES
   * @model name="validValues"
   * @generated
   * @ordered
   */
  public static final int VALID_VALUES_VALUE = 14;

  /**
   * The '<em><b>Validation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Validation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALIDATION
   * @model name="validation"
   * @generated
   * @ordered
   */
  public static final int VALIDATION_VALUE = 15;

  /**
   * The '<em><b>Required</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIRED
   * @model name="required"
   * @generated
   * @ordered
   */
  public static final int REQUIRED_VALUE = 16;

  /**
   * The '<em><b>Max length</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Max length</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAX_LENGTH
   * @model name="max_length"
   * @generated
   * @ordered
   */
  public static final int MAX_LENGTH_VALUE = 17;

  /**
   * The '<em><b>Min length</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Min length</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIN_LENGTH
   * @model name="min_length"
   * @generated
   * @ordered
   */
  public static final int MIN_LENGTH_VALUE = 18;

  /**
   * The '<em><b>Range</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Range</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANGE
   * @model name="range"
   * @generated
   * @ordered
   */
  public static final int RANGE_VALUE = 19;

  /**
   * The '<em><b>Mask</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mask</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MASK
   * @model name="mask"
   * @generated
   * @ordered
   */
  public static final int MASK_VALUE = 20;

  /**
   * The '<em><b>Event</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Event</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EVENT
   * @model name="event"
   * @generated
   * @ordered
   */
  public static final int EVENT_VALUE = 21;

  /**
   * The '<em><b>To String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>To String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TO_STRING
   * @model name="toString"
   * @generated
   * @ordered
   */
  public static final int TO_STRING_VALUE = 22;

  /**
   * The '<em><b>Onetomany</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Onetomany</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONETOMANY
   * @model name="onetomany"
   * @generated
   * @ordered
   */
  public static final int ONETOMANY_VALUE = 23;

  /**
   * The '<em><b>Manytoone</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Manytoone</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANYTOONE
   * @model name="manytoone"
   * @generated
   * @ordered
   */
  public static final int MANYTOONE_VALUE = 24;

  /**
   * The '<em><b>Transient</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Transient</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRANSIENT
   * @model name="transient"
   * @generated
   * @ordered
   */
  public static final int TRANSIENT_VALUE = 25;

  /**
   * The '<em><b>Folder</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Folder</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOLDER
   * @model name="folder"
   * @generated
   * @ordered
   */
  public static final int FOLDER_VALUE = 26;

  /**
   * The '<em><b>Presentation type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Presentation type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRESENTATION_TYPE
   * @model name="presentation_type"
   * @generated
   * @ordered
   */
  public static final int PRESENTATION_TYPE_VALUE = 27;

  /**
   * The '<em><b>Sequence</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sequence</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEQUENCE
   * @model name="sequence"
   * @generated
   * @ordered
   */
  public static final int SEQUENCE_VALUE = 28;

  /**
   * An array of all the '<em><b>Attribute Property Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributePropertyName[] VALUES_ARRAY =
    new AttributePropertyName[]
    {
      X,
      Y,
      COLSPAN,
      ROWSPAN,
      DISABLED,
      ICON,
      WIDTH,
      HEIGHT,
      TOOLTIP,
      GROUP,
      VISIBLE_IN_EDITION,
      VISIBLE_IN_GRID,
      CONTENT,
      VALUE,
      VALID_VALUES,
      VALIDATION,
      REQUIRED,
      MAX_LENGTH,
      MIN_LENGTH,
      RANGE,
      MASK,
      EVENT,
      TO_STRING,
      ONETOMANY,
      MANYTOONE,
      TRANSIENT,
      FOLDER,
      PRESENTATION_TYPE,
      SEQUENCE,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Property Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributePropertyName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Property Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributePropertyName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributePropertyName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Property Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributePropertyName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributePropertyName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Property Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributePropertyName get(int value)
  {
    switch (value)
    {
      case X_VALUE: return X;
      case Y_VALUE: return Y;
      case COLSPAN_VALUE: return COLSPAN;
      case ROWSPAN_VALUE: return ROWSPAN;
      case DISABLED_VALUE: return DISABLED;
      case ICON_VALUE: return ICON;
      case WIDTH_VALUE: return WIDTH;
      case HEIGHT_VALUE: return HEIGHT;
      case TOOLTIP_VALUE: return TOOLTIP;
      case GROUP_VALUE: return GROUP;
      case VISIBLE_IN_EDITION_VALUE: return VISIBLE_IN_EDITION;
      case VISIBLE_IN_GRID_VALUE: return VISIBLE_IN_GRID;
      case CONTENT_VALUE: return CONTENT;
      case VALUE_VALUE: return VALUE;
      case VALID_VALUES_VALUE: return VALID_VALUES;
      case VALIDATION_VALUE: return VALIDATION;
      case REQUIRED_VALUE: return REQUIRED;
      case MAX_LENGTH_VALUE: return MAX_LENGTH;
      case MIN_LENGTH_VALUE: return MIN_LENGTH;
      case RANGE_VALUE: return RANGE;
      case MASK_VALUE: return MASK;
      case EVENT_VALUE: return EVENT;
      case TO_STRING_VALUE: return TO_STRING;
      case ONETOMANY_VALUE: return ONETOMANY;
      case MANYTOONE_VALUE: return MANYTOONE;
      case TRANSIENT_VALUE: return TRANSIENT;
      case FOLDER_VALUE: return FOLDER;
      case PRESENTATION_TYPE_VALUE: return PRESENTATION_TYPE;
      case SEQUENCE_VALUE: return SEQUENCE;
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
  private AttributePropertyName(int value, String name, String literal)
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
  
} //AttributePropertyName
