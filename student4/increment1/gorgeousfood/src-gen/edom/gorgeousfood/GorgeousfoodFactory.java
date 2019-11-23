/**
 */
package edom.gorgeousfood;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edom.gorgeousfood.GorgeousfoodPackage
 * @generated
 */
public interface GorgeousfoodFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GorgeousfoodFactory eINSTANCE = edom.gorgeousfood.impl.GorgeousfoodFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Meal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meal</em>'.
	 * @generated
	 */
	Meal createMeal();

	/**
	 * Returns a new object of class '<em>Meal Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meal Item</em>'.
	 * @generated
	 */
	MealItem createMealItem();

	/**
	 * Returns a new object of class '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sale</em>'.
	 * @generated
	 */
	Sale createSale();

	/**
	 * Returns a new object of class '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor</em>'.
	 * @generated
	 */
	Descriptor createDescriptor();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GorgeousfoodPackage getGorgeousfoodPackage();

} //GorgeousfoodFactory
