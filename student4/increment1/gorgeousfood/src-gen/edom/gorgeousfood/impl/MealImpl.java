/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.Descriptor;
import edom.gorgeousfood.GorgeousfoodPackage;
import edom.gorgeousfood.Ingredient;
import edom.gorgeousfood.Meal;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Meal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.impl.MealImpl#getMealID <em>Meal ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.MealImpl#getIngredient <em>Ingredient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealImpl extends MinimalEObjectImpl.Container implements Meal {
	/**
	 * The default value of the '{@link #getMealID() <em>Meal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealID()
	 * @generated
	 * @ordered
	 */
	protected static final int MEAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMealID() <em>Meal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealID()
	 * @generated
	 * @ordered
	 */
	protected int mealID = MEAL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Descriptor> descriptor;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MealImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousfoodPackage.Literals.MEAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMealID() {
		return mealID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMealID(int newMealID) {
		int oldMealID = mealID;
		mealID = newMealID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.MEAL__MEAL_ID, oldMealID,
					mealID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.MEAL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<Ingredient>(Ingredient.class, this,
					GorgeousfoodPackage.MEAL__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GorgeousfoodPackage.MEAL__DESCRIPTOR:
			return ((InternalEList<?>) getDescriptor()).basicRemove(otherEnd, msgs);
		case GorgeousfoodPackage.MEAL__INGREDIENT:
			return ((InternalEList<?>) getIngredient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Descriptor> getDescriptor() {
		if (descriptor == null) {
			descriptor = new EObjectContainmentEList<Descriptor>(Descriptor.class, this,
					GorgeousfoodPackage.MEAL__DESCRIPTOR);
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorgeousfoodPackage.MEAL__MEAL_ID:
			return getMealID();
		case GorgeousfoodPackage.MEAL__DESCRIPTION:
			return getDescription();
		case GorgeousfoodPackage.MEAL__DESCRIPTOR:
			return getDescriptor();
		case GorgeousfoodPackage.MEAL__INGREDIENT:
			return getIngredient();
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
		case GorgeousfoodPackage.MEAL__MEAL_ID:
			setMealID((Integer) newValue);
			return;
		case GorgeousfoodPackage.MEAL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GorgeousfoodPackage.MEAL__DESCRIPTOR:
			getDescriptor().clear();
			getDescriptor().addAll((Collection<? extends Descriptor>) newValue);
			return;
		case GorgeousfoodPackage.MEAL__INGREDIENT:
			getIngredient().clear();
			getIngredient().addAll((Collection<? extends Ingredient>) newValue);
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
		case GorgeousfoodPackage.MEAL__MEAL_ID:
			setMealID(MEAL_ID_EDEFAULT);
			return;
		case GorgeousfoodPackage.MEAL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GorgeousfoodPackage.MEAL__DESCRIPTOR:
			getDescriptor().clear();
			return;
		case GorgeousfoodPackage.MEAL__INGREDIENT:
			getIngredient().clear();
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
		case GorgeousfoodPackage.MEAL__MEAL_ID:
			return mealID != MEAL_ID_EDEFAULT;
		case GorgeousfoodPackage.MEAL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GorgeousfoodPackage.MEAL__DESCRIPTOR:
			return descriptor != null && !descriptor.isEmpty();
		case GorgeousfoodPackage.MEAL__INGREDIENT:
			return ingredient != null && !ingredient.isEmpty();
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
		result.append(" (MealID: ");
		result.append(mealID);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MealImpl
