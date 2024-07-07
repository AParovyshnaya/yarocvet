package ru.aparovyshnaia.yarocvet.events.model.tests.internal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders.SpeakerBuilder;

public final class Speakers {
	
	private final List<Speaker> speakers;
	
	public Speakers() {
		this.speakers = createSpeakers();
	}
	
	private List<Speaker> createSpeakers() {
		return List.of(//
				new SpeakerBuilder().present("Darwin", "Charles",  link("https://en.wikipedia.org/wiki/Charles_Darwin)")).createSpeaker()//
				);
	}
	
	public List<Speaker> speakers() {
		return this.speakers;
	}
	
	public Speaker Darwin() {
		return this.speakers.get(0);
	}
	
	private URL link(String link) {
		try {
			return new URL(link);
		} catch (MalformedURLException e) {
			// no-op,
			// because catch trusts you
		}
		return null;
	}
}
