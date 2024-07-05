/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#getTowns <em>Towns</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isFullAttendance <em>Full Attendance</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isIteratable <em>Iteratable</em>}</li>
 * </ul>
 *
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRoad()
 * @model
 * @generated
 */
public interface Road extends EObject {
	/**
	 * Returns the value of the '<em><b>Towns</b></em>' reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Town}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towns</em>' reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRoad_Towns()
	 * @model required="true"
	 * @generated
	 */
	EList<Town> getTowns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRoad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full Attendance</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Attendance</em>' attribute.
	 * @see #setFullAttendance(boolean)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRoad_FullAttendance()
	 * @model default="false"
	 * @generated
	 */
	boolean isFullAttendance();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isFullAttendance <em>Full Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Attendance</em>' attribute.
	 * @see #isFullAttendance()
	 * @generated
	 */
	void setFullAttendance(boolean value);

	/**
	 * Returns the value of the '<em><b>Iteratable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteratable</em>' attribute.
	 * @see #setIteratable(boolean)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getRoad_Iteratable()
	 * @model default="false"
	 * @generated
	 */
	boolean isIteratable();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Road#isIteratable <em>Iteratable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteratable</em>' attribute.
	 * @see #isIteratable()
	 * @generated
	 */
	void setIteratable(boolean value);

} // Road
