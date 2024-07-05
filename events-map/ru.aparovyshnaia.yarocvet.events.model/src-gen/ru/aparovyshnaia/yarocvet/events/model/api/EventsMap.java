/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

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
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTowns <em>Towns</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getTypes <em>Types</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRegions <em>Regions</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getRoads <em>Roads</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.EventsMap#getSpeakers <em>Speakers</em>}</li>
 * </ul>
 *
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap()
 * @model
 * @generated
 */
public interface EventsMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Towns</b></em>' containment reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towns</em>' containment reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap_Towns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Town> getTowns();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.TownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TownType> getTypes();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Roads</b></em>' containment reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roads</em>' containment reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap_Roads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoads();

	/**
	 * Returns the value of the '<em><b>Speakers</b></em>' containment reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers</em>' containment reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getEventsMap_Speakers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Speaker> getSpeakers();

} // EventsMap
