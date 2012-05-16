/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.util;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage
 * @generated
 */
public class ServicefeaturemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicefeaturemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicefeaturemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicefeaturemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicefeaturemodelSwitch<Adapter> modelSwitch =
		new ServicefeaturemodelSwitch<Adapter>() {
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceFeature(ServiceFeature object) {
				return createServiceFeatureAdapter();
			}
			@Override
			public Adapter caseOptionalServiceFeature(OptionalServiceFeature object) {
				return createOptionalServiceFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseRequires(Requires object) {
				return createRequiresAdapter();
			}
			@Override
			public Adapter caseExcludes(Excludes object) {
				return createExcludesAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter caseXOR(XOR object) {
				return createXORAdapter();
			}
			@Override
			public Adapter caseServiceFeatureDiagram(ServiceFeatureDiagram object) {
				return createServiceFeatureDiagramAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter casePreference(Preference object) {
				return createPreferenceAdapter();
			}
			@Override
			public Adapter caseVariant(Variant object) {
				return createVariantAdapter();
			}
			@Override
			public Adapter caseMandatoryServiceFeature(MandatoryServiceFeature object) {
				return createMandatoryServiceFeatureAdapter();
			}
			@Override
			public Adapter casePossibleConfigurations(PossibleConfigurations object) {
				return createPossibleConfigurationsAdapter();
			}
			@Override
			public Adapter caseAttributeTypes(AttributeTypes object) {
				return createAttributeTypesAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseModifyRelationship(ModifyRelationship object) {
				return createModifyRelationshipAdapter();
			}
			@Override
			public Adapter caseAttributeToAttributeModifyRelationship(AttributeToAttributeModifyRelationship object) {
				return createAttributeToAttributeModifyRelationshipAdapter();
			}
			@Override
			public Adapter caseFeatureToAttributeModifyRelationship(FeatureToAttributeModifyRelationship object) {
				return createFeatureToAttributeModifyRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
	 * @generated
	 */
	public Adapter createServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature <em>Optional Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature
	 * @generated
	 */
	public Adapter createOptionalServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires
	 * @generated
	 */
	public Adapter createRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes
	 * @generated
	 */
	public Adapter createExcludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram <em>Service Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram
	 * @generated
	 */
	public Adapter createServiceFeatureDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference
	 * @generated
	 */
	public Adapter createPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature <em>Mandatory Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature
	 * @generated
	 */
	public Adapter createMandatoryServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations <em>Possible Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations
	 * @generated
	 */
	public Adapter createPossibleConfigurationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes <em>Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes
	 * @generated
	 */
	public Adapter createAttributeTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship <em>Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship
	 * @generated
	 */
	public Adapter createModifyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship <em>Attribute To Attribute Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship
	 * @generated
	 */
	public Adapter createAttributeToAttributeModifyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship <em>Feature To Attribute Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship
	 * @generated
	 */
	public Adapter createFeatureToAttributeModifyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServicefeaturemodelAdapterFactory
