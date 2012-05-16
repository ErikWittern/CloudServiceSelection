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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getInstantiationValue <em>Instantiation Value</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getOfAttributeType <em>Of Attribute Type</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getContainsModifyRelationship <em>Contains Modify Relationship</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Instantiation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Value</em>' attribute.
	 * @see #setInstantiationValue(String)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttribute_InstantiationValue()
	 * @model
	 * @generated
	 */
	String getInstantiationValue();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getInstantiationValue <em>Instantiation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation Value</em>' attribute.
	 * @see #getInstantiationValue()
	 * @generated
	 */
	void setInstantiationValue(String value);

	/**
	 * Returns the value of the '<em><b>Of Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Attribute Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Attribute Type</em>' reference.
	 * @see #setOfAttributeType(AttributeType)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttribute_OfAttributeType()
	 * @model required="true"
	 * @generated
	 */
	AttributeType getOfAttributeType();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getOfAttributeType <em>Of Attribute Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Attribute Type</em>' reference.
	 * @see #getOfAttributeType()
	 * @generated
	 */
	void setOfAttributeType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Contains Modify Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Modify Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Modify Relationship</em>' containment reference list.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttribute_ContainsModifyRelationship()
	 * @model containment="true"
	 * @generated
	 */
	List<ModifyRelationship> getContainsModifyRelationship();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getAttribute_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Attribute
