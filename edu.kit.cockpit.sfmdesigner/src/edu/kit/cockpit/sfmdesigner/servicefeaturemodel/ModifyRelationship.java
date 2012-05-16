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
 * A representation of the model object '<em><b>Modify Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getOrderNumber <em>Order Number</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getFunction <em>Function</em>}</li>
 *   <li>{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getTargetParameterName <em>Target Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getModifyRelationship()
 * @model abstract="true"
 * @generated
 */
public interface ModifyRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getModifyRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number</em>' attribute.
	 * @see #setOrderNumber(int)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getModifyRelationship_OrderNumber()
	 * @model
	 * @generated
	 */
	int getOrderNumber();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getOrderNumber <em>Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number</em>' attribute.
	 * @see #getOrderNumber()
	 * @generated
	 */
	void setOrderNumber(int value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getModifyRelationship_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Target Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameter Name</em>' attribute.
	 * @see #setTargetParameterName(String)
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#getModifyRelationship_TargetParameterName()
	 * @model
	 * @generated
	 */
	String getTargetParameterName();

	/**
	 * Sets the value of the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getTargetParameterName <em>Target Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parameter Name</em>' attribute.
	 * @see #getTargetParameterName()
	 * @generated
	 */
	void setTargetParameterName(String value);

} // ModifyRelationship
