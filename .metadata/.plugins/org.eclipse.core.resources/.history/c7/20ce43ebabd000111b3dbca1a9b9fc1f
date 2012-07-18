/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;


public class NewEvaluationWizardAttributeConfigurationPage extends WizardPage {

	// create the tableViewer - needs to be public to be editable:
	TableViewer tableViewer;

	// List to store the attribute types:
	static List<AttributeTypeData> atList = new ArrayList<AttributeTypeData>();

	// Label to list the number of comparisons (=n*(n-1)/2):
	static Label numComparisonsLabel;
	static int numComp = 0;

	static ServicefeaturemodelEditor currentEditor;
	static EditingDomain editingDomain;
	static URI resourceURI;
	static ResourceSet resourceSet;
	static Resource resource;
	static Service service;
	
	/**
	 * Constructor
	 * @param pageName
	 */
	protected NewEvaluationWizardAttributeConfigurationPage(String pageName) {
		super(pageName);
		setTitle(Messages.NewEvaluationWizard_AttributeConfigurationPage_Title);
		setMessage(Messages.NewEvaluationWizard_AttributeConfigurationPage_Message);
	}
		
	/**
	 * createControl
	 */
	public void createControl(Composite parent) {
		// Create new composite as container for the table
		final Composite composite = new Composite(parent, SWT.NULL);
		
		// Create grid layout and set the size of the margins
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		gridLayout.marginWidth = 15;
		gridLayout.marginHeight = 10;
		composite.setLayout(gridLayout);
		
		// JFace TableViewer is created in the defined composite to include it into grid layout:
		tableViewer = new TableViewer(composite, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		
		// create columns of tableviewer:
		createColumns(parent, tableViewer);
		
		// SWT Table + Make column heads and row lines visible:
		final Table table = tableViewer.getTable();		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		// Define content provider that delivers content in array form:
		tableViewer.setContentProvider(new ArrayContentProvider());
		
		// provide the table viewer with input object (which will be handled by the content provider):
		loadAttributeTypes();
		tableViewer.setInput(atList);
		
		
		// Create labels to contain text and number of comparisons:
		new Label(composite, SWT.NONE).setText(Messages.NewEvaluationWizard_AttributeConfigurationPage_LabelNumberComparisons);
		numComparisonsLabel = new Label(composite, SWT.NONE);
		numComparisonsLabel.setText("0");
	
		// set control of the wizard page:
		setControl(composite);
		
		// validate page and setPageComplete if validation succeeded:
		if (validatePage() == true){
			setPageComplete(true);
		}
	}
	
	/**
	 * validate();
	 * Checks whether the number of comparisons is sufficient:
	 * @return boolean
	 */
	private boolean validatePage() {
		// get number of comparisons:
		int numToBeEvaluated = 0;
		if (!(atList==null)) {
			for (int i = 0; i < atList.size(); i++) {
				if (atList.get(i).isToBeEvaluated()) {
					numToBeEvaluated++;
				}
			}
		}
		int numComparisons = (numToBeEvaluated * (numToBeEvaluated - 1)) / 2;
		numComparisonsLabel.setText("" + numComparisons);
		if(numComparisons < 1){
			setErrorMessage(Messages.NewEvaluationWizard_AttributeConfigurationPage_Error_InsufficientNumComparisons);
			setPageComplete(false);
			return false;
		}
		setErrorMessage(null);
		setPageComplete(true);
		return true;
	}

	/**
	 * getNextPage()
	 * Performs if the "next"-button is pressed.
	 * Saves the model (changes could have been made) & returns evaluationPage that was priorly added to the wizard.
	 */
//	public WizardPage getNextPage(){
//		storeAttributeTypes();
//		
//		// Case 1: No attribute types with binary aggregation 
//		if(!((NewEvaluationWizard)getWizard()).booleanAttributeTypesList.isEmpty()){
//			return ((NewEvaluationWizard)getWizard()).attPrioritizationPage;
//		}
//		// Case 2: At least one attribute type with binary aggregation
//		return ((NewEvaluationWizard)getWizard()).evaluationPage;
//	}
	
	
	/**
	 * createColumns
	 *  This will create the columns for the table
	 * @param parent
	 * @param viewer
	 */
	private void createColumns(final Composite parent, final TableViewer viewer) {
		// title and size of columns:
		String[] titles = { Messages.NewEvaluationWizard_AttributeConfigurationPage_TableColumnTitles_Name, 
							Messages.NewEvaluationWizard_AttributeConfigurationPage_TableColumnTitles_AggregationRule, 
							Messages.NewEvaluationWizard_AttributeConfigurationPage_TableColumnTitles_ScaleOrder, 
							Messages.NewEvaluationWizard_AttributeConfigurationPage_TableColumnTitles_ToBeEvaluated };
		int[] bounds = { 150, 150, 100, 100 };
		
		TableViewerColumn viewerNameColumn = createTableViewerColumn(tableViewer, titles[0], bounds[0], 0);
		viewerNameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributeTypeData at = (AttributeTypeData) element;
				return at.getName();
			}
		});
		/**viewerNameColumn.setEditingSupport(new EditingSupport(tableViewer) {

			protected boolean canEdit(Object element) {
				return true;
			}

			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(tableViewer.getTable());
			}

			protected Object getValue(Object element) {
				AttributeTypeData at = (AttributeTypeData) element;
				return at.getName();
			}

			protected void setValue(Object element, Object value) {
				AttributeTypeData at = (AttributeTypeData) element;
				at.setName(String.valueOf(value));
				tableViewer.refresh(element);
			}

		});**/
		
		
		TableViewerColumn viewerAggregationColumn = createTableViewerColumn(tableViewer, titles[1], bounds[1], 1);
		viewerAggregationColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributeTypeData at2 = (AttributeTypeData) element;
				return at2.getAggregationRule().toString();
			}
		});
		
		
		TableViewerColumn viewerScaleOrderColumn = createTableViewerColumn(tableViewer, titles[2], bounds[2], 2);
		viewerScaleOrderColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributeTypeData at3 = (AttributeTypeData) element;
				return at3.getScaleOrder().toString();
			}			
		});
		
		TableViewerColumn viewerToBeEvaluatedColumn = createTableViewerColumn(tableViewer, titles[3], bounds[3], 3);
		viewerToBeEvaluatedColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributeTypeData at4 = (AttributeTypeData) element;
				return at4.isToBeEvaluatedString();
			}
		});
		/**viewerToBeEvaluatedColumn.setEditingSupport(new EditingSupport(tableViewer) {

			protected boolean canEdit(Object element) {
				return true;
			}

			protected CellEditor getCellEditor(Object element) {			
				return new CheckboxCellEditor(tableViewer.getTable(), SWT.CHECK | SWT.READ_ONLY);
			}

			protected Object getValue(Object element) {
				AttributeTypeData at = (AttributeTypeData) element;
				return at.isToBeEvaluated();
			}

			protected void setValue(Object element, Object value) {
				AttributeTypeData at = (AttributeTypeData) element;
				at.setToBeEvaluated((Boolean) value);
				//storeAttributeTypes();
				validatePage();
				tableViewer.refresh(element);
			}

		});**/
	}
	
	
	/**
	 * Load attribute types defined in currently active model.
	 * 
	 * @return ArrayList with all the Attribute Type elements from the model
	 *         currently active in the workspace.
	 */
	public void loadAttributeTypes() {
		if(!(atList == null)){
			atList.clear();
		}
		
		// Get access to the instance of the model in use:
		currentEditor = (ServicefeaturemodelEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editingDomain = currentEditor.getEditingDomain();
		resourceSet = editingDomain.getResourceSet(); //new ResourceSetImpl();
		resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput());
		resource = resourceSet.getResource(resourceURI, true);
		// Read top-level element from the obtained resource:
		service = (Service) resource.getContents().get(0);
		
		AttributeTypes attributeTypes = service.getHas();
		for (Iterator<EObject> iter = attributeTypes.eAllContents(); iter.hasNext();) {
			AttributeType at = (AttributeType) iter.next();
			atList.add(new AttributeTypeData(at.getName(), at.getDescription(), at.getAggregationRule(), at.getScaleOrder(), at.isToBeEvaluated(), at.getCustomAttributeTypePriority(), at.getDomain()));
			if(at.getDomain().getLiteral().equals("Boolean")){
				((NewEvaluationWizard)getWizard()).booleanAttributeTypesList.add(at.getName());
			}
		}
	}
	
	
	/**
	 * Store attribute types as edited in the wizard.
	 * 
	 * @return ArrayList with all the Attribute Type elements from the model
	 *         currently active in the workspace.
	 */
	public void storeAttributeTypes() {
		// Get access to the instance of the model in use:
		ServicefeaturemodelEditor currentEditor = (ServicefeaturemodelEditor)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		EditingDomain editingDomain = currentEditor.getEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet(); //new ResourceSetImpl();
		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput());
		Resource resource = resourceSet.getResource(resourceURI, true);
		// Read top-level element from the obtained resource:
		Service service = (Service) resource.getContents().get(0);
		
		AttributeTypes attributeTypes = service.getHas();
		int i = 0;
		for (Iterator<AttributeType> iter =  attributeTypes.getContains().iterator(); iter.hasNext() ; ){
			AttributeType at = (AttributeType) iter.next();
			AttributeTypeData tempAT = atList.get(i);
			at.setName(tempAT.getName());
			at.setToBeEvaluated(tempAT.isToBeEvaluated());
			i++;
		}
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
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