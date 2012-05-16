package edu.kit.cockpit.sfmdesigner.analyzer.controller.core

import java.util.Map;

import choco.cp.model.CPModel
import choco.cp.solver.CPSolver
import edu.kit.cockpit.sfmdesigner.analyzer.domain.ConstraintModel
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.impl.ServiceFeatureDiagramImpl

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AggregationRules

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.edit.ui.util.EditUIUtil
import org.eclipse.jface.action.IAction
import org.eclipse.ui.PlatformUI


/**
 * The CPHandler class is the core-entrance class for conducting analysis operations. 
 * @author jK
 *
 */
class CPHandler {

	Resource emfResource										// EMF Workbench resource
	Service emfServiceModel										// EMF Service Model
	ServicefeaturemodelFactory servicefeaturemodelFactory		// EMF factory to generate Configuration objects
	ConstraintModel constraintModel								// SFA CP Model
	VariableExtractionContext variableExtractionContext			// Context to perform step (i) of FM to CLP problem mapping
	DependencyExtractionContext dependencyExtractionContext		// Context to perform step (ii) of FM to CLP problem mapping
	CPModel cpModel												// CHOCO model
	CPSolver cpSolver											// CHOCO solver
	
	/**
	 * 
	 */
	public CPHandler(){
		servicefeaturemodelFactory = ServicefeaturemodelFactory.eINSTANCE
		cpModel = new CPModel()
		cpSolver = new CPSolver()
		constraintModel = new ConstraintModel()
	}
	
