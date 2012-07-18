/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.jface.dialogs.MessageDialog;
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

import edu.kit.cockpit.valuationserver.rest.clients.EvaluationClient;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;

public class EvaluationManagementWizardEvaluationEditPage extends WizardPage implements Listener {

	Evaluation updatedEvaluation;
	
	Label serviceId;
	Text descriptionText;
	Text stakeholderText;
	Combo statesCombo;
	DateTime endDate;
	Text versionText;
	Text serviceNameText;
	int currentState; // stores the state of the evaluation as it is on the valuation server (for validation of correct state change)	
	
	/**
	 * Constructor
	 * @param pageName
	 */
	protected EvaluationManagementWizardEvaluationEditPage(String pageName) {
		super(pageName);
		setTitle(Messages.EvaluationManagementWizard_EvaluationEditPage_Title);
		setMessage(Messages.EvaluationManagementWizard_EvaluationEditPage_Message);
	}
	
	/**
	 * setVisible
	 * Is called just before the wizard page is shown - useful to access information from previous page.
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			String evaluationURL = ((EvaluationManagementWizard)getWizard()).evaluationSelectionPage.getSelectedEvaluation();
						
			EvaluationClient ec = new EvaluationClient();
			updatedEvaluation = ec.getEvaluation(evaluationURL);
			
			if(updatedEvaluation != null){
				if(updatedEvaluation.getName() != null && !updatedEvaluation.getName().equals("")){
					serviceNameText.setText("" + updatedEvaluation.getName());
				} else {
					serviceId.setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_no_name);
				}
				
				
				if(updatedEvaluation.getServiceId() != null && !updatedEvaluation.getServiceId().equals("")){
					serviceId.setText("" + updatedEvaluation.getServiceId());
				} else {
					serviceId.setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_no_id);
				}
				
				if(updatedEvaluation.getDescription() != null && !updatedEvaluation.getDescription().equals("")){
					descriptionText.setText("" + updatedEvaluation.getDescription());
				} else {
					descriptionText.setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_no_description);
				}
				
				if(updatedEvaluation.getVersion() != null && !updatedEvaluation.getVersion().equals("")){
					versionText.setText("" + updatedEvaluation.getVersion());
				} else {
					serviceId.setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_no_version);
				}
				// TODO: load actual stakeholders from GSM:
				if(updatedEvaluation.getStakeholderGroup() != null && !updatedEvaluation.getStakeholderGroup().equals("")){
					stakeholderText.setText("" + updatedEvaluation.getStakeholderGroup());
				}
				
				if(updatedEvaluation.getState() >= 0 && updatedEvaluation.getState() <= 3){
					currentState = updatedEvaluation.getState();
					statesCombo.select(currentState);
				}
				
				if(updatedEvaluation.getPollDeadline() != null){
					endDate.setDate(updatedEvaluation.getPollDeadline().getYear(), updatedEvaluation.getPollDeadline().getMonth() - 1, updatedEvaluation.getPollDeadline().getDay()); // -1 to show actually selected date
				}

			} else {
				MessageDialog
				.openError(
						getShell(),
						Messages.EvaluationManagementWizard_EvaluationEditPage_GET_Evaluation_Error_Title,
						Messages.EvaluationManagementWizard_EvaluationEditPage_GET_Evaluation_Error_Message);
			}
		}
	}

	/**
	 * createControl
	 */
	public void createControl(Composite parent) {
		// Create new composite as container for the table
		final Composite composite = new Composite(parent, SWT.NULL);

		// Create grid layout and set the size of the margins
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginWidth = 15;
		gridLayout.marginHeight = 10;
		composite.setLayout(gridLayout);

		// Service Name
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_EvaluationName);
		serviceNameText = new Text(composite, SWT.BORDER);
		serviceNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		serviceNameText.addListener(SWT.CHANGED, this);
		
		// Service ID:
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_ServiceID);
		serviceId = new Label(composite, SWT.NULL);
		
		GridData serviceIDGridData = new GridData();
		serviceIDGridData.horizontalAlignment = GridData.FILL;
		serviceIDGridData.grabExcessHorizontalSpace = true;
		serviceId.setLayoutData(serviceIDGridData);
		
		serviceId.setText("no ID available");
		
		// Description
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_Description);
		descriptionText = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
		descriptionText.setLayoutData(new GridData(320, 100));
		descriptionText.addListener(SWT.CHANGED, this);
		
		// Version
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_Version);
		versionText = new Text(composite, SWT.BORDER);
		versionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		versionText.addListener(SWT.CHANGED, this);
				
		// Stakeholder group
		// TODO: load with actual stakeholders
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_StakeholderGroup);
		stakeholderText = new Text(composite, SWT.BORDER);
		stakeholderText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		stakeholderText.addListener(SWT.CHANGED, this);
		
		// State
		new Label(composite, SWT.NULL).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_State);
		String[] states = { "Created", "Running", "Aborted", "Finished" };
		statesCombo = new Combo(composite, SWT.NULL);
		statesCombo.setItems(states);
		statesCombo.addListener(SWT.Selection, this);

