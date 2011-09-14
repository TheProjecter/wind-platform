/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra.impl;

import br.com.maisha.wind.terra.Array;
import br.com.maisha.wind.terra.OperationProperty;
import br.com.maisha.wind.terra.OperationPropertyName;
import br.com.maisha.wind.terra.TerraPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.impl.OperationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.OperationPropertyImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.OperationPropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationPropertyImpl extends MinimalEObjectImpl.Container implements OperationProperty
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final OperationPropertyName NAME_EDEFAULT = OperationPropertyName.DISABLED;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected OperationPropertyName name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValidValues() <em>Valid Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidValues()
   * @generated
   * @ordered
   */
  protected Array validValues;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TerraPackage.Literals.OPERATION_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationPropertyName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(OperationPropertyName newName)
  {
    OperationPropertyName oldName = name;
    name = newName == null ? NAME_EDEFAULT : newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.OPERATION_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array getValidValues()
  {
    return validValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidValues(Array newValidValues, NotificationChain msgs)
  {
    Array oldValidValues = validValues;
    validValues = newValidValues;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TerraPackage.OPERATION_PROPERTY__VALID_VALUES, oldValidValues, newValidValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidValues(Array newValidValues)
  {
    if (newValidValues != validValues)
    {
      NotificationChain msgs = null;
      if (validValues != null)
        msgs = ((InternalEObject)validValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TerraPackage.OPERATION_PROPERTY__VALID_VALUES, null, msgs);
      if (newValidValues != null)
        msgs = ((InternalEObject)newValidValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TerraPackage.OPERATION_PROPERTY__VALID_VALUES, null, msgs);
      msgs = basicSetValidValues(newValidValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.OPERATION_PROPERTY__VALID_VALUES, newValidValues, newValidValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.OPERATION_PROPERTY__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TerraPackage.OPERATION_PROPERTY__VALID_VALUES:
        return basicSetValidValues(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TerraPackage.OPERATION_PROPERTY__NAME:
        return getName();
      case TerraPackage.OPERATION_PROPERTY__VALID_VALUES:
        return getValidValues();
      case TerraPackage.OPERATION_PROPERTY__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TerraPackage.OPERATION_PROPERTY__NAME:
        setName((OperationPropertyName)newValue);
        return;
      case TerraPackage.OPERATION_PROPERTY__VALID_VALUES:
        setValidValues((Array)newValue);
        return;
      case TerraPackage.OPERATION_PROPERTY__VALUE:
        setValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TerraPackage.OPERATION_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TerraPackage.OPERATION_PROPERTY__VALID_VALUES:
        setValidValues((Array)null);
        return;
      case TerraPackage.OPERATION_PROPERTY__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TerraPackage.OPERATION_PROPERTY__NAME:
        return name != NAME_EDEFAULT;
      case TerraPackage.OPERATION_PROPERTY__VALID_VALUES:
        return validValues != null;
      case TerraPackage.OPERATION_PROPERTY__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //OperationPropertyImpl
