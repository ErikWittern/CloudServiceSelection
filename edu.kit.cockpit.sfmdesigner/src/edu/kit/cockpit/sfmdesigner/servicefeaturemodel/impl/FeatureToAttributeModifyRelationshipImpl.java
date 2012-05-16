/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature To Attribute Modify Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.FeatureToAttributeModifyRelationshipImpl#getTriggeredByServiceFeature <em>Triggered By Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureToAttributeModifyRelationshipImpl extends ModifyRelationshipImpl implements FeatureToAttributeModifyRelationship {
	/**
	 * The cached value of the '{@link #getTriggeredByServiceFeature() <em>Triggered By Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredByServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceFeature triggeredByServiceFeature;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureToAttributeModifyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicefeaturemodelPackage.Literals.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeature getTriggeredByServiceFeature() {
		if (triggeredByServiceFeature != null && triggeredByServiceFeature.eIsProxy()) {
			InternalEObject oldTriggeredByServiceFeature = (InternalEObject)triggeredByServiceFeature;
			triggeredByServiceFeature = (ServiceFeature)eResolveProxy(oldTriggeredByServiceFeature);
			if (triggeredByServiceFeature != oldTriggeredByServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE, oldTriggeredByServiceFeature, triggeredByServiceFeature));
			}
		}
		return triggeredByServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeature basicGetTriggeredByServiceFeature() {
		return triggeredByServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredByServiceFeature(ServiceFeature newTriggeredByServiceFeature) {
		ServiceFeature oldTriggeredByServiceFeature = triggeredByServiceFeature;
		triggeredByServiceFeature = newTriggeredByServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE, oldTriggeredByServiceFeature, triggeredByServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE:
				if (resolve) return getTriggeredByServiceFeature();
				return basicGetTriggeredByServiceFeature();
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
			case ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE:
				setTriggeredByServiceFeature((ServiceFeature)newValue);
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
			case ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE:
				setTriggeredByServiceFeature((ServiceFeature)null);
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
			case ServicefeaturemodelPackage.FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE:
				return triggeredByServiceFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureToAttributeModifyRelationshipImpl
