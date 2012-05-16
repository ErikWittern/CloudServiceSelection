package edu.kit.cockpit.sfmdesigner.analyzer.domain

import choco.kernel.model.variables.integer.IntegerVariable
import choco.kernel.model.variables.real.RealVariable
import choco.Choco
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ModifyRelationship
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain

class ServiceAttribute {

	String id
	String value
	
	// Dependencies
	ServiceFeature serviceFeature
	AttributeType serviceAttributeType
	
	// Analyzer
	IntegerVariable selected
	def valued
	
	// Modify relationships
	List<ModifyRelationship> modifyRelationshipOrder
	
	ServiceAttribute(AttributeType sat){
		this.serviceAttributeType = sat
		//this.selected = Choco.makeIntVar("${serviceAttributeType?.name}_selected", 0, 1)
	}
	
	ServiceAttribute(AttributeType sat, def value){
		this.serviceAttributeType = sat
		this.value = value
		//this.selected = Choco.makeIntVar("${serviceAttributeType?.name}_selected", 0, 1)
	}
	
	ServiceAttribute(AttributeType sat, def value, String id){
		this.serviceAttributeType = sat
		this.value = value
		this.id = id
		//this.selected = Choco.makeIntVar("${serviceAttributeType?.name}_selected", 0, 1)
	}
	
	ServiceAttribute(ServiceFeature sf, String value, AttributeType sat){
		this.value = value
		this.serviceAttributeType = sat
		setServiceFeature(sf)
	}
	
	ServiceAttribute(ServiceFeature sf, String value, AttributeType sat, String id){
		this.id = id
		this.value = value
		this.serviceAttributeType = sat
		setServiceFeature(sf)
	}
	
	void setServiceFeature(ServiceFeature sf){
		if(serviceFeature != sf){
			this.serviceFeature = sf
			sf.addServiceAttribute(this)
		}
	}
	
	void setServiceAttributeType(AttributeType sat){
		if(serviceAttributeType != sat){
			this.serviceAttributeType = sat
			sat.addServiceAttribute(this)
		}
	}
	
	String getName(){
		String result
		if(serviceAttributeType){
			result = serviceAttributeType.getName()
		}
		return result
	}
	
	def getSelected(){
		return serviceFeature.getSelected()
	}
	
	/**
	def getValue(){
		def result
		if(serviceAttributeType?.getDomain()){
			def domain = serviceAttributeType.getDomain()
			switch (domain){
				case AttributeDomain.BOOLEAN: 
					result = value.toInteger()
					break
				case AttributeDomain.CONTINUOUS:
				result = value.toDouble()
					break
				default:
					break
			}
		}
		return result
	}
	*/
	
	Integer getIntegerValue(){
		def result
		if(serviceAttributeType?.getDomain()){
			def domain = serviceAttributeType.getDomain()
			switch (domain){
				case AttributeDomain.BOOLEAN:
					result = value.toInteger()
					break
				case AttributeDomain.CONTINUOUS:
				result = value.toDouble().round() as Integer
					break
				default:
					break
			}
		}
		return result
	}
	
	String pretty(){
		return "(ServiceAttribute: ${serviceAttributeType?.name}, id=${id}, value=${value}, selected=${selected.pretty()}, valued=${valued?.pretty()})"
	}
	
	static Boolean isMoreThanTwoDecimalPlacesString(String s){
		def booleanMatcher = s =~ /\d+\.\d\d\d+/
		if( booleanMatcher.matches() )
			return true
		else
			return false
	}
	
	Boolean isTwoDecimalPlacesString(def s){
		def booleanMatcher = s =~ /\d+(\.\d?\d?)?/
		if( booleanMatcher.matches() )
			return true
		else
			return false
	}
	
	Boolean isOneDecimalPlacesString(def s){
		def booleanMatcher = s =~ /\d+\.\d/
		if( booleanMatcher.matches() )
			return true
		else
			return false
	}
	
	String roundToTwoDecimalPlacesString(def s){
		if(s && s.isNumber())
			return s.toDouble()?.round(2)
		else
			return null
	}
	
	void twoDecimalPlacesStringToIntegerString(){
		def val
		val = value.toDouble()
			val = val * 100
		val = val.round()
		value = val as String
	}
}
