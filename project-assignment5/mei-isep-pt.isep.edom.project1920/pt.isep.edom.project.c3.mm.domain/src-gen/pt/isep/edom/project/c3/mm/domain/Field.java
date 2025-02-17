/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Field#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"STRING"</code>.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c3.mm.domain.FieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c3.mm.domain.FieldType
	 * @see #setType(FieldType)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getField_Type()
	 * @model default="STRING"
	 * @generated
	 */
	FieldType getType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pt.isep.edom.project.c3.mm.domain.FieldType
	 * @see #getType()
	 * @generated
	 */
	void setType(FieldType value);

} // Field
