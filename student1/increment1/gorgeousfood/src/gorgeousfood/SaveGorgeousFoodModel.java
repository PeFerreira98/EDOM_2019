package gorgeousfood;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import edom.gorgeousfood.*;
import gorgeousfood.*;

public class SaveGorgeousFoodModel {

	public static void main(String[] args) {
	      saveModel();
	}
	
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
	
	@SuppressWarnings("deprecation")
	public static void saveModel() {
		// Initialize OCL support
				initOCL();
				
				// Associate the "gorgeous" extension with the XMI resource format
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("gorgeousfood", new XMIResourceFactoryImpl());
				
				// Initialize the model
				GorgeousfoodPackage.eINSTANCE.eClass();
				
				GorgeousfoodFactory factory = GorgeousfoodFactory.eINSTANCE;
				
				Sale mySale = factory.createSale();
				mySale.setSaleID(1);
				mySale.setDate(new Date("2019-11-11"));
				
				MealItem myMealItem = factory.createMealItem();
				myMealItem.setExpDate(new Date("2020-11-11"));
				myMealItem.setPrdDate(new Date("2018-11-11"));
				myMealItem.setMealItemID(1);			
				
				Meal myMeal = factory.createMeal();
				myMeal.setDescription("Meal1");
				myMeal.setMealID(1);
				
				Ingredient myIngredient = factory.createIngredient();
				myIngredient.setDescription("Ingredient1");
				myIngredient.setIngredientID(1);
				
				Descriptor myDescriptor = factory.createDescriptor();
				myDescriptor.setDescription("Descriptor1");
				myDescriptor.setDescriptorID(1);
				
				myMeal.getDescriptor().add(myDescriptor);
				myMeal.getIngredient().add(myIngredient);
				
				myMealItem.getMeal().add(myMeal);
				
				mySale.getMealitem().add(myMealItem);
				
				// Obtain a new resource set
		        ResourceSet resSet = new ResourceSetImpl();
		        
		        // create a resource
		        Resource resource = resSet.createResource(URI.createURI("instances/exemplo1.gorgeousfood"));

		        resource.getContents().add(mySale);
		        
		        System.out.println("Root topics:");
		        EList<MealItem> mealItens=mySale.getMealitem();
		        for (MealItem s: mealItens) {
		        	System.out.println(s.getMeal().toString() + s.getMealItemID() + s.getExpDate() + s.getPrdDate());
		        }
		        
		     // Add a call to validation...
		        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
		        // See: generated code for MindmapValidator.java
		        // See: https://mattsch.com/2012/05/31/how-to-use-ocl-when-running-emf-standalone/
		        // See: https://wiki.eclipse.org/OCL/OCLinEcore
		        System.out.println("Diagnostic:");
		        Diagnostic diag=Diagnostician.INSTANCE.validate(mySale);
		        if (diag.getSeverity()!=Diagnostic.OK) {
		        	System.out.println(diag.getMessage());
		        	List<Diagnostic> l=diag.getChildren();
		        	for (Diagnostic d: l) {
		        		System.out.println(d.getMessage());
		        	}
		        }
		        else {
		        	System.out.println(" Everything seems fine :-)");
		        }
		        
		     // now save the content.
		        try {
		            resource.save(Collections.EMPTY_MAP);
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } 	

	}
}
