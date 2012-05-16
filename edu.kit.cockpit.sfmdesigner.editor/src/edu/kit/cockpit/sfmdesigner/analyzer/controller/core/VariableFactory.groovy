package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
import choco.Choco
import choco.Options
import choco.kernel.model.variables.integer.IntegerVariable
import choco.kernel.model.variables.real.RealVariable

abstract class VariableFactory {

	abstract ConstraintModel createVariableMapping(Service serv, ConstraintModel cm)
	
	/**
	* Creates an IntegerVariable to be used with a ChocoSolver representing a selected feature.
	*/
   private IntegerVariable createRootSelectedVariable(String id) throws IllegalArgumentException{
	   def var
	   if(id && (id != "")){
		   var = Choco.makeIntVar("sel_"+id, 1, 1)
	   }
	   else{
		   throw new IllegalArgumentException("Can not create Choco-IntegerVariable for feature: No valid feature name provided.")
	   }
	   return var
   }
	
	/**
	* Creates an IntegerVariable to be used with a ChocoSolver representing a feature cardinality.
	*/
   private IntegerVariable createRootCardinalityVariable(String id) throws IllegalArgumentException{
	   def var
	   if (id && (id != "")){
		   var = Choco.makeIntVar("car_"+id, 1, 1)
	   }
	   else{
		   throw new IllegalArgumentException("Can not create Choco-IntegerVariable for cardinality: No valid attribute name provided.")
	   }
	   return var
   }
	
   /**
   * Creates an IntegerVariable to be used with a ChocoSolver representing a selected feature.
   */
  private IntegerVariable createSelectedVariable(String id) throws IllegalArgumentException{
	  def var
	  if(id && (id != "")){
		  var = Choco.makeIntVar("sel_" +id, 0, 1)
	  }
	  else{
		  throw new IllegalArgumentException("Can not create Choco-IntegerVariable for feature: No valid feature name provided.")
	  }
	  return var
  }
	
	/**
	 * Creates an IntegerVariable to be used with a ChocoSolver representing a feature cardinality.
	 */
	private IntegerVariable createCardinalityVariable(String id, Integer min, Integer max) throws IllegalArgumentException{
		def var
		if (id && (id != "")){
			//if(!min){min = 0}
			if(min < 0) {
				throw new IllegalArgumentException("Can not create Choco-IntegerVariable for cardinality: Min cardinality can not be a negative value.")
			}
			if(!max){
				if(min == 0) {
					max = 1
				}
				else{
					max = min // Is this the right constructor or does it set max val?
				}
			}
			if(max< min) {
				throw new IllegalArgumentException("Can not create Choco-IntegerVariable for cardinality: Max cardinality -${max}- exceeds min cardinality -${min}-.")
			}
			min = 0
			var = Choco.makeIntVar("car_" +id, min, max)
		}
		else{
			throw new IllegalArgumentException("Can not create Choco-IntegerVariable for cardinality: No valid attribute name provided.")
		}
		return var
	}
	
	/**
	* Creates an IntegerVariable that represents a Boolean value. The variable is used with a ChocoSolver and represents the value of an attribute feature.
	*/
   private IntegerVariable createBooleanAttributeVariable(String id) throws IllegalArgumentException{
	   IntegerVariable var
	   if(id && (id != "")) {
		   var = Choco.makeBooleanVar("att_" +id)
	   }
	   else{
		   throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute name provided.")
	   }
	   return var
   }
	
	/**
	 * Creates an IntegerVariable to be used with a ChocoSolver representing the value of an attribute feature.
	 */
	private IntegerVariable createIntegerAttributeVariable(String id) throws IllegalArgumentException{
		IntegerVariable var
		if(id && (id != "")) {
			//if(value || (value == 0)){
				var = Choco.makeIntVar("att_" +id, 0, 10000)
			//}
			//else{
			//	throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute value provided.")
			//}
		}
		else{
			throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute name provided.")
		}
		return var
	}
	
	private IntegerVariable createIntegerAttributeVariable(String id, def value) throws IllegalArgumentException{
		IntegerVariable var
		if(id && (id != "")) {
			if(value || (value == 0)){
				//var = Choco.makeIntVar("att_" +attrName+ "_" +featName, value, value)
				int[] valueArray = new int[2]
				valueArray[0] = 0
				valueArray[1] = value
				var = Choco.makeIntVar("att_" +id, valueArray)
			}
			else{
			//	throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute value provided.")
			}
		}
		else{
			throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute name provided.")
		}
		return var
	}
	
	private RealVariable createRealAttributeVariable(String id, Double value) throws IllegalArgumentException{
		RealVariable var
		if(id && (id != "")) {
				var = Choco.makeRealVar("att_" +id, -100000000, 100000000);
				/**
				if(value || (value == 0)){
					 var = Choco.makeRealVar("att_" +attrName, value, value);
					 
				}
				else{
					throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute value provided.")
				}
				*/
		}
		else{
			throw new IllegalArgumentException("Can not create Choco-IntegerVariable for attribute: No valid attribute name provided.")
		}
		return var
	}
	
	private validateServiceModel(ConstraintModel cm){
		
	}
}
