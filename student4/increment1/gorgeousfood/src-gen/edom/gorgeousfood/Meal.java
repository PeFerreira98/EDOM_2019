/**
 */
package edom.gorgeousfood;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.Meal#getMealID <em>Meal ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.Meal#getDescription <em>Description</em>}</li>
 *   <li>{@link edom.gorgeousfood.Meal#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link edom.gorgeousfood.Meal#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @see edom.gorgeousfood.GorgeousfoodPackage#getMeal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveID mustHavePositiveID mustHaveDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveID='not MealID.oclIsInvalid()' mustHavePositiveID='MealID &gt; 0' mustHaveDescription='not Description.oclIsInvalid()'"
 * @generated
 */
public interface Meal extends EObject {
	/**
	 * Returns the value of the '<em><b>Meal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal ID</em>' attribute.
	 * @see #setMealID(int)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMeal_MealID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getMealID();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Meal#getMealID <em>Meal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal ID</em>' attribute.
	 * @see #getMealID()
	 * @generated
	 */
	void setMealID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMeal_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Meal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link edom.gorgeousfood.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMeal_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' containment reference list.
	 * The list contents are of type {@link edom.gorgeousfood.Descriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' containment reference list.
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMeal_Descriptor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Descriptor> getDescriptor();

} // Meal
