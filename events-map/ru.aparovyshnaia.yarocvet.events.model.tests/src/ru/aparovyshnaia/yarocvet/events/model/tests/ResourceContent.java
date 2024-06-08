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
	
	private final List<Town> towns;
	private final List<TownType> types;
	private final List<Road> roads;
	private final List<Region> regions;

	ResourceContent() {
		this.towns = towns();
		this.types = towns.stream().map(t -> t.getType()).toList();
		this.roads = roads();
		this.regions = regions();
	}
	
	List<Town> getTowns() {
		return towns;
	}


	List<TownType> getTypes() {
		return types;
	}


	List<Road> getRoads() {
		return roads;
	}


	List<Region> getRegions() {
		return regions;
	}


	private List<Town> towns() {
		TownType opening = type("Glorious opening");
		TownType conference = type("Conference");
		return List.of(town("Glorious opening of First Yarocvet session", new Date(1728471600L), opening), town("Microplastic disaster at Finskiy Bay and Kotlin", new Date(1739293200L), conference), town("Agronomical companies in Gatchinskiy Region", new Date(1741366800L), conference));
	}
	
	private List<Road> roads() {
		return List.of(road(List.of(this.towns.get(1), this.towns.get(2))));
	}
	
	private List<Region> regions() {
		return List.of(region("Ecology", List.of(this.towns.get(1), this.towns.get(2))), region("Economic", List.of(this.towns.get(2))));
	}
	
	private Road road(List<Town> towns) {
		Road road = EventsFactory.eINSTANCE.createRoad();
		road.getTowns().addAll(towns);
		return road;
	}
	
	private Region region(String name, List<Town> points) {
		Region region = EventsFactory.eINSTANCE.createRegion();
		region.setName(name);
		region.getTowns().addAll(towns);
		return region;
	}
	
	private Town town(String name, Date start, TownType type) {
		Town town = EventsFactory.eINSTANCE.createTown();
		town.setName(name);
		// FIXME: add normal time
		town.setStart(start);
		town.setType(type);
		return town;
	}
	
	@SuppressWarnings("unused")
	private Town fullTown(String name, Date strat, TownType type, Date end) {
		Town town = town(name, strat, type);
		town.setEnd(end);
		return town;
	}

	private TownType type(String name) {
		TownType type = EventsFactory.eINSTANCE.createTownType();
		type.setName(name);
		// TODO: calculate type name with town name
		return type;
	}
	
	
}
