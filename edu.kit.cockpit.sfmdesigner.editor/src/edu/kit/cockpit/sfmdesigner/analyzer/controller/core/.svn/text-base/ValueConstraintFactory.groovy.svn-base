package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import java.util.List;

import choco.Choco
import choco.kernel.model.constraints.Constraint
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.model.variables.real.RealVariable;

class ValueConstraintFactory extends ConstraintFactory {

	public Constraint createNotSelectedImpliesAttributeValueConstraint(IntegerVariable selected, def valued, def value){
		Constraint result
		result = Choco.implies(Choco.eq(selected, 0), Choco.eq(valued, value))
		return result
	}
	
	public Constraint createSelectedImpliesAttributeValueConstraint(IntegerVariable selected, def valued, def value){
		Constraint result
		result = Choco.implies(Choco.eq(selected, 1), Choco.eq(valued, value))
		return result
	}

	public Constraint createIfGroupAndNotGroupThanConstraint(def valueVariable, List<IntegerVariable> ifList, List<IntegerVariable> ifNotList, def value){
		Constraint result
		if(valueVariable && (value != null) ){
			Constraint ifGroupConstraint
			Constraint ifNotGroupConstraint
			Constraint ifConstraint
			Constraint thanConstraint
			
			ifGroupConstraint = groupAnd(ifList)
			ifNotGroupConstraint = groupNotAnd(ifNotList)
			//println "ifGroupConstraint: " +ifGroupConstraint?.pretty()
			//println "ifNotGroupConstraint: " +ifNotGroupConstraint?.pretty()
			
			if(ifGroupConstraint && ifNotGroupConstraint){
				ifConstraint = Choco.and(ifGroupConstraint, ifNotGroupConstraint)
			}
			else if(ifGroupConstraint){
				ifConstraint = ifGroupConstraint
			}
			else if(ifNotGroupConstraint){
				ifConstraint = ifNotGroupConstraint
			}
			
			thanConstraint = Choco.eq(valueVariable, value)
			if(ifConstraint && thanConstraint){
				result = Choco.implies(ifConstraint, thanConstraint)
			}
			//println "ifConstraint : " +ifConstraint?.pretty()
			//println "thanConstraint : " +thanConstraint?.pretty()
			//println "resultConstraint: " +result?.pretty()
		}
		return result
	}
}
