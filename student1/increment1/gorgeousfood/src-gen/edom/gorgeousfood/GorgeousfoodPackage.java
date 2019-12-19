/**
 */
package edom.gorgeousfood;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edom.gorgeousfood.GorgeousfoodFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GorgeousfoodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gorgeousfood";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gorgeousfood";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gorgeousfood";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GorgeousfoodPackage eINSTANCE = edom.gorgeousfood.impl.GorgeousfoodPackageImpl.init();

	/**
	 * The meta object id for the '{@link edom.gorgeousfood.impl.MealImpl <em>Meal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edom.gorgeousfood.impl.MealImpl
	 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getMeal()
	 * @generated
	 */
	int MEAL = 0;

	/**
	 * The feature id for the '<em><b>Meal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__MEAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Ingredient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL__INGREDIENT = 3;

	/**
	 * The number of structural features of the '<em>Meal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edom.gorgeousfood.impl.MealItemImpl <em>Meal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edom.gorgeousfood.impl.MealItemImpl
	 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getMealItem()
	 * @generated
	 */
	int MEAL_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Meal Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM__MEAL_ITEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM__EXP_DATE = 1;

	/**
	 * The feature id for the '<em><b>Prd Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM__PRD_DATE = 2;

	/**
	 * The feature id for the '<em><b>Meal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM__MEAL = 3;

	/**
	 * The number of structural features of the '<em>Meal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edom.gorgeousfood.impl.SaleImpl <em>Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edom.gorgeousfood.impl.SaleImpl
	 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getSale()
	 * @generated
	 */
	int SALE = 2;

	/**
	 * The feature id for the '<em><b>Sale ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__SALE_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Mealitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__MEALITEM = 2;

	/**
	 * The number of structural features of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edom.gorgeousfood.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edom.gorgeousfood.impl.DescriptorImpl
	 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Descriptor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__DESCRIPTOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edom.gorgeousfood.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edom.gorgeousfood.impl.IngredientImpl
	 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 4;

	/**
	 * The feature id for the '<em><b>Ingredient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__INGREDIENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link edom.gorgeousfood.Meal <em>Meal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meal</em>'.
	 * @see edom.gorgeousfood.Meal
	 * @generated
	 */
	EClass getMeal();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Meal#getMealID <em>Meal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meal ID</em>'.
	 * @see edom.gorgeousfood.Meal#getMealID()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_MealID();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Meal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edom.gorgeousfood.Meal#getDescription()
	 * @see #getMeal()
	 * @generated
	 */
	EAttribute getMeal_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edom.gorgeousfood.Meal#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptor</em>'.
	 * @see edom.gorgeousfood.Meal#getDescriptor()
	 * @see #getMeal()
	 * @generated
	 */
	EReference getMeal_Descriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link edom.gorgeousfood.Meal#getIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient</em>'.
	 * @see edom.gorgeousfood.Meal#getIngredient()
	 * @see #getMeal()
	 * @generated
	 */
	EReference getMeal_Ingredient();

	/**
	 * Returns the meta object for class '{@link edom.gorgeousfood.MealItem <em>Meal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meal Item</em>'.
	 * @see edom.gorgeousfood.MealItem
	 * @generated
	 */
	EClass getMealItem();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.MealItem#getMealItemID <em>Meal Item ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meal Item ID</em>'.
	 * @see edom.gorgeousfood.MealItem#getMealItemID()
	 * @see #getMealItem()
	 * @generated
	 */
	EAttribute getMealItem_MealItemID();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.MealItem#getExpDate <em>Exp Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Date</em>'.
	 * @see edom.gorgeousfood.MealItem#getExpDate()
	 * @see #getMealItem()
	 * @generated
	 */
	EAttribute getMealItem_ExpDate();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.MealItem#getPrdDate <em>Prd Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prd Date</em>'.
	 * @see edom.gorgeousfood.MealItem#getPrdDate()
	 * @see #getMealItem()
	 * @generated
	 */
	EAttribute getMealItem_PrdDate();

	/**
	 * Returns the meta object for the containment reference list '{@link edom.gorgeousfood.MealItem#getMeal <em>Meal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meal</em>'.
	 * @see edom.gorgeousfood.MealItem#getMeal()
	 * @see #getMealItem()
	 * @generated
	 */
	EReference getMealItem_Meal();

	/**
	 * Returns the meta object for class '{@link edom.gorgeousfood.Sale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sale</em>'.
	 * @see edom.gorgeousfood.Sale
	 * @generated
	 */
	EClass getSale();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Sale#getSaleID <em>Sale ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sale ID</em>'.
	 * @see edom.gorgeousfood.Sale#getSaleID()
	 * @see #getSale()
	 * @generated
	 */
	EAttribute getSale_SaleID();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Sale#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see edom.gorgeousfood.Sale#getDate()
	 * @see #getSale()
	 * @generated
	 */
	EAttribute getSale_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link edom.gorgeousfood.Sale#getMealitem <em>Mealitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mealitem</em>'.
	 * @see edom.gorgeousfood.Sale#getMealitem()
	 * @see #getSale()
	 * @generated
	 */
	EReference getSale_Mealitem();

	/**
	 * Returns the meta object for class '{@link edom.gorgeousfood.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see edom.gorgeousfood.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Descriptor#getDescriptorID <em>Descriptor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptor ID</em>'.
	 * @see edom.gorgeousfood.Descriptor#getDescriptorID()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_DescriptorID();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Descriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edom.gorgeousfood.Descriptor#getDescription()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Description();

	/**
	 * Returns the meta object for class '{@link edom.gorgeousfood.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see edom.gorgeousfood.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Ingredient#getIngredientID <em>Ingredient ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ingredient ID</em>'.
	 * @see edom.gorgeousfood.Ingredient#getIngredientID()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_IngredientID();

	/**
	 * Returns the meta object for the attribute '{@link edom.gorgeousfood.Ingredient#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edom.gorgeousfood.Ingredient#getDescription()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GorgeousfoodFactory getGorgeousfoodFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edom.gorgeousfood.impl.MealImpl <em>Meal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edom.gorgeousfood.impl.MealImpl
		 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getMeal()
		 * @generated
		 */
		EClass MEAL = eINSTANCE.getMeal();

		/**
		 * The meta object literal for the '<em><b>Meal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__MEAL_ID = eINSTANCE.getMeal_MealID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL__DESCRIPTION = eINSTANCE.getMeal_Description();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEAL__DESCRIPTOR = eINSTANCE.getMeal_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Ingredient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEAL__INGREDIENT = eINSTANCE.getMeal_Ingredient();

		/**
		 * The meta object literal for the '{@link edom.gorgeousfood.impl.MealItemImpl <em>Meal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edom.gorgeousfood.impl.MealItemImpl
		 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getMealItem()
		 * @generated
		 */
		EClass MEAL_ITEM = eINSTANCE.getMealItem();

		/**
		 * The meta object literal for the '<em><b>Meal Item ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL_ITEM__MEAL_ITEM_ID = eINSTANCE.getMealItem_MealItemID();

		/**
		 * The meta object literal for the '<em><b>Exp Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL_ITEM__EXP_DATE = eINSTANCE.getMealItem_ExpDate();

		/**
		 * The meta object literal for the '<em><b>Prd Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL_ITEM__PRD_DATE = eINSTANCE.getMealItem_PrdDate();

		/**
		 * The meta object literal for the '<em><b>Meal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEAL_ITEM__MEAL = eINSTANCE.getMealItem_Meal();

		/**
		 * The meta object literal for the '{@link edom.gorgeousfood.impl.SaleImpl <em>Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edom.gorgeousfood.impl.SaleImpl
		 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getSale()
		 * @generated
		 */
		EClass SALE = eINSTANCE.getSale();

		/**
		 * The meta object literal for the '<em><b>Sale ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__SALE_ID = eINSTANCE.getSale_SaleID();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE__DATE = eINSTANCE.getSale_Date();

		/**
		 * The meta object literal for the '<em><b>Mealitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALE__MEALITEM = eINSTANCE.getSale_Mealitem();

		/**
		 * The meta object literal for the '{@link edom.gorgeousfood.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edom.gorgeousfood.impl.DescriptorImpl
		 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '<em><b>Descriptor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__DESCRIPTOR_ID = eINSTANCE.getDescriptor_DescriptorID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__DESCRIPTION = eINSTANCE.getDescriptor_Description();

		/**
		 * The meta object literal for the '{@link edom.gorgeousfood.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edom.gorgeousfood.impl.IngredientImpl
		 * @see edom.gorgeousfood.impl.GorgeousfoodPackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Ingredient ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__INGREDIENT_ID = eINSTANCE.getIngredient_IngredientID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__DESCRIPTION = eINSTANCE.getIngredient_Description();

	}

} //GorgeousfoodPackage
