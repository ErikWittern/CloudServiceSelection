/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires#getRequiresServiceFeature <em>Requires Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getRequires()
 * @model
 * @generated
 */
public interface Requires extends EObject {
	/**
	 * Returns the value of the '<em><b>Requires Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Service Feature</em>' reference.
	 * @see #setRequiresServiceFeature(ServiceFeature)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getRequires_RequiresServiceFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceFeature getRequiresServiceFeature();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires#getRequiresServiceFeature <em>Requires Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Service Feature</em>' reference.
	 * @see #getRequiresServiceFeature()
	 * @generated
	 */
	void setRequiresServiceFeature(ServiceFeature value);

} // Requires
