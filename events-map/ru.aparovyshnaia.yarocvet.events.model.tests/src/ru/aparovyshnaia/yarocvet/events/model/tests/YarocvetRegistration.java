package ru.aparovyshnaia.yarocvet.events.model.tests;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import ru.aparovyshnaia.yarocvet.events.model.meta.EventsPackage;
import ru.aparovyshnaia.yarocvet.events.model.util.EventsJsonResourceFactoryImpl;

public final class YarocvetRegistration {
	  
	  public void ensure() {
	    EPackage.Registry.INSTANCE.computeIfAbsent(EventsPackage.eNS_URI, k -> EventsPackage.eINSTANCE);
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().computeIfAbsent("events", //
	        k -> new EventsJsonResourceFactoryImpl());
	  }

	}