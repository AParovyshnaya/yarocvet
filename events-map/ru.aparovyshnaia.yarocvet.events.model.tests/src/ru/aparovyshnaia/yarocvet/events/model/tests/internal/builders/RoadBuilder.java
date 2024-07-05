package ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders;

import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Road;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

final class RoadBuilder {
	
	private List<Town> towns = List.of();
	private String name = "PLACEHOLDER";
	private String description = "PLACEHOLDER";
	private boolean fullAttendance = false;
	private boolean iteratable = false;
	private String ref = "";
	
	Road createRoad() {
		Road road = EventsFactory.eINSTANCE.createRoad();
		road.getTowns().addAll(towns);
		road.setName(name);
		road.setDescription(description);
		road.setRef(ref);
		road.setFullAttendance(fullAttendance);
		road.setIteratable(iteratable);
		return road;
	}
	
	RoadBuilder towns(List<Town> towns) {
		this.towns = towns;
		return this;
	}
	RoadBuilder name(String name) {
		this.name = name;
		return this;
	}
	RoadBuilder fullName(String name, String description, String ref) {
		this.name = name;
		this.description = description;
		this.ref = ref;
		return this;
	}
	RoadBuilder fullAttendance(boolean fullAttendance) {
		this.fullAttendance = fullAttendance;
		return this;
	}
	RoadBuilder iteratable(boolean iteratable) {
		this.iteratable = iteratable;
		return this;
	}

	
}
