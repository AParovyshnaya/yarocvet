/**
 */
package events.impl;

import events.EventsMap;
import events.EventsPackage;
import events.Region;
import events.Road;
import events.Town;
import events.TownType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link events.impl.EventsMapImpl#getTowns <em>Towns</em>}</li>
 *   <li>{@link events.impl.EventsMapImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link events.impl.EventsMapImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link events.impl.EventsMapImpl#getRoads <em>Roads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventsMapImpl extends MinimalEObjectImpl.Container implements EventsMap {
	/**
	 * The cached value of the '{@link #getTowns() <em>Towns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowns()
	 * @generated
	 * @ordered
	 */
	protected EList<Town> towns;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TownType> types;

	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getRoads() <em>Roads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoads()
	 * @generated
	 * @ordered
	 */
	protected EList<Road> roads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventsMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENTS_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Town> getTowns() {
		if (towns == null) {
			towns = new EObjectContainmentEList<Town>(Town.class, this, EventsPackage.EVENTS_MAP__TOWNS);
		}
		return towns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TownType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TownType>(TownType.class, this, EventsPackage.EVENTS_MAP__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentEList<Region>(Region.class, this, EventsPackage.EVENTS_MAP__REGIONS);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Road> getRoads() {
		if (roads == null) {
			roads = new EObjectContainmentEList<Road>(Road.class, this, EventsPackage.EVENTS_MAP__ROADS);
		}
		return roads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventsPackage.EVENTS_MAP__TOWNS:
				return ((InternalEList<?>)getTowns()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_MAP__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_MAP__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_MAP__ROADS:
				return ((InternalEList<?>)getRoads()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.EVENTS_MAP__TOWNS:
				return getTowns();
			case EventsPackage.EVENTS_MAP__TYPES:
				return getTypes();
			case EventsPackage.EVENTS_MAP__REGIONS:
				return getRegions();
			case EventsPackage.EVENTS_MAP__ROADS:
				return getRoads();
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
			case EventsPackage.EVENTS_MAP__TOWNS:
				getTowns().clear();
				getTowns().addAll((Collection<? extends Town>)newValue);
				return;
			case EventsPackage.EVENTS_MAP__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TownType>)newValue);
				return;
			case EventsPackage.EVENTS_MAP__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case EventsPackage.EVENTS_MAP__ROADS:
				getRoads().clear();
				getRoads().addAll((Collection<? extends Road>)newValue);
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
			case EventsPackage.EVENTS_MAP__TOWNS:
				getTowns().clear();
				return;
			case EventsPackage.EVENTS_MAP__TYPES:
				getTypes().clear();
				return;
			case EventsPackage.EVENTS_MAP__REGIONS:
				getRegions().clear();
				return;
			case EventsPackage.EVENTS_MAP__ROADS:
				getRoads().clear();
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
			case EventsPackage.EVENTS_MAP__TOWNS:
				return towns != null && !towns.isEmpty();
			case EventsPackage.EVENTS_MAP__TYPES:
				return types != null && !types.isEmpty();
			case EventsPackage.EVENTS_MAP__REGIONS:
				return regions != null && !regions.isEmpty();
			case EventsPackage.EVENTS_MAP__ROADS:
				return roads != null && !roads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventsMapImpl
