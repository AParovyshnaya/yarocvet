package ru.aparovyshnaia.yarocvet.events.model.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;

import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

public final class HelloWorldTest {

	@Test
	void hello() throws IOException {
		Town town = town("world", new Date(), type("Glorious opening"));
		TownType type = town.getType();

		// save
		ResourceSet set = new ResourceSetImpl();

		Resource towns = set.createResource(uri("towns.events"));
		towns.getContents().add(town);

		Resource types = set.createResource(uri("types.events"));
		types.getContents().add(type);

		for (Resource resource : set.getResources()) {
			System.out.println(resource.getURI());
			resource.save(Collections.emptyMap());
		}

		// load
		Resource resource = new ResourceSetImpl().getResource(uri("towns.events"), true);
		assertNotNull(resource);

		List<EObject> contents = resource.getContents();
		assertFalse(contents.isEmpty());

		EObject root = contents.get(0);
		assertInstanceOf(Town.class, root);

		Town loadedTown = (Town) root;
		assertNotNull(loadedTown.getType());

		assertEquals("Glorious opening", loadedTown.getType().getName());

	}

	private URI uri(String name) {
		String location = System.getProperty("user.dir");
		String dir = location.substring(0, location.lastIndexOf("\\"));
		return URI.createFileURI(dir + "\\resources" + File.separator + name);
	}

	private List<Town> towns() {

		return null;
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
