package pt.isep.edom.atl.example2;

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

import mindmap.*;

public class Refactor {
	
	public static void registerEcorePackages() {
		// Associate the "mindmap" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mindmap", new XMIResourceFactoryImpl());
		
		// Initialize the mindmap package 
		MindmapPackage.eINSTANCE.eClass();
		
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
		//inOutModel.setResource(rs.getResource(URI.createURI("../pt.isep.edom.mindmap/instances/exemplo2.mindmap", true), true));
		inOutModel.setResource(rs.getResource(URI.createURI("instances-in/exemplo2.mindmap", true), true));
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
			// inOutModel.getResource().setURI(URI.createFileURI("../pt.isep.edom.mindmap/instances/exemplo3-output.mindmap"));
			inOutModel.getResource().setURI(URI.createFileURI("instances-out/exemplo2-refactoring-output.mindmap"));
			inOutModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
