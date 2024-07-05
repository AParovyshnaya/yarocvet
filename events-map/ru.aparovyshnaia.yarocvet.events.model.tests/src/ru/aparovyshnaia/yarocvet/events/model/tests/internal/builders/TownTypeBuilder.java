package ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders;

import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

final class TownTypeBuilder {
	
	private String name = "Lecture";
	private String description = "PLACEHOLDER";
	
	TownType createTownType() {
		TownType townType = EventsFactory.eINSTANCE.createTownType();
		townType.setName(name);
		townType.setDescription(description);
		return townType;
	}
	
	TownTypeBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	TownTypeBuilder description(String description) {
		this.description = description;
		return this;
	}
}
