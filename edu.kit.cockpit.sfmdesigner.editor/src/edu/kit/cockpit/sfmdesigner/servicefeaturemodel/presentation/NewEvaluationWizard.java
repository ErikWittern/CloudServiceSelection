/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import edu.kit.cockpit.valuationserver.rest.clients.EvaluationClient;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;


public class NewEvaluationWizard extends Wizard {

	NewEvaluationWizardAttributeConfigurationPage attConfigurationPage;
	NewEvaluationWizardCustomAttributePrioritizationPage attPrioritizationPage;
	NewEvaluationWizardEvaluationConfigurationPage evaluationPage;

	List<String> booleanAttributeTypesList;
	int indexBooleanAttributeType;
	
	boolean isFinished;
	
	/**
	 * Constructor
	 */
	public NewEvaluationWizard() {
		setWindowTitle(Messages.NewEvaluationWizard_WindowTitle);
		setNeedsProgressMonitor(true);
		booleanAttributeTypesList = new ArrayList<String>();
		indexBooleanAttributeType = 0;
	}

	
	/**
	 * performFinish
	 */
	@Override
	public boolean performFinish() {
		
		// POST new evaluation:
		Evaluation evaluation = evaluationPage.getNewEvaluation();
		System.out.println("performFinish() - Evaluation to POST:");
		System.out.println("	Name: " + evaluation.getName());	
		System.out.println("	Version: " + evaluation.getVersion());	
		System.out.println("	Description: " + evaluation.getDescription());
		System.out.println("	Eval URL: " + evaluation.getEvaluationUrl());
		System.out.println("	ModelUrl: " + evaluation.getModelUrl());
		System.out.println("	Service ID: " + evaluation.getServiceId());
		System.out.println("	Stakeholder-Group: " + evaluation.getStakeholderGroup());
		System.out.println("	State: " + evaluation.getState());
		System.out.println("	PollDeadLine: " + evaluation.getPollDeadline().toString());
				
		EvaluationClient ec = new EvaluationClient();
		Evaluation responseEvaluation = ec.postEvaluation(evaluation);

		if (responseEvaluation == null) {
			MessageDialog
			.openError(
					getShell(), 
					Messages.NewEvaluationWizard_POST_Evaluation_Error_Title, 
					Messages.NewEvaluationWizard_POST_Evaluation_Error_Message);
			System.out.println("EVALUATION could not be posted.");
			return false;
		}
		
		System.out.println("performFinish() - Evaluation received after POST:");
		System.out.println("	Name: " + responseEvaluation.getName());	
		System.out.println("	Version: " + responseEvaluation.getVersion());	
		System.out.println("	Description: " + responseEvaluation.getDescription());
		System.out.println("	Eval URL: " + responseEvaluation.getEvaluationUrl());
		System.out.println("	ModelUrl: " + responseEvaluation.getModelUrl());
		System.out.println("	Service ID: " + responseEvaluation.getServiceId());
		System.out.println("	Stakeholder-Group: " + responseEvaluation.getStakeholderGroup());
		System.out.println("	State: " + responseEvaluation.getState());
		System.out.println("	PollDeadLine: " + responseEvaluation.getPollDeadline().toString());
		
		// Send SFM to valuationserver:
		ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		EditingDomain editingDomain = currentEditor.getEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet(); //new ResourceSetImpl();
		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput());
		Resource resource = resourceSet.getResource(resourceURI, true);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		try	{
			resource.save(outputStream, null);
		}catch (IOException ioe) { 
			ioe.printStackTrace(); 
		}

		String modelAsString = outputStream.toString(); 
		
		WebResource wrs = Client.create().resource(responseEvaluation.getEvaluationUrl());
		ClientResponse response = wrs.type("cockpit/sfm+xml").post(ClientResponse.class, modelAsString);

		java.net.URI location = response.getLocation();

		System.out.println("POST model request returned status '"
				+ response.getClientResponseStatus() + "' and location is '"
				+ location + "'");