//		// Input for start date:
//		new Label(composite, SWT.LEFT).setText(Messages.EvaluationWizardEvaluationEditPage_StartDateLabel);
//		DateTime startDate = new DateTime(composite, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
//		startDate.setDate(2011, 0, 1);

		// Input for end date:
		new Label(composite, SWT.LEFT).setText(Messages.EvaluationManagementWizard_EvaluationEditPage_Label_EndDate);
		endDate = new DateTime(composite, SWT.BORDER | SWT.DATE |
		SWT.DROP_DOWN);
		endDate.setDate(2011, 0, 1);

		
		// set control of the wizard page:
		setControl(composite);

		// validate page and setPageComplete if validation succeeded:
		if (validate() == true) {
			setPageComplete(true);
		}
	}


	/**
	 * validate()
	 * @return true, if all properties are correctly set.
	 */
	private boolean validate() {
		boolean descBool = !(descriptionText.getText().equals("")) && descriptionText.getText().length() < 2000;
		boolean stakeBool = !(stakeholderText.getText().equals(""));
		boolean statesBool = !(statesCombo.getSelectionIndex() == -1);
		
		if (descBool && stakeBool && statesBool) {
			// Check for correct state change:
			if(currentState == 0 && (statesCombo.getSelectionIndex() == 2 || statesCombo.getSelectionIndex() == 3)){
				setErrorMessage("Can't change from state 'created' to this state.");
				setPageComplete(false);
				return false;
			} else if (currentState == 1 && (statesCombo.getSelectionIndex() == 0 || statesCombo.getSelectionIndex() == 3)){
				setErrorMessage("Can't change from state 'running' to this state.");
				setPageComplete(false);
				return false;
			} else if (currentState == 2 && statesCombo.getSelectionIndex() == 0){
				setErrorMessage("Can't change from state 'aborted' to state 'created'.");
				setPageComplete(false);
				return false;
			} else if (currentState == 2 &&	statesCombo.getSelectionIndex() == 3 && 
					updatedEvaluation.getPollDeadline().compare(getCurrentGregCal()) == DatatypeConstants.GREATER){
				setErrorMessage("Can't change to 'finished' before end date is reached.");
				setPageComplete(false);
				return false;
			} else if (currentState == 3 && statesCombo.getSelectionIndex() != 3){
				setErrorMessage("Can't change from state 'finished'.");
				setPageComplete(false);
				return false;
			}
			setErrorMessage(null);
			setPageComplete(true);
			return true;
		} else {
			setErrorMessage(Messages.EvaluationManagementWizard_EvaluationEditPage_Validate_Error_Message);
			setPageComplete(false);
			return false;
		}		
	}

	@Override
	public void handleEvent(Event event) {
		validate();
	}

	/**
	 * getUpdatedEvaluation
	 * Note: Updated Evaluation does NOT get stored to the current resource,
	 * because the current resource might not be the one changed on the server!
	 */
	public Evaluation getUpdatedEvaluation(){
		// update variable with values from the UI:
		updatedEvaluation.setServiceId(serviceId.getText());
		updatedEvaluation.setName(serviceNameText.getText());
		updatedEvaluation.setDescription(descriptionText.getText());
		updatedEvaluation.setVersion(versionText.getText());
		updatedEvaluation.setStakeholderGroup(stakeholderText.getText());
		updatedEvaluation.setState(statesCombo.getSelectionIndex()); // Server requires value 0,1,2 or 3.

		int year = endDate.getYear();
		int month = endDate.getMonth();
		int day = endDate.getDay();

		XMLGregorianCalendar today = null;
		try {
			today = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day));
			updatedEvaluation.setPollDeadline(today);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return updatedEvaluation;
	}
	
	
	/**
	 * getIntForStateName
	 * @param stateName
	 * @return the int value corresponding to the given state name
	 */
	public Integer getIntForStateName(String stateName){
		if(stateName != null){
			if(stateName.equals("Created")){
				return 0;
			} else if (stateName.equals("Running")){
				return 1;
			} else if (stateName.equals("Aborted")){
				return 2;
			} else if (stateName.equals("Finished")){
				return 3;
			}
		}
		return null;
	}
	
	
	/**
	 * getStateNameForInt
	 * @param i
	 * @return the state name as String value corresponding to the given state name
	 */
	public String getStateNameForInt(int i){
		switch (i) {
			case 0: return "Created";
			case 1: return "Running";
			case 2: return "Aborted";
			case 3: return "Finished";
			default: return null;
		}
	}
	
	/**
	 * getCurrentGregCal
	 */
	public XMLGregorianCalendar getCurrentGregCal(){
		Calendar cal = Calendar.getInstance(); // current date
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        XMLGregorianCalendar today = null;
		try {
			today = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(year, month, day));
			return today;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
}