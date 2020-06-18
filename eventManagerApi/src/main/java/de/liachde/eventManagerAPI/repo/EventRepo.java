package de.liachde.eventManagerAPI.repo;

import org.springframework.data.repository.CrudRepository;

import de.liachde.eventManagerAPI.model.Event;

public interface EventRepo extends CrudRepository<Event, Long>{

}
