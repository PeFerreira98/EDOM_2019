/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getValueobject <em>Valueobject</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valueObjectNameNotEqual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valueObjectNameNotEqual='self.valueobject -&gt; exists(r | self &lt;&gt; r  and  self.name =  r.name) = false'"
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Valueobject</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.edom.project.c3.mm.domain.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueobject</em>' containment reference list.
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getDomainModel_Valueobject()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getValueobject();

} // DomainModel
