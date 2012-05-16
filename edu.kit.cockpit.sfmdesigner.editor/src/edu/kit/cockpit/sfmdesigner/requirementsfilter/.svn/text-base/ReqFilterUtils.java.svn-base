package edu.kit.cockpit.sfmdesigner.requirementsfilter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Attribute;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Configuration;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeature;

public class ReqFilterUtils {
	
	public static void printConf(Configuration conf){
		System.out.println("Configuration " + conf.getName());
		System.out.print(" ATTS: ");
		for(Attribute att : conf.getDescribedBy()){
			System.out.print("" + att.getOfAttributeType().getName() + ": " + att.getInstantiationValue() + "; ");
		}
		System.out.print(" FEATURES: ");
		for(ServiceFeature f : conf.getGroups()){
			System.out.print("" + f.getName() + ", ");
		}
		System.out.println("");
	}
	

	public static Service loadModel(String modelName){
		// Load service model:
		String projectName = "";
		IEditorPart editorPart = (IEditorPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editorPart != null) {
			IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			projectName = activeProject.getName();
		}
		String path = Platform.getLocation().toString() + "/" + projectName + "/" + modelName;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource (URI.createFileURI(path), true);
		return (Service) resource.getContents().get(0);
	}
	
}