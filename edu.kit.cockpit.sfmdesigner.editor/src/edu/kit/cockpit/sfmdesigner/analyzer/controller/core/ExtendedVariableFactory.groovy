package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceAttribute
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram


class ExtendedVariableFactory extends VariableFactory {

	private ConstraintModel mapFeature(ServiceFeature f, ConstraintModel cm) throws IllegalArgumentException{
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature result
		
		if(f){
			if(cm){
				String id
				String name
				Integer minAmount = 0
				Integer maxAmount = 1
				
				f.setId(UUID.randomUUID().toString())
				id = f.getId()  // Change to proper id usage
				name = f.getName()
				if(f.getMinAmount())
					minAmount = f.getMinAmount()
				if(f.getMaxAmount())
					maxAmount = f.getMaxAmount()
				
				result = new edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature(id, minAmount, maxAmount)
				if(name)
					result.setName(name)
				
				result.selected = super.createSelectedVariable(id)
				result.amount = super.createCardinalityVariable(id, f.minAmount, f.maxAmount)
				result.emfFeature = f

				//println result
				
				cm.addServiceFeature(result)
				
				f.getDescribedBy()?.each{
					//println "ID: "+it.getId()
					ServiceAttribute a = mapAttribute(it)
					if(a){
						result.addServiceAttribute(a)
					}
				}
				
				f.getDecomposesInto().each{
					mapFeature(it, cm)
				}
				f.getContainsVariant()?.getContains()?.each{
					mapFeature(it, cm)
				}
				
				return cm
			}
			else{
				throw new IllegalArgumentException("Can not map ServiceFeature to Choco-IntegerVariables: No valid ConstraintModel provided.")
			}
		}
		else{
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco-IntegerVariables: No valid ServiceFeature provided.")
		}
	}
	
	private ServiceAttribute mapAttribute(Attribute a) throws IllegalArgumentException{
		ServiceAttribute result
		AttributeType t
		a.setId(UUID.randomUUID().toString());   	// ID: Reset
		String id = a.getId()
		if(a && a.getInstantiationValue() && a.getOfAttributeType()){
			t = a.getOfAttributeType()
			if(t){
				if(t.getDomain() && t.getAggregationRule()){
					result = new ServiceAttribute(t, a.getInstantiationValue(), id)
					result.selected = super.createSelectedVariable(id)
					switch(t.getDomain()){
						case edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain.BOOLEAN: 		
							//println "BOOLEAN attribute domain found"
							def booleanMatcher = a.getInstantiationValue() =~ /(true|1)/
							if( booleanMatcher.matches() ){
								result.setValue("1")
							}
							else{
								result.setValue("0")
							}
							result.valued = super.createBooleanAttributeVariable(id)
							break
						case edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain.CONTINUOUS:
							//println "Init value=" +a.getInstantiationValue()
							if( ServiceAttribute.isMoreThanTwoDecimalPlacesString(a.getInstantiationValue().toString()) ){
								String s = a.getInstantiationValue().toString()
								s =  s.toDouble()?.round(2)
								result.setValue(s)
								//println "Rounded val=" +result.getValue()
							}
							result.twoDecimalPlacesStringToIntegerString()
							//println "Integer val=" +result.getValue()
							//println "CONTINUOUS attribute domain found"
							if(a.getContainsModifyRelationship())
								result.valued = super.createIntegerAttributeVariable(id)
							else
								result.valued = super.createIntegerAttributeVariable(id, result.getValue().toInteger())
							
							//result.valued = super.createRealAttributeVariable(id, a.getInstantiationValue().toDouble())
							break
						default:
						throw new IllegalArgumentException("Can not map ServiceAttribute -${t.getName()}: No valid value provided. With value type: ${a?.getInstantiationValue()?.class.name}. Currently only Boolean/Integer/Real values are supported")
							break
						
					}
					//println "  - " +result.pretty()
				}
				else{
					throw new IllegalArgumentException("Can not map ServiceAttribute for feature -${featName}-: No valid AttributeType Domain/AggregationRule/ScaleOrder provided.")
				}
			}
			else{
				throw new IllegalArgumentException("Can not map ServiceAttribute: No valid AttributeType name provided.")
			}
		}
		else{
			throw new IllegalArgumentException("Can not map ServiceAttribute: No valid Attribute provided.")
		}
		return result
	}
	
	@Override
	public ConstraintModel createVariableMapping(Service s, ConstraintModel cm) throws IllegalArgumentException{
		ServiceFeatureDiagram diag
		
		if(s){
			if(!cm){
				if(!s.name || (s.name == "")){
					cm = new ConstraintModel()
				}
				else{
					cm = new ConstraintModel(s.name)
				}
			}
			if(s.getHas()){
				List<AttributeType> typeList = []
				s.getHas().getContains().each{ typeList.add(it) }
				//println "Extracted attribute types: " +typeList
				typeList.each{ cm.addServiceAttributeType(it) }
			}
			
			diag = s.getRepresentedBy()
			if(diag){
				String id = UUID.randomUUID().toString()
				diag.setId(id)
				def rootFeature = new edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature(id, 1, 1)
				if(diag.getName())
					rootFeature.setName(diag.getName())
				rootFeature.selected = super.createRootSelectedVariable(id)
				rootFeature.amount = super.createRootCardinalityVariable(id)
				
				//println rootFeature
				
				cm.addServiceFeature(rootFeature)
				
				diag.getContainsFeatures().each{
					cm = mapFeature(it, cm)
				}
			}
			else{
				throw new IllegalArgumentException("Can not map SFM to Choco-IntegerVariables: No valid ServiceDiagram provided.")
			}
		}
		else{
			throw new IllegalArgumentException("Can not map SFM to Choco-IntegerVariables: No valid Service provided.")
		}
		return cm
	}

}
