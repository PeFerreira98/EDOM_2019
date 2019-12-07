/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.ValueObject#getField <em>Field</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.ValueObject#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.ValueObject#isIsId <em>Is Id</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getValueObject()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveDifferentValueObjectName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveDifferentValueObjectName='self.oclType().allInstances() -&gt; exists(r | self &lt;&gt; r  and  self.name =  r.name) = false'"
 * @generated
 */
public interface ValueObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(Field)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getValueObject_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.ValueObject#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getValueObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.ValueObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(boolean)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getValueObject_IsId()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsId();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.ValueObject#isIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #isIsId()
	 * @generated
	 */
	void setIsId(boolean value);

} // ValueObject
