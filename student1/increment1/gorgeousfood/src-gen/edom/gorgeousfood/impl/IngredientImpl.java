/**
 */
package edom.gorgeousfood.impl;

import edom.gorgeousfood.GorgeousfoodPackage;
import edom.gorgeousfood.Ingredient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edom.gorgeousfood.impl.IngredientImpl#getIngredientID <em>Ingredient ID</em>}</li>
 *   <li>{@link edom.gorgeousfood.impl.IngredientImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngredientImpl extends MinimalEObjectImpl.Container implements Ingredient {
	/**
	 * The default value of the '{@link #getIngredientID() <em>Ingredient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientID()
	 * @generated
	 * @ordered
	 */
	protected static final int INGREDIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIngredientID() <em>Ingredient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientID()
	 * @generated
	 * @ordered
	 */
	protected int ingredientID = INGREDIENT_ID_EDEFAULT;

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
	protected IngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorgeousfoodPackage.Literals.INGREDIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIngredientID() {
		return ingredientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIngredientID(int newIngredientID) {
		int oldIngredientID = ingredientID;
		ingredientID = newIngredientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.INGREDIENT__INGREDIENT_ID,
					oldIngredientID, ingredientID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorgeousfoodPackage.INGREDIENT__DESCRIPTION,
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
		case GorgeousfoodPackage.INGREDIENT__INGREDIENT_ID:
			return getIngredientID();
		case GorgeousfoodPackage.INGREDIENT__DESCRIPTION:
			return getDescription();
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
		case GorgeousfoodPackage.INGREDIENT__INGREDIENT_ID:
			setIngredientID((Integer) newValue);
			return;
		case GorgeousfoodPackage.INGREDIENT__DESCRIPTION:
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
		case GorgeousfoodPackage.INGREDIENT__INGREDIENT_ID:
			setIngredientID(INGREDIENT_ID_EDEFAULT);
			return;
		case GorgeousfoodPackage.INGREDIENT__DESCRIPTION:
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
		case GorgeousfoodPackage.INGREDIENT__INGREDIENT_ID:
			return ingredientID != INGREDIENT_ID_EDEFAULT;
		case GorgeousfoodPackage.INGREDIENT__DESCRIPTION:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (IngredientID: ");
		result.append(ingredientID);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IngredientImpl
