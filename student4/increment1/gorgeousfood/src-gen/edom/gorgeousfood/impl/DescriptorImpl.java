/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.Descriptor;
import edom.gorgeousfood.GorgeousfoodPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.impl.DescriptorImpl#getDescriptorID <em>Descriptor ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.DescriptorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptorImpl extends MinimalEObjectImpl.Container implements Descriptor {
	/**
	 * The default value of the '{@link #getDescriptorID() <em>Descriptor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorID()
	 * @generated
	 * @ordered
	 */
	protected static final int DESCRIPTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDescriptorID() <em>Descriptor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorID()
	 * @generated
	 * @ordered
	 */
	protected int descriptorID = DESCRIPTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousfoodPackage.Literals.DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDescriptorID() {
		return descriptorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorID(int newDescriptorID) {
		int oldDescriptorID = descriptorID;
		descriptorID = newDescriptorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.DESCRIPTOR__DESCRIPTOR_ID,
					oldDescriptorID, descriptorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.DESCRIPTOR__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTOR_ID:
			return getDescriptorID();
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTOR_ID:
			setDescriptorID((Integer) newValue);
			return;
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTION:
			setDescription((String) newValue);
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
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTOR_ID:
			setDescriptorID(DESCRIPTOR_ID_EDEFAULT);
			return;
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTOR_ID:
			return descriptorID != DESCRIPTOR_ID_EDEFAULT;
		case GorgeousfoodPackage.DESCRIPTOR__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (DescriptorID: ");
		result.append(descriptorID);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DescriptorImpl
