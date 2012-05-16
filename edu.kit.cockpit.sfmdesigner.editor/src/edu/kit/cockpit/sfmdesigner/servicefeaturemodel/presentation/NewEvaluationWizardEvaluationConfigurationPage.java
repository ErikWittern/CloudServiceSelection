/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;

public class NewEvaluationWizardEvaluationConfigurationPage extends WizardPage implements Listener {

	Evaluation newEvaluation;

	Label serviceIdLabel;
	Text evaluationNameText;
	Text descriptionText;
	Text versionText;
	Text stakeholderText;
	Combo statesCombo;
	DateTime endDate;
	


	/**
	 * Constructor
	 * @param pageName
	 */
	protected NewEvaluationWizardEvaluationConfigurationPage(String pageName) {
		super(pageName);
		setTitle(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Title);
		setMessage(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Message);
		newEvaluation = new Evaluation();
	}

	/**
	 * createControl
	 */
	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		final GridLayout layout = new GridLayout();
		composite.setLayout(layout);

		layout.numColumns = 2;

		// Get access to the instance of the model in use:
		ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor) PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		EditingDomain editingDomain = currentEditor.getEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet(); // new
																	// ResourceSetImpl();
		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorInput());
		Resource resource = resourceSet.getResource(resourceURI, true);
		Service service = (Service) resource.getContents().get(0);
		
		// assign existing attributes from the model to the newEvaluation:
		if(service.getId() != null){
			newEvaluation.setServiceId(service.getId());
		}
//		if(service.getName() != null){
//			newEvaluation.setName(service.getName());
//		}
//		if(service.getDescription() != null){
//			newEvaluation.setDescription(service.getDescription());
//		}
		
		// Service ID:
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_ServiceID);
		serviceIdLabel = new Label(composite, SWT.NULL);
		if (newEvaluation.getServiceId() != null) {
			serviceIdLabel.setText(newEvaluation.getServiceId());
		} else {
			serviceIdLabel.setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Error_ServiceID);
		}
		
		// Evaluation Name
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_EvaluationName);
		evaluationNameText = new Text(composite, SWT.BORDER);
		evaluationNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		evaluationNameText.addListener(SWT.CHANGED, this);
		
		// Evaluation Description
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_Description);
		descriptionText = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
		descriptionText.setLayoutData(new GridData(320, 100));
		descriptionText.addListener(SWT.CHANGED, this);
		
		// Version
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_Version);
		versionText = new Text(composite, SWT.BORDER);
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		versionText.addListener(SWT.CHANGED, this);

		// Stakeholder group
		// TODO: Change to combo and provide actual stakeholders from public service:
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_Stakeholder);
		stakeholderText = new Text(composite, SWT.BORDER);
		stakeholderText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		stakeholderText.addListener(SWT.CHANGED, this);
		
		
		// State
		new Label(composite, SWT.NULL).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_State);
		String[] states = { "Created" }; //, "Running", "Aborted", "Finished" };
		statesCombo = new Combo(composite, SWT.NULL);
		statesCombo.setItems(states);
		statesCombo.addListener(SWT.Selection, this);


		// // Input for start date:
		// new Label(composite,
		// SWT.LEFT).setText(Messages.EvaluationWizardEvaluationConfigurationPage_StartDateLabel);
		// DateTime startDate = new DateTime(composite, SWT.BORDER | SWT.DATE |
		// SWT.DROP_DOWN);
		// startDate.setDate(2011, 0, 1);


		// Input for end date:
		new Label(composite, SWT.LEFT).setText(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Label_EndDate);
		endDate = new DateTime(composite, SWT.BORDER | SWT.DATE |
		SWT.DROP_DOWN);
		Calendar cal = Calendar.getInstance(); // current date
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
		endDate.setDate(year, month, day + 7);
		
		// set control of the wizard page:
		setControl(composite);

		// validate page and setPageComplete if validation succeeded:
		if (validate() == true) {
			setPageComplete(true);
		}
	}

	@Override
	public void setVisible(boolean visible) {
	    super.setVisible(visible);
	    if(visible){
	        validate();
	    }
	}
	
	/**
	 * validate()
	 * @return true, if the configuration is complete
	 */
	private boolean validate() {
		boolean idComplete = !(serviceIdLabel.getText().equals(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Error_ServiceID));
		boolean nameComplete = !(evaluationNameText.getText().equals(""));
		boolean descriptionComplete = !(descriptionText.getText().equals("")) && descriptionText.getText().length() < 2000;
		boolean stakeholderComplete = !(stakeholderText.getText().equals(""));
		boolean stateComplete = !(statesCombo.getSelectionIndex() == -1);
		
		if (nameComplete && descriptionComplete && stakeholderComplete && stateComplete && idComplete) {
			setErrorMessage(null);
			setPageComplete(true);
			return true;
		} else {
			setErrorMessage(Messages.NewEvaluationWizard_EvaluationConfigurationPage_Error_Message_Incomplete);
			setPageComplete(false);
		}
		return false;
	}

	/**
	 * handleEvent
	 */
	@Override
	public void handleEvent(Event event) {
		validate();
	}
	
	/**
	 * getNewEvaluation
	 * @return the evaluation loaded from the SFM designer
	 */
	public Evaluation getNewEvaluation(){
//		// Store given description and service name to model (if updated):
//		ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor) PlatformUI
//			.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
//		EditingDomain editingDomain = currentEditor.getEditingDomain();
//		ResourceSet resourceSet = editingDomain.getResourceSet(); // new
//															// ResourceSetImpl();
//		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench()
//				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
//				.getEditorInput());
//		Resource resource = resourceSet.getResource(resourceURI, true);
//		Service service = (Service) resource.getContents().get(0);
//		service.setDescription(descriptionLabel.getText());
//		service.setName(evaluationNameLabel.getText());
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// update variable with values from the UI:
		newEvaluation.setServiceId(serviceIdLabel.getText());
		newEvaluation.setName(evaluationNameText.getText());
		newEvaluation.setDescription(descriptionText.getText());
		newEvaluation.setVersion(versionText.getText());
		newEvaluation.setStakeholderGroup(stakeholderText.getText());
		newEvaluation.setState(statesCombo.getSelectionIndex()); // Server requires value 0,1,2 or 3

		int year = endDate.getYear();
		int month = endDate.getMonth();
		int day = endDate.getDay();

		XMLGregorianCalendar today = null;
		try {
			today = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day));
			newEvaluation.setPollDeadline(today);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return newEvaluation;
	}
}
