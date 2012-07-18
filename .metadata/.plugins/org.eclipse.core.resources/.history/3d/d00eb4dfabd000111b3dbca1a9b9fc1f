/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */


package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

import edu.kit.cockpit.valuationserver.rest.clients.EvaluationClient;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;

public class EvaluationManagementWizard extends Wizard {
	
	EvaluationManagementWizardEvaluationSelectionPage evaluationSelectionPage;
	EvaluationManagementWizardEvaluationEditPage evaluationEditPage;
	
	/**
	 * Constructor
	 */
	public EvaluationManagementWizard(){
		setWindowTitle(Messages.EvaluationManagementWizard_WindowTitle);
	}
	
	/**
	 * performFinish()
	 */
	@Override
	public boolean performFinish() {
		Evaluation evaluation = evaluationEditPage.getUpdatedEvaluation();
		System.out.println("performFinish() - Evaluation to PUT:");
		System.out.println("	Name:				" + evaluation.getName());	
		System.out.println("	Version:			" + evaluation.getVersion());	
		System.out.println("	Description:		" + evaluation.getDescription());
		System.out.println("	Evaluation URL:		" + evaluation.getEvaluationUrl());
		System.out.println("	ModelUrl:			" + evaluation.getModelUrl());
		System.out.println("	Service ID:			" + evaluation.getServiceId());
		System.out.println("	Stakeholder-Group:	" + evaluation.getStakeholderGroup());
		System.out.println("	State:				" + evaluation.getState());
		System.out.println("	PollDeadLine:		" + evaluation.getPollDeadline().toString());
			
		EvaluationClient ec = new EvaluationClient();
		Evaluation responseEvaluation = ec.putEvaluation(evaluation.getEvaluationUrl(), evaluation);
		
		if (responseEvaluation != null) {
			System.out
					.println("performFinish() received PUT evaluation with URL: "
							+ responseEvaluation.getEvaluationUrl());
			return true;
		}

		MessageDialog
				.openError(
						getShell(),
						Messages.EvaluationManagementWizard_POST_Evaluation_Error_Title,
						Messages.EvaluationManagementWizard_POST_Evaluation_Error_Message);
		return false;	
	}

	/**
	 * performCancel()
	 */
	public boolean performCancel() {
		System.out.println("Perform Cancel called");
		return true;
	}
	
	public void addPages(){
		evaluationSelectionPage =  new EvaluationManagementWizardEvaluationSelectionPage(Messages.EvaluationManagementWizard_EvaluationSelectionPage_Title);
		addPage(evaluationSelectionPage);

		evaluationEditPage = new EvaluationManagementWizardEvaluationEditPage(Messages.EvaluationManagementWizard_EvaluationEditPage_Title);
		addPage(evaluationEditPage);
	}

}
