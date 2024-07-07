package ru.aparovyshnaia.yarocvet.events.model.tests.internal;

import java.util.Date;
import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders.TownBuilder;

public final class Towns {
	
	private final List<Town> towns;
	
	public Towns(Speakers speakers, TownTypes types) {
		this.towns = createTowns(speakers, types);
	}
	
	private List<Town> createTowns(Speakers speakers, TownTypes types) {
		return List.of(//
				originOFSpecies(speakers)
				);
	}

	private Town originOFSpecies(Speakers speakers) {
		return new TownBuilder().describe("On the Origin of Species Publication", "How mitigate the Church confusion, when you talk about Natural Selection? My contribution to modern Natural Selection Theory ", "/natural-selection/origin-of-the-species").date(new Date(1728377100000L)).appoint(speakers.Darwin()).createTown();
	}
	
	public List<Town> towns() {
		return this.towns;
	}
	
	public Town originOfSpecies() {
		return this.towns.get(0);
	}
	
}
