package ru.aparovyshnaia.yarocvet.events.model.tests;

import java.util.Date;
import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Participants;
import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

final class TownBuilder {
	
	private String name = "Time X: nothing find.";
	private String description = "You don't fill the gaps. Please try again. It's very instresting to describe blank filed. ~Do you any guilty conscience?~. Please use [infostyle](https://glvrd.ru/). \n You can create new line by combining symbols _n_ and _\\_! Also you can styling text: avalibale hightlighting and italic. Use this opportunity wisly.";
	private String image = "PLACEHOLDER";
	private String alt = "PLACEHOLDER";
	private Date start = new Date(1725170400);
	private Date end = new Date(0);
	private int minAge = -1;
	private int maxAge = -1;
	private int minClass = -1;
	private int maxClass = -1;
	private List<Participants> participants = List.of(Participants.SCHOOLCHILDREN, Participants.TEACHERS, Participants.PARENTS);
	private List<Speaker> speaker = List.of();
	private String ref = "";
	private TownType type;
	
	Town createComplexClass() {
		Town town = EventsFactory.eINSTANCE.createTown();
		town.setName(name);
		town.setDescription(description);
		town.setImage(image);
		town.setAlt(alt);
		town.setStart(start);
		town.setEnd(end);
		town.setMinAge(minAge);
		town.setMaxAge(maxAge);
		town.setMinClass(minClass);
		town.setMaxClass(maxClass);
		town.getParticipants().addAll(participants);
		town.getSpeakers().addAll(speaker);
		town.setRef(ref);
		town.setType(type);
		return town;
	}
	
	TownBuilder describe(String name, String description, String ref) {
		this.name = name;
		this.description = description;
		this.ref = ref;
		return this;
	}
	TownBuilder illustrate(String src, String alt) {
		this.image = src;
		this.alt = alt;
		return this;
	}
	TownBuilder date(Date start) {
		this.start = start;
		return this;
	}
	TownBuilder period(Date start, Date end) {
		this.start = start;
		this.end = end;
		return this;
	}
	TownBuilder ages(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
		return this;
	}
	TownBuilder withMinAge(int minAge) {
		this.minAge = minAge;
		return this;
	}
	TownBuilder withMaxAge(int maxAge) {
		this.maxAge = maxAge;
		return this;
	}
	TownBuilder withMinClass(int minClass) {
		this.minClass = minClass;
		return this;
	}
	TownBuilder withMaxClass(int maxClass) {
		this.maxClass = maxClass;
		return this;
	}
	TownBuilder classes(int minClass, int maxClass) {
		this.minClass = minClass;
		this.maxClass = maxClass;
		return this;
	}
	TownBuilder withParticipants(List<Participants> participants) {
		this.participants = participants;
		return this;
	}
	TownBuilder withSpeaker(List<Speaker> speaker) {
		this.speaker = speaker;
		return this;
	}
	TownBuilder withType(TownType type) {
		this.type = type;
		return this;
	}
	
}