/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.util.ServicefeaturemodelValidator;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getEvaluatedBy <em>Evaluated By</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceFeature> groups;

	/**
	 * The cached value of the '{@link #getEvaluatedBy() <em>Evaluated By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Preference> evaluatedBy;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> describedBy;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicefeaturemodelPackage.Literals.CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.CONFIGURATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceFeature> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<ServiceFeature>(ServiceFeature.class, this, ServicefeaturemodelPackage.CONFIGURATION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Preference> getEvaluatedBy() {
		if (evaluatedBy == null) {
			evaluatedBy = new EObjectContainmentEList<Preference>(Preference.class, this, ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY);
		}
		return evaluatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Attribute> getDescribedBy() {
		if (describedBy == null) {
			describedBy = new EObjectContainmentEList<Attribute>(Attribute.class, this, ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY);
		}
		return describedBy;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicefeaturemodelPackage.CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostic, Map<Object, Object> context) {
		boolean valid = true;
			if (diagnostic != null) {
				if (getName() == null || getName().length() == 0 ){
					valid = false;
					diagnostic.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 ServicefeaturemodelValidator.DIAGNOSTIC_SOURCE,
							 ServicefeaturemodelValidator.CONFIGURATION__VALIDATE, "Name of Configuration (ID: " + getId()+") is missing",
							 new Object [] { this }));
					}else if(getId() == null || getId().length() == 0){
						valid = false;
						diagnostic.add
							(new BasicDiagnostic
								(Diagnostic.ERROR,
								 ServicefeaturemodelValidator.DIAGNOSTIC_SOURCE,
								 ServicefeaturemodelValidator.CONFIGURATION__VALIDATE, "ID of Configuration (Name: " + getName()+") is missing",
								 new Object [] { this }));	
					}
			}
			return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY:
				return ((InternalEList<?>)getEvaluatedBy()).basicRemove(otherEnd, msgs);
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY:
				return ((InternalEList<?>)getDescribedBy()).basicRemove(otherEnd, msgs);
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
			case ServicefeaturemodelPackage.CONFIGURATION__NAME:
				return getName();
			case ServicefeaturemodelPackage.CONFIGURATION__ID:
				return getId();
			case ServicefeaturemodelPackage.CONFIGURATION__GROUPS:
				return getGroups();
			case ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY:
				return getEvaluatedBy();
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY:
				return getDescribedBy();
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIPTION:
				return getDescription();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicefeaturemodelPackage.CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends ServiceFeature>)newValue);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY:
				getEvaluatedBy().clear();
				getEvaluatedBy().addAll((Collection<? extends Preference>)newValue);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY:
				getDescribedBy().clear();
				getDescribedBy().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
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
			case ServicefeaturemodelPackage.CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__GROUPS:
				getGroups().clear();
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY:
				getEvaluatedBy().clear();
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY:
				getDescribedBy().clear();
				return;
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ServicefeaturemodelPackage.CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicefeaturemodelPackage.CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicefeaturemodelPackage.CONFIGURATION__GROUPS:
				return groups != null && !groups.isEmpty();
			case ServicefeaturemodelPackage.CONFIGURATION__EVALUATED_BY:
				return evaluatedBy != null && !evaluatedBy.isEmpty();
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIBED_BY:
				return describedBy != null && !describedBy.isEmpty();
			case ServicefeaturemodelPackage.CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
