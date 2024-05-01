/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Region#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Region#getTowns <em>Towns</em>}</li>
 * </ul>
 *
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRegion_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Towns</b></em>' reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towns</em>' reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRegion_Towns()
	 * @model required="true"
	 * @generated
	 */
	EList<Town> getTowns();

} // Region
