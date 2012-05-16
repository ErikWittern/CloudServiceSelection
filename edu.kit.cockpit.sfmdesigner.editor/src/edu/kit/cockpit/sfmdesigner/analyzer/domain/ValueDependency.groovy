package edu.kit.cockpit.sfmdesigner.analyzer.domain

import choco.kernel.model.constraints.Constraint;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.ValueDependencyType

class ValueDependency extends Dependency {

	ValueDependencyType dependencyType
	
	ValueDependency(Constraint constraint, ValueDependencyType dependencyType){
		this.dependencyType = dependencyType
		this.constraint = constraint
	}
	
	String pretty(){
		return "${dependencyType.getLabel()}: ${dependencyType.getSymbol()} : ${constraint.pretty()}"
	}
}
