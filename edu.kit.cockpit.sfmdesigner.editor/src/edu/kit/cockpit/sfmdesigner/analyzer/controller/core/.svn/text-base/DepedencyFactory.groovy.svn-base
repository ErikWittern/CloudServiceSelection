package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import choco.kernel.model.constraints.Constraint
import choco.kernel.model.variables.integer.IntegerVariable
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceAttribute
import edu.kit.cockpit.sfmdesigner.analyzer.domain.Dependency
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ValueDependency
import edu.kit.cockpit.sfmdesigner.analyzer.domain.VariabilityDependency
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.ValueDependencyType
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.VariabilityDependencyType

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service


/**
 * @author jK
 * @version 1.0
 * @created 26-Jan-2011 12:28:13
 */
abstract class DependencyFactory {

	ConstraintFactory cf

	void finalize() throws Throwable {

	}
	
	/**
	 * 
	 * @param child
	 * @param parent
	 */
	private VariabilityDependency createMandatoryDependency(ServiceFeature parent, ServiceFeature child) {
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t

		try{
			c = cf.createMandatoryFeatureConstraint(parent.selected, child.selected)
			t = VariabilityDependencyType.MANDATORY
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.MANDATORY.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}
	
	private VariabilityDependency createMandatoryDependencyFromAttribute(ServiceFeature parent, ServiceAttribute child) {
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		try{
			result = cf.createMandatoryFeatureConstraint(parent.selected, child.selected)
			t = VariabilityDependencyType.MANDATORY
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.MANDATORY.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param parent
	 * @param child
	 */
	private VariabilityDependency createOptionalDependency(ServiceFeature parent, ServiceFeature child){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		
		try{
			c = cf.createOptionalFeatureConstraint(parent?.selected, child?.selected)
			t = VariabilityDependencyType.OPTIONAL
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.OPTIONAL.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param parent
	 * @param childs
	 */
	private VariabilityDependency createXorDependency(ServiceFeature parent, List<ServiceFeature> childs){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		//println "Creating XOR dependency: parent="+parent+" , childs= "+childs
		try{
			c = cf.createAlternativeFeatureConstraint(parent?.selected, childs?.collect{it.selected})
			t = VariabilityDependencyType.XOR
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.XOR.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param parent
	 * @param childs
	 */
	private VariabilityDependency createOrDependency(ServiceFeature parent, List<ServiceFeature> childs){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		
		try{
			c = cf.createOrFeatureConstraint(parent?.selected, childs?.collect{it.selected})
			t = VariabilityDependencyType.OR
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.OR.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param demanding
	 * @param required
	 */
	private VariabilityDependency createRequiresDependency(ServiceFeature demanding, ServiceFeature required){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		
		try{
			c = cf.createRequiresFeatureConstraint(demanding?.selected, required?.selected)
			t = VariabilityDependencyType.REQUIRES
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.REQUIRES.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param f2
	 * @param f1
	 */
	private VariabilityDependency createExcludesDependency(ServiceFeature f1, ServiceFeature f2){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t
		
		try{
			c = cf.createExcludesFeatureConstraint(f1?.selected, f2?.selected)
			t = VariabilityDependencyType.EXCLUDES
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.EXCLUDES.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	/**
	 * 
	 * @param child
	 * @param parent
	 */
	private VariabilityDependency createCardinalityDependency(ServiceFeature parent, ServiceFeature child){
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t

		try{
			c = cf.createCardinalityFeatureConstraint(parent.selected, child.amount, child.minAmount, child.maxAmount)
			t = VariabilityDependencyType.CARDINALITY
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.CARDINALITY.label} dependency. Constraint=${c}, Type=${t}, Result=${result}\n    Exception: ${e}"
			println e.stackTrace
		}
		return result
	}
	
	private VariabilityDependency createAttributeDependency(ServiceFeature parent, ServiceAttribute attribute) {
		VariabilityDependency result
		Constraint c
		VariabilityDependencyType t

		try{
			c = cf.createMandatoryFeatureConstraint(parent.selected, attribute.selected)
			t = VariabilityDependencyType.ATTRIBUTE
			result = new VariabilityDependency(c, t)
		}catch(Exception e){
			println "Could not create ${VariabilityDependencyType.ATTRIBUTE.label} dependency.\n  |-Exception: ${e}"
		}
		return result
	}
	
	private ValueDependency createAttributeEqualsValueDependency(ServiceAttribute attribute, def value) {
		ValueDependency result
		Constraint c
		ValueDependencyType t

		try{
			c = cf.createEqualsValueConstraint(attribute.valued, value)
			t = ValueDependencyType.MODIFYRELATIONSHIP
			result = new ValueDependency(c, t)
		}catch(Exception e){
			println "Could not create dependency.\n  |-Exception: ${e}"
		}
		return result
	}

	private ValueDependency createAttributeNotSelectedDependency(ServiceAttribute attribute) {
		ValueDependency result
		Constraint c
		ValueDependencyType t

		try{
			c = cf.createNotSelectedImpliesAttributeValueConstraint(attribute.selected, attribute.valued, 0)
			t = ValueDependencyType.INSTANTIATION
			result = new ValueDependency(c, t)
		}catch(Exception e){
			println "Could not create dependency.\n  |-Exception: ${e}"
		}
		return result
	}
	
	private ValueDependency createAttributeSelectedDependency(ServiceAttribute attribute) {
		ValueDependency result
		Constraint c
		ValueDependencyType t

		try{
			c = cf.createSelectedImpliesAttributeValueConstraint(attribute.selected, attribute.valued, attribute.getIntegerValue())
			t = ValueDependencyType.INSTANTIATION
			result = new ValueDependency(c, t)
		}catch(Exception e){
			println "Could not create dependency.\n  |-Exception: ${e}"
		}
		return result
	}
	
	/**
	 * 
	 * @param cm
	 * @param service
	 */
	abstract ConstraintModel createDependencyMapping(ConstraintModel cm, Service service);

}
