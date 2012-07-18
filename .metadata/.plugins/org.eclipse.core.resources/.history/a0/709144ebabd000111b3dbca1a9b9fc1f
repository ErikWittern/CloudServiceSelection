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
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeType;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;


public class NewEvaluationWizardCustomAttributePrioritizationPage extends WizardPage {

	// create the tableViewer - needs to be public to be editable:
	TableViewer tableViewer;

	// List to store the attribute types:
	List<AttributeTypeData> atList = new ArrayList<AttributeTypeData>();

	// Label to list the number of comparisons (=n*(n-1)/2):
	Label numComparisonsLabel;

	Label value;
	
	String attributeName = "";
	
	ServicefeaturemodelEditor currentEditor;
	EditingDomain editingDomain;
	URI resourceURI;
	ResourceSet resourceSet;
	Resource resource;
	Service service;

	/**
	 * Constructor
	 * @param pageName
	 */
	protected NewEvaluationWizardCustomAttributePrioritizationPage(String pageName) {
		super(pageName);
		setTitle(Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Title);
		setMessage(Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Message);
	}
		
	/**
	 * createControl
	 */
	public void createControl(Composite parent) {
		// Create new composite as container for the table
		final Composite composite = new Composite(parent, SWT.NULL);
		
		GridLayoutFactory.swtDefaults().numColumns(1).margins(10, 5).applyTo(composite);
		
		loadAttributeTypes();
		
		value = new Label(composite, SWT.SINGLE);
		value.setText(Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part1
						+ " "  + attributeName + " " + 
						Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part2
						+ " " + Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_indifferent + " " +
						Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part3);
		
		final Scale scale = new Scale(composite, SWT.HORIZONTAL);
		scale.setBounds(0, 0, 300, 40);
		scale.setMaximum (7);
		scale.setMinimum(1);
		scale.setPageIncrement(1);
				
		scale.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				int perspectiveValue = scale.getMaximum() - scale.getSelection() + scale.getMinimum();
				String preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_indifferent;
				switch (perspectiveValue) {
					case 1:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_highly_preferred;		break;
					case 2:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_preferred;				break;
					case 3:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_slightly_preferred;	break;
					case 4:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_indifferent;			break;
					case 5:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_slightly_disliked;		break;
					case 6:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_disliked;				break;
					case 7:	preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_highly_disliked;		break;
					default:preference = Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_indifferent;			break;
				}
				value.setText(Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part1
								+ " "  + attributeName + " " + 
								Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part2
								+ " " + preference + " " +
								Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part3);
			}
		});
		scale.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		value.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
		
		//setControl(composite);
		setControl(composite);
		
		// validate page and setPageComplete if validation succeeded:
		if (validatePage() == true){
			setPageComplete(true);
		}
	}
	
	
//	@Override
//    public void setVisible(boolean visible) {
//        super.setVisible(visible);
//        if (visible) {
//        	updateLabels();
//		}
//    }
	
	public void updateLabels(){
		System.out.println("updateLabels() with index " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
		// Get current attribute Name and update the labels:
    	attributeName = ((NewEvaluationWizard)getWizard()).booleanAttributeTypesList.get(((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
    	System.out.println("Custom Attribute Configuration Page for attribute type: " + attributeName);
		value.setText(Messages.NewEvaluationWizard_CustomAttributePriortizationPage_Compare_Label_part0 + " " + attributeName);
	}
	
	
	/**
	 * validate();
	 * Checks whether the number of comparisons is sufficient:
	 * @return boolean
	 */
	private boolean validatePage() {
		return true;
	}

	/**
	 * getNextPage()
	 * Performs if the "next"-button is pressed.
	 * Saves the model (changes could have been made) & returns evaluationPage that was priorly added to the wizard.
	 */
//	public WizardPage getNextPage(){
//		// If there is another boolean Attribute Type...
//		System.out.println("1. Index: " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//		if(((NewEvaluationWizard)getWizard()).indexBooleanAttributeType < ((NewEvaluationWizard)getWizard()).booleanAttributeTypesList.size()){
//			System.out.println("2. There is a further boolean Attribute Type");
//			// ...set index +1 and return another custom attribute priortization page:
//			((NewEvaluationWizard)getWizard()).indexBooleanAttributeType++;
//			System.out.println("3. Index: " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//			updateLabels();
//			return ((NewEvaluationWizard)getWizard()).attPrioritizationPage;
//		}
//		System.out.println("2. There is NO further boolean Attribute Type, index " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//		// Else, return evaluation configuration page:
//		return ((NewEvaluationWizard)getWizard()).evaluationPage;
//	}
//	
//	public WizardPage getPreviousPage(){
//		System.out.println("previousPage() 1. Index: " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//		if(((NewEvaluationWizard)getWizard()).indexBooleanAttributeType > 1){
//			System.out.println("previousPage() 2. There is a previous boolean Attribute Type");
//			// ...set index -1 and return another custom attribute priortization page:
//			((NewEvaluationWizard)getWizard()).indexBooleanAttributeType--;
//			System.out.println("3. Index: " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//			updateLabels();
//			return ((NewEvaluationWizard)getWizard()).attPrioritizationPage;
//		}
//		((NewEvaluationWizard)getWizard()).indexBooleanAttributeType--;
//		System.out.println("previousPage() 2. There is NO further boolean Attribute Type, index " + ((NewEvaluationWizard)getWizard()).indexBooleanAttributeType);
//		return ((NewEvaluationWizard)getWizard()).attConfigurationPage;
//	}
	
	/**
	 * Load attribute types defined in currently active model.
	 * 
	 * @return ArrayList with all the Attribute Type elements from the model
	 *         currently active in the workspace.
	 */
	public void loadAttributeTypes() {
		System.out.println("loadAttributeTypes()");
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
		//int i = 0;
		for (Iterator<AttributeType> iter =  attributeTypes.getContains().iterator(); iter.hasNext() ; ){
			// TODO: Implement storing of new scale types into the model.
		}
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}