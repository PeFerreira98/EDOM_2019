/**
 */
package pt.isep.edom.mmap.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pt.isep.edom.mmap.MmapPackage;
import pt.isep.edom.mmap.Priority;
import pt.isep.edom.mmap.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getStart <em>Start</em>}</li>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getEnd <em>End</em>}</li>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getSubtopics <em>Subtopics</em>}</li>
 *   <li>{@link pt.isep.edom.mmap.impl.TopicImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MapElementImpl implements Topic {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.LOW;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtopics() <em>Subtopics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtopics()
	 * @generated
	 * @ordered
	 */
	protected Topic subtopics;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmapPackage.Literals.TOPIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmapPackage.TOPIC__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmapPackage.TOPIC__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmapPackage.TOPIC__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmapPackage.TOPIC__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Topic getSubtopics() {
		if (subtopics != null && subtopics.eIsProxy()) {
			InternalEObject oldSubtopics = (InternalEObject) subtopics;
			subtopics = (Topic) eResolveProxy(oldSubtopics);
			if (subtopics != oldSubtopics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmapPackage.TOPIC__SUBTOPICS,
							oldSubtopics, subtopics));
			}
		}
		return subtopics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetSubtopics() {
		return subtopics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtopics(Topic newSubtopics) {
		Topic oldSubtopics = subtopics;
		subtopics = newSubtopics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmapPackage.TOPIC__SUBTOPICS, oldSubtopics,
					subtopics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<Topic>(Topic.class, this, MmapPackage.TOPIC__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> allSubtopics() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmapPackage.TOPIC__DESCRIPTION:
			return getDescription();
		case MmapPackage.TOPIC__START:
			return getStart();
		case MmapPackage.TOPIC__END:
			return getEnd();
		case MmapPackage.TOPIC__PRIORITY:
			return getPriority();
		case MmapPackage.TOPIC__SUBTOPICS:
			if (resolve)
				return getSubtopics();
			return basicGetSubtopics();
		case MmapPackage.TOPIC__PARENT:
			return getParent();
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
		case MmapPackage.TOPIC__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MmapPackage.TOPIC__START:
			setStart((Date) newValue);
			return;
		case MmapPackage.TOPIC__END:
			setEnd((Date) newValue);
			return;
		case MmapPackage.TOPIC__PRIORITY:
			setPriority((Priority) newValue);
			return;
		case MmapPackage.TOPIC__SUBTOPICS:
			setSubtopics((Topic) newValue);
			return;
		case MmapPackage.TOPIC__PARENT:
			getParent().clear();
			getParent().addAll((Collection<? extends Topic>) newValue);
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
		case MmapPackage.TOPIC__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MmapPackage.TOPIC__START:
			setStart(START_EDEFAULT);
			return;
		case MmapPackage.TOPIC__END:
			setEnd(END_EDEFAULT);
			return;
		case MmapPackage.TOPIC__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case MmapPackage.TOPIC__SUBTOPICS:
			setSubtopics((Topic) null);
			return;
		case MmapPackage.TOPIC__PARENT:
			getParent().clear();
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
		case MmapPackage.TOPIC__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MmapPackage.TOPIC__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case MmapPackage.TOPIC__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case MmapPackage.TOPIC__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case MmapPackage.TOPIC__SUBTOPICS:
			return subtopics != null;
		case MmapPackage.TOPIC__PARENT:
			return parent != null && !parent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MmapPackage.TOPIC___ALL_SUBTOPICS:
			return allSubtopics();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
