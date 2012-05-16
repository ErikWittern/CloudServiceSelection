package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import java.util.List;

import choco.Choco
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

abstract class ConstraintFactory {

	/**
	* Sets the selected attribute of a feature to true/mandatory.
	* @param var - <code>IntegerValue</code> representing a feature.
	* @return - Constraint representing a selected feature.
	*/
   protected Constraint sel(IntegerVariable var){
	   return Choco.eq(var, 1)
   }
   
   /**
   * Sets the selected attribute of a feature to false/restricted.
   * @param var - <code>IntegerValue</code> representing a feature.
   * @return - Constraint representing a restricted feature.
   */
   protected Constraint unSel(IntegerVariable var){
	   return Choco.eq(var, 0)
   }
   
   ///////////////////////////////////////////////////////////////////////
   // Helper Methods								         			 //
   ///////////////////////////////////////////////////////////////////////
   
   /**
	* Models the logical EQUIVALENT of 2 constraints: a <-> b.
	* @param c1 - Constraint a || IntegerVariable
	* @param c2 - Constraint b || IntegerVariable
	* @return - Constraint representing the logical equivalent of a and b
	*/
   protected Constraint equivalent(def c1, def c2) {
	   if(c1.class == IntegerVariable) c1 = sel(c1)
	   if(c2.class == IntegerVariable) c2 = sel(c2)
	   
	   return Choco.and( Choco.implies(c1, c2), Choco.implies(c2, c1) )
   }
   
   /**
	* Models the logical AND for a group of <code>Constraints</code> or <code>IntegerValues</code>.
	* @param cons - List of <code>constraints</code> or <code>IntegerValues</code>
	* @return - Constraint representing the logical conjunction of all input parameter
	*/
   protected Constraint groupAnd(List constraintList) {
	   def resultConstraint
	   
	   constraintList = constraintList.collect{
		   (it.class == IntegerVariable) ? sel(it) : it
	   }
	   
	   switch(constraintList.size){
		   case 0: 	break
		   
		   case 1: 	resultConstraint = constraintList.first()
					   break
		   case 2: 	resultConstraint = Choco.and(constraintList[0], constraintList[1])
					   break
		   default: 	resultConstraint = Choco.and(constraintList[0], constraintList[1])
					   (constraintList.size-2).times{
						   resultConstraint = Choco.and(resultConstraint, constraintList[it+2])
					   }
	   }
	   return resultConstraint
   }
   
   protected Constraint groupNotAnd(List constraintList) {
	   def resultConstraint
	   
	   constraintList = constraintList.collect{
		   (it.class == IntegerVariable) ? unSel(it) : it
	   }
	   
	   switch(constraintList.size){
		   case 0: 	break
		   
		   case 1: 	resultConstraint = constraintList.first()
					   break
		   case 2: 	resultConstraint = Choco.and(constraintList[0], constraintList[1])
					   break
		   default: 	resultConstraint = Choco.and(constraintList[0], constraintList[1])
					   (constraintList.size-2).times{
						   resultConstraint = Choco.and(resultConstraint, constraintList[it+2])
					   }
	   }
	   return resultConstraint
   }
   
   /**
   * Models the logical OR for a group of <code>Constraints</code> or <code>IntegerValues</code>.
   * @param cons - List of <code>constraints</code> or <code>IntegerValues</code>
   * @return - Constraint representing the logical disjunction of all input parameter
   */
   protected Constraint groupOr(List constraintList) {
	   
	   def resultConstraint

	   constraintList = constraintList.collect{
		   (it.class == IntegerVariable) ? sel(it) : it
	   }

	   switch(constraintList.size){
		   case 0: 	break
		   
		   case 1: 	resultConstraint = constraintList[0]
					   break
		   case 2: 	resultConstraint = Choco.or(constraintList[0], constraintList[1])
					   break
		   default: 	resultConstraint = Choco.or(constraintList[0], constraintList[1])
					   (constraintList.size-2).times{
						   resultConstraint = Choco.or(resultConstraint, constraintList[it+2])
					   }
	   }
	   
	   return resultConstraint
   }
}
