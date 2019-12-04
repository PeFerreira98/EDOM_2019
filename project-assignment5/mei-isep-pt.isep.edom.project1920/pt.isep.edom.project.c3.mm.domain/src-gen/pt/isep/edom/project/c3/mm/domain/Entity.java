/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Entity#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Entity#getReferences <em>References</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Entity#isRoot <em>Root</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Entity#getValueobject <em>Valueobject</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustCheckRoot merda mustHaveDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustCheckRoot='root = true or root = false' merda='self.oclType().allInstances() -&gt; exists(r | self &lt;&gt; r  and  self.name =  r.name) = false' mustHaveDescription='not name.oclIsInvalid()'"
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity_Root()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Entity#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Valueobject</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueobject</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getEntity_Valueobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getValueobject();

} // Entity
