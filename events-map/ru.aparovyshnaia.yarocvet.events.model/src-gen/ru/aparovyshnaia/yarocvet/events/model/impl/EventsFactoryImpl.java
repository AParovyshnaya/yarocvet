/**
 */
package ru.aparovyshnaia.yarocvet.events.model.impl;

import java.net.URL;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.aparovyshnaia.yarocvet.events.model.api.*;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsFactoryImpl extends EFactoryImpl implements EventsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EventsFactory init() {
		try {
			EventsFactory theEventsFactory = (EventsFactory)EPackage.Registry.INSTANCE.getEFactory(EventsPackage.eNS_URI);
			if (theEventsFactory != null) {
				return theEventsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EventsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EventsPackage.TOWN: return createTown();
			case EventsPackage.TOWN_TYPE: return createTownType();
			case EventsPackage.REGION: return createRegion();
			case EventsPackage.ROAD: return createRoad();
			case EventsPackage.EVENTS_MAP: return createEventsMap();
			case EventsPackage.SPEAKER: return createSpeaker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EventsPackage.PARTICIPANTS:
				return createParticipantsFromString(eDataType, initialValue);
			case EventsPackage.SRC:
				return createSRCFromString(eDataType, initialValue);
			case EventsPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case EventsPackage.PATH_NAME:
				return createPathNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EventsPackage.PARTICIPANTS:
				return convertParticipantsToString(eDataType, instanceValue);
			case EventsPackage.SRC:
				return convertSRCToString(eDataType, instanceValue);
			case EventsPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case EventsPackage.PATH_NAME:
				return convertPathNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Town createTown() {
		TownImpl town = new TownImpl();
		return town;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TownType createTownType() {
		TownTypeImpl townType = new TownTypeImpl();
		return townType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Road createRoad() {
		RoadImpl road = new RoadImpl();
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsMap createEventsMap() {
		EventsMapImpl eventsMap = new EventsMapImpl();
		return eventsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Speaker createSpeaker() {
		SpeakerImpl speaker = new SpeakerImpl();
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participants createParticipantsFromString(EDataType eDataType, String initialValue) {
		Participants result = Participants.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSRCFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSRCToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsPackage getEventsPackage() {
		return (EventsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EventsPackage getPackage() {
		return EventsPackage.eINSTANCE;
	}

} //EventsFactoryImpl
