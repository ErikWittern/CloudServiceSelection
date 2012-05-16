/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl;


import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.util.ServicefeaturemodelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicefeaturemodelPackageImpl extends EPackageImpl implements ServicefeaturemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalServiceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFeatureDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryServiceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleConfigurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeToAttributeModifyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureToAttributeModifyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationRulesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scaleOrdersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicefeaturemodelPackageImpl() {
		super(eNS_URI, ServicefeaturemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServicefeaturemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicefeaturemodelPackage init() {
		if (isInited) return (ServicefeaturemodelPackage)EPackage.Registry.INSTANCE.getEPackage(ServicefeaturemodelPackage.eNS_URI);

		// Obtain or create and register package
		ServicefeaturemodelPackageImpl theServicefeaturemodelPackage = (ServicefeaturemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicefeaturemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicefeaturemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theServicefeaturemodelPackage.createPackageContents();

		// Initialize created meta-data
		theServicefeaturemodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theServicefeaturemodelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ServicefeaturemodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theServicefeaturemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicefeaturemodelPackage.eNS_URI, theServicefeaturemodelPackage);
		return theServicefeaturemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_RepresentedBy() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Enables() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Has() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFeature() {
		return serviceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_Name() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_Description() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeature_DescribedBy() {
		return (EReference)serviceFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeature_ContainsVariant() {
		return (EReference)serviceFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeature_ContainsRequires() {
		return (EReference)serviceFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeature_ContainsExcludes() {
		return (EReference)serviceFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeature_DecomposesInto() {
		return (EReference)serviceFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_MinAmount() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_MaxAmount() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_MapsToGSMElement() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_AssociatedGSMElement() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_Id() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_FeatureType() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeature_Required() {
		return (EAttribute)serviceFeatureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalServiceFeature() {
		return optionalServiceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_InstantiationValue() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_OfAttributeType() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_ContainsModifyRelationship() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Id() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_RequiresServiceFeature() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludes() {
		return excludesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludes_ExcludesServiceFeature() {
		return (EReference)excludesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOR() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOR_MinFeaturesToChoose() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOR_MaxFeaturesToChoose() {
		return (EAttribute)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOR() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceFeatureDiagram() {
		return serviceFeatureDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceFeatureDiagram_ContainsFeatures() {
		return (EReference)serviceFeatureDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeatureDiagram_Name() {
		return (EAttribute)serviceFeatureDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeatureDiagram_Description() {
		return (EAttribute)serviceFeatureDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceFeatureDiagram_Id() {
		return (EAttribute)serviceFeatureDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Id() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Groups() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_EvaluatedBy() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_DescribedBy() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Description() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreference() {
		return preferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreference_CreationDate() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreference_Value() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreference_Description() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreference_StakeholderGroup() {
		return (EAttribute)preferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariant_Contains() {
		return (EReference)variantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryServiceFeature() {
		return mandatoryServiceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleConfigurations() {
		return possibleConfigurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPossibleConfigurations_Contains() {
		return (EReference)possibleConfigurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeTypes() {
		return attributeTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeTypes_Contains() {
		return (EReference)attributeTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Name() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Domain() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_AggregationRule() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_ScaleOrder() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_ToBeEvaluated() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Description() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_CustomAttributeTypePriority() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Requirement() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyRelationship() {
		return modifyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyRelationship_Name() {
		return (EAttribute)modifyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyRelationship_OrderNumber() {
		return (EAttribute)modifyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyRelationship_Function() {
		return (EAttribute)modifyRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyRelationship_TargetParameterName() {
		return (EAttribute)modifyRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeToAttributeModifyRelationship() {
		return attributeToAttributeModifyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeToAttributeModifyRelationship_TriggerParameterName() {
		return (EAttribute)attributeToAttributeModifyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeToAttributeModifyRelationship_TriggeredByAttribute() {
		return (EReference)attributeToAttributeModifyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureToAttributeModifyRelationship() {
		return featureToAttributeModifyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureToAttributeModifyRelationship_TriggeredByServiceFeature() {
		return (EReference)featureToAttributeModifyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeDomain() {
		return attributeDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationRules() {
		return aggregationRulesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScaleOrders() {
		return scaleOrdersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureTypes() {
		return featureTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicefeaturemodelFactory getServicefeaturemodelFactory() {
		return (ServicefeaturemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__REPRESENTED_BY);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__ID);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__ENABLES);
		createEReference(serviceEClass, SERVICE__HAS);

		serviceFeatureEClass = createEClass(SERVICE_FEATURE);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__NAME);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__DESCRIPTION);
		createEReference(serviceFeatureEClass, SERVICE_FEATURE__DESCRIBED_BY);
		createEReference(serviceFeatureEClass, SERVICE_FEATURE__CONTAINS_VARIANT);
		createEReference(serviceFeatureEClass, SERVICE_FEATURE__CONTAINS_REQUIRES);
		createEReference(serviceFeatureEClass, SERVICE_FEATURE__CONTAINS_EXCLUDES);
		createEReference(serviceFeatureEClass, SERVICE_FEATURE__DECOMPOSES_INTO);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__MIN_AMOUNT);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__MAX_AMOUNT);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__ID);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__FEATURE_TYPE);
		createEAttribute(serviceFeatureEClass, SERVICE_FEATURE__REQUIRED);

		optionalServiceFeatureEClass = createEClass(OPTIONAL_SERVICE_FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__INSTANTIATION_VALUE);
		createEReference(attributeEClass, ATTRIBUTE__OF_ATTRIBUTE_TYPE);
		createEReference(attributeEClass, ATTRIBUTE__CONTAINS_MODIFY_RELATIONSHIP);
		createEAttribute(attributeEClass, ATTRIBUTE__ID);

		requiresEClass = createEClass(REQUIRES);
		createEReference(requiresEClass, REQUIRES__REQUIRES_SERVICE_FEATURE);

		excludesEClass = createEClass(EXCLUDES);
		createEReference(excludesEClass, EXCLUDES__EXCLUDES_SERVICE_FEATURE);

		orEClass = createEClass(OR);
		createEAttribute(orEClass, OR__MIN_FEATURES_TO_CHOOSE);
		createEAttribute(orEClass, OR__MAX_FEATURES_TO_CHOOSE);

		xorEClass = createEClass(XOR);

		serviceFeatureDiagramEClass = createEClass(SERVICE_FEATURE_DIAGRAM);
		createEReference(serviceFeatureDiagramEClass, SERVICE_FEATURE_DIAGRAM__CONTAINS_FEATURES);
		createEAttribute(serviceFeatureDiagramEClass, SERVICE_FEATURE_DIAGRAM__NAME);
		createEAttribute(serviceFeatureDiagramEClass, SERVICE_FEATURE_DIAGRAM__DESCRIPTION);
		createEAttribute(serviceFeatureDiagramEClass, SERVICE_FEATURE_DIAGRAM__ID);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEAttribute(configurationEClass, CONFIGURATION__ID);
		createEReference(configurationEClass, CONFIGURATION__GROUPS);
		createEReference(configurationEClass, CONFIGURATION__EVALUATED_BY);
		createEReference(configurationEClass, CONFIGURATION__DESCRIBED_BY);
		createEAttribute(configurationEClass, CONFIGURATION__DESCRIPTION);

		preferenceEClass = createEClass(PREFERENCE);
		createEAttribute(preferenceEClass, PREFERENCE__CREATION_DATE);
		createEAttribute(preferenceEClass, PREFERENCE__DESCRIPTION);
		createEAttribute(preferenceEClass, PREFERENCE__VALUE);
		createEAttribute(preferenceEClass, PREFERENCE__STAKEHOLDER_GROUP);

		variantEClass = createEClass(VARIANT);
		createEReference(variantEClass, VARIANT__CONTAINS);

		mandatoryServiceFeatureEClass = createEClass(MANDATORY_SERVICE_FEATURE);

		possibleConfigurationsEClass = createEClass(POSSIBLE_CONFIGURATIONS);
		createEReference(possibleConfigurationsEClass, POSSIBLE_CONFIGURATIONS__CONTAINS);

		attributeTypesEClass = createEClass(ATTRIBUTE_TYPES);
		createEReference(attributeTypesEClass, ATTRIBUTE_TYPES__CONTAINS);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DOMAIN);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__AGGREGATION_RULE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SCALE_ORDER);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__TO_BE_EVALUATED);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DESCRIPTION);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__CUSTOM_ATTRIBUTE_TYPE_PRIORITY);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__REQUIREMENT);

		modifyRelationshipEClass = createEClass(MODIFY_RELATIONSHIP);
		createEAttribute(modifyRelationshipEClass, MODIFY_RELATIONSHIP__NAME);
		createEAttribute(modifyRelationshipEClass, MODIFY_RELATIONSHIP__ORDER_NUMBER);
		createEAttribute(modifyRelationshipEClass, MODIFY_RELATIONSHIP__FUNCTION);
		createEAttribute(modifyRelationshipEClass, MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME);

		attributeToAttributeModifyRelationshipEClass = createEClass(ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP);
		createEAttribute(attributeToAttributeModifyRelationshipEClass, ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME);
		createEReference(attributeToAttributeModifyRelationshipEClass, ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE);

		featureToAttributeModifyRelationshipEClass = createEClass(FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP);
		createEReference(featureToAttributeModifyRelationshipEClass, FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE);

		// Create enums
		attributeDomainEEnum = createEEnum(ATTRIBUTE_DOMAIN);
		aggregationRulesEEnum = createEEnum(AGGREGATION_RULES);
		scaleOrdersEEnum = createEEnum(SCALE_ORDERS);
		featureTypesEEnum = createEEnum(FEATURE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optionalServiceFeatureEClass.getESuperTypes().add(this.getServiceFeature());
		orEClass.getESuperTypes().add(this.getVariant());
		xorEClass.getESuperTypes().add(this.getVariant());
		mandatoryServiceFeatureEClass.getESuperTypes().add(this.getServiceFeature());
		attributeToAttributeModifyRelationshipEClass.getESuperTypes().add(this.getModifyRelationship());
		featureToAttributeModifyRelationshipEClass.getESuperTypes().add(this.getModifyRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_RepresentedBy(), this.getServiceFeatureDiagram(), null, "representedBy", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Id(), ecorePackage.getEString(), "id", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Enables(), this.getPossibleConfigurations(), null, "enables", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Has(), this.getAttributeTypes(), null, "has", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceFeatureEClass, ServiceFeature.class, "ServiceFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFeature_DescribedBy(), this.getAttribute(), null, "describedBy", null, 0, -1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFeature_ContainsVariant(), this.getVariant(), null, "containsVariant", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFeature_ContainsRequires(), this.getRequires(), null, "containsRequires", null, 0, -1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFeature_ContainsExcludes(), this.getExcludes(), null, "containsExcludes", null, 0, -1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceFeature_DecomposesInto(), this.getServiceFeature(), null, "decomposesInto", null, 0, -1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_MinAmount(), ecorePackage.getEInt(), "minAmount", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_MaxAmount(), ecorePackage.getEInt(), "maxAmount", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_MapsToGSMElement(), ecorePackage.getEBoolean(), "mapsToGSMElement", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_AssociatedGSMElement(), ecorePackage.getEString(), "associatedGSMElement", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_FeatureType(), this.getFeatureTypes(), "featureType", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeature_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, ServiceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(serviceFeatureEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionalServiceFeatureEClass, OptionalServiceFeature.class, "OptionalServiceFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_InstantiationValue(), ecorePackage.getEString(), "instantiationValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_OfAttributeType(), this.getAttributeType(), null, "ofAttributeType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_ContainsModifyRelationship(), this.getModifyRelationship(), null, "containsModifyRelationship", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Id(), ecorePackage.getEString(), "id", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequires_RequiresServiceFeature(), this.getServiceFeature(), null, "requiresServiceFeature", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludesEClass, Excludes.class, "Excludes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcludes_ExcludesServiceFeature(), this.getServiceFeature(), null, "excludesServiceFeature", null, 1, 1, Excludes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOR_MinFeaturesToChoose(), ecorePackage.getEInt(), "minFeaturesToChoose", null, 0, 1, edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOR_MaxFeaturesToChoose(), ecorePackage.getEInt(), "maxFeaturesToChoose", null, 0, 1, edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xorEClass, edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR.class, "XOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceFeatureDiagramEClass, ServiceFeatureDiagram.class, "ServiceFeatureDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceFeatureDiagram_ContainsFeatures(), this.getServiceFeature(), null, "containsFeatures", null, 0, -1, ServiceFeatureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeatureDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceFeatureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeatureDiagram_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceFeatureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceFeatureDiagram_Id(), ecorePackage.getEString(), "id", null, 0, 1, ServiceFeatureDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(serviceFeatureDiagramEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Groups(), this.getServiceFeature(), null, "groups", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_EvaluatedBy(), this.getPreference(), null, "evaluatedBy", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_DescribedBy(), this.getAttribute(), null, "describedBy", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(configurationEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostic", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreference_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreference_Description(), ecorePackage.getEString(), "description", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreference_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreference_StakeholderGroup(), ecorePackage.getEString(), "stakeholderGroup", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantEClass, Variant.class, "Variant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariant_Contains(), this.getOptionalServiceFeature(), null, "contains", null, 2, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryServiceFeatureEClass, MandatoryServiceFeature.class, "MandatoryServiceFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(possibleConfigurationsEClass, PossibleConfigurations.class, "PossibleConfigurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPossibleConfigurations_Contains(), this.getConfiguration(), null, "contains", null, 0, -1, PossibleConfigurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypesEClass, AttributeTypes.class, "AttributeTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeTypes_Contains(), this.getAttributeType(), null, "contains", null, 0, -1, AttributeTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Domain(), this.getAttributeDomain(), "domain", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_AggregationRule(), this.getAggregationRules(), "aggregationRule", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_ScaleOrder(), this.getScaleOrders(), "scaleOrder", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_ToBeEvaluated(), ecorePackage.getEBoolean(), "toBeEvaluated", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_CustomAttributeTypePriority(), ecorePackage.getEInt(), "customAttributeTypePriority", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Requirement(), ecorePackage.getEString(), "requirement", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyRelationshipEClass, ModifyRelationship.class, "ModifyRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifyRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifyRelationship_OrderNumber(), ecorePackage.getEInt(), "orderNumber", null, 0, 1, ModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifyRelationship_Function(), ecorePackage.getEString(), "function", null, 0, 1, ModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifyRelationship_TargetParameterName(), ecorePackage.getEString(), "targetParameterName", null, 0, 1, ModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeToAttributeModifyRelationshipEClass, AttributeToAttributeModifyRelationship.class, "AttributeToAttributeModifyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeToAttributeModifyRelationship_TriggerParameterName(), ecorePackage.getEString(), "triggerParameterName", null, 0, 1, AttributeToAttributeModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeToAttributeModifyRelationship_TriggeredByAttribute(), this.getAttribute(), null, "triggeredByAttribute", null, 1, 1, AttributeToAttributeModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureToAttributeModifyRelationshipEClass, FeatureToAttributeModifyRelationship.class, "FeatureToAttributeModifyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureToAttributeModifyRelationship_TriggeredByServiceFeature(), this.getServiceFeature(), null, "triggeredByServiceFeature", null, 1, 1, FeatureToAttributeModifyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeDomainEEnum, AttributeDomain.class, "AttributeDomain");
		addEEnumLiteral(attributeDomainEEnum, AttributeDomain.CONTINUOUS);
		addEEnumLiteral(attributeDomainEEnum, AttributeDomain.BOOLEAN);

		initEEnum(aggregationRulesEEnum, AggregationRules.class, "AggregationRules");
		addEEnumLiteral(aggregationRulesEEnum, AggregationRules.SUM);
		addEEnumLiteral(aggregationRulesEEnum, AggregationRules.PRODUCT);
		addEEnumLiteral(aggregationRulesEEnum, AggregationRules.AT_LEAST_ONCE);
		addEEnumLiteral(aggregationRulesEEnum, AggregationRules.MINIMUM);
		addEEnumLiteral(aggregationRulesEEnum, AggregationRules.MAXIMUM);

		initEEnum(scaleOrdersEEnum, ScaleOrders.class, "ScaleOrders");
		addEEnumLiteral(scaleOrdersEEnum, ScaleOrders.HIGHER_IS_BETTER);
		addEEnumLiteral(scaleOrdersEEnum, ScaleOrders.LOWER_IS_BETTER);
		addEEnumLiteral(scaleOrdersEEnum, ScaleOrders.EXISTENCE_IS_BETTER);

		initEEnum(featureTypesEEnum, FeatureTypes.class, "FeatureTypes");
		addEEnumLiteral(featureTypesEEnum, FeatureTypes.GROUPING_FEATURE);
		addEEnumLiteral(featureTypesEEnum, FeatureTypes.ABSTRACT_FEATURE);
		addEEnumLiteral(featureTypesEEnum, FeatureTypes.INSTANCE_FEATURE);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicefeaturemodelPackageImpl
