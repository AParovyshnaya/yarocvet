package ru.aparovyshnaia.yarocvet.events.model.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emfcloud.jackson.resource.JsonResource;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;

public final class EventsJsonResourceFactoryImpl extends JsonResourceFactory {

	@Override
	public Resource createResource(URI uri) {
		JsonResource result = new EventsJsonResourceImpl(uri, getMapper());
		return result;
	}

}