	/**
	 * Initiates connection to emf resource and sets emfResource and emfServiceModel properties.
	 */
	private void initServiceModel(){
		try{
			ResourceSet resourceSet = new ResourceSetImpl()
			URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput())
			emfResource = resourceSet.getResource(resourceURI, true)
			emfServiceModel = (Service)emfResource.getContents().get(0)
		}
		catch(Exception e){
			println "Service core model could not be extracted!"
		}
	}
	
	/**
	 * Generates a Configuration object for the current solution of the CHOCO solver and adds
	 * the Configuration object to the EMF Service Model. Aggregates attribute values by their
	 * specified aggregation strategy.
	 * @param constraintModel
	 * @param cpSolver
	 * @param emfServiceModel
	 * @throws Exception
	 */
	private void writeCurrentServiceConfFromSolver(ConstraintModel constraintModel, CPSolver cpSolver, Service emfServiceModel) throws IllegalArgumentException{
		
		//println ""
		//println "       Found solution: "
		
		def conf = servicefeaturemodelFactory?.createConfiguration()
		if(!constraintModel || !cpSolver || !emfServiceModel){
			throw new IllegalArgumentException("Please ensure valid inputs: ConstraintModel=${constraintModel}, CPSolver=${cpSolver}, Service=${emfServiceModel}")
		}
		
		if(conf) {
			constraintModel.serviceFeatures.each{
				if(cpSolver.getVar(it.selected)?.getVal() == 1){
					def curF = it.emfFeature
					if(curF && curF.class != ServiceFeatureDiagramImpl){
						conf?.getGroups()?.add(curF)
					}
				}
				//println "         * " +it.name+ " = " +s.getVar(it.selected).getVal()+ ", Attributes: "+ it.getServiceAttributes().collect{[name: it?.getName(), value: s.getVar(it.valued)?.getVal()]}
			}
		}
		
		// Aggregate attribute values for configuration
		List<AttributeType> attrTypes = emfServiceModel?.getHas()?.getContains()
		
		// BEGIN - Aggregation Strategies (Groovy Closures): Convention prefix = "agg" suffix = AggregationRule
		// Aggregation Strategy: SUM
		def aggSum = { a, b ->
			return a.toBigDecimal() + b.toBigDecimal()
		}
		
		// Aggregation Strategy: PRODUCT
		def aggProduct = { a, b ->
			def result
			result = a.toBigDecimal() * b.toBigDecimal()
			return result
		}
		
		// Aggregation Strategy: MINIMUM
		def aggMinimum = { a, b ->
			def result
			if(b|| b==0){
				if(a == "init"){
					result = b
				}
				else{ 
					if(a <= b)
						result = a
					else
						result = b
				}
			}
			else {
				result = a
			}
			return result
		}
		
		// Aggregation Strategy: MAXIMUM
		def aggMaximum = { a, b ->
			def result
			if(b || b==0){
				if(a == "init"){
					result = b
				}
				else{
					if(a >= b)
						result = a
					else
						result = b
				}
			} 
			else {
				result = a
			}
			return result
		}
		
		// Aggregation Strategy: ATLEASTONCE
		def aggAtLeastOnce = { a, value ->
			def result = 0
			def b
			def booleanMatcher = value =~ /(true|1)/
			if( booleanMatcher.matches() ) b=1 else b=0
			if(a || b){
				result = 100 // Erik: to hinder getting '0.01' if true (caused by division by 100)
			}
			return result
		}
		// END - Aggregation Strategies (Groovy Closures)
		
		
		if(attrTypes){
			for(AttributeType at: attrTypes){
				def aggRule
				def aggregatedValue
				
				switch (at.aggregationRule) {
					case AggregationRules.Sum: 			aggRule = aggSum
														aggregatedValue = 0	//Initial value (neutral value)
														break
					case AggregationRules.Product:		aggRule = aggProduct
														aggregatedValue = 1	//Initial value (neutral value)
														break
					case AggregationRules.AtLeastOnce:	aggRule = aggAtLeastOnce
														aggregatedValue = 0 //Initial value (neutral value)
														break
					case AggregationRules.Minimum:		aggRule = aggMinimum
														aggregatedValue = "init" //Initial value (neutral value)
														break
					case AggregationRules.Maximum:		aggRule = aggMaximum
														aggregatedValue = "init" //Initial value (neutral value)
														break
					default:							aggRule = aggAtLeastOnce
														aggregatedValue = 0 //Initial value (neutral value)
														break
				}
				
				List<ServiceFeature> curFeatures = conf?.getGroups()
				if(attrTypes){
					for(ServiceFeature f: curFeatures){
						//edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature sf = constraintModel.getFeatureByName(f.getName())
						edu.kit.cockpit.sfmdesigner.analyzer.domain.ServiceFeature sf = constraintModel.getFeatureById(f.getId())
						sf.serviceAttributes.each{ sa ->
							if(sa.serviceAttributeType == at){
								def attrVal = cpSolver?.getVar(sa.valued)?.getVal()
								//println "Agg value="+aggregatedValue+", attrValue=" +attrVal
								if(attrVal || attrVal==0){
									aggregatedValue = aggRule(aggregatedValue, attrVal)
								}
							}
							//println "aggregatedValue=${aggregatedValue}"
						}
						// NO CHOCO VARIABLES FOR AGGREGATION
						// f.describedBy.each{attr ->
						//	 println "aggregatedValue=${aggregatedValue}"
						//	 if( (attr.ofAttributeType == at) && attr.instantiationValue ){
						//	 	aggregatedValue = aggRule(aggregatedValue, attr.instantiationValue)
						//	 }
						// }
					}
				}
				
				def aggAttr = servicefeaturemodelFactory?.createAttribute()
				aggAttr.instantiationValue = aggregatedValue / 100
				aggAttr.ofAttributeType = at
				//println "       Aggregated Value: " +at.name+ "=" +aggAttr.instantiationValue
				conf.getDescribedBy().add(aggAttr)
			}
		}
		
		//println conf.getGroups()
		def configurationCount = emfServiceModel.enables.getContains().size() +1
		//println "Configuration count: " +configurationCount
		conf.id = configurationCount
		conf.name = configurationCount		// replace line with: "conf.name = "Configuration"+configurationCount"
		emfServiceModel.enables.getContains().add(conf)
	}
	
	/**
	 * Calls the variableExtractionContext and returns true if a ConstraintModel object has
	 * been generated successfully.
	 * @return
	 */
	private Boolean extractVariablesFromEmfModel(){
		Boolean success = false
		if(emfServiceModel) {
			constraintModel = variableExtractionContext.extractVariables(emfServiceModel)
			if(constraintModel) {
				success = true
			}
		}
		return success
	}
	/**
	* Calls the DependencyExtractionContext and returns true if a ConstraintModel object has
	* been updated successfully.
	* @return
	*/
	private Boolean extractDependenciesFromConstraintModel(){
		Boolean success = false
		if(constraintModel){
			constraintModel = dependencyExtractionContext.extractDependencies(emfServiceModel, constraintModel)
			if(constraintModel) {
				success = true
			}
		}
		return success
	}
	
	/**
	 * Adds all dependencies within the current constraintModel to the CHOCO cp solver.
	 * @return
	 */
	private Boolean copyDependencysToChocoModel(){
		Boolean success = false
		if(constraintModel){
			constraintModel.dependencies.collect{it.constraint}.each{ constraint ->
				//println constraint.pretty()
				cpModel.addConstraint(constraint)
			}
			success = true
		}
		return success
	}
	
	/**
	 * Iterates over all possible solutions of a CHOCO cpSolver and generates a Configuration object
	 * for each solution.
	 * @return
	 */
	private Boolean writeAllSolutionsToEmfModel(){
		Boolean success = false
		if(constraintModel && emfServiceModel && cpSolver ){ //&& resource
			emfServiceModel.enables = servicefeaturemodelFactory.createPossibleConfigurations()
			writeCurrentServiceConfFromSolver(constraintModel, cpSolver, emfServiceModel)
			//println cpSolver.solutionToString() 
			while (cpSolver.nextSolution() == Boolean.TRUE) {
				writeCurrentServiceConfFromSolver(constraintModel, cpSolver, emfServiceModel)
				//println cpSolver.solutionToString()
			}
			//resource.save(null)
			success = true
		}
		return success
	}
	
	/**
	 * Print meta data for solving the current cp problem from the cpSolver to console.
	 */
	private void printSolverMetaData(){
		println ""
		println "  Solver meta data:"
		println "       Processing time: " +cpSolver.getTimeCount()
		println "       Number of Variables: " +cpSolver.getNbIntVars()
		println "       Number of Solutions: " +cpSolver.getNbSolutions()
		println "       Used constraints: " + constraintModel.getDependencies().size()
	}

	/**
	 * Calculates configurations represented within an emfServiceModel with aggregated attribute values
	 * for each feature attribute within the emfServiceModel. Returns the input emfServiceModel with added Configuration objects.
	 * @param serviceModel: emfServiceModel
	 * @param useCardinalities: use cardinalities flag
	 * @return emfServiceModel
	 */
	public Service getAllConfigurations(Service serviceModel, Boolean useCardinalities){
		
		variableExtractionContext = new VariableExtractionContext(new ExtendedVariableFactory())
		dependencyExtractionContext = new DependencyExtractionContext(new VariabilityDependencyFactory())
		Boolean nextStep = true
		
		emfServiceModel = serviceModel

		nextStep ? extractVariablesFromEmfModel() : {println "Skiped extracting variables from EMF model step."}
		//println constraintModel.prettyFullModel()
		nextStep ? extractDependenciesFromConstraintModel() : {println "Skiped extracting dependencies from constraint model step."}
		
		dependencyExtractionContext = new DependencyExtractionContext(new ValueDependencyFactory())
		nextStep ? extractDependenciesFromConstraintModel() : {println "Skiped extracting dependencies from constraint model step."}

		nextStep ? copyDependencysToChocoModel() : {println "Skiped copy extracted dependencies step."}
		//println constraintModel.prettyFullModel()

		cpSolver.read(cpModel)
		println "       Start solving Constraint Problem..."
		cpSolver.solve()
		//cpSolver.solveAll()
		
		nextStep ? writeAllSolutionsToEmfModel() : {println "Skiped writing configurations to emf model step."}
		
		println "       Finished solving Constraint Problem..."
		printSolverMetaData()

		return emfServiceModel
	}
	
	/**
	 * Calculates the number of configurations represented by an emfServiceModel.
	 * @param serviceModel: emfServiceModel
	 * @param useCardinalities: use cardinalities flag
	 * @return number of represented configurations
	 */
	public Integer getNumberOfConfigurations(Service serviceModel, Boolean useCardinalities){
		ExtendedVariableFactory varStrat
		VariabilityDependencyFactory varFac
		Boolean nextStep
		
		varStrat = new ExtendedVariableFactory()
		if(useCardinalities){
			varFac = new VariabilityDependencyFactory(true, true, true, true)
		}
		else {
			varFac = new VariabilityDependencyFactory()
		}
		nextStep = true
		
		variableExtractionContext = new VariableExtractionContext(varStrat)
		dependencyExtractionContext = new DependencyExtractionContext(varFac)
		
		initServiceModel()
		
		nextStep ? extractVariablesFromEmfModel() : {println "Skiped extracting variables from EMF model step."}
		println constraintModel.prettyFullModel()
		
		//Variability Relationships
		nextStep ? extractDependenciesFromConstraintModel() : {println "Skiped extracting dependencies from constraint model step."}
		println constraintModel.prettyFullModel()
		
		nextStep ? copyDependencysToChocoModel() : {println "Skiped copy extracted dependencies step."}
		//println cm.prettyFullModel()
		
		cpSolver.read(cpModel)
		//cpSolver.solve()
		cpSolver.solveAll()
		
		println "   - Starting Step 5 - Printing the solutions found..."
		println ""
		
		//nextStep ? writeAllSolutionsToEmfModel() : {println "Skiped writing configurations to emf model step."}
		
		printSolverMetaData()
		return cpSolver.getNbSolutions()
	}
}
