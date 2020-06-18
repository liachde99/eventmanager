package de.liachde.eventManager.repo;

import org.springframework.data.repository.CrudRepository;

import de.liachde.eventManager.model.Event;

public interface EventRepo extends CrudRepository<Event, Long>{

}
