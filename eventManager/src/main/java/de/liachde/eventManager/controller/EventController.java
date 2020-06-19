package de.liachde.eventManager.controller;

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
        return (List<Event>) repo.findAll();
    }
 
    @PostMapping("/events")
    void addEvent(@RequestBody Event event) {
    	System.out.println(event.getName() + " | " + event.getOrt() + " | " + event.getOpen().toString() + " | " + event.getBeschreibung());
        repo.save(event);
    }
}
