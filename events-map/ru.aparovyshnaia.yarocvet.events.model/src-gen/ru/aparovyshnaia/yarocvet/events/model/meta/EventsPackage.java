/**
 */
package ru.aparovyshnaia.yarocvet.events.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory
 * @model kind="package"
 * @generated
 */
public interface EventsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "events";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ru.aparovyshnaia/events/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsPackage eINSTANCE = ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl <em>Town</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getTown()
	 * @generated
	 */
	int TOWN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__ALT = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__START = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__END = 5;

	/**
	 * The feature id for the '<em><b>Min Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__MIN_AGE = 6;

	/**
	 * The feature id for the '<em><b>Max Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__MAX_AGE = 7;

	/**
	 * The feature id for the '<em><b>Min Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__MIN_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Max Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__MAX_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__PARTICIPANTS = 10;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__SPEAKERS = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__REF = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__TYPE = 13;

	/**
	 * The number of structural features of the '<em>Town</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Town</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownTypeImpl <em>Town Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.TownTypeImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getTownType()
	 * @generated
	 */
	int TOWN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.RegionImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Towns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TOWNS = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 3;

	/**
	 * The feature id for the '<em><b>Towns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__TOWNS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Full Attendance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__FULL_ATTENDANCE = 2;

	/**
	 * The feature id for the '<em><b>Iteratable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__ITERATABLE = 3;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.EventsMapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsMapImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getEventsMap()
	 * @generated
	 */
	int EVENTS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Towns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP__TOWNS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP__REGIONS = 2;

	/**
	 * The feature id for the '<em><b>Roads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP__ROADS = 3;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP__SPEAKERS = 4;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.SpeakerImpl
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 5;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__SURNAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Patronymic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__PATRONYMIC = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__LINK = 3;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Participants <em>Participants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Participants
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getParticipants()
	 * @generated
	 */
	int PARTICIPANTS = 6;

	/**
	 * The meta object id for the '<em>SRC</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getSRC()
	 * @generated
	 */
	int SRC = 7;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getURL()
	 * @generated
	 */
	int URL = 8;


	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Town</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town
	 * @generated
	 */
	EClass getTown();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getName()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getDescription()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Description();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getImage()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Image();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getAlt()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Alt();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getStart()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Start();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getEnd()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_End();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinAge <em>Min Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Age</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinAge()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_MinAge();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxAge <em>Max Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Age</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxAge()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_MaxAge();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinClass <em>Min Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Class</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinClass()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_MinClass();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxClass <em>Max Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Class</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxClass()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_MaxClass();

	/**
	 * Returns the meta object for the attribute list '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participants</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getParticipants()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Participants();

	/**
	 * Returns the meta object for the reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speakers</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getSpeakers()
	 * @see #getTown()
	 * @generated
	 */
	EReference getTown_Speakers();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getRef()
	 * @see #getTown()
	 * @generated
	 */
	EAttribute getTown_Ref();

	/**
	 * Returns the meta object for the reference '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Town#getType()
	 * @see #getTown()
	 * @generated
	 */
	EReference getTown_Type();

	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.TownType <em>Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Town Type</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.TownType
	 * @generated
	 */
	EClass getTownType();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.TownType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.TownType#getName()
	 * @see #getTownType()
	 * @generated
	 */
	EAttribute getTownType_Name();

	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for the reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.Region#getTowns <em>Towns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Towns</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Region#getTowns()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Towns();

	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for the reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#getTowns <em>Towns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Towns</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Road#getTowns()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_Towns();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Road#getName()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isFullAttendance <em>Full Attendance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Attendance</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Road#isFullAttendance()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_FullAttendance();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isIteratable <em>Iteratable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteratable</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Road#isIteratable()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Iteratable();

	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap
	 * @generated
	 */
	EClass getEventsMap();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTowns <em>Towns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Towns</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTowns()
	 * @see #getEventsMap()
	 * @generated
	 */
	EReference getEventsMap_Towns();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTypes()
	 * @see #getEventsMap()
	 * @generated
	 */
	EReference getEventsMap_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRegions()
	 * @see #getEventsMap()
	 * @generated
	 */
	EReference getEventsMap_Regions();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRoads <em>Roads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roads</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRoads()
	 * @see #getEventsMap()
	 * @generated
	 */
	EReference getEventsMap_Roads();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speakers</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getSpeakers()
	 * @see #getEventsMap()
	 * @generated
	 */
	EReference getEventsMap_Speakers();

	/**
	 * Returns the meta object for class '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getSurname()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Surname();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getName()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getPatronymic <em>Patronymic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patronymic</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getPatronymic()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Patronymic();

	/**
	 * Returns the meta object for the attribute '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getLink()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Link();

	/**
	 * Returns the meta object for enum '{@link ru.aparovyshnaia.yarocvet.events.model.api.Participants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participants</em>'.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Participants
	 * @generated
	 */
	EEnum getParticipants();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SRC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SRC</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getSRC();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EventsFactory getEventsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl <em>Town</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.TownImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getTown()
		 * @generated
		 */
		EClass TOWN = eINSTANCE.getTown();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__NAME = eINSTANCE.getTown_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__DESCRIPTION = eINSTANCE.getTown_Description();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__IMAGE = eINSTANCE.getTown_Image();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__ALT = eINSTANCE.getTown_Alt();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__START = eINSTANCE.getTown_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__END = eINSTANCE.getTown_End();

		/**
		 * The meta object literal for the '<em><b>Min Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__MIN_AGE = eINSTANCE.getTown_MinAge();

		/**
		 * The meta object literal for the '<em><b>Max Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__MAX_AGE = eINSTANCE.getTown_MaxAge();

		/**
		 * The meta object literal for the '<em><b>Min Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__MIN_CLASS = eINSTANCE.getTown_MinClass();

		/**
		 * The meta object literal for the '<em><b>Max Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__MAX_CLASS = eINSTANCE.getTown_MaxClass();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__PARTICIPANTS = eINSTANCE.getTown_Participants();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOWN__SPEAKERS = eINSTANCE.getTown_Speakers();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN__REF = eINSTANCE.getTown_Ref();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOWN__TYPE = eINSTANCE.getTown_Type();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.TownTypeImpl <em>Town Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.TownTypeImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getTownType()
		 * @generated
		 */
		EClass TOWN_TYPE = eINSTANCE.getTownType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWN_TYPE__NAME = eINSTANCE.getTownType_Name();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.RegionImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Towns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TOWNS = eINSTANCE.getRegion_Towns();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.RoadImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '<em><b>Towns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__TOWNS = eINSTANCE.getRoad_Towns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__NAME = eINSTANCE.getRoad_Name();

		/**
		 * The meta object literal for the '<em><b>Full Attendance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__FULL_ATTENDANCE = eINSTANCE.getRoad_FullAttendance();

		/**
		 * The meta object literal for the '<em><b>Iteratable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__ITERATABLE = eINSTANCE.getRoad_Iteratable();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.EventsMapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsMapImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getEventsMap()
		 * @generated
		 */
		EClass EVENTS_MAP = eINSTANCE.getEventsMap();

		/**
		 * The meta object literal for the '<em><b>Towns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_MAP__TOWNS = eINSTANCE.getEventsMap_Towns();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_MAP__TYPES = eINSTANCE.getEventsMap_Types();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_MAP__REGIONS = eINSTANCE.getEventsMap_Regions();

		/**
		 * The meta object literal for the '<em><b>Roads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_MAP__ROADS = eINSTANCE.getEventsMap_Roads();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTS_MAP__SPEAKERS = eINSTANCE.getEventsMap_Speakers();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.SpeakerImpl
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__SURNAME = eINSTANCE.getSpeaker_Surname();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__NAME = eINSTANCE.getSpeaker_Name();

		/**
		 * The meta object literal for the '<em><b>Patronymic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__PATRONYMIC = eINSTANCE.getSpeaker_Patronymic();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__LINK = eINSTANCE.getSpeaker_Link();

		/**
		 * The meta object literal for the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Participants <em>Participants</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.aparovyshnaia.yarocvet.events.model.api.Participants
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getParticipants()
		 * @generated
		 */
		EEnum PARTICIPANTS = eINSTANCE.getParticipants();

		/**
		 * The meta object literal for the '<em>SRC</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getSRC()
		 * @generated
		 */
		EDataType SRC = eINSTANCE.getSRC();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see ru.aparovyshnaia.yarocvet.events.model.impl.EventsPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

	}

} //EventsPackage
