/**
 * <copyright>
 * </copyright>
 *
 */
package br.com.maisha.wind.terra.impl;

import br.com.maisha.wind.terra.Attribute;
import br.com.maisha.wind.terra.DomainObject;
import br.com.maisha.wind.terra.Import;
import br.com.maisha.wind.terra.ObjectProperty;
import br.com.maisha.wind.terra.Operation;
import br.com.maisha.wind.terra.PackageDeclaration;
import br.com.maisha.wind.terra.TerraPackage;
import br.com.maisha.wind.terra.Validation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.impl.DomainObjectImpl#getValidations <em>Validations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainObjectImpl extends MinimalEObjectImpl.Container implements DomainObject
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected PackageDeclaration package_;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ObjectProperty> properties;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The cached value of the '{@link #getValidations() <em>Validations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidations()
   * @generated
   * @ordered
   */
  protected EList<Validation> validations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainObjectImpl()
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
    return TerraPackage.Literals.DOMAIN_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(PackageDeclaration newPackage, NotificationChain msgs)
  {
    PackageDeclaration oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TerraPackage.DOMAIN_OBJECT__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(PackageDeclaration newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TerraPackage.DOMAIN_OBJECT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TerraPackage.DOMAIN_OBJECT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.DOMAIN_OBJECT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, TerraPackage.DOMAIN_OBJECT__IMPORTS);
    }
    return imports;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.DOMAIN_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TerraPackage.DOMAIN_OBJECT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ObjectProperty>(ObjectProperty.class, this, TerraPackage.DOMAIN_OBJECT__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TerraPackage.DOMAIN_OBJECT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, TerraPackage.DOMAIN_OBJECT__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Validation> getValidations()
  {
    if (validations == null)
    {
      validations = new EObjectContainmentEList<Validation>(Validation.class, this, TerraPackage.DOMAIN_OBJECT__VALIDATIONS);
    }
    return validations;
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
      case TerraPackage.DOMAIN_OBJECT__PACKAGE:
        return basicSetPackage(null, msgs);
      case TerraPackage.DOMAIN_OBJECT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case TerraPackage.DOMAIN_OBJECT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case TerraPackage.DOMAIN_OBJECT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TerraPackage.DOMAIN_OBJECT__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
      case TerraPackage.DOMAIN_OBJECT__VALIDATIONS:
        return ((InternalEList<?>)getValidations()).basicRemove(otherEnd, msgs);
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
      case TerraPackage.DOMAIN_OBJECT__PACKAGE:
        return getPackage();
      case TerraPackage.DOMAIN_OBJECT__IMPORTS:
        return getImports();
      case TerraPackage.DOMAIN_OBJECT__NAME:
        return getName();
      case TerraPackage.DOMAIN_OBJECT__LABEL:
        return getLabel();
      case TerraPackage.DOMAIN_OBJECT__PROPERTIES:
        return getProperties();
      case TerraPackage.DOMAIN_OBJECT__ATTRIBUTES:
        return getAttributes();
      case TerraPackage.DOMAIN_OBJECT__OPERATIONS:
        return getOperations();
      case TerraPackage.DOMAIN_OBJECT__VALIDATIONS:
        return getValidations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TerraPackage.DOMAIN_OBJECT__PACKAGE:
        setPackage((PackageDeclaration)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__NAME:
        setName((String)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__LABEL:
        setLabel((String)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ObjectProperty>)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case TerraPackage.DOMAIN_OBJECT__VALIDATIONS:
        getValidations().clear();
        getValidations().addAll((Collection<? extends Validation>)newValue);
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
      case TerraPackage.DOMAIN_OBJECT__PACKAGE:
        setPackage((PackageDeclaration)null);
        return;
      case TerraPackage.DOMAIN_OBJECT__IMPORTS:
        getImports().clear();
        return;
      case TerraPackage.DOMAIN_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TerraPackage.DOMAIN_OBJECT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TerraPackage.DOMAIN_OBJECT__PROPERTIES:
        getProperties().clear();
        return;
      case TerraPackage.DOMAIN_OBJECT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TerraPackage.DOMAIN_OBJECT__OPERATIONS:
        getOperations().clear();
        return;
      case TerraPackage.DOMAIN_OBJECT__VALIDATIONS:
        getValidations().clear();
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
      case TerraPackage.DOMAIN_OBJECT__PACKAGE:
        return package_ != null;
      case TerraPackage.DOMAIN_OBJECT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case TerraPackage.DOMAIN_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TerraPackage.DOMAIN_OBJECT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TerraPackage.DOMAIN_OBJECT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case TerraPackage.DOMAIN_OBJECT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TerraPackage.DOMAIN_OBJECT__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case TerraPackage.DOMAIN_OBJECT__VALIDATIONS:
        return validations != null && !validations.isEmpty();
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
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //DomainObjectImpl
