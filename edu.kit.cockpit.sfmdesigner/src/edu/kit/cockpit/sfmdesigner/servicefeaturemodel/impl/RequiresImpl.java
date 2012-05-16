/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.RequiresImpl#getRequiresServiceFeature <em>Requires Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresImpl extends EObjectImpl implements Requires {
	/**
	 * The cached value of the '{@link #getRequiresServiceFeature() <em>Requires Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresServiceFeature()
	 * @generated
	 * @ordered
	 */
	protected ServiceFeature requiresServiceFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicefeaturemodelPackage.Literals.REQUIRES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeature getRequiresServiceFeature() {
		if (requiresServiceFeature != null && requiresServiceFeature.eIsProxy()) {
			InternalEObject oldRequiresServiceFeature = (InternalEObject)requiresServiceFeature;
			requiresServiceFeature = (ServiceFeature)eResolveProxy(oldRequiresServiceFeature);
			if (requiresServiceFeature != oldRequiresServiceFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE, oldRequiresServiceFeature, requiresServiceFeature));
			}
		}
		return requiresServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeature basicGetRequiresServiceFeature() {
		return requiresServiceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresServiceFeature(ServiceFeature newRequiresServiceFeature) {
		ServiceFeature oldRequiresServiceFeature = requiresServiceFeature;
		requiresServiceFeature = newRequiresServiceFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE, oldRequiresServiceFeature, requiresServiceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE:
				if (resolve) return getRequiresServiceFeature();
				return basicGetRequiresServiceFeature();
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
			case ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE:
				setRequiresServiceFeature((ServiceFeature)newValue);
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
			case ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE:
				setRequiresServiceFeature((ServiceFeature)null);
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
			case ServicefeaturemodelPackage.REQUIRES__REQUIRES_SERVICE_FEATURE:
				return requiresServiceFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiresImpl
