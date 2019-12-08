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
import pt.isep.edom.project.c4.mm.dbase.Column;
import pt.isep.edom.project.c4.mm.dbase.Constraint;
import pt.isep.edom.project.c4.mm.dbase.ConstraintType;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;
import pt.isep.edom.project.c4.mm.dbase.Relationship;

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
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.ConstraintImpl#getRelationship <em>Relationship</em>}</li>
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
	protected static final ConstraintType CONSTRAINT_TYPE_EDEFAULT = ConstraintType.PK;

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
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

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
	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DbasePackage.CONSTRAINT__COLUMN, oldColumn, newColumn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject) column).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DbasePackage.CONSTRAINT__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject) newColumn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DbasePackage.CONSTRAINT__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.CONSTRAINT__COLUMN, newColumn,
					newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<Relationship>(Relationship.class, this,
					DbasePackage.CONSTRAINT__RELATIONSHIP);
		}
		return relationship;
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
			return basicSetColumn(null, msgs);
		case DbasePackage.CONSTRAINT__RELATIONSHIP:
			return ((InternalEList<?>) getRelationship()).basicRemove(otherEnd, msgs);
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
		case DbasePackage.CONSTRAINT__RELATIONSHIP:
			return getRelationship();
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
			setColumn((Column) newValue);
			return;
		case DbasePackage.CONSTRAINT__RELATIONSHIP:
			getRelationship().clear();
			getRelationship().addAll((Collection<? extends Relationship>) newValue);
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
			setColumn((Column) null);
			return;
		case DbasePackage.CONSTRAINT__RELATIONSHIP:
			getRelationship().clear();
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
			return column != null;
		case DbasePackage.CONSTRAINT__RELATIONSHIP:
			return relationship != null && !relationship.isEmpty();
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
