/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

public class RequirementsFilterConfigurationPage extends WizardPage {

	/**
	 * Constructor
	 * @param pageName
	 */
	protected RequirementsFilterConfigurationPage(String pageName) {
		super(pageName);
		setTitle("Configure requirements filter");
		setMessage("Use this page to configure the requirements filtering");
	}
	
	
	String selectedRequirementsModel;
	String selectedServiceModel;
	
	public void createControl(Composite parent) {
		setPageComplete(false);
		
		// Create composite to hold the widgets:
		Composite composite = new Composite(parent, SWT.NONE);
		
		// Create layout for wizard-page
		GridLayout grid = new GridLayout(1, false);
		composite.setLayout(grid);
		
		// Requirements selection elements:
		final Label requirementsSelectionLabel = new Label(composite, SWT.LEFT);
		requirementsSelectionLabel.setText("Select the Requirements Model here:");
		GridData reqLabelData = new GridData();
		reqLabelData.horizontalAlignment = GridData.FILL;
		requirementsSelectionLabel.setLayoutData(reqLabelData);
		
		final org.eclipse.swt.widgets.List requirementsModelList = new org.eclipse.swt.widgets.List(
					composite, SWT.MULTI | SWT.SINGLE | SWT.BORDER
							| SWT.V_SCROLL | SWT.H_SCROLL);
		GridData reqListData = new GridData();
		reqListData.horizontalAlignment = GridData.FILL;
		reqListData.grabExcessHorizontalSpace = true;
		requirementsModelList.setLayoutData(reqListData);
		
		// Service selection elements:
		final Label serviceSelectionLabel = new Label(composite, SWT.LEFT);
		serviceSelectionLabel.setText("Select the Service Model here:");
		GridData serLabelData = new GridData();
		serLabelData.horizontalAlignment = GridData.FILL;
		serviceSelectionLabel.setLayoutData(serLabelData);
		
		final org.eclipse.swt.widgets.List serviceModelList = new org.eclipse.swt.widgets.List(
					composite, SWT.MULTI | SWT.SINGLE | SWT.BORDER
							| SWT.V_SCROLL | SWT.H_SCROLL);		
		GridData serListData = new GridData();
		serListData.horizontalAlignment = GridData.FILL;
		serListData.grabExcessHorizontalSpace = true;
		serviceModelList.setLayoutData(serListData);
		
		
		// Get list of all files in the "template" folder:
		String projectName = "";
		IEditorPart editorPart = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editorPart != null) {
			IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			projectName = activeProject.getName();
		}
		String path = Platform.getLocation().toString() + "/" + projectName;
		System.out.println("path: " + path);
		
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		if (listOfFiles != null && listOfFiles.length != 0) {
			for (int i = 0; i < listOfFiles.length; i++) {
				// Get each file's extension:
				String fileExtension = listOfFiles[i].toString().substring(
						listOfFiles[i].toString().lastIndexOf("."));
				// Add to service model and requirements model list:
				if (fileExtension.equals(".sfm")) {
					serviceModelList.add(listOfFiles[i].getName());
					requirementsModelList.add(listOfFiles[i].getName());
				}
			}

			// Add listener to the lists:
			Listener serviceModelListListener = new Listener() {
				public void handleEvent(Event event) {
					String[] items = serviceModelList.getSelection();
					if(items.length != 0 && items[0] != null && !items[0].equals("")){
						serviceSelectionLabel.setText("You selected Service Model: " + items[0]);
						selectedServiceModel = items[0];
					} else {
						serviceSelectionLabel.setText("Select the Service Model here:");
						selectedServiceModel = "";
					}
					validatePage();
				}
			};
			serviceModelList.addListener(SWT.Selection, serviceModelListListener);
			
			Listener requirementsModelListListener = new Listener() {
				public void handleEvent(Event event) {
					String[] items = requirementsModelList.getSelection();
					if(items.length != 0 && items[0] != null && !items[0].equals("")){
						requirementsSelectionLabel.setText("You selected Requirements Model: " + items[0]);
						selectedRequirementsModel = items[0];
					} else {
						requirementsSelectionLabel.setText("Select the Requirements Model here:");
						selectedRequirementsModel = "";
					}
					validatePage();
				}
			};
			requirementsModelList.addListener(SWT.Selection, requirementsModelListListener);
		}
		setControl(composite);
	}

	
	public String getServiceModelSelection(){
		return selectedServiceModel;
	}
	
	public String getRequirementsModelSelection(){
		return selectedRequirementsModel;
	}
	
	
	
	/**
	 * validate();
	 * @return boolean
	 */
	private boolean validatePage() {
		boolean finished = (getServiceModelSelection() != null && getServiceModelSelection() != "") && (getRequirementsModelSelection() != null && getRequirementsModelSelection() != "");
		if(finished){
			setErrorMessage(null);
			setPageComplete(true);
		} else {
			setErrorMessage("Please select requirements and service model.");
			setPageComplete(false);
		}
		return finished;
	}
}