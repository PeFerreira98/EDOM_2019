package pt.isep.edom.atl.example;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
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
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import pt.isep.edom.dsl.MMapDslStandaloneSetup;
import pt.isep.edom.mindmap.mindmap.MindmapFactory;
import pt.isep.edom.mindmap.mindmap.MindmapPackage;

public class RefactorDsl {

	public static void registerEcorePackages() {
		// do this only once per application
		Injector injector = new MMapDslStandaloneSetup().createInjectorAndDoEMFRegistration();

		// obtain a resourceset from the injector
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		
		// Initialize the model
		MindmapPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
        // MindmapFactory factory = MindmapFactory.eINSTANCE;		
		
        // Initialize the EMFTVM package  
		org.eclipse.m2m.atl.emftvm.EmftvmPackage.eINSTANCE.eClass();
		
		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());
	}
	
	public static void main(String[] args) {
		registerEcorePackages();		
		
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(rs.getResource(URI.createURI("http://www.example.org/mindmap"), true));
		env.registerMetaModel("MM", metaModel);
		
		// Load models
		Model inOutModel = EmftvmFactory.eINSTANCE.createModel();
		//inOutModel.setResource(rs.getResource(URI.createURI("../pt.isep.edom.dsl.mmapdsl.parent/pt.isep.edom.dsl.mmapdsl/dsl/test3.mmapdsl", true), true));
		inOutModel.setResource(rs.getResource(URI.createURI("instances-in/test3.mmapdsl", true), true));
		env.registerInOutModel("IN", inOutModel);

		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver("transformations/", new ResourceSetImpl());
		
		TimingData td = new TimingData();
		env.loadModule(mr, "refactoring");
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		try {
			//inOutModel.getResource().setURI(URI.createFileURI("../pt.isep.edom.dsl.mmapdsl.parent/pt.isep.edom.dsl.mmapdsl/dsl/test3-output.mmapdsl"));
			inOutModel.getResource().setURI(URI.createFileURI("instances-out/test3-refactoring-output.mmapdsl"));
			inOutModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
