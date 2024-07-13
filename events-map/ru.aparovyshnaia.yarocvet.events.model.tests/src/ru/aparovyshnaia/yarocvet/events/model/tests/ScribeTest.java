package ru.aparovyshnaia.yarocvet.events.model.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;

import ru.aparovyshnaia.yarocvet.events.model.api.Town;

final class ScribeTest {

	@Test
	void FileTest() throws IOException {
		new YarocvetRegistration().ensure();

		save();
		
		Resource resource = new ResourceSetImpl().getResource(uri("towns.events"), true);
		assertNotNull(resource);
		
		List<EObject> contents = resource.getContents();
		assertFalse(contents.isEmpty());

		EObject root = contents.get(0);
		assertInstanceOf(Town.class, root);

		Town loadedTown = (Town) root;
		assertNotNull(loadedTown.getType());
	}
	
	private void save() throws IOException {
		Scribe content = new Scribe();
		
		ResourceSet set = new ResourceSetImpl();

		Resource towns = set.createResource(uri("towns.events"));
		towns.getContents().addAll(content.getTowns());

		Resource types = set.createResource(uri("types.events"));
		types.getContents().addAll(content.getTypes());
		
		Resource roads = set.createResource(uri("roads.events"));
		roads.getContents().addAll(content.getRoads());
		
		Resource regions = set.createResource(uri("speakers.events"));
		regions.getContents().addAll(content.getSpeakers());

		for (Resource resource : set.getResources()) {
			System.out.println(resource.getURI());
			resource.save(Collections.emptyMap());
		}
	}

	private URI uri(String name) {
		String location = System.getProperty("user.dir");
		String dir = location.substring(0, location.lastIndexOf("\\"));
		return URI.createFileURI(dir + "\\resources" + File.separator + name);
	}
	
	
}
