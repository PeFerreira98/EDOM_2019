/**
 */
package pt.isep.edom.project.c4.mm.dbase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.edom.project.c4.mm.dbase.BoundsType;
import pt.isep.edom.project.c4.mm.dbase.Cardinality;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.CardinalityImpl#getBoundsType <em>Bounds Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityImpl extends MinimalEObjectImpl.Container implements Cardinality {
	/**
	 * The default value of the '{@link #getBoundsType() <em>Bounds Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsType()
	 * @generated
	 * @ordered
	 */
	protected static final BoundsType BOUNDS_TYPE_EDEFAULT = BoundsType.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getBoundsType() <em>Bounds Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundsType()
	 * @generated
	 * @ordered
	 */
	protected BoundsType boundsType = BOUNDS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbasePackage.Literals.CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundsType getBoundsType() {
		return boundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsType(BoundsType newBoundsType) {
		BoundsType oldBoundsType = boundsType;
		boundsType = newBoundsType == null ? BOUNDS_TYPE_EDEFAULT : newBoundsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.CARDINALITY__BOUNDS_TYPE, oldBoundsType,
					boundsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DbasePackage.CARDINALITY__BOUNDS_TYPE:
			return getBoundsType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DbasePackage.CARDINALITY__BOUNDS_TYPE:
			setBoundsType((BoundsType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DbasePackage.CARDINALITY__BOUNDS_TYPE:
			setBoundsType(BOUNDS_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DbasePackage.CARDINALITY__BOUNDS_TYPE:
			return boundsType != BOUNDS_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (boundsType: ");
		result.append(boundsType);
		result.append(')');
		return result.toString();
	}

} //CardinalityImpl
