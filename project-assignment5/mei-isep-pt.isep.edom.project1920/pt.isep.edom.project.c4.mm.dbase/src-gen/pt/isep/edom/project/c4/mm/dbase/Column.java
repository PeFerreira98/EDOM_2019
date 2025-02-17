/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='haveColumnName validColumnName containType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot haveColumnName='not name.oclIsUndefined()' validColumnName='name.matches(\'[a-zA-Z]*\')' containType='self.type-&gt;notEmpty()'"
 * @generated
 */
public interface Column extends EObject {
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
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c4.mm.dbase.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @see #setType(ColumnType)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

} // Column
