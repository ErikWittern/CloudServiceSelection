/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttributeTypes()
 * @model
 * @generated
 */
public interface AttributeTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttributeTypes_Contains()
	 * @model containment="true"
	 * @generated
	 */
	List<AttributeType> getContains();

} // AttributeTypes
