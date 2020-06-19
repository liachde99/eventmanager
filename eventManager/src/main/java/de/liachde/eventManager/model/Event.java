package de.liachde.eventManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",unique = true,nullable = false)
	private Long eventId;
	
	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name = "ort",nullable = false)
	private String ort;
	
	@Column(name = "beschreibung")
	private String beschreibung;
	
	@Column(name = "open",nullable = false)
	private Boolean open;
}
