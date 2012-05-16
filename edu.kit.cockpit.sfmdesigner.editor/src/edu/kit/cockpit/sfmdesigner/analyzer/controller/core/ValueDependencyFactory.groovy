package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import java.util.List;

import choco.Choco
import choco.kernel.model.constraints.Constraint
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.real.RealExpressionVariable
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.analyzer.domain.Dependency
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceAttribute
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ValueDependency
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.ValueDependencyType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeToAttributeModifyRelationship
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.FeatureToAttributeModifyRelationship
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram


class ValueDependencyFactory extends DependencyFactory {

	Boolean useModifyRelationship
	ConstraintModel cm
	
	ValueDependencyFactory(){
		cf = new ValueConstraintFactory()
		useModifyRelationship = true
	}

	private Boolean usesChocoVariable(String effect){
		if(effect.find(/[xy]/))
			return true
		else
			return false
	}
	
	private def applyMRToValue(ModifyRelationship mr, def targetParam, def triggerParam){
		def resultValue = targetParam
		String effect
		String functionType
		
		def isParamRegex = ~/(x|y|\d+(\.\d+)?)/
		def isFunctionRegex = ~/([A-Z]+)(\(.*\))/
		
		def stringToValue  = { s ->
			switch(s){
				case ~/x/:
					return triggerParam
					break
				case ~/y/:
					return targetParam
					break
				case ~/\d+(\.\d+)?/:
					return s.toDouble().round() as Integer
					break
				default:
					break
			}
		}
		
		effect = mr.getFunction()
		
		if(effect){
			effect = effect.replaceAll(/\s/, "")
			if(effect ==~ isParamRegex){
				resultValue = stringToValue(effect)
			}
			else if(effect ==~ isFunctionRegex){
				// Determine if Choco functions or Groovy functions are used
				Boolean useChocoFunction = false
				if( effect.find(/[y]/) ){
					if(targetParam?.class == IntegerExpressionVariable){
						useChocoFunction = true
						//println "            + Use Choco Function because of targetParam with class: " +targetParam?.class
					}
					if(targetParam?.class == IntegerVariable){
						useChocoFunction = true
						//println "            + Use Choco Function because of targetParam with class: " +targetParam?.class
					}
				}
				if( effect.find(/[x]/) ){
					if(triggerParam?.class == IntegerExpressionVariable){
						useChocoFunction = true
						//println "            + Use Choco Function because of triggerParam with class: " +triggerParam?.class
					}
					if(triggerParam?.class == IntegerVariable){
						useChocoFunction = true
						//println "            + Use Choco Function because of triggerParam with class: " +triggerParam?.class
					}
				}
				//println "            + Use Choco Function: " +useChocoFunction
				//println "            + Effect: " +effect
				
				switch(effect){
					case ~/PLUS\((.*)\)/:
						def matcher = ( effect =~ /(x|y|\d+(\.\d+)?),(x|y|\d+(\.\d+)?)/ )
						def firstArg = stringToValue(matcher[0][1])
						def secondArg =  stringToValue(matcher[0][3])
						if(useChocoFunction)
							resultValue = Choco.plus(firstArg, secondArg)
						else
							resultValue = firstArg + secondArg
						break
					case ~/MINUS\((.*)\)/:
						def matcher = ( effect =~ /(x|y|\d+(\.\d+)?),(x|y|\d+(\.\d+)?)/ )
						def firstArg = stringToValue(matcher[0][1])
						def secondArg =  stringToValue(matcher[0][3])
						if(useChocoFunction)
							resultValue = Choco.minus(firstArg, secondArg)
						else
							resultValue = firstArg - secondArg
						break
					case ~/MULT\((.*)\)/:
						def matcher = ( effect =~ /(x|y|\d+(\.\d+)?),(x|y|\d+(\.\d+)?)/ )
						def firstArg = stringToValue(matcher[0][1])
						def secondArg =  stringToValue(matcher[0][3])
						
						if(useChocoFunction)
							resultValue = Choco.mult(firstArg, secondArg)
						else
							resultValue = firstArg * secondArg
						break
					default:
						break
				}
			}
		}
		else{
			println "         - ERROR: NO effect String specified!"
		}
		//println "         - End: Applying MR to value: " +resultValue
		return resultValue
	}
	

