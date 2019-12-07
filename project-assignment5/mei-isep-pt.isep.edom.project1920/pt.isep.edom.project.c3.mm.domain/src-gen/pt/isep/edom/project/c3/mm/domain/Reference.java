/**
 */
package pt.isep.edom.project.c3.mm.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Reference#getEntity <em>Entity</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Reference#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Reference#getValueobject <em>Valueobject</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Reference#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link pt.isep.edom.project.c3.mm.domain.Reference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveValueObjectOrEntity needsName mustHaveDifferentReferenceName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveValueObjectOrEntity='entity.oclIsUndefined() &lt;&gt; valueobject.oclIsUndefined()' needsName='name.oclIsUndefined() = false' mustHaveDifferentReferenceName='self.oclType().allInstances() -&gt; exists(r | self &lt;&gt; r  and  self.name =  r.name) = false'"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Reference#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Reference#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Valueobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueobject</em>' reference.
	 * @see #setValueobject(ValueObject)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference_Valueobject()
	 * @model
	 * @generated
	 */
	ValueObject getValueobject();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Reference#getValueobject <em>Valueobject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valueobject</em>' reference.
	 * @see #getValueobject()
	 * @generated
	 */
	void setValueobject(ValueObject value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Reference#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.edom.project.c3.mm.domain.DomainPackage#getReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c3.mm.domain.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Reference
