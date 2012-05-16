package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram

class VariableExtractionContext {

	VariableFactory varExtractStrat
	
	public VariableExtractionContext(VariableFactory varExtractStrat) {
		this.varExtractStrat = varExtractStrat
	}
	
	ConstraintModel extractVariables(service) {
		ConstraintModel cm
		println "       Extracting CP variables with extraction strategy: " + varExtractStrat
		// Input validation
		if(service){
			try{
				service.name ? {cm = new ConstraintModel(service.name)} : {cm = new ConstraintModel()}
				cm = varExtractStrat.createVariableMapping(service, cm)
				println "       Extracted CP variables: "
			}
			catch(Exception e){
				println "Variables for the choco constraint model could not be extracted from the emf service model."
				println e
				println e.stackTrace
			}
		}
		return cm
	}
}
