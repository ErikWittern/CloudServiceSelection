package edu.kit.cockpit.sfmdesigner.analyzer.evaluation

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl

abstract class SfmMockupFactory {

	Service emfServiceModel										// EMF Service Model
	ServicefeaturemodelFactory servicefeaturemodelFactory		// EMF factory to generate Configuration objects
	String mockupName
		
	public SfmMockupFactory(String mockupName){
		servicefeaturemodelFactory = ServicefeaturemodelFactory.eINSTANCE
		if(!mockupName || mockupName == "")
			this.mockupName = "Mockup Diagram"
		else
			this.mockupName = mockupName
	}
	
	protected AttributeType getCostAttributeType() throws IllegalArgumentException{
		AttributeType at = servicefeaturemodelFactory?.createAttributeType()
		at.setName("cost")
		at.setDomain(edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeDomain.CONTINUOUS)
		at.setAggregationRule(edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules.SUM)
		return at
	}
	
	protected XOR getXOR(Integer childNumber, AttributeType aType) throws IllegalArgumentException{
		if(!childNumber || childNumber == 0){
			throw new IllegalArgumentException("No Service Feature Diagram")
		}
		XOR xor = servicefeaturemodelFactory?.createXOR()
		childNumber.times{
			OptionalServiceFeature sf = servicefeaturemodelFactory?.createOptionalServiceFeature()
			sf.setName("VF"+it)
			Attribute a = servicefeaturemodelFactory?.createAttribute()
			a.setInstantiationValue("it")
			a.setOfAttributeType(aType)
			sf.getDescribedBy().add(a)
			if(sf)
				xor?.getContains()?.add(sf)
		}
		
	}
	
	protected ServiceFeatureDiagram getDiagramWithMandatoryFeatures(Integer childNumber, AttributeType aType) throws IllegalArgumentException{
		// Mockup service feature diagram
		ServiceFeatureDiagram diagram = servicefeaturemodelFactory?.createServiceFeatureDiagram()
		diagram?.setName(mockupName)
		if(!diagram || !childNumber){
			throw new IllegalArgumentException("No Service Feature Diagram")
		}
		childNumber.times{
			MandatoryServiceFeature sf = servicefeaturemodelFactory?.createMandatoryServiceFeature()
			sf.setName("MF"+it)
			Attribute a = servicefeaturemodelFactory?.createAttribute()
			a.setInstantiationValue("it")
			a.setOfAttributeType(aType)
			sf.getDescribedBy().add(a)
		}
		
		return diagram
	}
	
	protected ServiceFeatureDiagram getDiagramWithMandatoryFeaturesAndXORs(Integer mandatoryNumber, Integer xorNumber, AttributeType aType) throws IllegalArgumentException{
		ServiceFeatureDiagram diagram = getDiagramWithMandatoryFeatures(mandatoryNumber, aType)
		diagram?.getContainsFeatures().each{ f ->
			XOR xor = getXOR(xorNumber, aType)
			f.setContainsVariant(xor)
		}
		return diagram
	}

}
