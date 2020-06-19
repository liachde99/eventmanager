package de.liachde.eventManager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.liachde.eventManager.model.Event;

public interface EventRepo extends CrudRepository<Event, Long>{
	List<Event> findAll();
}
