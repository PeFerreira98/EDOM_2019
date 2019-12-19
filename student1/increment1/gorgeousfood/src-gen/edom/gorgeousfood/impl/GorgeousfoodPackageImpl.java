/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.GorgeousfoodFactory;
import edom.gorgeousfood.GorgeousfoodPackage;
import edom.gorgeousfood.Ingredient;
import edom.gorgeousfood.Meal;
import edom.gorgeousfood.MealItem;
import edom.gorgeousfood.Sale;

import edom.gorgeousfood.util.GorgeousfoodValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GorgeousfoodPackageImpl extends EPackageImpl implements GorgeousfoodPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mealItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edom.gorgeousfood.GorgeousfoodPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GorgeousfoodPackageImpl() {
		super(eNS_URI, GorgeousfoodFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GorgeousfoodPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GorgeousfoodPackage init() {
		if (isInited)
			return (GorgeousfoodPackage) EPackage.Registry.INSTANCE.getEPackage(GorgeousfoodPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGorgeousfoodPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GorgeousfoodPackageImpl theGorgeousfoodPackage = registeredGorgeousfoodPackage instanceof GorgeousfoodPackageImpl
				? (GorgeousfoodPackageImpl) registeredGorgeousfoodPackage
				: new GorgeousfoodPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGorgeousfoodPackage.createPackageContents();

		// Initialize created meta-data
		theGorgeousfoodPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theGorgeousfoodPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return GorgeousfoodValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theGorgeousfoodPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GorgeousfoodPackage.eNS_URI, theGorgeousfoodPackage);
		return theGorgeousfoodPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeal() {
		return mealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeal_MealID() {
		return (EAttribute) mealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeal_Description() {
		return (EAttribute) mealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeal_Descriptor() {
		return (EReference) mealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeal_Ingredient() {
		return (EReference) mealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMealItem() {
		return mealItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMealItem_MealItemID() {
		return (EAttribute) mealItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMealItem_ExpDate() {
		return (EAttribute) mealItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMealItem_PrdDate() {
		return (EAttribute) mealItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealItem_Meal() {
		return (EReference) mealItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSale() {
		return saleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSale_SaleID() {
		return (EAttribute) saleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSale_Date() {
		return (EAttribute) saleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSale_Mealitem() {
		return (EReference) saleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptor_DescriptorID() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptor_Description() {
		return (EAttribute) descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIngredient_IngredientID() {
		return (EAttribute) ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIngredient_Description() {
		return (EAttribute) ingredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GorgeousfoodFactory getGorgeousfoodFactory() {
		return (GorgeousfoodFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		mealEClass = createEClass(MEAL);
		createEAttribute(mealEClass, MEAL__MEAL_ID);
		createEAttribute(mealEClass, MEAL__DESCRIPTION);
		createEReference(mealEClass, MEAL__DESCRIPTOR);
		createEReference(mealEClass, MEAL__INGREDIENT);

		mealItemEClass = createEClass(MEAL_ITEM);
		createEAttribute(mealItemEClass, MEAL_ITEM__MEAL_ITEM_ID);
		createEAttribute(mealItemEClass, MEAL_ITEM__EXP_DATE);
		createEAttribute(mealItemEClass, MEAL_ITEM__PRD_DATE);
		createEReference(mealItemEClass, MEAL_ITEM__MEAL);

		saleEClass = createEClass(SALE);
		createEAttribute(saleEClass, SALE__SALE_ID);
		createEAttribute(saleEClass, SALE__DATE);
		createEReference(saleEClass, SALE__MEALITEM);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__DESCRIPTOR_ID);
		createEAttribute(descriptorEClass, DESCRIPTOR__DESCRIPTION);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__INGREDIENT_ID);
		createEAttribute(ingredientEClass, INGREDIENT__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mealEClass, Meal.class, "Meal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeal_MealID(), theXMLTypePackage.getInt(), "MealID", null, 1, 1, Meal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeal_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Meal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeal_Descriptor(), this.getDescriptor(), null, "descriptor", null, 0, -1, Meal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeal_Ingredient(), this.getIngredient(), null, "ingredient", null, 0, -1, Meal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mealItemEClass, MealItem.class, "MealItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMealItem_MealItemID(), theXMLTypePackage.getInt(), "MealItemID", null, 1, 1, MealItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMealItem_ExpDate(), ecorePackage.getEDate(), "ExpDate", null, 0, 1, MealItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMealItem_PrdDate(), ecorePackage.getEDate(), "PrdDate", null, 0, 1, MealItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealItem_Meal(), this.getMeal(), null, "meal", null, 0, -1, MealItem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(saleEClass, Sale.class, "Sale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSale_SaleID(), theXMLTypePackage.getInt(), "SaleID", null, 1, 1, Sale.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSale_Date(), ecorePackage.getEDate(), "Date", null, 0, 1, Sale.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSale_Mealitem(), this.getMealItem(), null, "mealitem", null, 0, -1, Sale.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(descriptorEClass, edom.gorgeousfood.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_DescriptorID(), theXMLTypePackage.getInt(), "DescriptorID", null, 1, 1,
				edom.gorgeousfood.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Description(), ecorePackage.getEString(), "Description", null, 0, 1,
				edom.gorgeousfood.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_IngredientID(), theXMLTypePackage.getInt(), "IngredientID", null, 1, 1,
				Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Description(), ecorePackage.getEString(), "Description", null, 0, 1,
				Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore", "ecore.xml.type",
				"http://www.eclipse.org/emf/2003/XMLType" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(mealEClass, source,
				new String[] { "constraints", "mustHaveID mustHavePositiveID mustHaveDescription" });
		addAnnotation(mealItemEClass, source, new String[] { "constraints",
				"mustHaveID mustHavePositiveID mustHaveExpDate mustHavePrdDate expDateNextPrdDate" });
		addAnnotation(saleEClass, source, new String[] { "constraints", "mustHaveID mustHavePositiveID mustHaveDate" });
		addAnnotation(descriptorEClass, source,
				new String[] { "constraints", "mustHaveID mustHavePositiveID mustHaveDescription" });
		addAnnotation(ingredientEClass, source,
				new String[] { "constraints", "mustHaveID mustHavePositiveID mustHaveDescription" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(mealEClass, source, new String[] { "mustHaveID", "not MealID.oclIsInvalid()",
				"mustHavePositiveID", "MealID > 0", "mustHaveDescription", "not Description.oclIsInvalid()" });
		addAnnotation(mealItemEClass, source,
				new String[] { "mustHaveID", "not MealItemID.oclIsInvalid()", "mustHavePositiveID", "MealItemID > 0",
						"mustHaveExpDate", "not ExpDate.oclIsInvalid()", "mustHavePrdDate",
						"not PrdDate.oclIsInvalid()", "expDateNextPrdDate", "self.ExpDate > self.PrdDate" });
		addAnnotation(saleEClass, source, new String[] { "mustHaveID", "not SaleID.oclIsInvalid()",
				"mustHavePositiveID", "SaleID > 0", "mustHaveDate", "not Date.oclIsInvalid()" });
		addAnnotation(descriptorEClass, source, new String[] { "mustHaveID", "not DescriptorID.oclIsInvalid()",
				"mustHavePositiveID", "DescriptorID > 0", "mustHaveDescription", "not Description.oclIsInvalid()" });
		addAnnotation(ingredientEClass, source, new String[] { "mustHaveID", "not IngredientID.oclIsInvalid()",
				"mustHavePositiveID", "IngredientID > 0", "mustHaveDescription", "not Description.oclIsInvalid()" });
	}

} //GorgeousfoodPackageImpl
