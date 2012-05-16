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
 * A representation of the model object '<em><b>Excludes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes#getExcludesServiceFeature <em>Excludes Service Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getExcludes()
 * @model
 * @generated
 */
public interface Excludes extends EObject {
	/**
	 * Returns the value of the '<em><b>Excludes Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes Service Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes Service Feature</em>' reference.
	 * @see #setExcludesServiceFeature(ServiceFeature)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getExcludes_ExcludesServiceFeature()
	 * @model required="true"
	 * @generated
	 */
	ServiceFeature getExcludesServiceFeature();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes#getExcludesServiceFeature <em>Excludes Service Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excludes Service Feature</em>' reference.
	 * @see #getExcludesServiceFeature()
	 * @generated
	 */
	void setExcludesServiceFeature(ServiceFeature value);

} // Excludes
