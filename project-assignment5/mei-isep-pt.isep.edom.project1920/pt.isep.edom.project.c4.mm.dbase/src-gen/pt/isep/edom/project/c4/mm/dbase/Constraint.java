/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getColumn <em>Column</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='constraintPKIsIntegerType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot constraintPKIsIntegerType='self.constraintType = 0 implies self.column.type = 1'"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c4.mm.dbase.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ConstraintType
	 * @see #setConstraintType(ConstraintType)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getConstraint_ConstraintType()
	 * @model
	 * @generated
	 */
	ConstraintType getConstraintType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ConstraintType
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(Column)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getConstraint_Column()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Constraint#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c4.mm.dbase.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getConstraint_Relationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getRelationship();

} // Constraint
