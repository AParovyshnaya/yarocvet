/**
 */
package ru.aparovyshnaia.yarocvet.events.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.aparovyshnaia.yarocvet.events.model.api.Road;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#getTowns <em>Towns</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#isFullAttendance <em>Full Attendance</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#isIteratable <em>Iteratable</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoadImpl extends MinimalEObjectImpl.Container implements Road {
	/**
	 * The cached value of the '{@link #getTowns() <em>Towns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowns()
	 * @generated
	 * @ordered
	 */
	protected EList<Town> towns;

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
	 * The default value of the '{@link #isFullAttendance() <em>Full Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullAttendance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULL_ATTENDANCE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFullAttendance() <em>Full Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFullAttendance()
	 * @generated
	 * @ordered
	 */
	protected boolean fullAttendance = FULL_ATTENDANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #isIteratable() <em>Iteratable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIteratable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITERATABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIteratable() <em>Iteratable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIteratable()
	 * @generated
	 * @ordered
	 */
	protected boolean iteratable = ITERATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.ROAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Town> getTowns() {
		if (towns == null) {
			towns = new EObjectResolvingEList<Town>(Town.class, this, EventsPackage.ROAD__TOWNS);
		}
		return towns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.ROAD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.ROAD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFullAttendance() {
		return fullAttendance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullAttendance(boolean newFullAttendance) {
		boolean oldFullAttendance = fullAttendance;
		fullAttendance = newFullAttendance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.ROAD__FULL_ATTENDANCE, oldFullAttendance, fullAttendance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIteratable() {
		return iteratable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIteratable(boolean newIteratable) {
		boolean oldIteratable = iteratable;
		iteratable = newIteratable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.ROAD__ITERATABLE, oldIteratable, iteratable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.ROAD__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.ROAD__TOWNS:
				return getTowns();
			case EventsPackage.ROAD__NAME:
				return getName();
			case EventsPackage.ROAD__DESCRIPTION:
				return getDescription();
			case EventsPackage.ROAD__FULL_ATTENDANCE:
				return isFullAttendance();
			case EventsPackage.ROAD__ITERATABLE:
				return isIteratable();
			case EventsPackage.ROAD__REF:
				return getRef();
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
			case EventsPackage.ROAD__TOWNS:
				getTowns().clear();
				getTowns().addAll((Collection<? extends Town>)newValue);
				return;
			case EventsPackage.ROAD__NAME:
				setName((String)newValue);
				return;
			case EventsPackage.ROAD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EventsPackage.ROAD__FULL_ATTENDANCE:
				setFullAttendance((Boolean)newValue);
				return;
			case EventsPackage.ROAD__ITERATABLE:
				setIteratable((Boolean)newValue);
				return;
			case EventsPackage.ROAD__REF:
				setRef((String)newValue);
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
			case EventsPackage.ROAD__TOWNS:
				getTowns().clear();
				return;
			case EventsPackage.ROAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventsPackage.ROAD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EventsPackage.ROAD__FULL_ATTENDANCE:
				setFullAttendance(FULL_ATTENDANCE_EDEFAULT);
				return;
			case EventsPackage.ROAD__ITERATABLE:
				setIteratable(ITERATABLE_EDEFAULT);
				return;
			case EventsPackage.ROAD__REF:
				setRef(REF_EDEFAULT);
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
			case EventsPackage.ROAD__TOWNS:
				return towns != null && !towns.isEmpty();
			case EventsPackage.ROAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventsPackage.ROAD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EventsPackage.ROAD__FULL_ATTENDANCE:
				return fullAttendance != FULL_ATTENDANCE_EDEFAULT;
			case EventsPackage.ROAD__ITERATABLE:
				return iteratable != ITERATABLE_EDEFAULT;
			case EventsPackage.ROAD__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", fullAttendance: ");
		result.append(fullAttendance);
		result.append(", iteratable: ");
		result.append(iteratable);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //RoadImpl
