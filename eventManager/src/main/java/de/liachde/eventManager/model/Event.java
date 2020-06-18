package de.liachde.eventManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eventId;
	
	private final String name;
	private final String ort;
	private final String beschreibung;
	private final Boolean open;
}
