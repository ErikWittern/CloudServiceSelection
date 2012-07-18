/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */

package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.valuationserver.rest.clients.EvaluationClient;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluation;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluations;
import edu.kit.cockpit.valuationserver.rest.messages.Evaluations.EvaluationEntry;


public class EvaluationResultsWizardEvaluationSelectionPage extends WizardPage {

	// create the tableViewer - needs to be public to be editable:
	TableViewer tableViewer;
	static Table table;
	static String selectedEvaluationURL;
	static long selectedEvaluationId;
	EvaluationClient ec;
	
	List<Evaluation> evaluationsList;
	
	/**
	 * Constructor
	 * @param pageName
	 */
	protected EvaluationResultsWizardEvaluationSelectionPage(String pageName) {
		super(pageName);
		setTitle(Messages.EvaluationResultsWizard_EvaluationSelectionPage_Title);
		setMessage(Messages.EvaluationResultsWizard_EvaluationSelectionPage_Message);
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
					selectedEvaluationId = evaluationsList.get(table.getSelectionIndex()).getEvaluationId();
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
			// Get access to the instance of the model in use:
			ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			EditingDomain editingDomain = currentEditor.getEditingDomain();
			ResourceSet resourceSet = editingDomain.getResourceSet(); //new ResourceSetImpl();
			URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput());
			Resource resource = resourceSet.getResource(resourceURI, true);
			// Read top-level element from the obtained resource:
			Service service = (Service) resource.getContents().get(0);
			String currentServiceId = service.getId();
			
			List<EvaluationEntry> tempEvaluationsList = eval.getEvaluationEntry();
			for (int i = 0; i < tempEvaluationsList.size(); i++) {
				EvaluationEntry temp = tempEvaluationsList.get(i);
				Evaluation tempEval = ec.getEvaluation(temp.getEvaluationUrl());
				// Add evaluation to List only if service id matches:
				if(tempEval.getServiceId().equals(currentServiceId)){
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
			}
		} else {
			MessageDialog.openError(getShell(),
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Title,
					Messages.EvaluationManagementWizard_EvaluationSelectionPage_GET_Evaluation_Error_Message);
		}
	}
	
	/**
	 * getSelectedEvaluationUrl
	 * @return
	 */
	public String getSelectedEvaluationUrl(){
		return selectedEvaluationURL;
	}
	
	/**
	 * getSelectedEvaluationId
	 * @return
	 */
	public long getSelectedEvaluationId(){
		return selectedEvaluationId;
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
}