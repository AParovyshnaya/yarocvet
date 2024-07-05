/**
 */
package ru.aparovyshnaia.yarocvet.events.model.api;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Town</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getName <em>Name</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getImage <em>Image</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getAlt <em>Alt</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getStart <em>Start</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getEnd <em>End</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinAge <em>Min Age</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinClass <em>Min Class</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxClass <em>Max Class</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getRef <em>Ref</em>}</li>
 *   <li>{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown()
 * @model
 * @generated
 */
public interface Town extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Image()
	 * @model default="" dataType="ru.aparovyshnaia.yarocvet.events.model.api.SRC"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Alt()
	 * @model required="true"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Start()
	 * @model required="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Min Age</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Age</em>' attribute.
	 * @see #setMinAge(int)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_MinAge()
	 * @model default="1"
	 * @generated
	 */
	int getMinAge();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinAge <em>Min Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Age</em>' attribute.
	 * @see #getMinAge()
	 * @generated
	 */
	void setMinAge(int value);

	/**
	 * Returns the value of the '<em><b>Max Age</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Age</em>' attribute.
	 * @see #setMaxAge(int)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_MaxAge()
	 * @model default="1"
	 * @generated
	 */
	int getMaxAge();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxAge <em>Max Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Age</em>' attribute.
	 * @see #getMaxAge()
	 * @generated
	 */
	void setMaxAge(int value);

	/**
	 * Returns the value of the '<em><b>Min Class</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Class</em>' attribute.
	 * @see #setMinClass(int)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_MinClass()
	 * @model default="1"
	 * @generated
	 */
	int getMinClass();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMinClass <em>Min Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Class</em>' attribute.
	 * @see #getMinClass()
	 * @generated
	 */
	void setMinClass(int value);

	/**
	 * Returns the value of the '<em><b>Max Class</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Class</em>' attribute.
	 * @see #setMaxClass(int)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_MaxClass()
	 * @model default="1"
	 * @generated
	 */
	int getMaxClass();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getMaxClass <em>Max Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Class</em>' attribute.
	 * @see #getMaxClass()
	 * @generated
	 */
	void setMaxClass(int value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' attribute list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Participants}.
	 * The literals are from the enumeration {@link ru.aparovyshnaia.yarocvet.events.model.api.Participants}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' attribute list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.api.Participants
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Participants()
	 * @model default="Schoolchildren"
	 * @generated
	 */
	EList<Participants> getParticipants();

	/**
	 * Returns the value of the '<em><b>Speakers</b></em>' reference list.
	 * The list contents are of type {@link ru.aparovyshnaia.yarocvet.events.model.api.Speaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers</em>' reference list.
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Speakers()
	 * @model
	 * @generated
	 */
	EList<Speaker> getSpeakers();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Ref()
	 * @model dataType="ru.aparovyshnaia.yarocvet.events.model.api.PathName" required="true"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TownType)
	 * @see ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage#getTown_Type()
	 * @model required="true"
	 * @generated
	 */
	TownType getType();

	/**
	 * Sets the value of the '{@link ru.aparovyshnaia.yarocvet.events.model.api.Town#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TownType value);

} // Town
