/**
 */
package edom.gorgeousfood.util;

import edom.gorgeousfood.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edom.gorgeousfood.GorgeousfoodPackage
 * @generated
 */
public class GorgeousfoodValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GorgeousfoodValidator INSTANCE = new GorgeousfoodValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edom.gorgeousfood";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GorgeousfoodValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return GorgeousfoodPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GorgeousfoodPackage.MEAL:
			return validateMeal((Meal) value, diagnostics, context);
		case GorgeousfoodPackage.MEAL_ITEM:
			return validateMealItem((MealItem) value, diagnostics, context);
		case GorgeousfoodPackage.SALE:
			return validateSale((Sale) value, diagnostics, context);
		case GorgeousfoodPackage.DESCRIPTOR:
			return validateDescriptor((edom.gorgeousfood.Descriptor) value, diagnostics, context);
		case GorgeousfoodPackage.INGREDIENT:
			return validateIngredient((Ingredient) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeal(Meal meal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meal, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMeal_mustHaveID(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMeal_mustHavePositiveID(meal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMeal_mustHaveDescription(meal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL__MUST_HAVE_ID__EEXPRESSION = "not MealID.oclIsInvalid()";

	/**
	 * Validates the mustHaveID constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeal_mustHaveID(Meal meal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL, meal, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", MEAL__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePositiveID constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL__MUST_HAVE_POSITIVE_ID__EEXPRESSION = "MealID > 0";

	/**
	 * Validates the mustHavePositiveID constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeal_mustHavePositiveID(Meal meal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL, meal, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePositiveID",
				MEAL__MUST_HAVE_POSITIVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not Description.oclIsInvalid()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeal_mustHaveDescription(Meal meal, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL, meal, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				MEAL__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem(MealItem mealItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mealItem, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealItem_mustHaveID(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealItem_mustHavePositiveID(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealItem_mustHaveExpDate(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealItem_mustHavePrdDate(mealItem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealItem_expDateNextPrdDate(mealItem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL_ITEM__MUST_HAVE_ID__EEXPRESSION = "not MealItemID.oclIsInvalid()";

	/**
	 * Validates the mustHaveID constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem_mustHaveID(MealItem mealItem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL_ITEM, mealItem, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", MEAL_ITEM__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePositiveID constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL_ITEM__MUST_HAVE_POSITIVE_ID__EEXPRESSION = "MealItemID > 0";

	/**
	 * Validates the mustHavePositiveID constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem_mustHavePositiveID(MealItem mealItem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL_ITEM, mealItem, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePositiveID",
				MEAL_ITEM__MUST_HAVE_POSITIVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveExpDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL_ITEM__MUST_HAVE_EXP_DATE__EEXPRESSION = "not ExpDate.oclIsInvalid()";

	/**
	 * Validates the mustHaveExpDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem_mustHaveExpDate(MealItem mealItem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL_ITEM, mealItem, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveExpDate",
				MEAL_ITEM__MUST_HAVE_EXP_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePrdDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL_ITEM__MUST_HAVE_PRD_DATE__EEXPRESSION = "not PrdDate.oclIsInvalid()";

	/**
	 * Validates the mustHavePrdDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem_mustHavePrdDate(MealItem mealItem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL_ITEM, mealItem, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePrdDate",
				MEAL_ITEM__MUST_HAVE_PRD_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the expDateNextPrdDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEAL_ITEM__EXP_DATE_NEXT_PRD_DATE__EEXPRESSION = "self.ExpDate > self.PrdDate";

	/**
	 * Validates the expDateNextPrdDate constraint of '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealItem_expDateNextPrdDate(MealItem mealItem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.MEAL_ITEM, mealItem, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "expDateNextPrdDate",
				MEAL_ITEM__EXP_DATE_NEXT_PRD_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSale(Sale sale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sale, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSale_mustHaveID(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSale_mustHavePositiveID(sale, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSale_mustHaveDate(sale, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SALE__MUST_HAVE_ID__EEXPRESSION = "not SaleID.oclIsInvalid()";

	/**
	 * Validates the mustHaveID constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSale_mustHaveID(Sale sale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.SALE, sale, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", SALE__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePositiveID constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SALE__MUST_HAVE_POSITIVE_ID__EEXPRESSION = "SaleID > 0";

	/**
	 * Validates the mustHavePositiveID constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSale_mustHavePositiveID(Sale sale, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.SALE, sale, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePositiveID",
				SALE__MUST_HAVE_POSITIVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDate constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SALE__MUST_HAVE_DATE__EEXPRESSION = "not Date.oclIsInvalid()";

	/**
	 * Validates the mustHaveDate constraint of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSale_mustHaveDate(Sale sale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.SALE, sale, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDate", SALE__MUST_HAVE_DATE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor(edom.gorgeousfood.Descriptor descriptor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(descriptor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescriptor_mustHaveID(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescriptor_mustHavePositiveID(descriptor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDescriptor_mustHaveDescription(descriptor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTOR__MUST_HAVE_ID__EEXPRESSION = "not DescriptorID.oclIsInvalid()";

	/**
	 * Validates the mustHaveID constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor_mustHaveID(edom.gorgeousfood.Descriptor descriptor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.DESCRIPTOR, descriptor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", DESCRIPTOR__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePositiveID constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTOR__MUST_HAVE_POSITIVE_ID__EEXPRESSION = "DescriptorID > 0";

	/**
	 * Validates the mustHavePositiveID constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor_mustHavePositiveID(edom.gorgeousfood.Descriptor descriptor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.DESCRIPTOR, descriptor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePositiveID",
				DESCRIPTOR__MUST_HAVE_POSITIVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESCRIPTOR__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not Description.oclIsInvalid()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptor_mustHaveDescription(edom.gorgeousfood.Descriptor descriptor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.DESCRIPTOR, descriptor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				DESCRIPTOR__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredient(Ingredient ingredient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ingredient, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIngredient_mustHaveID(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIngredient_mustHavePositiveID(ingredient, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIngredient_mustHaveDescription(ingredient, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveID constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INGREDIENT__MUST_HAVE_ID__EEXPRESSION = "not IngredientID.oclIsInvalid()";

	/**
	 * Validates the mustHaveID constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredient_mustHaveID(Ingredient ingredient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.INGREDIENT, ingredient, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveID", INGREDIENT__MUST_HAVE_ID__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHavePositiveID constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INGREDIENT__MUST_HAVE_POSITIVE_ID__EEXPRESSION = "IngredientID > 0";

	/**
	 * Validates the mustHavePositiveID constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredient_mustHavePositiveID(Ingredient ingredient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.INGREDIENT, ingredient, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHavePositiveID",
				INGREDIENT__MUST_HAVE_POSITIVE_ID__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the mustHaveDescription constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INGREDIENT__MUST_HAVE_DESCRIPTION__EEXPRESSION = "not Description.oclIsInvalid()";

	/**
	 * Validates the mustHaveDescription constraint of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIngredient_mustHaveDescription(Ingredient ingredient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(GorgeousfoodPackage.Literals.INGREDIENT, ingredient, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "mustHaveDescription",
				INGREDIENT__MUST_HAVE_DESCRIPTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GorgeousfoodValidator
