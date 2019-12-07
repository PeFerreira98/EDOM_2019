/**
 */
package pt.isep.edom.project.c4.mm.dbase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.Cardinality#getBoundsType <em>Bounds Type</em>}</li>
 * </ul>
 *
 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounds Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.isep.edom.project.c4.mm.dbase.BoundsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.BoundsType
	 * @see #setBoundsType(BoundsType)
	 * @see pt.isep.edom.project.c4.mm.dbase.DbasePackage#getCardinality_BoundsType()
	 * @model
	 * @generated
	 */
	BoundsType getBoundsType();

	/**
	 * Sets the value of the '{@link pt.isep.edom.project.c4.mm.dbase.Cardinality#getBoundsType <em>Bounds Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds Type</em>' attribute.
	 * @see pt.isep.edom.project.c4.mm.dbase.BoundsType
	 * @see #getBoundsType()
	 * @generated
	 */
	void setBoundsType(BoundsType value);

} // Cardinality
