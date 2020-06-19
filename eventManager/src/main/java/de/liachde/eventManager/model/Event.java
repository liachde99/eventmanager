package de.liachde.eventManager.model;

import javax.persistence.Column;
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
	@Column(name = "eventId",unique = true,nullable = false)
	private Long eventId;
	
	@Column(name = "name",nullable = false)
	private final String name;
	
	@Column(name = "ort",nullable = false)
	private final String ort;
	
	@Column(name = "beschreibung")
	private final String beschreibung;
	
	@Column(name = "open",nullable = false)
	private final Boolean open;
}
