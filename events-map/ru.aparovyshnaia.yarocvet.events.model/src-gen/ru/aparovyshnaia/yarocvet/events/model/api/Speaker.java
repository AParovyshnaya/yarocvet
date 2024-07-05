/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getSurname <em>Surname</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getPatronymic <em>Patronymic</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getSpeaker()
 * @model
 * @generated
 */
public interface Speaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getSpeaker_Surname()
	 * @model required="true"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getSpeaker_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Patronymic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patronymic</em>' attribute.
	 * @see #setPatronymic(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getSpeaker_Patronymic()
	 * @model
	 * @generated
	 */
	String getPatronymic();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getPatronymic <em>Patronymic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patronymic</em>' attribute.
	 * @see #getPatronymic()
	 * @generated
	 */
	void setPatronymic(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * The default value is <code>"http://www.school617.spb.ru/kollektiv/"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(URL)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getSpeaker_Link()
	 * @model default="http://www.school617.spb.ru/kollektiv/" dataType="ru.aparovyshnaia.yarocvet.events.model.api.URL" required="true"
	 * @generated
	 */
	URL getLink();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(URL value);

} // Speaker
