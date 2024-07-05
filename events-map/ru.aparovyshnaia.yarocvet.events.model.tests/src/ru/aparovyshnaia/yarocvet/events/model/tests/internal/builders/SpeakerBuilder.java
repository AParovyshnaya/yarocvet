package ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders;

import java.net.MalformedURLException;
import java.net.URL;

import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

final class SpeakerBuilder {
	
	private String surname = "Kovalevskaia";
	private String name = "Sofia";
	private String patronymic = "PLACEHOLDER";
	private URL link = defaultLink();
	private String job = "PLACEHOLDER";
	private String place = "PLACEHOLDER";
	
	private URL defaultLink() {
		try {
			return new URL("http://www.school617.spb.ru/kollektiv");
		} catch (MalformedURLException e) {
			// no-op
		}
		return null;
	}

	SpeakerBuilder present(String surname, String name, URL link) {
		this.surname = surname;
		this.name = name;
		this.link = link;
		return this;
	}
	SpeakerBuilder present(String surname, String name, String patronymic, URL link) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.link = link;
		return this;
	}
	SpeakerBuilder job(String job, String place) {
		this.job = job;
		this.place = place;
		return this;
	}
	
	Speaker createSpeaker() {
		Speaker speaker = EventsFactory.eINSTANCE.createSpeaker();
		speaker.setSurname(surname);
		speaker.setName(name);
		speaker.setPatronymic(patronymic);
		speaker.setLink(link);
		speaker.setJob(job);
		speaker.setPlace(place);
		return speaker;
	}
}
