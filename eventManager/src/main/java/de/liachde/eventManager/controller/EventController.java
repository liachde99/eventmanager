package de.liachde.eventManager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.liachde.eventManager.model.Event;
import de.liachde.eventManager.repo.EventRepo;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class EventController {

	private final EventRepo repo;
	
	@GetMapping("/events")
    public List<Event> getEvents() {
		List<Event> eventlist = new ArrayList<>();
		eventlist = repo.findAll();
		for (Event event : eventlist) {
			System.out.println(event.getName());
		}
        return eventlist;
    }
 
    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event) {
        return repo.save(event);
    }
}
