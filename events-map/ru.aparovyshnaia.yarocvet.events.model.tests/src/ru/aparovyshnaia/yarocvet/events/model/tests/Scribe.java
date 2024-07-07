package ru.aparovyshnaia.yarocvet.events.model.tests;

import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Road;
import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.Roads;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.Speakers;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.TownTypes;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.Towns;

final class Scribe {

	private final Speakers speakers = new Speakers();
	private final TownTypes types = new TownTypes();
	private final Towns towns = new Towns(speakers, types);
	private final Roads roads = new Roads(towns);
	// TODO: private final List<Region> regions;

	List<Speaker> getSpeakers() {
		return this.speakers.speakers();
	}

	List<TownType> getTypes() {
		return this.types.types();
	}

	List<Town> getTowns() {
		return this.towns.towns();
	}

	List<Road> getRoads() {
		return this.roads.roads();
	}

}
