/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getCardinalityType <em>Cardinality Type</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validRelationTable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot validRelationTable='self.table-&gt;notEmpty()'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c4.mm.dbase.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.CardinalityType
	 * @see #setCardinalityType(CardinalityType)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getRelationship_CardinalityType()
	 * @model
	 * @generated
	 */
	CardinalityType getCardinalityType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getCardinalityType <em>Cardinality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.CardinalityType
	 * @see #getCardinalityType()
	 * @generated
	 */
	void setCardinalityType(CardinalityType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(Table)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getRelationship_Table()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Relationship#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Relationship
