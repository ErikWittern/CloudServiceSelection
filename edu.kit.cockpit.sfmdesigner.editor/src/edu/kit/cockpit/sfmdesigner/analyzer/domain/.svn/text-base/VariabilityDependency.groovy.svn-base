package edu.kit.cockpit.sfmdesigner.analyzer.domain

import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.VariabilityDependencyType;
import choco.kernel.model.constraints.Constraint;

class VariabilityDependency extends Dependency {

	VariabilityDependencyType dependencyType
	List<ServiceFeature> triggerFeatures
	List<ServiceFeature> effectedFeatures
	
	VariabilityDependency(Integer id, VariabilityDependencyType dependencyType){
		this.id = id
		this.dependencyType = dependencyType
	}
	
	VariabilityDependency(Integer id, VariabilityDependencyType dependencyType, Constraint constraint){
		this.id = id
		this.dependencyType = dependencyType
		this.constraint = constraint
	}
	
	VariabilityDependency(Constraint constraint, VariabilityDependencyType dependencyType){
		this.dependencyType = dependencyType
		this.constraint = constraint
	}
	
	String pretty(){
		return "${dependencyType.getLabel()}: ${dependencyType.getSymbol()} : ${constraint.pretty()}"
	}
}
