/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.GorgeousfoodPackage;
import edom.gorgeousfood.MealItem;
import edom.gorgeousfood.Sale;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.impl.SaleImpl#getSaleID <em>Sale ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.SaleImpl#getDate <em>Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.SaleImpl#getMealitem <em>Mealitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaleImpl extends MinimalEObjectImpl.Container implements Sale {
	/**
	 * The default value of the '{@link #getSaleID() <em>Sale ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaleID()
	 * @generated
	 * @ordered
	 */
	protected static final int SALE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSaleID() <em>Sale ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaleID()
	 * @generated
	 * @ordered
	 */
	protected int saleID = SALE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMealitem() <em>Mealitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealitem()
	 * @generated
	 * @ordered
	 */
	protected EList<MealItem> mealitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousfoodPackage.Literals.SALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSaleID() {
		return saleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaleID(int newSaleID) {
		int oldSaleID = saleID;
		saleID = newSaleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.SALE__SALE_ID, oldSaleID,
					saleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.SALE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MealItem> getMealitem() {
		if (mealitem == null) {
			mealitem = new EObjectContainmentEList<MealItem>(MealItem.class, this, GorgeousfoodPackage.SALE__MEALITEM);
		}
		return mealitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorgeousfoodPackage.SALE__MEALITEM:
			return ((InternalEList<?>) getMealitem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorgeousfoodPackage.SALE__SALE_ID:
			return getSaleID();
		case GorgeousfoodPackage.SALE__DATE:
			return getDate();
		case GorgeousfoodPackage.SALE__MEALITEM:
			return getMealitem();
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
		case GorgeousfoodPackage.SALE__SALE_ID:
			setSaleID((Integer) newValue);
			return;
		case GorgeousfoodPackage.SALE__DATE:
			setDate((Date) newValue);
			return;
		case GorgeousfoodPackage.SALE__MEALITEM:
			getMealitem().clear();
			getMealitem().addAll((Collection<? extends MealItem>) newValue);
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
		case GorgeousfoodPackage.SALE__SALE_ID:
			setSaleID(SALE_ID_EDEFAULT);
			return;
		case GorgeousfoodPackage.SALE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case GorgeousfoodPackage.SALE__MEALITEM:
			getMealitem().clear();
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
		case GorgeousfoodPackage.SALE__SALE_ID:
			return saleID != SALE_ID_EDEFAULT;
		case GorgeousfoodPackage.SALE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case GorgeousfoodPackage.SALE__MEALITEM:
			return mealitem != null && !mealitem.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SaleID: ");
		result.append(saleID);
		result.append(", Date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //SaleImpl
