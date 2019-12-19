/**
 */
package edom.gorgeousfood;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.Descriptor#getDescriptorID <em>Descriptor ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.Descriptor#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edom.gorgeousfood.GorgeousfoodPackage#getDescriptor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveID mustHavePositiveID mustHaveDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveID='not DescriptorID.oclIsInvalid()' mustHavePositiveID='DescriptorID &gt; 0' mustHaveDescription='not Description.oclIsInvalid()'"
 * @generated
 */
public interface Descriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor ID</em>' attribute.
	 * @see #setDescriptorID(int)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getDescriptor_DescriptorID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getDescriptorID();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Descriptor#getDescriptorID <em>Descriptor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor ID</em>' attribute.
	 * @see #getDescriptorID()
	 * @generated
	 */
	void setDescriptorID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edom.gorgeousfood.GorgeousfoodPackage#getDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edom.gorgeousfood.Descriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Descriptor