	private def applyMRSequenceToServiceAttribute(List<ModifyRelationship> mrSequence, ServiceAttribute sa){
		//Double initSAValue = sa.getValue().toDouble()
		Integer initSAValue = sa.getIntegerValue()
		def currentValue = initSAValue
		def triggerVariable
		
		//println "   - Start: Calculating value for SA: " +sa.getName()
		
		// First apply with value
		// Than with variable
		if((mrSequence != null) && (initSAValue || initSAValue==0) && (currentValue|| currentValue==0) ){
			Boolean isFirstIteration = true
			//println "      * Current value:" +currentValue+ ", isFirstIteration: " +isFirstIteration
			for (ModifyRelationship mr : mrSequence){
				switch(mr){
					case AttributeToAttributeModifyRelationship:
						String triggerAttributeId = mr?.getTriggeredByAttribute()?.getId()
						//println "      * AttributeToAttributeModifyRelationship: TriggerAttributeId: " +triggerAttributeId
						triggerVariable = cm?.getAttributeById(triggerAttributeId)?.valued
						//println "      * AttributeToAttributeModifyRelationship: Trigger var: " +triggerVariable
						break
					case FeatureToAttributeModifyRelationship:
						//println "      * FeatureToAttributeModifyRelationship: No Trigger var for FeatureToAttributeModifyRelationship"
						break
					default:
						break
				}
				if(isFirstIteration){
					currentValue = applyMRToValue(mr, initSAValue, triggerVariable)
					isFirstIteration = false
				}
				else{
					currentValue = applyMRToValue(mr, currentValue, triggerVariable)
				}
				//println "      * Current value:" +currentValue
			}
		}
		else{
			println "      * ERROR: mrSequence or initSAValue or currentValue missing! mrSequence=" +mrSequence+ ", initSAValue=" +initSAValue+ ", currentValue=" +currentValue
		}
		//println "   - Stop: Calculating value for SA: " +sa.getName()+ ", Return value: " +currentValue
		return currentValue
	}
	
	/**
	 * Takes a list of ModifyRelationship objects and returns the corresponding CHOCO selected variables
	 * @param mrList: List of ModifyRelationships
	 * @return
	 */
	private List<IntegerVariable> getSelectedTriggerVarsListFromMRList(List<ModifyRelationship> mrList){
		List<IntegerVariable> resultList = []
		if(mrList){
			mrList.each{ mr ->
				switch(mr){
					case FeatureToAttributeModifyRelationship:
						def featureName = mr.getTriggeredByServiceFeature().getName()
						def selectedVar = cm?.getFeatureByName(featureName)?.getSelected()
						if(selectedVar){
							resultList.add(selectedVar)
						}
						break
					case AttributeToAttributeModifyRelationship:
						def attributeId = mr.getTriggeredByAttribute().getId()
						def selectedVar = cm?.getAttributeById(attributeId)?.getSelected()
						if(selectedVar){
							resultList.add(selectedVar)
						}
						break
					default:
						break
				}
			}
		}
		return resultList 
	}
	
