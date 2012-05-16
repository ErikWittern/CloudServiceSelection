package edu.kit.cockpit.sfmdesigner.analyzer.domain

import choco.kernel.model.variables.integer.IntegerVariable
import choco.Choco
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureImpl

class ServiceFeature {

	// Model
	String id
	String name
	Integer minAmount
	Integer maxAmount
	ServiceFeatureImpl emfFeature
	
	//Dependencies
	ConstraintModel model
	List<ServiceAttribute> serviceAttributes
	
	// Analyzer
	transient IntegerVariable selected
	transient IntegerVariable amount
	
	ServiceFeature(String id, Integer minAmount, Integer maxAmount){
		this.id = id
		this.minAmount = minAmount
		this.maxAmount = maxAmount
		this.serviceAttributes = []
		//this.selected = Choco.makeIntVar("sel_${name}", 0, 1)
		//this.amount = Choco.makeIntVar("num_${name}", minAmount, maxAmount)
	}
	
	ServiceFeature(String id, String name, Integer minAmount, Integer maxAmount){
		this.id = id
		this.name = name
		this.minAmount = minAmount
		this.maxAmount = maxAmount
		this.serviceAttributes = []
		//this.selected = Choco.makeIntVar("${name}_selected", 0, 1)
		//this.amount = Choco.makeIntVar("${name}_amount", minAmount, maxAmount)
	}
	
	void setConstraintModel(ConstraintModel cm){
		if(model != cm){
			model = cm
			cm.addServiceFeature(this)
		}
	}
	
	void addServiceAttribute(ServiceAttribute attr){
		if(!serviceAttributes.contains(attr)){
			if(!containsServiceAttributeType(attr.serviceAttributeType)){
				serviceAttributes.add(attr)
				attr.setServiceFeature(this)
			}
			else{
				//println "Can not add ${attr.pretty()} - ${this.pretty()} allready contains ${getAttributeByType(attr.serviceAttributeType).pretty()} with ServiceAttributeType ${attr.serviceAttributeType.pretty()}"
			}
		}
		else{
			//println "${this.pretty()} allready contains ${attr.pretty()}"
		}
	}
	
	/**
	 * TO BE TESTED
	 * @param index
	 * @return
	 */
	ServiceAttribute getAttrByIndex(Integer index){
		return serviceAttributes[index]
	}
	
	/**
	 * TO BE TESTED
	 * @param name
	 * @return
	 */
	ServiceAttribute getAttrByName(String name){
		ServiceAttribute result
		serviceAttributes.each{
			if(it?.serviceAttributeType?.name == name)
				result = it
		}
		return result
	}
	
	ServiceAttribute getAttrById(String id){
		ServiceAttribute result
		serviceAttributes.each{
			if(it?.getId() == id)
				result = it
		}
		return result
	}
	
	private Boolean containsServiceAttributeType(AttributeType sat){
		def contains = false
		serviceAttributes.each{
			if(it.serviceAttributeType == sat){
				contains = true
			}
		}
		return contains
	}
	
	
	ServiceAttribute getAttributeByType(AttributeType sat){
		def returnAttribute
		serviceAttributes.each{ attr ->
			if(attr.serviceAttributeType.equals(sat))
				returnAttribute = attr
		}
		return returnAttribute
	}
	/**
	String toString(){
		return "(ServiceFeature: ${name} min=${minAmount}, max=${maxAmount}, id=${id}, selected=${selected?.pretty()}, amount=${amount?.pretty()})"
	}
	*/
	
	String pretty(){
		return "(ServiceFeature: ${name} min=${minAmount}, max=${maxAmount}, id=${id}, selected=${selected?.pretty()}, amount=${amount?.pretty()})"
	}
	
}
