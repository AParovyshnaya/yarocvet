package ru.aparovyshnaia.yarocvet.events.model.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emfcloud.jackson.resource.JsonResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class EventsJsonResourceImpl extends JsonResource {

	public EventsJsonResourceImpl(URI uri, ObjectMapper mapper) {
		super(uri, mapper);
	}

	@Override
	protected boolean useUUIDs() {
		return false;
	}

	
}
