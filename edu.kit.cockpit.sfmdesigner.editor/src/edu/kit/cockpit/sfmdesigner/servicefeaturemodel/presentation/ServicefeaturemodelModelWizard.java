/*
 * Project: Cockpit Service Feature Model designer
 * Author:  Erik Wittern
 * Copyright (c): KIT, 2011
 */
package edu.kit.cockpit.sfmdesigner.servicefeaturemodel.presentation;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;
import java.util.UUID;

import org.eclipse.emf.common.CommonPlugin;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.AttributeTypes;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.PossibleConfigurations;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.Service;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServiceFeatureDiagram;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelFactory;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.ServicefeaturemodelPackage;
import edu.kit.cockpit.sfmdesigner.servicefeaturemodel.provider.ServiceFeatureModelEditPlugin;



import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicefeaturemodelModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicefeaturemodelPackage servicefeaturemodelPackage = ServicefeaturemodelPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicefeaturemodelFactory servicefeaturemodelFactory = servicefeaturemodelPackage.getServicefeaturemodelFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicefeaturemodelModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicefeaturemodelModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * This is the template selection page
	 * by Erik Wittern
	 */
	protected ServicefeaturemodelModelWizardTemplateSelectionPage templateSelectionPage;
	
	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 *  Stores the URI of the project folder:
	 */
	static String projectFolderURIString;
	
	static String projectFolder;
	
	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ServiceFeatureModelEditorPlugin.INSTANCE.getImage("full/wizban/NewServicefeaturemodel")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : servicefeaturemodelPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)servicefeaturemodelPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = servicefeaturemodelFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
							
							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);
														
							// Get selection from servicefeaturemodelModelWizardTemplateSelectionPage:
							String selectedTemplate = templateSelectionPage.getSelection();	
							
							if(selectedTemplate == null){ // case: no template selected.
								// Add the initial model object to the contents.
								EObject rootObject = createInitialModel();
								if (rootObject != null) {
									resource.getContents().add(rootObject);
								}
								
								// Get Service object to add further nodes:
								Service service = (Service) resource.getContents().get(0);
								
								// Give new UUID:
								System.out.println("Start ID giving: ");
								UUID uuid = UUID.randomUUID();
								System.out.println("UUID created.");
								String randomUUIDString = uuid.toString();
								System.out.println("UUID: " + uuid.toString());
								service.setId(randomUUIDString);
								
								// Add the AttributeTypes node under the Service node:
								AttributeTypes attTypes = servicefeaturemodelFactory.createAttributeTypes();
								service.setHas(attTypes);
							
								// Add the ServiceFeatureDiagram node under the Service node:
								ServiceFeatureDiagram sfd = servicefeaturemodelFactory.createServiceFeatureDiagram();
								service.setRepresentedBy(sfd);
															
								// Add the PossibleConfigurations node under the Service node:
								PossibleConfigurations possConfs = servicefeaturemodelFactory.createPossibleConfigurations();
								service.setEnables(possConfs);
								
							}else{ // case: template selected
								
								// Get URI of the selected template-resource:
								URI templateURI = URI.createPlatformResourceURI(projectFolder + "/" + selectedTemplate, true);
																
								ResourceSet templateResourceSet = new ResourceSetImpl();
								Resource templateResource = templateResourceSet.createResource(templateURI);
								
								// Load the resource already available at the specified URI:
								try {
									templateResource.load(null);
								} catch (Exception e) {
									MessageDialog.openError(getShell(), "Error loading template", "The selected template could not be loaded. Please check the availability of the template and re-run the model creation wizard.");
								}
								// Get the ServiceFeatureDiagram (= top Object) of the template resource:
								Service templateSFD = (Service)templateResource.getContents().get(0);
								
								// Give new UUID:
								System.out.println("Start ID giving: ");
								UUID uuid = UUID.randomUUID();
								System.out.println("UUID created.");
								String randomUUIDString = uuid.toString();
								System.out.println("UUID: " + uuid.toString());
								templateSFD.setId(randomUUIDString);
								
								System.out.println("Service: " + templateSFD.getName() + " with uuid: " + templateSFD.getId());
								
								// Add the loaded ServiceFeatureDiagram to the resource of the new model:
								resource.getContents().add(templateSFD);
							}	
							
							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							ServiceFeatureModelEditPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			ServiceFeatureModelEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ServicefeaturemodelModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ServicefeaturemodelModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(ServiceFeatureModelEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ServicefeaturemodelModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ServicefeaturemodelModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public String getInitialObjectName() {
//			String label = initialObjectField.getText();
//
//			for (String name : getInitialObjectNames()) {
//				if (getLabel(name).equals(label)) {
//					return name;
//				}
//			}
//			return null;
			return "Service";
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return ServiceFeatureModelEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				ServiceFeatureModelEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * This is the page where the template to create is selected.
	 * by Erik Wittern
	 */
	public class ServicefeaturemodelModelWizardTemplateSelectionPage extends WizardPage{

		protected ServicefeaturemodelModelWizardTemplateSelectionPage(String pageName) {
			super(pageName);
			setTitle("Uargh!");
			setDescription("Please select the template to use.");
		}
		
		String selectedTemplate;
		
		public void createControl(Composite parent) {
			// Create composite to hold the widgets:
			Composite composite = new Composite(parent, SWT.NONE);
			
			// Create layout for wizard-page
			GridLayout grid = new GridLayout();
			int numCol = 1;
			grid.numColumns = numCol;
			composite.setLayout(grid);
			
			// Create label to indicate the made selection (create widget and data object):
			final Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText("Select the template here");
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}
			
			// Get list of all files in the "template" folder:
			File folder = new File(projectFolderURIString);
			File[] listOfFiles = folder.listFiles();
			
			// Fill the found files into the listCreate List:
			final org.eclipse.swt.widgets.List list = new org.eclipse.swt.widgets.List(composite, SWT.MULTI | SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
			for (int i = 0; i < listOfFiles.length; i++) {
				// Get each file's extension:
				String fileExtension = listOfFiles[i].toString().substring(listOfFiles[i].toString().lastIndexOf("."));
				// Add template to list, if file extension matches:
				if(fileExtension.equals(".sfm")){
					list.add(listOfFiles[i].getName());
				}
			}
			
			// Add listener to the list:
			Listener lListener = new Listener() {
				public void handleEvent(Event event) {
					String[] items = list.getSelection();
			         containerLabel.setText("You selected: " + items[0]);
			         selectedTemplate = items[0];
				}
			};
			
			list.addListener(SWT.Selection, lListener);
			
			GridData listData = new GridData();
			listData.horizontalAlignment = GridData.FILL;
			listData.grabExcessHorizontalSpace = true;
			list.setLayoutData(listData);
		
			setControl(composite);
		}
		
		/**
		 * Method to return the selection made for the template:
		 * @return String with the selected template
		 */
		public String getSelection(){
			return selectedTemplate;
		}
		
	}

	
	
	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ServicefeaturemodelModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelModelWizard_label"));
		newFileCreationPage.setDescription(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelModelWizard_description"));
		newFileCreationPage.setFileName(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);
		
		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
					
					// Store folder of the project in variables:
					projectFolderURIString = Platform.getLocation().toString() + selectedResource.getFullPath().toString();
					projectFolder = selectedResource.getFullPath().toString();
					System.out.println("@addPages - projectFolderURIString: " + projectFolderURIString);
					System.out.println("@addPages - projectFolder: " + projectFolder);

					
					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		
		// Add templateSelectionPage to Wizard:
		templateSelectionPage = new ServicefeaturemodelModelWizardTemplateSelectionPage("Any_Text_is_suitable.");
		templateSelectionPage.setTitle(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelModelWizard_label"));
		templateSelectionPage.setDescription("Select a template to define the feature structure to be used.");
		addPage(templateSelectionPage);
		
		
		initialObjectCreationPage = new ServicefeaturemodelModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_ServicefeaturemodelModelWizard_label"));
		initialObjectCreationPage.setDescription(ServiceFeatureModelEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
