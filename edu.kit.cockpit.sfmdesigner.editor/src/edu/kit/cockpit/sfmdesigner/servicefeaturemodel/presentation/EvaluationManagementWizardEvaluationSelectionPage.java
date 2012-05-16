/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */

package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import edu.kit.cockpit.valuationserver.rest.clients.EvaluationClient;
import edu.kit.cockpit.valuationserver.rest.clients.ServiceConstants;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluations;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluations.EvaluationEntry;


public class EvaluationManagementWizardEvaluationSelectionPage extends WizardPage {

	// create the tableViewer - needs to be public to be editable:
	TableViewer tableViewer;
	static Table table;
	static String selectedEvaluationURL;
	Button deleteButton;
	EvaluationClient ec;
	
	List<Evaluation> evaluationsList;
	
	/**
	 * Constructor
	 * @param pageName
	 */
	protected EvaluationManagementWizardEvaluationSelectionPage(String pageName) {
		super(pageName);
		setTitle(Messages.EvaluationManagementWizard_EvaluationSelectionPage_Title);
		setMessage(Messages.EvaluationManagementWizard_EvaluationSelectionPage_Message);
		ec = new EvaluationClient();
	}
	
	/**
	 * createControl
	 */
	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NULL);
		GridLayoutFactory.swtDefaults().numColumns(1).margins(10, 5).applyTo(composite);
		
		// JFace TableViewer is created in the defined composite to include it into grid layout:
		tableViewer = new TableViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		
		// create columns of tableviewer:
		createColumns(parent, tableViewer);
		
		// SWT Table + Make column heads and row lines visible:
		table = tableViewer.getTable();		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		table.addListener(SWT.MouseDown, new Listener() {
			@Override
			public void handleEvent(Event event) {
				validate();
				if (table.getSelectionIndex() != -1) {
					selectedEvaluationURL = evaluationsList.get(table.getSelectionIndex()).getEvaluationUrl();
					if( isDeletable( evaluationsList.get(table.getSelectionIndex()).getState() ) ){
						deleteButton.setEnabled(true);
					} else {
						deleteButton.setEnabled(false);
					}
				}
			}
		});
		
		// Define content provider that delivers content in array form:
		tableViewer.setContentProvider(new ArrayContentProvider());
		
		// provide the table viewer with input object (which will be handled by the content provider):
		getEvaluationsList();
		if(!evaluationsList.isEmpty()){
			tableViewer.setInput(evaluationsList);
		}else{
			MessageDialog.openError(getShell(),
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Title,
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Message);
		}
		
		deleteButton = new Button(composite, SWT.PUSH | SWT.Resize);
		deleteButton.setText("Delete");
		deleteButton.setEnabled(false);
		deleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				WebResource wrs = Client.create().resource(selectedEvaluationURL);
				ClientResponse response = wrs.accept(
						ServiceConstants.EVALUATION_MIME_TYPE).delete(
						ClientResponse.class);
				System.out.println("ClientResponseStatus: '" + response.getStatus() + "'");
				if(response.getStatus() == 200){
					MessageDialog.openInformation(getShell(),
							Messages.EvaluationManagementWizard_EvaluationSelectionPage_DELETE_Evaluation_Success_Title,
							Messages.EvaluationManagementWizard_EvaluationSelectionPage_DELETE_Evaluation_Success_Message);				
					evaluationsList.remove(table.getSelectionIndex()); // remove from underlying data structure
					tableViewer.remove(table.getSelectionIndex());	// remove from tableviewer
					tableViewer.refresh();	// update tableviewer to make changes visible
					deleteButton.setEnabled(false);
				} else if(response.getStatus() == 404){
					MessageDialog.openError(getShell(),
							Messages.EvaluationManagementWizard_EvaluationSelectionPage_DELETE_Evaluation_Error_Title,
							Messages.EvaluationManagementWizard_EvaluationSelectionPage_DELETE_Evaluation_Error_Message);
				}
			}
		});
		
		// set control of the wizard page:
		setControl(composite);
		
		// validate page and setPageComplete if validation succeeded:
		if (validate() == true){
			setPageComplete(true);
		}
	}

	/**
	 * validate();
	 * @return boolean
	 */
	private boolean validate() {
		if(table.getSelectionIndex() == -1){
			setPageComplete(false);
			deleteButton.setEnabled(false);
			return false;
		}
		setPageComplete(true);
		return true;
	}

	/**
	 * createColumns
	 *  This will create the columns for the table
	 * @param parent
	 * @param viewer
	 */
	private void createColumns(final Composite parent, final TableViewer viewer) {
		// title and size of columns:
		String[] titles = { 
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_ServiceName,
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_ID,
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_Description,
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_State,
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_StakeholderGroup,
				Messages.EvaluationManagementWizard_EvaluationSelectionPage_TableColumnTitles_EndDate};
		int[] bounds = { 100, 150, 200, 70, 120, 150 };
		
		TableViewerColumn viewerNameColumn = createTableViewerColumn(tableViewer, titles[0], bounds[0], 0);
		viewerNameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				return evaluationEntry.getName();
			}
		});
		
		TableViewerColumn viewerSerivceIDColumn = createTableViewerColumn(tableViewer, titles[1], bounds[1], 1);
		viewerSerivceIDColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				return evaluationEntry.getServiceId();
			}
		});
		
		TableViewerColumn viewerDescriptionColumn = createTableViewerColumn(tableViewer, titles[2], bounds[2], 2);
		viewerDescriptionColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				return evaluationEntry.getDescription();
			}
		});
		
		TableViewerColumn viewerStateColumn = createTableViewerColumn(tableViewer, titles[3], bounds[3], 3);
		viewerStateColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				switch (evaluationEntry.getState()) {
					case 0: return "Created";
					case 1:	return "Running";
					case 2:	return "Aborted";
					case 3:	return "Finished";
					default: return "not specified";
				}
			}
		});
		
		TableViewerColumn viewerStakeholderColumn = createTableViewerColumn(tableViewer, titles[4], bounds[4], 4);
		viewerStakeholderColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				return evaluationEntry.getStakeholderGroup();
			}
		});
		
		TableViewerColumn viewerPollDeadlineColumn = createTableViewerColumn(tableViewer, titles[5], bounds[5], 5);
		viewerPollDeadlineColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Evaluation evaluationEntry = (Evaluation) element;
				return evaluationEntry.getPollDeadline().toString();
			}
		});
		
	}
	
	/**
	 * getEvaluationsList()
	 * Makes GET call to valuation server and retrieves all evaluations stored on the server.
	 */
	public void getEvaluationsList(){
		evaluationsList = new ArrayList<Evaluation>();
		
		Evaluations eval = ec.getEvaluations(null, null, null);
		
		if(eval != null){
			List<EvaluationEntry> tempEvaluationsList = eval.getEvaluationEntry();
			for (int i = 0; i < tempEvaluationsList.size(); i++) {
				EvaluationEntry temp = tempEvaluationsList.get(i);
				Evaluation tempEval = ec.getEvaluation(temp.getEvaluationUrl());
				Evaluation newEval = new Evaluation();
				newEval.setName(tempEval.getName());
				newEval.setServiceId(tempEval.getServiceId());
				newEval.setDescription(tempEval.getDescription());
				newEval.setState(tempEval.getState());
				newEval.setStakeholderGroup(tempEval.getStakeholderGroup());
				newEval.setPollDeadline(tempEval.getPollDeadline());
				newEval.setEvaluationUrl(tempEval.getEvaluationUrl()); // required to access evaluation in case it should be edited.
				newEval.setEvaluationId(tempEval.getEvaluationId());
				evaluationsList.add(newEval);
			}
		} else {
			MessageDialog.openError(getShell(),
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Title,
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Message);
		}
	}
	
	/**
	 * getSelectedEvaluation()
	 */
	public String getSelectedEvaluation(){
		return selectedEvaluationURL;
	}
	
	/**
	 * createTableViewerColumn
	 * @param title
	 * @param bound
	 * @param colNumber
	 * @return
	 */
	private TableViewerColumn createTableViewerColumn(TableViewer viewer, String title, int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}
	
	/**
	 * isDeletable
	 * @param state
	 * @return for the given state, whether deletion is possible.
	 */
	public boolean isDeletable(int state){
		System.out.println("State is: " + state);
		switch (state) {
			case 0: return true;	// created
			case 1:	return false;	// running
			case 2:	return true;	// running
			case 3:	return true;	// aborted
			default: return true;
		}
	}
	
}