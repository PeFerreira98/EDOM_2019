/**
 */
package edom.gorgeousfood;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.Sale#getSaleID <em>Sale ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.Sale#getDate <em>Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.Sale#getMealitem <em>Mealitem</em>}</li>
 * </ul>
 *
 * @see edom.gorgeousfood.GorgeousfoodPackage#getSale()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveID mustHavePositiveID mustHaveDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveID='not SaleID.oclIsInvalid()' mustHavePositiveID='SaleID &gt; 0' mustHaveDate='not Date.oclIsInvalid()'"
 * @generated
 */
public interface Sale extends EObject {
	/**
	 * Returns the value of the '<em><b>Sale ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sale ID</em>' attribute.
	 * @see #setSaleID(int)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getSale_SaleID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getSaleID();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Sale#getSaleID <em>Sale ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sale ID</em>' attribute.
	 * @see #getSaleID()
	 * @generated
	 */
	void setSaleID(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getSale_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Sale#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Mealitem</b></em>' containment reference list.
	 * The list contents are of type {@link edom.gorgeousfood.MealItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mealitem</em>' containment reference list.
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getSale_Mealitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<MealItem> getMealitem();

} // Sale
