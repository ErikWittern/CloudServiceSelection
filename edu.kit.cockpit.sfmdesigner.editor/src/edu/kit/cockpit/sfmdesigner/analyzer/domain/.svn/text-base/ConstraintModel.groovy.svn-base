package edu.kit.cockpit.sfmdesigner.analyzer.domain

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType

class ConstraintModel {
	
	String name
	List<AttributeType> serviceAttributeTypes
	List<ServiceFeature> serviceFeatures
	List<Dependency> dependencies
	Map featureIdMapping
	
	ConstraintModel(){
		serviceAttributeTypes = []
		serviceFeatures = []
		dependencies = []
	}
	
	ConstraintModel(String name){
		this.name = name
		serviceAttributeTypes = []
		serviceFeatures = []
		dependencies = []
	}
	
	void addServiceFeature(ServiceFeature f){
		if(!serviceFeatures.contains(f)){
			serviceFeatures.add(f)
			f.setModel(this)
		}
	}
	
	void addDependency(Dependency d){
		if(d && !dependencies.contains(d)){
			dependencies.add(d)
			d.setModel(this)
		}
	}
	
	void addServiceAttributeType(AttributeType sat){
		if(!serviceAttributeTypes.contains(sat)){
			serviceAttributeTypes.add(sat)
		}
	}
	
	String getName(){
		if(!name){
			return ""
		}
		return name
	}
	
	ServiceFeature getFeatureByName(String name){
		ServiceFeature result
		serviceFeatures.each{
			if(it.name == name)
				result = it
		}
		return result
	}
	
	ServiceFeature getFeatureById(String id){
		ServiceFeature result
		serviceFeatures.each{
			if(it.id == id)
				result = it
		}
		return result
	}
	
	ServiceAttribute getAttributeById(String id){
		ServiceAttribute result
		serviceFeatures.each{ sf ->
			sf.serviceAttributes.each{ sa ->
				if(sa.id == id)
					result = sa
			}
		}
		return result
	}
	
	String pretty(){
		return "(ConstraintModel: ${name})"
	}
	
	String prettyFullModel(){
		String m
		m =  "Constraint Model: ${name} \n"
		m += "Attribute Types:\n"
		serviceAttributeTypes.each{
			m += "  - " +it.toString()+"\n"
		}
		m += "Features:\n"
		serviceFeatures.each{ f ->
			m += "  - " +f.pretty()+ "\n"
			f.serviceAttributes.each{ a ->
				m += "    + " +a.pretty()+ "\n"
			}
		}
		m += "Dependencies:\n"
		dependencies.each{ d ->
			m += "  - " +d.pretty()+ "\n"
		}
		return m
	}
}
