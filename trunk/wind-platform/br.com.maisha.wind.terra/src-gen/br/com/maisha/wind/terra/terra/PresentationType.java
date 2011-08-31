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
 * A representation of the literals of the enumeration '<em><b>Presentation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.com.maisha.wind.terra.terra.TerraPackage#getPresentationType()
 * @model
 * @generated
 */
public enum PresentationType implements Enumerator
{
  /**
   * The '<em><b>Text</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_VALUE
   * @generated
   * @ordered
   */
  TEXT(0, "text", "text"),

  /**
   * The '<em><b>Radio</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RADIO_VALUE
   * @generated
   * @ordered
   */
  RADIO(1, "radio", "radio"),

  /**
   * The '<em><b>Checkbox</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHECKBOX_VALUE
   * @generated
   * @ordered
   */
  CHECKBOX(2, "checkbox", "checkbox"),

  /**
   * The '<em><b>Combo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMBO_VALUE
   * @generated
   * @ordered
   */
  COMBO(3, "combo", "combo"),

  /**
   * The '<em><b>List</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIST_VALUE
   * @generated
   * @ordered
   */
  LIST(4, "list", "list"),

  /**
   * The '<em><b>Textarea</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXTAREA_VALUE
   * @generated
   * @ordered
   */
  TEXTAREA(5, "textarea", "textarea"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(6, "date", "date"),

  /**
   * The '<em><b>Related</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATED_VALUE
   * @generated
   * @ordered
   */
  RELATED(7, "related", "related"),

  /**
   * The '<em><b>Embedded object</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMBEDDED_OBJECT_VALUE
   * @generated
   * @ordered
   */
  EMBEDDED_OBJECT(8, "embedded_object", "embedded_object"),

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
   * The '<em><b>Folder</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOLDER_VALUE
   * @generated
   * @ordered
   */
  FOLDER(10, "folder", "folder");

  /**
   * The '<em><b>Text</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT
   * @model name="text"
   * @generated
   * @ordered
   */
  public static final int TEXT_VALUE = 0;

  /**
   * The '<em><b>Radio</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Radio</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RADIO
   * @model name="radio"
   * @generated
   * @ordered
   */
  public static final int RADIO_VALUE = 1;

  /**
   * The '<em><b>Checkbox</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Checkbox</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHECKBOX
   * @model name="checkbox"
   * @generated
   * @ordered
   */
  public static final int CHECKBOX_VALUE = 2;

  /**
   * The '<em><b>Combo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Combo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMBO
   * @model name="combo"
   * @generated
   * @ordered
   */
  public static final int COMBO_VALUE = 3;

  /**
   * The '<em><b>List</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIST
   * @model name="list"
   * @generated
   * @ordered
   */
  public static final int LIST_VALUE = 4;

  /**
   * The '<em><b>Textarea</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Textarea</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXTAREA
   * @model name="textarea"
   * @generated
   * @ordered
   */
  public static final int TEXTAREA_VALUE = 5;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 6;

  /**
   * The '<em><b>Related</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Related</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATED
   * @model name="related"
   * @generated
   * @ordered
   */
  public static final int RELATED_VALUE = 7;

  /**
   * The '<em><b>Embedded object</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Embedded object</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMBEDDED_OBJECT
   * @model name="embedded_object"
   * @generated
   * @ordered
   */
  public static final int EMBEDDED_OBJECT_VALUE = 8;

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
  public static final int FOLDER_VALUE = 10;

  /**
   * An array of all the '<em><b>Presentation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PresentationType[] VALUES_ARRAY =
    new PresentationType[]
    {
      TEXT,
      RADIO,
      CHECKBOX,
      COMBO,
      LIST,
      TEXTAREA,
      DATE,
      RELATED,
      EMBEDDED_OBJECT,
      GROUP,
      FOLDER,
    };

  /**
   * A public read-only list of all the '<em><b>Presentation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PresentationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Presentation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PresentationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PresentationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Presentation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PresentationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PresentationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Presentation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PresentationType get(int value)
  {
    switch (value)
    {
      case TEXT_VALUE: return TEXT;
      case RADIO_VALUE: return RADIO;
      case CHECKBOX_VALUE: return CHECKBOX;
      case COMBO_VALUE: return COMBO;
      case LIST_VALUE: return LIST;
      case TEXTAREA_VALUE: return TEXTAREA;
      case DATE_VALUE: return DATE;
      case RELATED_VALUE: return RELATED;
      case EMBEDDED_OBJECT_VALUE: return EMBEDDED_OBJECT;
      case GROUP_VALUE: return GROUP;
      case FOLDER_VALUE: return FOLDER;
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
  private PresentationType(int value, String name, String literal)
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
  
} //PresentationType
