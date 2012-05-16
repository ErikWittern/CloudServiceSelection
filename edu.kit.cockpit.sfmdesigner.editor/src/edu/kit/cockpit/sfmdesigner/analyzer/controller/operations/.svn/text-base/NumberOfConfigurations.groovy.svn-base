package edu.kit.cockpit.sfmdesigner.analyzer.controller.operations

import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.jface.action.IAction;
import edu.kit.cockpit.sfmdesigner.analyzer.controller.core.CPHandler;

class NumberOfConfigurations extends ActionDelegate implements IActionDelegate{

	CPHandler cpHandler	// Operation handler for generic analysis operation handling
	

	void run(IAction action) {
		cpHandler = new CPHandler()
		Integer configurationNb
		configurationNb = cpHandler.getNumberOfConfigurations(false)
		println ""
		println "Found ${configurationNb} solutions using NO cardinalities."
	}
}
