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
	
	@GetMapping("/users")
    public List<Event> getUsers() {
        return (List<Event>) repo.findAll();
    }
 
    @PostMapping("/users")
    void addUser(@RequestBody Event event) {
        repo.save(event);
    }
}