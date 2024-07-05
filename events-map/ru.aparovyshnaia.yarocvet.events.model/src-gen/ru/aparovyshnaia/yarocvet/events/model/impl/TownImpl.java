/**
 */
package ru.aparovyshnaia.yarocvet.events.model.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ru.aparovyshnaia.yarocvet.events.model.api.Participants;
import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Town</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getImage <em>Image</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getStart <em>Start</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getEnd <em>End</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getMinAge <em>Min Age</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getMinClass <em>Min Class</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getMaxClass <em>Max Class</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TownImpl extends MinimalEObjectImpl.Container implements Town {
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
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;

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
	 * The default value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_AGE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinAge() <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAge()
	 * @generated
	 * @ordered
	 */
	protected int minAge = MIN_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_AGE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected int maxAge = MAX_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinClass() <em>Min Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinClass()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CLASS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinClass() <em>Min Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinClass()
	 * @generated
	 * @ordered
	 */
	protected int minClass = MIN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxClass() <em>Max Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClass()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CLASS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxClass() <em>Max Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClass()
	 * @generated
	 * @ordered
	 */
	protected int maxClass = MAX_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participants> participants;

	/**
	 * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakers()
	 * @generated
	 * @ordered
	 */
	protected EList<Speaker> speakers;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TownType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TownImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.TOWN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAge() {
		return minAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAge(int newMinAge) {
		int oldMinAge = minAge;
		minAge = newMinAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__MIN_AGE, oldMinAge, minAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAge() {
		return maxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAge(int newMaxAge) {
		int oldMaxAge = maxAge;
		maxAge = newMaxAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__MAX_AGE, oldMaxAge, maxAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinClass() {
		return minClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinClass(int newMinClass) {
		int oldMinClass = minClass;
		minClass = newMinClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__MIN_CLASS, oldMinClass, minClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxClass() {
		return maxClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxClass(int newMaxClass) {
		int oldMaxClass = maxClass;
		maxClass = newMaxClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__MAX_CLASS, oldMaxClass, maxClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Participants> getParticipants() {
		if (participants == null) {
			participants = new EDataTypeUniqueEList<Participants>(Participants.class, this, EventsPackage.TOWN__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Speaker> getSpeakers() {
		if (speakers == null) {
			speakers = new EObjectResolvingEList<Speaker>(Speaker.class, this, EventsPackage.TOWN__SPEAKERS);
		}
		return speakers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TownType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TownType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.TOWN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TownType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TownType newType) {
		TownType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.TOWN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.TOWN__NAME:
				return getName();
			case EventsPackage.TOWN__DESCRIPTION:
				return getDescription();
			case EventsPackage.TOWN__IMAGE:
				return getImage();
			case EventsPackage.TOWN__ALT:
				return getAlt();
			case EventsPackage.TOWN__START:
				return getStart();
			case EventsPackage.TOWN__END:
				return getEnd();
			case EventsPackage.TOWN__MIN_AGE:
				return getMinAge();
			case EventsPackage.TOWN__MAX_AGE:
				return getMaxAge();
			case EventsPackage.TOWN__MIN_CLASS:
				return getMinClass();
			case EventsPackage.TOWN__MAX_CLASS:
				return getMaxClass();
			case EventsPackage.TOWN__PARTICIPANTS:
				return getParticipants();
			case EventsPackage.TOWN__SPEAKERS:
				return getSpeakers();
			case EventsPackage.TOWN__REF:
				return getRef();
			case EventsPackage.TOWN__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case EventsPackage.TOWN__NAME:
				setName((String)newValue);
				return;
			case EventsPackage.TOWN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EventsPackage.TOWN__IMAGE:
				setImage((String)newValue);
				return;
			case EventsPackage.TOWN__ALT:
				setAlt((String)newValue);
				return;
			case EventsPackage.TOWN__START:
				setStart((Date)newValue);
				return;
			case EventsPackage.TOWN__END:
				setEnd((Date)newValue);
				return;
			case EventsPackage.TOWN__MIN_AGE:
				setMinAge((Integer)newValue);
				return;
			case EventsPackage.TOWN__MAX_AGE:
				setMaxAge((Integer)newValue);
				return;
			case EventsPackage.TOWN__MIN_CLASS:
				setMinClass((Integer)newValue);
				return;
			case EventsPackage.TOWN__MAX_CLASS:
				setMaxClass((Integer)newValue);
				return;
			case EventsPackage.TOWN__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participants>)newValue);
				return;
			case EventsPackage.TOWN__SPEAKERS:
				getSpeakers().clear();
				getSpeakers().addAll((Collection<? extends Speaker>)newValue);
				return;
			case EventsPackage.TOWN__REF:
				setRef((String)newValue);
				return;
			case EventsPackage.TOWN__TYPE:
				setType((TownType)newValue);
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
			case EventsPackage.TOWN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EventsPackage.TOWN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EventsPackage.TOWN__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case EventsPackage.TOWN__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case EventsPackage.TOWN__START:
				setStart(START_EDEFAULT);
				return;
			case EventsPackage.TOWN__END:
				setEnd(END_EDEFAULT);
				return;
			case EventsPackage.TOWN__MIN_AGE:
				setMinAge(MIN_AGE_EDEFAULT);
				return;
			case EventsPackage.TOWN__MAX_AGE:
				setMaxAge(MAX_AGE_EDEFAULT);
				return;
			case EventsPackage.TOWN__MIN_CLASS:
				setMinClass(MIN_CLASS_EDEFAULT);
				return;
			case EventsPackage.TOWN__MAX_CLASS:
				setMaxClass(MAX_CLASS_EDEFAULT);
				return;
			case EventsPackage.TOWN__PARTICIPANTS:
				getParticipants().clear();
				return;
			case EventsPackage.TOWN__SPEAKERS:
				getSpeakers().clear();
				return;
			case EventsPackage.TOWN__REF:
				setRef(REF_EDEFAULT);
				return;
			case EventsPackage.TOWN__TYPE:
				setType((TownType)null);
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
			case EventsPackage.TOWN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EventsPackage.TOWN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EventsPackage.TOWN__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case EventsPackage.TOWN__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case EventsPackage.TOWN__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case EventsPackage.TOWN__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case EventsPackage.TOWN__MIN_AGE:
				return minAge != MIN_AGE_EDEFAULT;
			case EventsPackage.TOWN__MAX_AGE:
				return maxAge != MAX_AGE_EDEFAULT;
			case EventsPackage.TOWN__MIN_CLASS:
				return minClass != MIN_CLASS_EDEFAULT;
			case EventsPackage.TOWN__MAX_CLASS:
				return maxClass != MAX_CLASS_EDEFAULT;
			case EventsPackage.TOWN__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case EventsPackage.TOWN__SPEAKERS:
				return speakers != null && !speakers.isEmpty();
			case EventsPackage.TOWN__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case EventsPackage.TOWN__TYPE:
				return type != null;
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
		result.append(", image: ");
		result.append(image);
		result.append(", alt: ");
		result.append(alt);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", minAge: ");
		result.append(minAge);
		result.append(", maxAge: ");
		result.append(maxAge);
		result.append(", minClass: ");
		result.append(minClass);
		result.append(", maxClass: ");
		result.append(maxClass);
		result.append(", participants: ");
		result.append(participants);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //TownImpl
