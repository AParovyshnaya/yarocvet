/**
 */
package ru.aparovyshnaia.yarocvet.events.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__END = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Town</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWN_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_MAP_OPERATION_COUNT = 0;


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

	}

} //EventsPackage