	private ConstraintModel mapFeature(def parent, ServiceFeature feature) throws IllegalArgumentException{
		List<Dependency> extDep
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature p
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature f
		
		if( !parent  || !parent.getId()){
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco constraint: No valid parent ServiceFeature provided. Parent: ${parent}")
		}
		if(!feature || !feature.getId()){
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco constraint: No valid child ServiceFeature provided. Child: ${child}")
		}
		
		p = cm.getFeatureById(parent.getId())
		f = cm.getFeatureById(feature.getId())
		extDep = []
		
		// Iterate over <EMF-Attribute> objects of each <EMF-ServiceFeature>
		feature.getDescribedBy().each{ fa ->
			
			edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceAttribute sa
			def finalAttributeValue
			List<ModifyRelationship> mrList = []
			
			// Get <ServiceAttribute> for <EMF-Attribute>
			sa = f.getAttrById(fa?.getId())
			//println "Feature:"+f.getName()
			// Get list of <EMF-ModifyRelationship> objects of <EMF-Attribute>
			fa.getContainsModifyRelationship().each{ mr ->
				mrList.add(mr)	
			}
			extDep.add(super.createAttributeNotSelectedDependency(sa))
			
			// If NO <EMF-ModifyRelationship> found or MRs are restricted use inital value of <EMF-Attribute>
			if(mrList.isEmpty() || !(useModifyRelationship)){				
				//finalAttributeValue = sa.getValue()
				//println "Initial value for FA: " +fa.getInstantiationValue()+ " ,CHOCO solver value: " +finalAttributeValue
				extDep.add(super.createAttributeSelectedDependency(sa))
			}
			else{
				// If <EMF-ModifyRelationship> found AND MRs are NOT restricted
				def subSequenceList		// List of sub-sequences for ModifyRelationship sequence
				def subSequenceMapWithValue = [:]
				// println "MODIFIED VALUE for FA: " +mrList.size()+ " MRs detected."
				// println "Unsorted MRList: " +mrList.collect{it.getOrderNumber()}
				
				// Sort MRs by their orderNumber attribute
				mrList = mrList.sort{it.getOrderNumber()}
				// println "Sorted MRList: " +mrList.collect{it.getOrderNumber()}

				// Derive sub-sequences of list of sorted MRs
				subSequenceList = mrList.subsequences()
				subSequenceList.add([])
				//println "Subsequence MRList: " +subSequenceList.collect{ sub -> sub.collect{m -> m.getOrderNumber()}}
				//println "Subsequence MRList2: " +subSequenceList
				
				// Derive resulting attribute value for each sub-sequence add to Map
				subSequenceList.each{ subsequence ->
					subSequenceMapWithValue += [(subsequence):applyMRSequenceToServiceAttribute(subsequence, sa)]
				}
				//println "Subsequences with values: " +subSequenceMapWithValue
				
				subSequenceMapWithValue.each{ selSubSeq ->
					//println "SelSubSeq: " +selSubSeq.key
					def notSelSubSeq = mrList - selSubSeq.key
					//println "NotSelSubSeq: " +notSelSubSeq
					def selSubSeqVarList = getSelectedTriggerVarsListFromMRList(selSubSeq.key)
					//println "selSubSeqVarList: " +selSubSeqVarList
					def notSelSubSeqVarList = getSelectedTriggerVarsListFromMRList(notSelSubSeq)
					//println "notSelSubSeqVarList: " +notSelSubSeqVarList
					ServiceAttribute targetAttribute = cm?.getAttributeById(fa?.getId())
					//println "ID: "+fa?.getId()
					if(targetAttribute){
						def selectedVar = targetAttribute.getSelected()
						selSubSeqVarList.add(selectedVar)
						def valueVar = targetAttribute.getValued()
						//println "valueVar: " +valueVar
						//println "selSubSeqVarList: " +selSubSeqVarList
						//println "notSelSubSeqVarList: " +notSelSubSeqVarList
						//println "value: " +selSubSeq.value
						Constraint constraint = cf.createIfGroupAndNotGroupThanConstraint(valueVar, selSubSeqVarList, notSelSubSeqVarList, selSubSeq.value)
						//println "constraint: " +constraint
						if(constraint){
							def constraintType = ValueDependencyType.MODIFYRELATIONSHIP
							//println "constraintType: " +constraintType
							ValueDependency resultDependency = new ValueDependency(constraint, constraintType)
							//println "resultDependency: " +resultDependency
							extDep.add(resultDependency)
						}
						else{
							println "ERROR: Could not create MR Dependency: No constraint extracted!"
						}
					}
					else{
						println "ERROR: Could not create MR Dependency: No target attribute!"
					}
					
				}
				//finalAttributeValue = sa.getValue()
			}
			
		}
		
		extDep.each{
			cm.addDependency(it)
		}
		
		feature.getDecomposesInto()?.each{
			mapFeature(feature, it)
		}
		feature.getContainsVariant()?.getContains()?.each{
			mapFeature(feature, it)
		}
		
		return cm
	}
	
	@Override
	ConstraintModel createDependencyMapping(ConstraintModel cm, Service s){
		ServiceFeatureDiagram diag
		
		if(!s){
			throw new IllegalArgumentException("ERROR: Can map dependencies from SFM: No valid SFM provided.")
		}
		if(!cm){
			throw new IllegalArgumentException("ERROR: Can map dependencies from SFM: No valid ConstraintModel provided.")
		}
		
		this.cm = cm
		diag = s.getRepresentedBy()
		if(!diag){
			throw new IllegalArgumentException("ERROR: Can not map SFM to Choco-IntegerVariables: No valid ServiceDiagram provided.")
		}

		diag.getContainsFeatures().each{
			cm = mapFeature(diag, it)
		}

		return cm;
	}

}
