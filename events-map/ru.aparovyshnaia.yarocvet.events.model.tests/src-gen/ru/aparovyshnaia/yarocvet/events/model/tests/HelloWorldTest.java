package ru.aparovyshnaia.yarocvet.events.model.tests;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;

import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;
import ru.aparovyshnaia.yarocvet.events.model.util.EventsJsonResourceFactoryImpl;

final class HelloWorldTest {
	
	@Test
	void hello() throws IOException {
		Town town = town();
		String dir = System.getProperty("user.dir");
		System.out.println("HelloWorldTest.hello(): " + dir);
		URI uri = URI.createFileURI(dir + File.separator + "hello.events.json");
		Resource resource = new EventsJsonResourceFactoryImpl().createResource(uri);
		resource.getContents().add(town.getType());
		resource.getContents().add(town);
		resource.save(new HashMap<>());
	}
	
	private Town town() {
		Town town = EventsFactory.eINSTANCE.createTown();
		town.setName("Торжественное открытие «»\r\n Яроцвета первого созыва");
		// FIXME: add normal time
		town.setStart(new Date(1730966100000L));
		town.setType(type());
		return town;
		
	}
	
	private TownType type() {
		TownType type = EventsFactory.eINSTANCE.createTownType();
		type.setName("Торжественное открытие");
		// TODO: calculate type name with town name
		return type;
	}
}
