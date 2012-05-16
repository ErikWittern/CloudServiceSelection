/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

public class RequirementsFilterWizardActionDelegate extends ActionDelegate implements IActionDelegate {

	protected EClass eClass;
	
	public RequirementsFilterWizardActionDelegate() {
		super();
	}
	
	/**
	 * run(IAction action)
	 * Performed when menu entry "Trigger evaluation..." is selected by user.
	 */
	@Override
	public void run(IAction action) {
		RequirementsFilterWizard wizard = new RequirementsFilterWizard();
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.open();
	}
}