package edu.kit.cockpit.sfmdesigner.analyzer.domain

import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.AggregationRule;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.AttributeDomain;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.FactorType;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.java.ScaleOrder;

class AttributeType {
	
	Integer id
	String name
	AggregationRule aggregationRule
	AttributeDomain attrDomain
	ScaleOrder scaleOrder
	FactorType factorType
	
	// Dependencies
	ConstraintModel model
	List<ServiceAttribute> serviceAttributes
	
	AttributeType(String name, AggregationRule aggregationRule, AttributeDomain attrDomain, ScaleOrder scaleOrder, FactorType factorType){
		this.name = name
		this.aggregationRule = aggregationRule
		this.attrDomain = attrDomain
		this.scaleOrder = scaleOrder
		this.factorType = factorType
		this.serviceAttributes = []
	}
	
	AttributeType(String name){
		this.name = name
		this.aggregationRule = AggregationRule.SUM
		this.attrDomain = AttributeDomain.INTEGER
		this.scaleOrder = ScaleOrder.HIGHERISBETTER
		this.factorType = FactorType.NEUTRAL
		this.serviceAttributes = []
	}
	
	void setConstraintModel(ConstraintModel cm){
		if(model != cm){
			model = cm
			cm.addServiceAttributeType(this)
		}
	}
	
	void addAttribute(ServiceAttribute attr){
		if(!serviceAttributes.contains(attr)){
			serviceAttributes.add(attr)
			attr.setServiceAttributeType(this)
		}
	}
	
	
	String pretty(){
		return "(ServiceAttributeType: ${name})"
	}
}
