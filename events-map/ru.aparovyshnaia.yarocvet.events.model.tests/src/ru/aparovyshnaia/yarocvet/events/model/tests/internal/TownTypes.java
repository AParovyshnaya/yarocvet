package ru.aparovyshnaia.yarocvet.events.model.tests.internal;

import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.TownType;

public final class TownTypes {

	private final List<TownType> types;
	
	public TownTypes() {
		this.types = createTypes();
	}
	
	private List<TownType> createTypes() {
		return List.of();
	}
	
	public List<TownType> types() {
		return this.types;
	}
	
}
