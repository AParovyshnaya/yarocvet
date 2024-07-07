package ru.aparovyshnaia.yarocvet.events.model.tests.internal.builders;

import java.util.Date;
import java.util.List;

import ru.aparovyshnaia.yarocvet.events.model.api.Participants;
import ru.aparovyshnaia.yarocvet.events.model.api.Speaker;
import ru.aparovyshnaia.yarocvet.events.model.api.Town;
import ru.aparovyshnaia.yarocvet.events.model.api.TownType;
import ru.aparovyshnaia.yarocvet.events.model.meta.EventsFactory;

public final class TownBuilder {
	
	private String name = "Time X: nothing find.";
	private String description = "You don't fill the gaps. Please try again. It's very instresting to describe blank filed. ~Do you any guilty conscience?~. Please use [infostyle](https://glvrd.ru/). \n You can create new line by combining symbols _n_ and _\\_! Also you can styling text: avalibale hightlighting and italic. Use this opportunity wisly.";
	private String image = "PLACEHOLDER";
	private String alt = "PLACEHOLDER";
	private Date start = new Date(1725170400000L);
	private Date end = new Date(1725178500000L);
	private int minAge = -1;
	private int maxAge = -1;
	private int minClass = -1;
	private int maxClass = -1;
	private List<Participants> participants = List.of(Participants.SCHOOLCHILDREN, Participants.TEACHERS, Participants.PARENTS);
	private List<Speaker> speaker = List.of();
	private String ref = "";
	private TownType type = new TownTypeBuilder().createTownType();
	
	public Town createTown() {
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
	
	public TownBuilder describe(String name, String description, String ref) {
		this.name = name;
		this.description = description;
		this.ref = ref;
		return this;
	}
	public TownBuilder illustrate(String src, String alt) {
		this.image = src;
		this.alt = alt;
		return this;
	}
	public TownBuilder date(Date start) {
		this.start = start;
		return this;
	}
	public TownBuilder period(Date start, Date end) {
		this.start = start;
		this.end = end;
		return this;
	}
	public TownBuilder ages(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
		return this;
	}
	public TownBuilder withMinzAge(int minAge) {
		this.minAge = minAge;
		return this;
	}
	public TownBuilder withMaxAge(int maxAge) {
		this.maxAge = maxAge;
		return this;
	}
	public TownBuilder withMinClass(int minClass) {
		this.minClass = minClass;
		return this;
	}
	public TownBuilder withMaxClass(int maxClass) {
		this.maxClass = maxClass;
		return this;
	}
	public TownBuilder classes(int minClass, int maxClass) {
		this.minClass = minClass;
		this.maxClass = maxClass;
		return this;
	}
	public TownBuilder invinte(List<Participants> participants) {
		this.participants = participants;
		return this;
	}
	public TownBuilder invinte(Participants participant) {
		this.participants = List.of(participant);
		return this;
	}
	public TownBuilder appoint(List<Speaker> speaker) {
		this.speaker = speaker;
		return this;
	}
	public TownBuilder appoint(Speaker speaker) {
		this.speaker = List.of(speaker);
		return this;
	}
	public TownBuilder withType(TownType type) {
		this.type = type;
		return this;
	}
	
}
