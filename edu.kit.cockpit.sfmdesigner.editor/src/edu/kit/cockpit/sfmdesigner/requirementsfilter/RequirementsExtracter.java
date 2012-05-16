package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;

public class RequirementsExtracter {
	
	public static HashMap<String, String[]> extractAttributeTypeRequirements(String reqModelName){
		
		HashMap<String, String[]> reqMap = new HashMap<String, String[]>();
		
		Service reqModel = ReqFilterUtils.loadModel(reqModelName);
		
		for(AttributeType at : reqModel.getHas().getContains()){
			String req = at.getRequirement();
			if(req != null && !req.equals("")){
				String[] reqSplit = req.split(" ", 2);
				reqMap.put(at.getName(), reqSplit);
				System.out.println("Requirement " + at.getName() + ": " + reqSplit[0] + " " + reqSplit[1]);
			}
		}
		return reqMap;
	}


	public static ArrayList<String> extractFeatureRequirements(String reqModelName){
		
		ArrayList<String> reqList = new ArrayList<String>();
		
		Service reqModel = ReqFilterUtils.loadModel(reqModelName);
		
		for(org.eclipse.emf.common.util.TreeIterator<EObject> it = reqModel.eAllContents() ; it.hasNext();){
			EObject ob = it.next();
			if (ob instanceof ServiceFeature) {
				ServiceFeature sf = (ServiceFeature) ob;
				switch (sf.getFeatureType()) {
				case INSTANCE_FEATURE:
					if(sf.isRequired()){
						reqList.add(sf.getName());
					}
					break;
				case ABSTRACT_FEATURE:
					if(sf.isRequired()){
						reqList.add(sf.getName());
					}
					break;
				case GROUPING_FEATURE:
					break;
				default:
					break;
				}
			}
		}
		for (String s : reqList) {
			System.out.println("Required: " + s);
		}
		return reqList;
	}
	
}