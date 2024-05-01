/**
 */
package events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link events.EventsMap#getTowns <em>Towns</em>}</li>
 *   <li>{@link events.EventsMap#getTypes <em>Types</em>}</li>
 *   <li>{@link events.EventsMap#getRegions <em>Regions</em>}</li>
 *   <li>{@link events.EventsMap#getRoads <em>Roads</em>}</li>
 * </ul>
 *
 * @see events.EventsPackage#getEventsMap()
 * @model
 * @generated
 */
public interface EventsMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Towns</b></em>' containment reference list.
	 * The list contents are of type {@link events.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towns</em>' containment reference list.
	 * @see events.EventsPackage#getEventsMap_Towns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Town> getTowns();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link events.TownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see events.EventsPackage#getEventsMap_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TownType> getTypes();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link events.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see events.EventsPackage#getEventsMap_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Roads</b></em>' containment reference list.
	 * The list contents are of type {@link events.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roads</em>' containment reference list.
	 * @see events.EventsPackage#getEventsMap_Roads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoads();

} // EventsMap
