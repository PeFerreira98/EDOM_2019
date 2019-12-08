/**
 */
package pt.isep.edom.project.c4.mm.dbase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.edom.project.c4.mm.dbase.CardinalityType;
import pt.isep.edom.project.c4.mm.dbase.DbasePackage;
import pt.isep.edom.project.c4.mm.dbase.Relationship;
import pt.isep.edom.project.c4.mm.dbase.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl#getCardinalityType <em>Cardinality Type</em>}</li>
 *   <li>{@link pt.isep.edom.project.c4.mm.dbase.impl.RelationshipImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The default value of the '{@link #getCardinalityType() <em>Cardinality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityType()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType CARDINALITY_TYPE_EDEFAULT = CardinalityType.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getCardinalityType() <em>Cardinality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityType()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType cardinalityType = CARDINALITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbasePackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType getCardinalityType() {
		return cardinalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityType(CardinalityType newCardinalityType) {
		CardinalityType oldCardinalityType = cardinalityType;
		cardinalityType = newCardinalityType == null ? CARDINALITY_TYPE_EDEFAULT : newCardinalityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.RELATIONSHIP__CARDINALITY_TYPE,
					oldCardinalityType, cardinalityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DbasePackage.RELATIONSHIP__TABLE, oldTable, newTable);
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
	public void setTable(Table newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject) table).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DbasePackage.RELATIONSHIP__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject) newTable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DbasePackage.RELATIONSHIP__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbasePackage.RELATIONSHIP__TABLE, newTable,
					newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DbasePackage.RELATIONSHIP__TABLE:
			return basicSetTable(null, msgs);
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
		case DbasePackage.RELATIONSHIP__CARDINALITY_TYPE:
			return getCardinalityType();
		case DbasePackage.RELATIONSHIP__TABLE:
			return getTable();
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
		case DbasePackage.RELATIONSHIP__CARDINALITY_TYPE:
			setCardinalityType((CardinalityType) newValue);
			return;
		case DbasePackage.RELATIONSHIP__TABLE:
			setTable((Table) newValue);
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
		case DbasePackage.RELATIONSHIP__CARDINALITY_TYPE:
			setCardinalityType(CARDINALITY_TYPE_EDEFAULT);
			return;
		case DbasePackage.RELATIONSHIP__TABLE:
			setTable((Table) null);
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
		case DbasePackage.RELATIONSHIP__CARDINALITY_TYPE:
			return cardinalityType != CARDINALITY_TYPE_EDEFAULT;
		case DbasePackage.RELATIONSHIP__TABLE:
			return table != null;
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
		result.append(" (cardinalityType: ");
		result.append(cardinalityType);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
