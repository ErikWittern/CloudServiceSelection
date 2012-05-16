/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */

package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory;
import edu.kit.cockpit.valuationserver.rest.clients.VoteClient;
import edu.kit.cockpit.valuationserver.rest.messages.Configuration;
import edu.kit.cockpit.valuationserver.rest.messages.Configuration.ConfigurationRanking;
import edu.kit.cockpit.valuationserver.rest.messages.Configuration.ConfigurationRanking.RankedConfiguration;
import edu.kit.cockpit.valuationserver.rest.messages.Vote;
import edu.kit.cockpit.valuationserver.rest.messages.Votes;
import edu.kit.cockpit.valuationserver.rest.messages.Votes.VoteEntry;

public class EvaluationResultsWizard extends Wizard {
	
	EvaluationResultsWizardEvaluationSelectionPage evaluationSelectionPage;
	
	/**
	 * Constructor
	 */
	public EvaluationResultsWizard(){
		setWindowTitle(Messages.EvaluationResultsWizard_WindowTitle);
	}
	
	/**
	 * performFinish()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean performFinish() {
		
		String evaluationId = String.valueOf(evaluationSelectionPage.getSelectedEvaluationId());
		
		VoteClient vc = new VoteClient();
		
		
		/**POST 2 Votes as example:
		EvaluationClient ec = new EvaluationClient();
		String evaluationUrl = evaluationSelectionPage.getSelectedEvaluationUrl();

		Vote voteMsg1 = new Vote();
		voteMsg1.setAggregation(false);
		voteMsg1.setStakeholderGroup("Citizens");
		voteMsg1.setVoterId("1");
		Preference pref1 = new Preference();
		//Oder needs to correspond to order of Attribute Types in SFM:
		pref1.setFeatureAttributeType1("Throughput");
		pref1.setFeatureAttributeType2("Security Level");
		pref1.setPref1Over2(-9);
		voteMsg1.getPreference().add(pref1);
		
		Preference pref2 = new Preference();
		pref2.setFeatureAttributeType1("Throughput");
		pref2.setFeatureAttributeType2("Process cost");
		pref2.setPref1Over2(-9);
		voteMsg1.getPreference().add(pref2);
		
		Preference pref3 = new Preference();
		pref3.setFeatureAttributeType1("Security Level");
		pref3.setFeatureAttributeType2("Process cost");
		pref3.setPref1Over2(3);
		voteMsg1.getPreference().add(pref3);
		

		ec.postSingleVote(evaluationUrl, voteMsg1);
		
		
		Vote voteMsg2 = new Vote();
		voteMsg2.setAggregation(false);
		voteMsg2.setStakeholderGroup("Citizens");
		voteMsg2.setVoterId("2");
		
		pref1 = new Preference();
		//Oder needs to correspond to order of Attribute Types in SFM:
		pref1.setFeatureAttributeType1("Throughput");
		pref1.setFeatureAttributeType2("Security Level");
		pref1.setPref1Over2(-9);
		voteMsg1.getPreference().add(pref1);
		
		pref2 = new Preference();
		pref2.setFeatureAttributeType1("Throughput");
		pref2.setFeatureAttributeType2("Process cost");
		pref2.setPref1Over2(-9);
		voteMsg1.getPreference().add(pref2);
		
		pref3 = new Preference();
		pref3.setFeatureAttributeType1("Security Level");
		pref3.setFeatureAttributeType2("Process cost");
		pref3.setPref1Over2(3);
		voteMsg1.getPreference().add(pref3);
		
		ec.postSingleVote(evaluationUrl, voteMsg2);
		
		**/

		// postSimpleAggregatedVote triggers the aggregation on the DP:
		Votes votes = vc.postSimpleAggregatedVote(evaluationId);
		
		if(votes != null && votes.getVoteEntry() != null && votes.getVoteEntry().size() != 0){
			for(VoteEntry entry : votes.getVoteEntry()){
				
				Vote vote = vc.getSimpleAggregatedVote(entry.getVoteUrl());
				
				if(vote != null){
					Configuration configuration = vc.getVoteConfig(vote.getConfigurationUrl());
					
					if(configuration != null){
						// Get access to the instance of the model in use:
						ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
						EditingDomain editingDomain = currentEditor.getEditingDomain();
						ResourceSet resourceSet = editingDomain.getResourceSet(); //new ResourceSetImpl();
						URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput());
						Resource resource = resourceSet.getResource(resourceURI, true);
						// Read top-level element from the obtained resource:
						Service service = (Service) resource.getContents().get(0);
							
						ConfigurationRanking configurationRanking =	configuration.getConfigurationRanking();
						List<RankedConfiguration> rankedConfigurationList = configurationRanking.getRankedConfiguration();
						for(RankedConfiguration rankedConfiguration : rankedConfigurationList){
							System.out.println("Configuration with ID = " + rankedConfiguration.getConfigurationId() + " has preference value = " + rankedConfiguration.getPreferenceValue());
							for(edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration conf : service.getEnables().getContains()){
								if(conf.getId().equals(rankedConfiguration.getConfigurationId())){
									edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Preference preference = ServicefeaturemodelFactory.eINSTANCE.createPreference();
									preference.setCreationDate(new Date());
									preference.setStakeholderGroup(vote.getStakeholderGroup());
									preference.setValue(rankedConfiguration.getPreferenceValue());
									conf.getEvaluatedBy().add(preference);
								}
							}
						}
						
						// Persist model:
						try{
							service.eResource().save(new HashMap());
						}catch(IOException e){
							System.out.println(e);
						}
						
					} else {
						MessageDialog.openError(getShell(),
								Messages.EvaluationResultsWizard_Configuration_Does_Not_Exist_Error_Title,
								Messages.EvaluationResultsWizard_Configuration_Does_Not_Exist_Error_Message);
					}
				} else {
					MessageDialog.openError(getShell(),
							Messages.EvaluationResultsWizard_Vote_Does_Not_Exist_Error_Title,
							Messages.EvaluationResultsWizard_Vote_Does_Not_Exist_Error_Message);
				}
			}
		} else {
			MessageDialog.openError(getShell(),
					Messages.EvaluationResultsWizard_No_Votes_Exist_Error_Title,
					Messages.EvaluationResultsWizard_No_Votes_Exist_Error_Message);
		}
		return true;
	}

	/**
	 * performCancel()
	 */
	public boolean performCancel() {
		System.out.println("Perform Cancel called");
		return true;
	}
	
	public void addPages(){
		evaluationSelectionPage =  new EvaluationResultsWizardEvaluationSelectionPage(Messages.EvaluationResultsWizard_EvaluationSelectionPage_Title);
		addPage(evaluationSelectionPage);
	}

}
