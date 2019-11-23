/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GorgeousfoodFactoryImpl extends EFactoryImpl implements GorgeousfoodFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GorgeousfoodFactory init() {
		try {
			GorgeousfoodFactory theGorgeousfoodFactory = (GorgeousfoodFactory) EPackage.Registry.INSTANCE
					.getEFactory(GorgeousfoodPackage.eNS_URI);
			if (theGorgeousfoodFactory != null) {
				return theGorgeousfoodFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GorgeousfoodFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GorgeousfoodFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GorgeousfoodPackage.MEAL:
			return createMeal();
		case GorgeousfoodPackage.MEAL_ITEM:
			return createMealItem();
		case GorgeousfoodPackage.SALE:
			return createSale();
		case GorgeousfoodPackage.DESCRIPTOR:
			return createDescriptor();
		case GorgeousfoodPackage.INGREDIENT:
			return createIngredient();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meal createMeal() {
		MealImpl meal = new MealImpl();
		return meal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MealItem createMealItem() {
		MealItemImpl mealItem = new MealItemImpl();
		return mealItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sale createSale() {
		SaleImpl sale = new SaleImpl();
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient createIngredient() {
		IngredientImpl ingredient = new IngredientImpl();
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GorgeousfoodPackage getGorgeousfoodPackage() {
		return (GorgeousfoodPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GorgeousfoodPackage getPackage() {
		return GorgeousfoodPackage.eINSTANCE;
	}

} //GorgeousfoodFactoryImpl
