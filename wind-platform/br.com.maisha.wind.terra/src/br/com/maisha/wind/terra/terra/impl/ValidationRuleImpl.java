/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.com.maisha.wind.terra.terra.impl;

import br.com.maisha.wind.terra.terra.ValidationRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl#getMessageKey <em>Message Key</em>}</li>
 *   <li>{@link br.com.maisha.wind.terra.terra.impl.ValidationRuleImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidationRuleImpl extends MinimalEObjectImpl.Container implements ValidationRule {
	/**
	 * The default value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageKey() <em>Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageKey()
	 * @generated
	 * @ordered
	 */
	protected String messageKey = MESSAGE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraPackageImpl.Literals.VALIDATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageKey() {
		return messageKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageKey(String newMessageKey) {
		String oldMessageKey = messageKey;
		messageKey = newMessageKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerraPackageImpl.VALIDATION_RULE__MESSAGE_KEY, oldMessageKey, messageKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerraPackageImpl.VALIDATION_RULE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerraPackageImpl.VALIDATION_RULE__MESSAGE_KEY:
				return getMessageKey();
			case TerraPackageImpl.VALIDATION_RULE__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TerraPackageImpl.VALIDATION_RULE__MESSAGE_KEY:
				setMessageKey((String)newValue);
				return;
			case TerraPackageImpl.VALIDATION_RULE__EXPRESSION:
				setExpression((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TerraPackageImpl.VALIDATION_RULE__MESSAGE_KEY:
				setMessageKey(MESSAGE_KEY_EDEFAULT);
				return;
			case TerraPackageImpl.VALIDATION_RULE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TerraPackageImpl.VALIDATION_RULE__MESSAGE_KEY:
				return MESSAGE_KEY_EDEFAULT == null ? messageKey != null : !MESSAGE_KEY_EDEFAULT.equals(messageKey);
			case TerraPackageImpl.VALIDATION_RULE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (messageKey: ");
		result.append(messageKey);
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ValidationRuleImpl
