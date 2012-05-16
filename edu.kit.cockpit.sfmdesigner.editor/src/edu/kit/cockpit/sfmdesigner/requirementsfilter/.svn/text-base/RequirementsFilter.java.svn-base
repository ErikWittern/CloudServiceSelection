package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;

public class RequirementsFilter {
	
	public static void filterRequirements(String reqModelName, String serviceModelName){
		// Get requirements:
		HashMap<String, String[]> attTypeReq = RequirementsExtracter.extractAttributeTypeRequirements(reqModelName);
		ArrayList<String> featureReq = RequirementsExtracter.extractFeatureRequirements(reqModelName);
		
		// Get service model:
		Service serviceModel = ReqFilterUtils.loadModel(serviceModelName);
		
		// Iterate all configs and check whether they match the requirements:
		List<Configuration> confList = serviceModel.getEnables().getContains();
		int numMatchingConfs = 0;
		if(confList != null && confList.size() != 0){
			for(Configuration conf : confList){
				boolean meetsAtt = meetsAttributeTypeRequirements(attTypeReq, conf);
				boolean meetsFeat = meetsFeatureRequirements(featureReq, conf);
				if(meetsAtt && meetsFeat){ 
					// TODO: do something useful with the config.
					ReqFilterUtils.printConf(conf);
					numMatchingConfs++;
				}
			}
		} else {
			System.out.println("No configurations in service model: " + serviceModelName);
		}
		System.out.println("Overall, " + numMatchingConfs + " matching confs found.");
	}

	
	public static boolean meetsFeatureRequirements(ArrayList<String> reqList, Configuration conf){
		boolean meetsReq = true;
		
		for(String req : reqList){
			boolean sfExists = false;
			for(ServiceFeature sf : conf.getGroups()){
				switch (sf.getFeatureType()) {
				case INSTANCE_FEATURE: // Check whether this instance feature is required.
					if(sf.getName().equals(req)){
						sfExists = true;
					}
					break;
				case ABSTRACT_FEATURE: 
					if(sf.getName().equals(req)){
						// Check whether any instance feature is contained in this conf:
						List<ServiceFeature> instanceFeature = new ArrayList<ServiceFeature>();
						if(sf.getDecomposesInto() != null && sf.getDecomposesInto().size() != 0){
							instanceFeature.addAll(sf.getDecomposesInto());
						}
						if(sf.getContainsVariant() != null && sf.getContainsVariant().getContains() != null && 
							sf.getContainsVariant().getContains().size() != 0){
							instanceFeature.addAll(sf.getContainsVariant().getContains());
						}
						for(ServiceFeature isf : instanceFeature){
							for(ServiceFeature confsf : conf.getGroups()){
								if(isf.getName().equals(confsf.getName())){
									sfExists = true;
								}
							}
						}
					}
					break;
				default:
					break;
				}
			}
			if(sfExists){
				meetsReq = true;
			} else {
				meetsReq = false;
			}
		}
		return meetsReq;
	}


	public static boolean meetsAttributeTypeRequirements(HashMap<String, String[]> reqMap, Configuration conf){
		boolean meetsReq = true;
		
		for(Attribute att : conf.getDescribedBy()){
			if(reqMap.containsKey(att.getOfAttributeType().getName())){
				String[] req = reqMap.get(att.getOfAttributeType().getName());
				if(req[0].equals("<")){
					if( !( Double.parseDouble(att.getInstantiationValue()) < Double.parseDouble(req[1]) ) ){ 
						meetsReq = false; 
					}
				} else if (req[0].equals("=")){
					if( !( Double.parseDouble(req[1]) == Double.parseDouble(att.getInstantiationValue()) ) ){ 
						meetsReq = false; 
					}
				} else if (req[0].equals(">")){
					if( !( Double.parseDouble(att.getInstantiationValue()) > Double.parseDouble(req[1]) ) ){ 
						meetsReq = false;
					}
				} else if (req[0].equals(">=")){
					if( !( Double.parseDouble(att.getInstantiationValue()) >= Double.parseDouble(req[1]) ) ){ 
						meetsReq = false;
					}
				} else if (req[0].equals("<=")){
					if( !( Double.parseDouble(att.getInstantiationValue()) <= Double.parseDouble(req[1]) ) ){ 
						meetsReq = false;
					}
				} else {
					meetsReq = false;
				}
			}
		}
		return meetsReq;
	}


	
	
}
