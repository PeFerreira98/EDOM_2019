/**
 */
package pt.isep.edom.project.c4.mm.dbase.impl;

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

import pt.isep.edom.project.c4.mm.dbase.Cardinality;
import pt.isep.edom.project.c4.mm.dbase.Column;
import pt.isep.edom.project.c4.mm.dbase.Constraint;
import pt.isep.edom.project.c4.mm.dbase.ConstraintType;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintType CONSTRAINT_TYPE_EDEFAULT = ConstraintType.PKFK;

	/**
	 * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected ConstraintType constraintType = CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<Cardinality> cardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbasePackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintType getConstraintType() {
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintType(ConstraintType newConstraintType) {
		ConstraintType oldConstraintType = constraintType;
		constraintType = newConstraintType == null ? CONSTRAINT_TYPE_EDEFAULT : newConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.CONSTRAINT__CONSTRAINT_TYPE,
					oldConstraintType, constraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, DbasePackage.CONSTRAINT__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cardinality> getCardinality() {
		if (cardinality == null) {
			cardinality = new EObjectContainmentEList<Cardinality>(Cardinality.class, this,
					DbasePackage.CONSTRAINT__CARDINALITY);
		}
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DbasePackage.CONSTRAINT__COLUMN:
			return ((InternalEList<?>) getColumn()).basicRemove(otherEnd, msgs);
		case DbasePackage.CONSTRAINT__CARDINALITY:
			return ((InternalEList<?>) getCardinality()).basicRemove(otherEnd, msgs);
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
		case DbasePackage.CONSTRAINT__NAME:
			return getName();
		case DbasePackage.CONSTRAINT__CONSTRAINT_TYPE:
			return getConstraintType();
		case DbasePackage.CONSTRAINT__COLUMN:
			return getColumn();
		case DbasePackage.CONSTRAINT__CARDINALITY:
			return getCardinality();
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
		case DbasePackage.CONSTRAINT__NAME:
			setName((String) newValue);
			return;
		case DbasePackage.CONSTRAINT__CONSTRAINT_TYPE:
			setConstraintType((ConstraintType) newValue);
			return;
		case DbasePackage.CONSTRAINT__COLUMN:
			getColumn().clear();
			getColumn().addAll((Collection<? extends Column>) newValue);
			return;
		case DbasePackage.CONSTRAINT__CARDINALITY:
			getCardinality().clear();
			getCardinality().addAll((Collection<? extends Cardinality>) newValue);
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
		case DbasePackage.CONSTRAINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DbasePackage.CONSTRAINT__CONSTRAINT_TYPE:
			setConstraintType(CONSTRAINT_TYPE_EDEFAULT);
			return;
		case DbasePackage.CONSTRAINT__COLUMN:
			getColumn().clear();
			return;
		case DbasePackage.CONSTRAINT__CARDINALITY:
			getCardinality().clear();
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
		case DbasePackage.CONSTRAINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DbasePackage.CONSTRAINT__CONSTRAINT_TYPE:
			return constraintType != CONSTRAINT_TYPE_EDEFAULT;
		case DbasePackage.CONSTRAINT__COLUMN:
			return column != null && !column.isEmpty();
		case DbasePackage.CONSTRAINT__CARDINALITY:
			return cardinality != null && !cardinality.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", constraintType: ");
		result.append(constraintType);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
