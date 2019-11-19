package pt.isep.edom.atl.example2;
 
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import mindmap.MindmapPackage;
import pt.isep.edom.mmapdsl.MMapDslStandaloneSetup;
import pt.isep.edom.requirements.RequirementsPackage;

public class MMapDsl2Req {

	public static void initOCL() {
		//-----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		OCLDelegateDomain.initialize(null);
		
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install();
		//-------------		
	}
	
	public static void registerEcorePackages() {
		// do this only once per application
		Injector injector = new MMapDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		// obtain a resourceset from the injector
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);

		// Associate the "mindmap" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("requirements", new XMIResourceFactoryImpl());
		
		// Initialize the model
		MindmapPackage.eINSTANCE.eClass();

		// Initialize the model
		RequirementsPackage.eINSTANCE.eClass();
		
		// Retrieve the default factory singleton
        // MindmapFactory factory = MindmapFactory.eINSTANCE;		

        // Initialize the EMFTVM package  
		org.eclipse.m2m.atl.emftvm.EmftvmPackage.eINSTANCE.eClass();
		
		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}
	
	public static void main(String[] args) {
		// Initialize OCL support
		initOCL();
		
		registerEcorePackages();		
		
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(rs.getResource(URI.createURI("http://www.example.org/mindmap"), true));
		env.registerMetaModel("MM", metaModel);
		
		Metamodel metaModel2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel2.setResource(rs.getResource(URI.createURI("http://www.example.org/requirements"), true));
		env.registerMetaModel("MM1", metaModel2);
		
		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		//inModel.setResource(rs.getResource(URI.createURI("../pt.isep.edom.dsl.mmapdsl.parent/pt.isep.edom.dsl.mmapdsl/dsl/test3.mmapdsl", true), true));
		//inModel.setResource(rs.getResource(URI.createURI("instances-in/test3.mmapdsl", true), true));
		inModel.setResource(rs.getResource(URI.createURI("dsl/AgendaApp.mmapdsl", true), true));
		env.registerInputModel("IN", inModel);
		
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		//outModel.setResource(rs.createResource(URI.createFileURI("../pt.isep.edom.requirements/instances/test3.requirements")));
		outModel.setResource(rs.createResource(URI.createFileURI("instances-out/test3.requirements")));
		env.registerOutputModel("OUT", outModel);

		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver("transformations/", new ResourceSetImpl());
		
		TimingData td = new TimingData();
		env.loadModule(mr, "map2req");
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
