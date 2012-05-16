package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.Dependency
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;

abstract class DependencyExtractionStrategy {

	DependencyFactory df
	
	DependencyExtractionStrategy(DependencyFactory df){
		this.df = df
	}
	
	abstract List<Dependency> createDependencyMapping(Service service, ConstraintModel cm)
}
