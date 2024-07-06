package ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders;

import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Region;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

public final class RegionBuilder {
	
	private List<Town> towns = List.of();
	private String name = "A School Study";
	
	public Region createRegion() {
		Region region = EventsFactory.eINSTANCE.createRegion();
		region.getTowns().addAll(towns);
		region.setName(name);
		return region;
	}
	
	public RegionBuilder towns(List<Town> towns) {
		this.towns = towns;
		return this;
	}
	public RegionBuilder name(String name) {
		this.name = name;
		return this;
	}
	
}
