package ru.aparovyshnaia.yarocvet.events.model.tests;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

import ru.aparovyshnaia.yarocvet.events.model.api.Region;
import ru.aparovyshnaia.yarocvet.events.model.api.Road;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

final class ResourceContent {
	
	List<Town> towns;
	List<TownType> types;
	List<Road> roads;
	List<Region> regions;
	
	void get() {
		
	}
	
	private void towns() {
		TownType type = type("y");
		Town town = town("x", new Date(), type);
	}
	
	private Road road(EList<Town> points) {
		Road road = EventsFactory.eINSTANCE.createRoad();
		road.eSet((EStructuralFeature) points, road);
		return road;
	}
	
	private Region region(String name, EList<Town> points) {
		Region region = EventsFactory.eINSTANCE.createRegion();
		region.setName(name);
		region.eSet((EStructuralFeature) points, region);
		return region;
	}
	
	private Town town(String name, Date start, TownType type) {
		Town town = EventsFactory.eINSTANCE.createTown();
		// town.setName("Торжественное открытие «»\r\n Яроцвета первого созыва");
		town.setName(name);
		// FIXME: add normal time
		town.setStart(start);
		town.setType(type);
		return town;
	}
	
	private Town fullTown(String name, Date strat, TownType type, Date end) {
		Town town = town(name, strat, type);
		town.setEnd(end);
		return town;
	}

	private TownType type(String name) {
		TownType type = EventsFactory.eINSTANCE.createTownType();
		// type.setName("Торжественное открытие");
		type.setName(name);
		// TODO: calculate type name with town name
		return type;
	}
	
	
}
