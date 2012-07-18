/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */

package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ScaleOrders;

public class AttributeTypeData {
	private String name;
	private String description;
	private AggregationRules aggregationRule;
	private ScaleOrders scaleOrder;
	private Boolean toBeEvaluated;
	private int customAttributeTypePriority;
	private AttributeDomain domain;
	
	public AttributeTypeData(String name, String description,
			AggregationRules aggregationRule, ScaleOrders scaleOrder,
			Boolean toBeEvaluated, int customAttributeTypePriority, AttributeDomain domain) {
		super();
		this.name = name;
		this.description = description;
		this.aggregationRule = aggregationRule;
		this.scaleOrder = scaleOrder;
		this.toBeEvaluated = toBeEvaluated;
		this.domain = domain;
	}

	public AggregationRules getAggregationRule() {
		return aggregationRule;
	}

	public void setAggregationRule(AggregationRules aggregationRule) {
		this.aggregationRule = aggregationRule;
	}

	public void setAggregationRule(String aggregationRule) {
		this.aggregationRule = AggregationRules.get(aggregationRule);
	}

	public ScaleOrders getScaleOrder() {
		return scaleOrder;
	}

	public void setScaleOrder(ScaleOrders scaleOrders) {
		this.scaleOrder = scaleOrders;
	}

	public Boolean isToBeEvaluated() {
		return toBeEvaluated;
	}

	public String isToBeEvaluatedString() {
		return toBeEvaluated.toString();
	}

	public void setToBeEvaluated(boolean toBeEvaluated) {
		this.toBeEvaluated = toBeEvaluated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getCustomAttributeTypePriority(){
		return customAttributeTypePriority;
	}
	
	public void setCustomAttributeTypePriority(int customAttributeTypePriority){
		this.customAttributeTypePriority = customAttributeTypePriority;
	}
	
	public AttributeDomain getDomain(){
		return domain;
	}
	
	public void setDomain(AttributeDomain domain){
		this.domain = domain;
	}

}
