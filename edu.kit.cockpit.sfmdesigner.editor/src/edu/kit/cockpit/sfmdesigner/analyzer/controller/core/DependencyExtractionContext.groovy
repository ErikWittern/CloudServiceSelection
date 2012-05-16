package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.analyzer.domain.Dependency
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service

class DependencyExtractionContext {
	//DependencyExtractionStrategy depExtractStrat
	DependencyFactory dependencyFactory
	
	public DependencyExtractionContext(DependencyFactory dependencyFactory) {
		this.dependencyFactory = dependencyFactory
	}
	
	ConstraintModel extractDependencies(Service service, ConstraintModel cm) {
		println "       Extracting CP constraints with DependencyFactory: " + dependencyFactory
		// Input validation
		//println "Service: "+service+ " ,CM: " +cm
		if(service && cm){
			try{
				cm = dependencyFactory.createDependencyMapping(cm, service)
				//println "       Extracted CP constraints: "
			}
			catch(Exception e){
				println "Constraints for the choco constraint model could not be extracted from the emf service model."
				println e
				println e.stackTrace
			}
		}
		return cm
	}
}
