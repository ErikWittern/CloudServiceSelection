package edu.kit.cockpit.sfmdesigner.analyzer.domain

import choco.kernel.model.constraints.Constraint

abstract class Dependency {

	Integer id
	Constraint constraint
	ConstraintModel model
	
	void setConstraintModel(ConstraintModel cm){
		if(model != cm){
			model = cm
			cm.addDependency(this)
		}
	}
	
	abstract String pretty()
}
