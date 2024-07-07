package ru.aparovyshnaia.yarocvet.events.model.tests.internal;

import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Road;

public final class Roads {
	
	private final List<Road> roads;

	public Roads(Towns towns) {
		this.roads = createRoads(towns);
	}
	
	private List<Road> createRoads(Towns towns) {
		return List.of();
	}
	
	public List<Road> roads() {
		return this.roads;
	}
}
