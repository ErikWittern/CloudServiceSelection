package edu.kit.cockpit.sfmdesigner.analyzer.controller.operations;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import edu.kit.cockpit.sfmdesigner.analyzer.controller.core.CPHandler;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;

public class DetermineServiceConfigurationsActionDelegate extends
		ActionDelegate implements IActionDelegate {

	public void run(IAction action) {

		CPHandler cpHandler = new CPHandler();

		ResourceSet resourceSet = new ResourceSetImpl();
		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor()
				.getEditorInput());
		Resource resource = resourceSet.getResource(resourceURI, true);
		Service serviceModel = (Service) resource.getContents().get(0);
		cpHandler.getAllConfigurations(serviceModel, false);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}