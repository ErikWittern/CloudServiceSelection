package edu.kit.cockpit.sfmdesigner.analyzer.controller.operations

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import choco.cp.model.CPModel;
import edu.kit.cockpit.sfmdesigner.analyzer.controller.core.CPHandler
import edu.kit.cockpit.sfmdesigner.analyzer.controller.core.VariableExtractionContext
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.ui.util.EditUIUtil
import org.eclipse.jface.action.IAction
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IActionDelegate
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.actions.ActionDelegate


class AllServiceConfigurations extends ActionDelegate implements IActionDelegate{

	CPHandler cpHandler	// Operation handler for generic analysis operation handling

//	void run(IAction action) {
//
//		cpHandler = new CPHandler()
//
//		ResourceSet resourceSet = new ResourceSetImpl()
//		URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput())
//		Resource resource = resourceSet.getResource(resourceURI, true)
//		Service serviceModel = (Service)resource.getContents().get(0)
//		cpHandler.getAllConfigurations(serviceModel, false)
//		resource.save(null)
//
//	}
	
	void run(IAction action) {
		try {
			new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()).run(false, false, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					monitor.setTaskName("Determining service configurations.");

					cpHandler = new CPHandler()
					
					ResourceSet resourceSet = new ResourceSetImpl()
					URI resourceURI = EditUIUtil.getURI(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput())
					Resource resource = resourceSet.getResource(resourceURI, true)
					Service serviceModel = (Service)resource.getContents().get(0)
					cpHandler.getAllConfigurations(serviceModel, false)
					resource.save(null)

				}
			});
		} catch (InvocationTargetException e2) {
			e2.printStackTrace();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
	}
}