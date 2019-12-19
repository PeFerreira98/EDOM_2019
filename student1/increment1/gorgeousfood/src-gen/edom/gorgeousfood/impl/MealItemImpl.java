/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.GorgeousfoodPackage;
import edom.gorgeousfood.Meal;
import edom.gorgeousfood.MealItem;

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
 * An implementation of the model object '<em><b>Meal Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.impl.MealItemImpl#getMealItemID <em>Meal Item ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealItemImpl#getExpDate <em>Exp Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealItemImpl#getPrdDate <em>Prd Date</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealItemImpl#getMeal <em>Meal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealItemImpl extends MinimalEObjectImpl.Container implements MealItem {
	/**
	 * The default value of the '{@link #getMealItemID() <em>Meal Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealItemID()
	 * @generated
	 * @ordered
	 */
	protected static final int MEAL_ITEM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMealItemID() <em>Meal Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealItemID()
	 * @generated
	 * @ordered
	 */
	protected int mealItemID = MEAL_ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpDate() <em>Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpDate() <em>Exp Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpDate()
	 * @generated
	 * @ordered
	 */
	protected Date expDate = EXP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrdDate() <em>Prd Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrdDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrdDate() <em>Prd Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrdDate()
	 * @generated
	 * @ordered
	 */
	protected Date prdDate = PRD_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeal() <em>Meal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeal()
	 * @generated
	 * @ordered
	 */
	protected EList<Meal> meal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MealItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousfoodPackage.Literals.MEAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMealItemID() {
		return mealItemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMealItemID(int newMealItemID) {
		int oldMealItemID = mealItemID;
		mealItemID = newMealItemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.MEAL_ITEM__MEAL_ITEM_ID,
					oldMealItemID, mealItemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpDate() {
		return expDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpDate(Date newExpDate) {
		Date oldExpDate = expDate;
		expDate = newExpDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.MEAL_ITEM__EXP_DATE, oldExpDate,
					expDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPrdDate() {
		return prdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrdDate(Date newPrdDate) {
		Date oldPrdDate = prdDate;
		prdDate = newPrdDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.MEAL_ITEM__PRD_DATE, oldPrdDate,
					prdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Meal> getMeal() {
		if (meal == null) {
			meal = new EObjectContainmentEList<Meal>(Meal.class, this, GorgeousfoodPackage.MEAL_ITEM__MEAL);
		}
		return meal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorgeousfoodPackage.MEAL_ITEM__MEAL:
			return ((InternalEList<?>) getMeal()).basicRemove(otherEnd, msgs);
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
		case GorgeousfoodPackage.MEAL_ITEM__MEAL_ITEM_ID:
			return getMealItemID();
		case GorgeousfoodPackage.MEAL_ITEM__EXP_DATE:
			return getExpDate();
		case GorgeousfoodPackage.MEAL_ITEM__PRD_DATE:
			return getPrdDate();
		case GorgeousfoodPackage.MEAL_ITEM__MEAL:
			return getMeal();
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
		case GorgeousfoodPackage.MEAL_ITEM__MEAL_ITEM_ID:
			setMealItemID((Integer) newValue);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__EXP_DATE:
			setExpDate((Date) newValue);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__PRD_DATE:
			setPrdDate((Date) newValue);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__MEAL:
			getMeal().clear();
			getMeal().addAll((Collection<? extends Meal>) newValue);
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
		case GorgeousfoodPackage.MEAL_ITEM__MEAL_ITEM_ID:
			setMealItemID(MEAL_ITEM_ID_EDEFAULT);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__EXP_DATE:
			setExpDate(EXP_DATE_EDEFAULT);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__PRD_DATE:
			setPrdDate(PRD_DATE_EDEFAULT);
			return;
		case GorgeousfoodPackage.MEAL_ITEM__MEAL:
			getMeal().clear();
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
		case GorgeousfoodPackage.MEAL_ITEM__MEAL_ITEM_ID:
			return mealItemID != MEAL_ITEM_ID_EDEFAULT;
		case GorgeousfoodPackage.MEAL_ITEM__EXP_DATE:
			return EXP_DATE_EDEFAULT == null ? expDate != null : !EXP_DATE_EDEFAULT.equals(expDate);
		case GorgeousfoodPackage.MEAL_ITEM__PRD_DATE:
			return PRD_DATE_EDEFAULT == null ? prdDate != null : !PRD_DATE_EDEFAULT.equals(prdDate);
		case GorgeousfoodPackage.MEAL_ITEM__MEAL:
			return meal != null && !meal.isEmpty();
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
		result.append(" (MealItemID: ");
		result.append(mealItemID);
		result.append(", ExpDate: ");
		result.append(expDate);
		result.append(", PrdDate: ");
		result.append(prdDate);
		result.append(')');
		return result.toString();
	}

} //MealItemImpl
