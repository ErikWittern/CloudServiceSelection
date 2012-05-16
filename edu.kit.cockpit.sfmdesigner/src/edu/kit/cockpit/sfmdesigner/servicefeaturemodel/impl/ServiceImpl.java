/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getRepresentedBy <em>Represented By</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getEnables <em>Enables</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The cached value of the '{@link #getRepresentedBy() <em>Represented By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedBy()
	 * @generated
	 * @ordered
	 */
	protected ServiceFeatureDiagram representedBy;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getEnables() <em>Enables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnables()
	 * @generated
	 * @ordered
	 */
	protected PossibleConfigurations enables;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypes has;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicefeaturemodelPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFeatureDiagram getRepresentedBy() {
		return representedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedBy(ServiceFeatureDiagram newRepresentedBy, NotificationChain msgs) {
		ServiceFeatureDiagram oldRepresentedBy = representedBy;
		representedBy = newRepresentedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY, oldRepresentedBy, newRepresentedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedBy(ServiceFeatureDiagram newRepresentedBy) {
		if (newRepresentedBy != representedBy) {
			NotificationChain msgs = null;
			if (representedBy != null)
				msgs = ((InternalEObject)representedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY, null, msgs);
			if (newRepresentedBy != null)
				msgs = ((InternalEObject)newRepresentedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY, null, msgs);
			msgs = basicSetRepresentedBy(newRepresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY, newRepresentedBy, newRepresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__ID, oldId, id));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleConfigurations getEnables() {
		return enables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnables(PossibleConfigurations newEnables, NotificationChain msgs) {
		PossibleConfigurations oldEnables = enables;
		enables = newEnables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__ENABLES, oldEnables, newEnables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnables(PossibleConfigurations newEnables) {
		if (newEnables != enables) {
			NotificationChain msgs = null;
			if (enables != null)
				msgs = ((InternalEObject)enables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__ENABLES, null, msgs);
			if (newEnables != null)
				msgs = ((InternalEObject)newEnables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__ENABLES, null, msgs);
			msgs = basicSetEnables(newEnables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__ENABLES, newEnables, newEnables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypes getHas() {
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas(AttributeTypes newHas, NotificationChain msgs) {
		AttributeTypes oldHas = has;
		has = newHas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__HAS, oldHas, newHas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas(AttributeTypes newHas) {
		if (newHas != has) {
			NotificationChain msgs = null;
			if (has != null)
				msgs = ((InternalEObject)has).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__HAS, null, msgs);
			if (newHas != null)
				msgs = ((InternalEObject)newHas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicefeaturemodelPackage.SERVICE__HAS, null, msgs);
			msgs = basicSetHas(newHas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.SERVICE__HAS, newHas, newHas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY:
				return basicSetRepresentedBy(null, msgs);
			case ServicefeaturemodelPackage.SERVICE__ENABLES:
				return basicSetEnables(null, msgs);
			case ServicefeaturemodelPackage.SERVICE__HAS:
				return basicSetHas(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY:
				return getRepresentedBy();
			case ServicefeaturemodelPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case ServicefeaturemodelPackage.SERVICE__ID:
				return getId();
			case ServicefeaturemodelPackage.SERVICE__NAME:
				return getName();
			case ServicefeaturemodelPackage.SERVICE__ENABLES:
				return getEnables();
			case ServicefeaturemodelPackage.SERVICE__HAS:
				return getHas();
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
			case ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY:
				setRepresentedBy((ServiceFeatureDiagram)newValue);
				return;
			case ServicefeaturemodelPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ServicefeaturemodelPackage.SERVICE__ID:
				setId((String)newValue);
				return;
			case ServicefeaturemodelPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case ServicefeaturemodelPackage.SERVICE__ENABLES:
				setEnables((PossibleConfigurations)newValue);
				return;
			case ServicefeaturemodelPackage.SERVICE__HAS:
				setHas((AttributeTypes)newValue);
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
			case ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY:
				setRepresentedBy((ServiceFeatureDiagram)null);
				return;
			case ServicefeaturemodelPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.SERVICE__ENABLES:
				setEnables((PossibleConfigurations)null);
				return;
			case ServicefeaturemodelPackage.SERVICE__HAS:
				setHas((AttributeTypes)null);
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
			case ServicefeaturemodelPackage.SERVICE__REPRESENTED_BY:
				return representedBy != null;
			case ServicefeaturemodelPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ServicefeaturemodelPackage.SERVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicefeaturemodelPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicefeaturemodelPackage.SERVICE__ENABLES:
				return enables != null;
			case ServicefeaturemodelPackage.SERVICE__HAS:
				return has != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
