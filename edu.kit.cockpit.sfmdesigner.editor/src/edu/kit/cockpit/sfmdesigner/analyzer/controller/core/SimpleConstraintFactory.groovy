package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import choco.Choco

import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

class SimpleConstraintFactory extends ConstraintFactory{
	
	///////////////////////////////////////////////////////////////////////
	// Hierarchical Feature Decompositions								 //
	///////////////////////////////////////////////////////////////////////
	
	// Caption:
	// P = Parent	(Service Feature)
	// C = Child 	(Service Feature)
	// F = Service Feature
	
	// P <-> C
	Constraint createMandatoryFeatureConstraint(IntegerVariable parent, IntegerVariable child) throws Exception{
		if(parent && child)
			return Choco.eq(parent, child)
		else
			throw new IllegalArgumentException("Parent=${parent}, Child=${child}")
	}
	
	// C -> P
	Constraint createOptionalFeatureConstraint(IntegerVariable parent, IntegerVariable child) throws Exception{
		if(parent && child)
			return Choco.implies(sel(child), sel(parent))
		else
			throw new IllegalArgumentException("Parent=${parent}, Child=${child}")
	}
	
	
	// (C1 || C2 || ... || Cn) <-> P
	Constraint createOrFeatureConstraint(IntegerVariable parent, List childList) throws Exception{
		
		def resultConstraint
		
		if(parent && childList && !(childList.contains(null))) {
			switch(childList.size){
				case 0:		break
							
				default: 	resultConstraint = equivalent(sel(parent), groupOr(childList.collect{ j -> sel(j) }))
			}
		}
		else
			throw new IllegalArgumentException("Parent=${parent}, Childs=${childList}")
		
		
		return resultConstraint
	}
	
	// (C1 <-> not(C2 && ... && Cn && P)) && ... && (Cn <-> not(C1 && ... && Cn-1 && P))
	Constraint createAlternativeFeatureConstraint(IntegerVariable parent, List childList) throws Exception{
		def resultConstraint
		println "Creating xor dependency: Parent: "+parent.pretty()+ ", Childs: " +childList.collect{it.pretty()}
		if(parent && childList && !(childList.contains(null))) {
			switch(childList.size){
				case 0:		break
				
				case 1:		resultConstraint = Choco.eq(childList[0], parent)
							break
							
				default: 	def constraintList = []
							childList.each{ i ->
								//println "Child List: " +c
								def selectedChildsWithOutCurrent = (childList - i).collect{ j -> unSel(j) }
								//println "ChildWhithoutCurrent: " +selectedChildsWithOutCurrent.collect{it.pretty()}
								constraintList += equivalent(sel(i), groupAnd(selectedChildsWithOutCurrent + sel(parent)))
								//println "Constraint: " +constraintList.collect{it.pretty()}
							}
							resultConstraint = groupAnd(constraintList)
			}
		}
		else
			throw new IllegalArgumentException("Error - could not create xor dependency. Invalid params: Parent=${parent}, Childs=${childList}")

		return resultConstraint
	}
	
	///////////////////////////////////////////////////////////////////////
	// Global Feature Constraints								         //
	///////////////////////////////////////////////////////////////////////
	
	// !(F1 && F2)
	Constraint createExcludesFeatureConstraint(IntegerVariable f1, IntegerVariable f2) throws Exception{
		if(f1 && f2)
			return Choco.not(groupAnd([sel(f1), sel(f2)]))
		else
			throw new IllegalArgumentException("Feature1=${f1}, Feature2=${f2}")
	}
	
	// F(requires) -> F(demanded)
	Constraint createRequiresFeatureConstraint(IntegerVariable demanding, IntegerVariable required) throws Exception{
		if(demanding && required)
			return Choco.implies( sel(demanding), sel(required) )
		else
			throw new IllegalArgumentException("Demanding=${demanding}, Required=${required}")
	}
	
	Constraint createCardinalityFeatureConstraint(IntegerVariable parent, IntegerVariable child, Integer min, Integer max) throws Exception{
		Constraint result
		if(parent && child) {
			if(min != null && max != null && min>=0 && max>=0 && min<=max ){
				result = Choco.implies(sel(parent), Choco.and(Choco.geq(child, min), Choco.leq(child, max)))
			}
			else{
				throw new IllegalArgumentException("Min or max value are incorrect: Feature=${child}, Min=${min}, Max=${max}")
			}
		}
		else{
			throw new IllegalArgumentException("Parent or Child IntegerVariable are null: Feature=${child}, Parent=${parent}, Child=${child}")
		}
		return result
	}
}
