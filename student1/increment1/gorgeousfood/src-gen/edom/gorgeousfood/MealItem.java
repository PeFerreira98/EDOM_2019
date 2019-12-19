/**
 */
package edom.gorgeousfood;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meal Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.MealItem#getMealItemID <em>Meal Item ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.MealItem#getExpDate <em>Exp Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.MealItem#getPrdDate <em>Prd Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.MealItem#getMeal <em>Meal</em>}</li>
 * </ul>
 *
 * @see edom.gorgeousfood.GorgeousfoodPackage#getMealItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveID mustHavePositiveID mustHaveExpDate mustHavePrdDate expDateNextPrdDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveID='not MealItemID.oclIsInvalid()' mustHavePositiveID='MealItemID &gt; 0' mustHaveExpDate='not ExpDate.oclIsInvalid()' mustHavePrdDate='not PrdDate.oclIsInvalid()' expDateNextPrdDate='self.ExpDate &gt; self.PrdDate'"
 * @generated
 */
public interface MealItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Meal Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Item ID</em>' attribute.
	 * @see #setMealItemID(int)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMealItem_MealItemID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getMealItemID();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.MealItem#getMealItemID <em>Meal Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Item ID</em>' attribute.
	 * @see #getMealItemID()
	 * @generated
	 */
	void setMealItemID(int value);

	/**
	 * Returns the value of the '<em><b>Exp Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Date</em>' attribute.
	 * @see #setExpDate(Date)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMealItem_ExpDate()
	 * @model
	 * @generated
	 */
	Date getExpDate();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.MealItem#getExpDate <em>Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Date</em>' attribute.
	 * @see #getExpDate()
	 * @generated
	 */
	void setExpDate(Date value);

	/**
	 * Returns the value of the '<em><b>Prd Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prd Date</em>' attribute.
	 * @see #setPrdDate(Date)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMealItem_PrdDate()
	 * @model
	 * @generated
	 */
	Date getPrdDate();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.MealItem#getPrdDate <em>Prd Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prd Date</em>' attribute.
	 * @see #getPrdDate()
	 * @generated
	 */
	void setPrdDate(Date value);

	/**
	 * Returns the value of the '<em><b>Meal</b></em>' containment reference list.
	 * The list contents are of type {@link edom.gorgeousfood.Meal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal</em>' containment reference list.
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getMealItem_Meal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Meal> getMeal();

} // MealItem
