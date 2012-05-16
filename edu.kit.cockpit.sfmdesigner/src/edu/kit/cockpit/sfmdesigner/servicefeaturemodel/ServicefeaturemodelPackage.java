/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface ServicefeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicefeaturemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://servicefeaturemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "servicefeaturemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicefeaturemodelPackage eINSTANCE = edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Represented By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REPRESENTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Enables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENABLES = 4;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HAS = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureImpl <em>Service Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getServiceFeature()
	 * @generated
	 */
	int SERVICE_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__DESCRIBED_BY = 2;

	/**
	 * The feature id for the '<em><b>Contains Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__CONTAINS_VARIANT = 3;

	/**
	 * The feature id for the '<em><b>Contains Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__CONTAINS_REQUIRES = 4;

	/**
	 * The feature id for the '<em><b>Contains Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__CONTAINS_EXCLUDES = 5;

	/**
	 * The feature id for the '<em><b>Decomposes Into</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__DECOMPOSES_INTO = 6;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__MIN_AMOUNT = 7;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__MAX_AMOUNT = 8;

	/**
	 * The feature id for the '<em><b>Maps To GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Associated GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__ID = 11;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__FEATURE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE__REQUIRED = 13;

	/**
	 * The number of structural features of the '<em>Service Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.OptionalServiceFeatureImpl <em>Optional Service Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.OptionalServiceFeatureImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getOptionalServiceFeature()
	 * @generated
	 */
	int OPTIONAL_SERVICE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__NAME = SERVICE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__DESCRIPTION = SERVICE_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__DESCRIBED_BY = SERVICE_FEATURE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Contains Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__CONTAINS_VARIANT = SERVICE_FEATURE__CONTAINS_VARIANT;

	/**
	 * The feature id for the '<em><b>Contains Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__CONTAINS_REQUIRES = SERVICE_FEATURE__CONTAINS_REQUIRES;

	/**
	 * The feature id for the '<em><b>Contains Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__CONTAINS_EXCLUDES = SERVICE_FEATURE__CONTAINS_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Decomposes Into</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__DECOMPOSES_INTO = SERVICE_FEATURE__DECOMPOSES_INTO;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__MIN_AMOUNT = SERVICE_FEATURE__MIN_AMOUNT;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__MAX_AMOUNT = SERVICE_FEATURE__MAX_AMOUNT;

	/**
	 * The feature id for the '<em><b>Maps To GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT = SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Associated GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT = SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__ID = SERVICE_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__FEATURE_TYPE = SERVICE_FEATURE__FEATURE_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE__REQUIRED = SERVICE_FEATURE__REQUIRED;

	/**
	 * The number of structural features of the '<em>Optional Service Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_SERVICE_FEATURE_FEATURE_COUNT = SERVICE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Instantiation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INSTANTIATION_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Of Attribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OF_ATTRIBUTE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Contains Modify Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINS_MODIFY_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.RequiresImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 4;

	/**
	 * The feature id for the '<em><b>Requires Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__REQUIRES_SERVICE_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ExcludesImpl <em>Excludes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ExcludesImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getExcludes()
	 * @generated
	 */
	int EXCLUDES = 5;

	/**
	 * The feature id for the '<em><b>Excludes Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__EXCLUDES_SERVICE_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.VariantImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 11;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ORImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getOR()
	 * @generated
	 */
	int OR = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONTAINS = VARIANT__CONTAINS;

	/**
	 * The feature id for the '<em><b>Min Features To Choose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__MIN_FEATURES_TO_CHOOSE = VARIANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Features To Choose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__MAX_FEATURES_TO_CHOOSE = VARIANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.XORImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 7;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONTAINS = VARIANT__CONTAINS;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl <em>Service Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getServiceFeatureDiagram()
	 * @generated
	 */
	int SERVICE_FEATURE_DIAGRAM = 8;

	/**
	 * The feature id for the '<em><b>Contains Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_DIAGRAM__CONTAINS_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_DIAGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_DIAGRAM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_DIAGRAM__ID = 3;

	/**
	 * The number of structural features of the '<em>Service Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Evaluated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__EVALUATED_BY = 3;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIBED_BY = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PreferenceImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getPreference()
	 * @generated
	 */
	int PREFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__CREATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Stakeholder Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE__STAKEHOLDER_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.MandatoryServiceFeatureImpl <em>Mandatory Service Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.MandatoryServiceFeatureImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getMandatoryServiceFeature()
	 * @generated
	 */
	int MANDATORY_SERVICE_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__NAME = SERVICE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__DESCRIPTION = SERVICE_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Described By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__DESCRIBED_BY = SERVICE_FEATURE__DESCRIBED_BY;

	/**
	 * The feature id for the '<em><b>Contains Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__CONTAINS_VARIANT = SERVICE_FEATURE__CONTAINS_VARIANT;

	/**
	 * The feature id for the '<em><b>Contains Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__CONTAINS_REQUIRES = SERVICE_FEATURE__CONTAINS_REQUIRES;

	/**
	 * The feature id for the '<em><b>Contains Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__CONTAINS_EXCLUDES = SERVICE_FEATURE__CONTAINS_EXCLUDES;

	/**
	 * The feature id for the '<em><b>Decomposes Into</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__DECOMPOSES_INTO = SERVICE_FEATURE__DECOMPOSES_INTO;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__MIN_AMOUNT = SERVICE_FEATURE__MIN_AMOUNT;

	/**
	 * The feature id for the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__MAX_AMOUNT = SERVICE_FEATURE__MAX_AMOUNT;

	/**
	 * The feature id for the '<em><b>Maps To GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT = SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Associated GSM Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT = SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__ID = SERVICE_FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__FEATURE_TYPE = SERVICE_FEATURE__FEATURE_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE__REQUIRED = SERVICE_FEATURE__REQUIRED;

	/**
	 * The number of structural features of the '<em>Mandatory Service Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_SERVICE_FEATURE_FEATURE_COUNT = SERVICE_FEATURE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PossibleConfigurationsImpl <em>Possible Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PossibleConfigurationsImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getPossibleConfigurations()
	 * @generated
	 */
	int POSSIBLE_CONFIGURATIONS = 13;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_CONFIGURATIONS__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Possible Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_CONFIGURATIONS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypesImpl <em>Attribute Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypesImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeTypes()
	 * @generated
	 */
	int ATTRIBUTE_TYPES = 14;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPES__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Attribute Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypeImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Aggregation Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__AGGREGATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Scale Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__SCALE_ORDER = 3;

	/**
	 * The feature id for the '<em><b>To Be Evaluated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__TO_BE_EVALUATED = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Custom Attribute Type Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__CUSTOM_ATTRIBUTE_TYPE_PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__REQUIREMENT = 7;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ModifyRelationshipImpl <em>Modify Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ModifyRelationshipImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getModifyRelationship()
	 * @generated
	 */
	int MODIFY_RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RELATIONSHIP__ORDER_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RELATIONSHIP__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Target Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME = 3;

	/**
	 * The number of structural features of the '<em>Modify Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl <em>Attribute To Attribute Modify Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeToAttributeModifyRelationship()
	 * @generated
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__NAME = MODIFY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__ORDER_NUMBER = MODIFY_RELATIONSHIP__ORDER_NUMBER;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__FUNCTION = MODIFY_RELATIONSHIP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Target Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME = MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Trigger Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME = MODIFY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggered By Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE = MODIFY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute To Attribute Modify Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP_FEATURE_COUNT = MODIFY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.FeatureToAttributeModifyRelationshipImpl <em>Feature To Attribute Modify Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.FeatureToAttributeModifyRelationshipImpl
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getFeatureToAttributeModifyRelationship()
	 * @generated
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__NAME = MODIFY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__ORDER_NUMBER = MODIFY_RELATIONSHIP__ORDER_NUMBER;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__FUNCTION = MODIFY_RELATIONSHIP__FUNCTION;

	/**
	 * The feature id for the '<em><b>Target Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME = MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Triggered By Service Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE = MODIFY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature To Attribute Modify Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP_FEATURE_COUNT = MODIFY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain <em>Attribute Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeDomain()
	 * @generated
	 */
	int ATTRIBUTE_DOMAIN = 19;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules <em>Aggregation Rules</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAggregationRules()
	 * @generated
	 */
	int AGGREGATION_RULES = 20;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders <em>Scale Orders</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getScaleOrders()
	 * @generated
	 */
	int SCALE_ORDERS = 21;

	/**
	 * The meta object id for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes <em>Feature Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getFeatureTypes()
	 * @generated
	 */
	int FEATURE_TYPES = 22;

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getRepresentedBy <em>Represented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Represented By</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getRepresentedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RepresentedBy();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getEnables <em>Enables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enables</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getEnables()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Enables();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service#getHas()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Has();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
	 * @generated
	 */
	EClass getServiceFeature();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getName()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDescription()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Described By</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDescribedBy()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_DescribedBy();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsVariant <em>Contains Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains Variant</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsVariant()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_ContainsVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsRequires <em>Contains Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Requires</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsRequires()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_ContainsRequires();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsExcludes <em>Contains Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Excludes</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getContainsExcludes()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_ContainsExcludes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDecomposesInto <em>Decomposes Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decomposes Into</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getDecomposesInto()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EReference getServiceFeature_DecomposesInto();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getMinAmount <em>Min Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Amount</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getMinAmount()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_MinAmount();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getMaxAmount <em>Max Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Amount</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getMaxAmount()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_MaxAmount();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#isMapsToGSMElement <em>Maps To GSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps To GSM Element</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#isMapsToGSMElement()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_MapsToGSMElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getAssociatedGSMElement <em>Associated GSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated GSM Element</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getAssociatedGSMElement()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_AssociatedGSMElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getId()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#getFeatureType()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_FeatureType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature#isRequired()
	 * @see #getServiceFeature()
	 * @generated
	 */
	EAttribute getServiceFeature_Required();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature <em>Optional Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature
	 * @generated
	 */
	EClass getOptionalServiceFeature();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getInstantiationValue <em>Instantiation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiation Value</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getInstantiationValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_InstantiationValue();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getOfAttributeType <em>Of Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Attribute Type</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getOfAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_OfAttributeType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getContainsModifyRelationship <em>Contains Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Modify Relationship</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getContainsModifyRelationship()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ContainsModifyRelationship();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires#getRequiresServiceFeature <em>Requires Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requires Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires#getRequiresServiceFeature()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_RequiresServiceFeature();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes
	 * @generated
	 */
	EClass getExcludes();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes#getExcludesServiceFeature <em>Excludes Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Excludes Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes#getExcludesServiceFeature()
	 * @see #getExcludes()
	 * @generated
	 */
	EReference getExcludes_ExcludesServiceFeature();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR#getMinFeaturesToChoose <em>Min Features To Choose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Features To Choose</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR#getMinFeaturesToChoose()
	 * @see #getOR()
	 * @generated
	 */
	EAttribute getOR_MinFeaturesToChoose();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR#getMaxFeaturesToChoose <em>Max Features To Choose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Features To Choose</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR#getMaxFeaturesToChoose()
	 * @see #getOR()
	 * @generated
	 */
	EAttribute getOR_MaxFeaturesToChoose();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram <em>Service Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Feature Diagram</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram
	 * @generated
	 */
	EClass getServiceFeatureDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getContainsFeatures <em>Contains Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Features</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getContainsFeatures()
	 * @see #getServiceFeatureDiagram()
	 * @generated
	 */
	EReference getServiceFeatureDiagram_ContainsFeatures();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getName()
	 * @see #getServiceFeatureDiagram()
	 * @generated
	 */
	EAttribute getServiceFeatureDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getDescription()
	 * @see #getServiceFeatureDiagram()
	 * @generated
	 */
	EAttribute getServiceFeatureDiagram_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram#getId()
	 * @see #getServiceFeatureDiagram()
	 * @generated
	 */
	EAttribute getServiceFeatureDiagram_Id();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Id();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getGroups()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getEvaluatedBy <em>Evaluated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluated By</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getEvaluatedBy()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_EvaluatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Described By</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getDescribedBy()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DescribedBy();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration#getDescription()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Description();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference
	 * @generated
	 */
	EClass getPreference();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getCreationDate()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getValue()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Value();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getDescription()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getStakeholderGroup <em>Stakeholder Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stakeholder Group</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference#getStakeholderGroup()
	 * @see #getPreference()
	 * @generated
	 */
	EAttribute getPreference_StakeholderGroup();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant#getContains()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Contains();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature <em>Mandatory Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature
	 * @generated
	 */
	EClass getMandatoryServiceFeature();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations <em>Possible Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Configurations</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations
	 * @generated
	 */
	EClass getPossibleConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations#getContains()
	 * @see #getPossibleConfigurations()
	 * @generated
	 */
	EReference getPossibleConfigurations_Contains();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes <em>Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Types</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes
	 * @generated
	 */
	EClass getAttributeTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes#getContains()
	 * @see #getAttributeTypes()
	 * @generated
	 */
	EReference getAttributeTypes_Contains();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getDomain()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getAggregationRule <em>Aggregation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Rule</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getAggregationRule()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_AggregationRule();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getScaleOrder <em>Scale Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Order</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getScaleOrder()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_ScaleOrder();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#isToBeEvaluated <em>To Be Evaluated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Evaluated</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#isToBeEvaluated()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_ToBeEvaluated();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getDescription()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getCustomAttributeTypePriority <em>Custom Attribute Type Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Attribute Type Priority</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getCustomAttributeTypePriority()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_CustomAttributeTypePriority();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType#getRequirement()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Requirement();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship <em>Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify Relationship</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship
	 * @generated
	 */
	EClass getModifyRelationship();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getName()
	 * @see #getModifyRelationship()
	 * @generated
	 */
	EAttribute getModifyRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getOrderNumber <em>Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getOrderNumber()
	 * @see #getModifyRelationship()
	 * @generated
	 */
	EAttribute getModifyRelationship_OrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getFunction()
	 * @see #getModifyRelationship()
	 * @generated
	 */
	EAttribute getModifyRelationship_Function();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getTargetParameterName <em>Target Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Parameter Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship#getTargetParameterName()
	 * @see #getModifyRelationship()
	 * @generated
	 */
	EAttribute getModifyRelationship_TargetParameterName();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship <em>Attribute To Attribute Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute To Attribute Modify Relationship</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship
	 * @generated
	 */
	EClass getAttributeToAttributeModifyRelationship();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship#getTriggerParameterName <em>Trigger Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Parameter Name</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship#getTriggerParameterName()
	 * @see #getAttributeToAttributeModifyRelationship()
	 * @generated
	 */
	EAttribute getAttributeToAttributeModifyRelationship_TriggerParameterName();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship#getTriggeredByAttribute <em>Triggered By Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered By Attribute</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship#getTriggeredByAttribute()
	 * @see #getAttributeToAttributeModifyRelationship()
	 * @generated
	 */
	EReference getAttributeToAttributeModifyRelationship_TriggeredByAttribute();

	/**
	 * Returns the meta object for class '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship <em>Feature To Attribute Modify Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature To Attribute Modify Relationship</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship
	 * @generated
	 */
	EClass getFeatureToAttributeModifyRelationship();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship#getTriggeredByServiceFeature <em>Triggered By Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered By Service Feature</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship#getTriggeredByServiceFeature()
	 * @see #getFeatureToAttributeModifyRelationship()
	 * @generated
	 */
	EReference getFeatureToAttributeModifyRelationship_TriggeredByServiceFeature();

	/**
	 * Returns the meta object for enum '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain <em>Attribute Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Domain</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain
	 * @generated
	 */
	EEnum getAttributeDomain();

	/**
	 * Returns the meta object for enum '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules <em>Aggregation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Rules</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules
	 * @generated
	 */
	EEnum getAggregationRules();

	/**
	 * Returns the meta object for enum '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders <em>Scale Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale Orders</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders
	 * @generated
	 */
	EEnum getScaleOrders();

	/**
	 * Returns the meta object for enum '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes <em>Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Types</em>'.
	 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes
	 * @generated
	 */
	EEnum getFeatureTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicefeaturemodelFactory getServicefeaturemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Represented By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REPRESENTED_BY = eINSTANCE.getService_RepresentedBy();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Enables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENABLES = eINSTANCE.getService_Enables();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__HAS = eINSTANCE.getService_Has();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureImpl <em>Service Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getServiceFeature()
		 * @generated
		 */
		EClass SERVICE_FEATURE = eINSTANCE.getServiceFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__NAME = eINSTANCE.getServiceFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__DESCRIPTION = eINSTANCE.getServiceFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__DESCRIBED_BY = eINSTANCE.getServiceFeature_DescribedBy();

		/**
		 * The meta object literal for the '<em><b>Contains Variant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__CONTAINS_VARIANT = eINSTANCE.getServiceFeature_ContainsVariant();

		/**
		 * The meta object literal for the '<em><b>Contains Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__CONTAINS_REQUIRES = eINSTANCE.getServiceFeature_ContainsRequires();

		/**
		 * The meta object literal for the '<em><b>Contains Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__CONTAINS_EXCLUDES = eINSTANCE.getServiceFeature_ContainsExcludes();

		/**
		 * The meta object literal for the '<em><b>Decomposes Into</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE__DECOMPOSES_INTO = eINSTANCE.getServiceFeature_DecomposesInto();

		/**
		 * The meta object literal for the '<em><b>Min Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__MIN_AMOUNT = eINSTANCE.getServiceFeature_MinAmount();

		/**
		 * The meta object literal for the '<em><b>Max Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__MAX_AMOUNT = eINSTANCE.getServiceFeature_MaxAmount();

		/**
		 * The meta object literal for the '<em><b>Maps To GSM Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__MAPS_TO_GSM_ELEMENT = eINSTANCE.getServiceFeature_MapsToGSMElement();

		/**
		 * The meta object literal for the '<em><b>Associated GSM Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__ASSOCIATED_GSM_ELEMENT = eINSTANCE.getServiceFeature_AssociatedGSMElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__ID = eINSTANCE.getServiceFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Feature Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__FEATURE_TYPE = eINSTANCE.getServiceFeature_FeatureType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE__REQUIRED = eINSTANCE.getServiceFeature_Required();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.OptionalServiceFeatureImpl <em>Optional Service Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.OptionalServiceFeatureImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getOptionalServiceFeature()
		 * @generated
		 */
		EClass OPTIONAL_SERVICE_FEATURE = eINSTANCE.getOptionalServiceFeature();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Instantiation Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__INSTANTIATION_VALUE = eINSTANCE.getAttribute_InstantiationValue();

		/**
		 * The meta object literal for the '<em><b>Of Attribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OF_ATTRIBUTE_TYPE = eINSTANCE.getAttribute_OfAttributeType();

		/**
		 * The meta object literal for the '<em><b>Contains Modify Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONTAINS_MODIFY_RELATIONSHIP = eINSTANCE.getAttribute_ContainsModifyRelationship();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.RequiresImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>Requires Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__REQUIRES_SERVICE_FEATURE = eINSTANCE.getRequires_RequiresServiceFeature();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ExcludesImpl <em>Excludes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ExcludesImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getExcludes()
		 * @generated
		 */
		EClass EXCLUDES = eINSTANCE.getExcludes();

		/**
		 * The meta object literal for the '<em><b>Excludes Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDES__EXCLUDES_SERVICE_FEATURE = eINSTANCE.getExcludes_ExcludesServiceFeature();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ORImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '<em><b>Min Features To Choose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__MIN_FEATURES_TO_CHOOSE = eINSTANCE.getOR_MinFeaturesToChoose();

		/**
		 * The meta object literal for the '<em><b>Max Features To Choose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR__MAX_FEATURES_TO_CHOOSE = eINSTANCE.getOR_MaxFeaturesToChoose();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.XORImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl <em>Service Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getServiceFeatureDiagram()
		 * @generated
		 */
		EClass SERVICE_FEATURE_DIAGRAM = eINSTANCE.getServiceFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Contains Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FEATURE_DIAGRAM__CONTAINS_FEATURES = eINSTANCE.getServiceFeatureDiagram_ContainsFeatures();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE_DIAGRAM__NAME = eINSTANCE.getServiceFeatureDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE_DIAGRAM__DESCRIPTION = eINSTANCE.getServiceFeatureDiagram_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_FEATURE_DIAGRAM__ID = eINSTANCE.getServiceFeatureDiagram_Id();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ConfigurationImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ID = eINSTANCE.getConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__GROUPS = eINSTANCE.getConfiguration_Groups();

		/**
		 * The meta object literal for the '<em><b>Evaluated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__EVALUATED_BY = eINSTANCE.getConfiguration_EvaluatedBy();

		/**
		 * The meta object literal for the '<em><b>Described By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DESCRIBED_BY = eINSTANCE.getConfiguration_DescribedBy();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DESCRIPTION = eINSTANCE.getConfiguration_Description();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PreferenceImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getPreference()
		 * @generated
		 */
		EClass PREFERENCE = eINSTANCE.getPreference();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__CREATION_DATE = eINSTANCE.getPreference_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__VALUE = eINSTANCE.getPreference_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__DESCRIPTION = eINSTANCE.getPreference_Description();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCE__STAKEHOLDER_GROUP = eINSTANCE.getPreference_StakeholderGroup();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.VariantImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__CONTAINS = eINSTANCE.getVariant_Contains();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.MandatoryServiceFeatureImpl <em>Mandatory Service Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.MandatoryServiceFeatureImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getMandatoryServiceFeature()
		 * @generated
		 */
		EClass MANDATORY_SERVICE_FEATURE = eINSTANCE.getMandatoryServiceFeature();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PossibleConfigurationsImpl <em>Possible Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.PossibleConfigurationsImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getPossibleConfigurations()
		 * @generated
		 */
		EClass POSSIBLE_CONFIGURATIONS = eINSTANCE.getPossibleConfigurations();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLE_CONFIGURATIONS__CONTAINS = eINSTANCE.getPossibleConfigurations_Contains();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypesImpl <em>Attribute Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypesImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeTypes()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPES = eINSTANCE.getAttributeTypes();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPES__CONTAINS = eINSTANCE.getAttributeTypes_Contains();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeTypeImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DOMAIN = eINSTANCE.getAttributeType_Domain();

		/**
		 * The meta object literal for the '<em><b>Aggregation Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__AGGREGATION_RULE = eINSTANCE.getAttributeType_AggregationRule();

		/**
		 * The meta object literal for the '<em><b>Scale Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__SCALE_ORDER = eINSTANCE.getAttributeType_ScaleOrder();

		/**
		 * The meta object literal for the '<em><b>To Be Evaluated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__TO_BE_EVALUATED = eINSTANCE.getAttributeType_ToBeEvaluated();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DESCRIPTION = eINSTANCE.getAttributeType_Description();

		/**
		 * The meta object literal for the '<em><b>Custom Attribute Type Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__CUSTOM_ATTRIBUTE_TYPE_PRIORITY = eINSTANCE.getAttributeType_CustomAttributeTypePriority();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__REQUIREMENT = eINSTANCE.getAttributeType_Requirement();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ModifyRelationshipImpl <em>Modify Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ModifyRelationshipImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getModifyRelationship()
		 * @generated
		 */
		EClass MODIFY_RELATIONSHIP = eINSTANCE.getModifyRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_RELATIONSHIP__NAME = eINSTANCE.getModifyRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_RELATIONSHIP__ORDER_NUMBER = eINSTANCE.getModifyRelationship_OrderNumber();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_RELATIONSHIP__FUNCTION = eINSTANCE.getModifyRelationship_Function();

		/**
		 * The meta object literal for the '<em><b>Target Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFY_RELATIONSHIP__TARGET_PARAMETER_NAME = eINSTANCE.getModifyRelationship_TargetParameterName();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl <em>Attribute To Attribute Modify Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.AttributeToAttributeModifyRelationshipImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeToAttributeModifyRelationship()
		 * @generated
		 */
		EClass ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP = eINSTANCE.getAttributeToAttributeModifyRelationship();

		/**
		 * The meta object literal for the '<em><b>Trigger Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGER_PARAMETER_NAME = eINSTANCE.getAttributeToAttributeModifyRelationship_TriggerParameterName();

		/**
		 * The meta object literal for the '<em><b>Triggered By Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_ATTRIBUTE = eINSTANCE.getAttributeToAttributeModifyRelationship_TriggeredByAttribute();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.FeatureToAttributeModifyRelationshipImpl <em>Feature To Attribute Modify Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.FeatureToAttributeModifyRelationshipImpl
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getFeatureToAttributeModifyRelationship()
		 * @generated
		 */
		EClass FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP = eINSTANCE.getFeatureToAttributeModifyRelationship();

		/**
		 * The meta object literal for the '<em><b>Triggered By Service Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_ATTRIBUTE_MODIFY_RELATIONSHIP__TRIGGERED_BY_SERVICE_FEATURE = eINSTANCE.getFeatureToAttributeModifyRelationship_TriggeredByServiceFeature();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain <em>Attribute Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAttributeDomain()
		 * @generated
		 */
		EEnum ATTRIBUTE_DOMAIN = eINSTANCE.getAttributeDomain();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules <em>Aggregation Rules</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getAggregationRules()
		 * @generated
		 */
		EEnum AGGREGATION_RULES = eINSTANCE.getAggregationRules();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders <em>Scale Orders</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getScaleOrders()
		 * @generated
		 */
		EEnum SCALE_ORDERS = eINSTANCE.getScaleOrders();

		/**
		 * The meta object literal for the '{@link edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes <em>Feature Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureTypes
		 * @see edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServicefeaturemodelPackageImpl#getFeatureTypes()
		 * @generated
		 */
		EEnum FEATURE_TYPES = eINSTANCE.getFeatureTypes();

	}

} //ServicefeaturemodelPackage
