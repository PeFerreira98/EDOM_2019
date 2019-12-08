/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Table#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Table#getEntity <em>Entity</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Table#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='haveTableName validTableName containColumns uniqueTableColumnsName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot haveTableName='not name.oclIsUndefined()' validTableName='name.matches(\'[a-zA-Z]*\')' containColumns='self.columns-&gt;notEmpty()' uniqueTableColumnsName='self.columns-&gt;isUnique(Column.name)'"
 * @generated
 */
public interface Table extends EObject {
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
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c4.mm.dbase.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getTable_Entity()
	 * @model
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Table#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c4.mm.dbase.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getTable_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // Table