		if ( (responseEvaluation != null) && (response.getClientResponseStatus().equals(ClientResponse.Status.CREATED)) ){
			System.out.println("Evaluation posted. Model posted resulting in location '" + location +"'");
			return true;
		}

		MessageDialog
				.openError(
						getShell(), 
						Messages.NewEvaluationWizard_POST_Evaluation_Error_Title, 
						Messages.NewEvaluationWizard_POST_Evaluation_Error_Message);
		return false;
	}
		

	/**
	 * performCancel
	 */
	public boolean performCancel() {
		System.out.println("Perform Cancel called");
		return true;
	}

	/**
	 * addPages
	 */
	public void addPages() {
		attConfigurationPage = new NewEvaluationWizardAttributeConfigurationPage(
				Messages.NewEvaluationWizard_AttributeConfigurationPage_Title);
		addPage(attConfigurationPage);
		
		// TODO: Integrate custom attribute configuration page:
//		attPrioritizationPage = new NewEvaluationWizardCustomAttributePrioritizationPage(
//				Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Title);
//		addPage(attPrioritizationPage);
		
		evaluationPage = new NewEvaluationWizardEvaluationConfigurationPage(
				Messages.NewEvaluationWizard_EvaluationConfigurationPage_Title);
		addPage(evaluationPage);
	}

	// TODO: Integrate custom attribute configuration page with correct page order:	
//	@Override
//	public IWizardPage getNextPage(IWizardPage currentPage) {
//		if (currentPage == attConfigurationPage) {
//			if(indexBooleanAttributeType < booleanAttributeTypesList.size()){
//				System.out.println("Index=" + indexBooleanAttributeType + " - Next Boolean Attribute Type exists.");
//				indexBooleanAttributeType++;
//				return attPrioritizationPage;
//			}
//			System.out.println("Index=" + indexBooleanAttributeType + " - Next Boolean Attribute Type does NOT exist.");
//			return evaluationPage;
//		}
//		if (currentPage == attPrioritizationPage) {
//			if(indexBooleanAttributeType < booleanAttributeTypesList.size()){
//				System.out.println("Index=" + indexBooleanAttributeType + " - Next Boolean Attribute Type exists.");
//				indexBooleanAttributeType++;
//				return attPrioritizationPage;
//			}
//			System.out.println("Index=" + indexBooleanAttributeType + " - Next Boolean Attribute Type does NOT exist.");
//			return evaluationPage;
//		}
//		return super.getNextPage(currentPage);
//	 }
//	
//	@Override
//	public IWizardPage getPreviousPage(IWizardPage currentPage) {
//		if (currentPage == evaluationPage) {
//			System.out.println("Current index: " + indexBooleanAttributeType);
//			indexBooleanAttributeType = indexBooleanAttributeType - 1;
//			System.out.println("Index after reduction: " + indexBooleanAttributeType);
//			if(indexBooleanAttributeType > 0){
//				System.out.println("Index=" + indexBooleanAttributeType + " - Previous Boolean Attribute Type exists.");
//				return attPrioritizationPage;
//			}
//			System.out.println("Index=" + indexBooleanAttributeType + " - Previous Boolean Attribute Type does NOT exist.");
//			return attConfigurationPage;
//		}
//		if (currentPage == attPrioritizationPage) {
//			System.out.println("Current index: " + indexBooleanAttributeType);
//			indexBooleanAttributeType = indexBooleanAttributeType - 1;
//			System.out.println("Index after reduction: " + indexBooleanAttributeType);
//			if(indexBooleanAttributeType > 0){
//				System.out.println("Index=" + indexBooleanAttributeType + " - Previous Boolean Attribute Type exists.");
//				return attPrioritizationPage;
//			}
//			System.out.println("Index=" + indexBooleanAttributeType + " - Previous Boolean Attribute Type does NOT exist.");
//			return attConfigurationPage;
//		}
//		return super.getPreviousPage(currentPage);
//
//	}
}
