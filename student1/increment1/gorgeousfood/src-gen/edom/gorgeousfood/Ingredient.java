/**
 */
package edom.gorgeousfood;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.Ingredient#getIngredientID <em>Ingredient ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.Ingredient#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edom.gorgeousfood.GorgeousfoodPackage#getIngredient()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveID mustHavePositiveID mustHaveDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveID='not IngredientID.oclIsInvalid()' mustHavePositiveID='IngredientID &gt; 0' mustHaveDescription='not Description.oclIsInvalid()'"
 * @generated
 */
public interface Ingredient extends EObject {
	/**
	 * Returns the value of the '<em><b>Ingredient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient ID</em>' attribute.
	 * @see #setIngredientID(int)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getIngredient_IngredientID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getIngredientID();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Ingredient#getIngredientID <em>Ingredient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingredient ID</em>' attribute.
	 * @see #getIngredientID()
	 * @generated
	 */
	void setIngredientID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getIngredient_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Ingredient#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Ingredient
