package edu.kit.cockpit.sfmdesigner.analyzer.evaluation

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceImpl

class PerformanceTestsSfmMockupFactory extends SfmMockupFactory {


	public Service buildMockup(ServiceImpl serviceModel){
		try{
			if(serviceModel){
				AttributeType at = getCostAttributeType()
				if(serviceModel.getHas())
					serviceModel.getHas().add(at)
				else
					serviceModel.setHas(servicefeaturemodelFactory?.createAttributeTypes()).add(at)
				ServiceFeatureDiagram diagram =  getDiagramWithMandatoryFeaturesAndXORs(5, 3, at)
				if(diagram)
					serviceModel.setRepresentedby(diagram)
			}
		}
		catch(IllegalArgumentException e){
			println "ERROR: Could not extract SFM-Mockup!"
			println e
			println e.stackTrace
		}
		
		return serviceModel;
	}

}
