package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel;
import edu.kit.cockpit.sfmdesigner.analyzer.domain.Dependency;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.MandatoryServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OptionalServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Variant
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.OR
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.XOR
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Excludes
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Requires
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute

class VariabilityDependencyFactory extends DependencyFactory{

	Boolean useCardinalities
	Boolean useAttributes
	Boolean useExclude
	Boolean useRequires
	
	VariabilityDependencyFactory(){
		cf = new SimpleConstraintFactory()
		useCardinalities = false
		useAttributes = true
		useExclude = true
		useRequires = true
	}
	
	VariabilityDependencyFactory(Boolean card, Boolean attr, Boolean excl, Boolean requ){
		cf = new SimpleConstraintFactory()
		useCardinalities = card
		useAttributes = attr
		useExclude = excl
		useRequires = requ
	}
	
	private ConstraintModel mapFeature(def parent, ServiceFeature feature, ConstraintModel cm) throws IllegalArgumentException{
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature result
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature p
		edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature f
		List<Dependency> extDep
		List<edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature> subFeaForIteration
		Variant v
		List<Excludes> e
		List<Requires> r
		List<Attribute> a
		
		if(!parent  || !parent.getId()){
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco constraint: No valid parent ServiceFeature provided. Parent: ${parent}")
		}
		if(!feature || !feature.getId()){
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco constraint: No valid child ServiceFeature provided. Child: ${child}")
		}
		if(!cm){
			throw new IllegalArgumentException("Can not map ServiceFeature to Choco constraint: No valid child Constraint Model provided. ConstraintModel: ${cm}")
		}
		
		p = cm.getFeatureById(parent.getId())
		f = cm.getFeatureById(feature.getId())
		extDep = []
		
		//println "Parent: p1="+parent.name+", p2="+p.name+"; Feature: f1="+feature.name+", f2="+f.name
		
		switch(feature){
			case MandatoryServiceFeature: 	extDep.add(super.createMandatoryDependency(p, f))
											break
			case OptionalServiceFeature:	extDep.add(super.createOptionalDependency(p, f))			
		}
		
		v = feature.getContainsVariant()
		if(v) {
			List<edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature> variantChilds = []
			v.getContains().each{
				variantChilds.add(cm.getFeatureById(it.getId()))
			}
			if(!variantChilds.isEmpty())
			switch(v){ // Error in analysis, feature instead of parent?
				case XOR: 						extDep.add(super.createXorDependency(f, variantChilds))
												break
				case OR: 						extDep.add(super.createOrDependency(f, variantChilds))
			}
		}
		
		e = feature.getContainsExcludes()
		if(e && useExclude) {
			e.each{
				def excluded = cm.getFeatureById(it.getExcludesServiceFeature()?.getId())
				if(excluded){
					extDep.add(super.createExcludesDependency(f, excluded))
				}
			}
		}
		
		r = feature.getContainsRequires()
		if(r && useRequires) {
			r.each{
				def required = cm.getFeatureById(it.getRequiresServiceFeature()?.getId())
				if(required){
					extDep.add(super.createRequiresDependency(f, required))
				}
			}
		}

		// Do you want to use cardinalities?
		if(useCardinalities){
			extDep.add(super.createCardinalityDependency(p, f))
		}


		// Use attributes
		//a = feature.getDescribedBy()
		//if(useAttributes && a && f.serviceAttributes){
		//	f.serviceAttributes.each{
		//		extDep.add(super.createAttributeDependency(f, it))
		//	}
		//}
		
		extDep.each{
			cm.addDependency(it)
		}
		
		feature.getDecomposesInto()?.each{
			mapFeature(feature, it, cm)
		}
		feature.getContainsVariant()?.getContains()?.each{
			mapFeature(feature, it, cm)
		}
		
		return cm
	}
	
	ConstraintModel createDependencyMapping(ConstraintModel cm, Service s){
		ServiceFeatureDiagram diag
		
		if(!s){
			throw new IllegalArgumentException("Can map dependencies from SFM: No valid SFM provided.")
		}
		if(!cm){
			throw new IllegalArgumentException("Can map dependencies from SFM: No valid ConstraintModel provided.")
		}
		
		diag = s.getRepresentedBy()
		if(!diag){
			throw new IllegalArgumentException("Can not map SFM to Choco-IntegerVariables: No valid ServiceDiagram provided.")
		}

		diag.getContainsFeatures().each{
			cm = mapFeature(diag, it, cm)
		}

		return cm;
	}
}
