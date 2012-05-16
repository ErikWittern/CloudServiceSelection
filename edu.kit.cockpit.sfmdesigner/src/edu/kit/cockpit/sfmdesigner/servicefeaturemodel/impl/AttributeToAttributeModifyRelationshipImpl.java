/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute To Attribute Modify Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl#getTriggerParameterName <em>Trigger Parameter Name</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl#getTriggeredByAttribute <em>Triggered By Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeToAttributeModifyRelationshipImpl extends ModifyRelationshipImpl implements AttributeToAttributeModifyRelationship {
	/**
	 * The default value of the '{@link #getTriggerParameterName() <em>Trigger Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerParameterName() <em>Trigger Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerParameterName()
	 * @generated
	 * @ordered
	 */
	protected String triggerParameterName = TRIGGER_PARAMETER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggeredByAttribute() <em>Triggered By Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredByAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute triggeredByAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeToAttributeModifyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicefeaturemodelPackage.Literals.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerParameterName() {
		return triggerParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerParameterName(String newTriggerParameterName) {
		String oldTriggerParameterName = triggerParameterName;
		triggerParameterName = newTriggerParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME, oldTriggerParameterName, triggerParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTriggeredByAttribute() {
		if (triggeredByAttribute != null && triggeredByAttribute.eIsProxy()) {
			InternalEObject oldTriggeredByAttribute = (InternalEObject)triggeredByAttribute;
			triggeredByAttribute = (Attribute)eResolveProxy(oldTriggeredByAttribute);
			if (triggeredByAttribute != oldTriggeredByAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE, oldTriggeredByAttribute, triggeredByAttribute));
			}
		}
		return triggeredByAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTriggeredByAttribute() {
		return triggeredByAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredByAttribute(Attribute newTriggeredByAttribute) {
		Attribute oldTriggeredByAttribute = triggeredByAttribute;
		triggeredByAttribute = newTriggeredByAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE, oldTriggeredByAttribute, triggeredByAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME:
				return getTriggerParameterName();
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE:
				if (resolve) return getTriggeredByAttribute();
				return basicGetTriggeredByAttribute();
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
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME:
				setTriggerParameterName((String)newValue);
				return;
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE:
				setTriggeredByAttribute((Attribute)newValue);
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
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME:
				setTriggerParameterName(TRIGGER_PARAMETER_NAME_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE:
				setTriggeredByAttribute((Attribute)null);
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
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME:
				return TRIGGER_PARAMETER_NAME_EDEFAULT == null ? triggerParameterName != null : !TRIGGER_PARAMETER_NAME_EDEFAULT.equals(triggerParameterName);
			case ServicefeaturemodelPackage.ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE:
				return triggeredByAttribute != null;
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
		result.append(" (triggerParameterName: ");
		result.append(triggerParameterName);
		result.append(')');
		return result.toString();
	}

} //AttributeToAttributeModifyRelationshipImpl
