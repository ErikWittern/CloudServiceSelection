/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import org.eclipse.jface.wizard.Wizard;


public class RequirementsFilterWizard extends Wizard {

	RequirementsFilterConfigurationPage configPage;
	
	
	/**
	 * Constructor
	 */
	public RequirementsFilterWizard() {
		setWindowTitle("Configure requriements filter");
	}

	/**
	 * performFinish
	 */
	public boolean performFinish() {
		String serviceModelName = configPage.getServiceModelSelection();
		System.out.println("ServiceModelName: " + serviceModelName);
		
		String reqModelName = configPage.getRequirementsModelSelection();
		System.out.println("ReqModelName: " + reqModelName);
		
		RequirementsFilter.filterRequirements(reqModelName, serviceModelName);
		
		return true;
	}

	/**
	 * performCancel
	 */
	public boolean performCancel() {
		return true;
	}

	/**
	 * addPages
	 */
	public void addPages() {
		configPage = new RequirementsFilterConfigurationPage("Configure requirements filter");
		addPage(configPage);		
	}
}
