package pt.isep.edom.project.c3.mm.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerateDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadModel();
	}

	public static void loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Initialize the model
		DomainPackage.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		DomainFactory factory = DomainFactory.eINSTANCE;

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createURI("instances/gorgeousfood.xmi"), true);

		// now load the content.
		PrintWriter writer=null;
		try {
			resource.load(Collections.EMPTY_MAP);

			EObject root = resource.getContents().get(0);
			DomainModel myDomain=(DomainModel)root;
			
			System.out.println(root.toString());
			
			//-----
			// Generate a plantuml file that represents the mind map diagram
			FileWriter w = new FileWriter("instances/gorgeousfood.puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        writer.println("digraph xpto {");
	        
	        writer.println(myDomain.getName());
	        
			// For the Topics
//			for (MapElement e: myMap.getElements()) {
//				if (e instanceof Topic) {
//					Topic t=(Topic)e;
//					writer.println(t.getName());
//				}
//			} 
			
			// For the hierarchy
//			for (MapElement e: myMap.getElements()) {
//				if (e instanceof Topic) {
//					Topic t=(Topic)e;
//					for (Topic t2: t.getSubtopics()) {
//						writer.println(t.getName()+ " -> "+t2.getName());
//					}
//				}
//			}
			
			writer.println("}");
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
	}
}