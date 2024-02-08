package com.Technosignia.NetflixOtt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.NetflixOtt.entity.Actor;
import com.Technosignia.NetflixOtt.service.ActorService;

@RestController
public class ActorController {
	@Autowired
	ActorService actorservice;

	//i am making changes
	
	@PostMapping("/actor")
	public Actor createActor(@RequestBody Actor actor) {
		return actorservice.createActor(actor);
	}
	
	@GetMapping("actor/{id}")
	public Actor getActorById(@PathVariable Long id ) {
		return actorservice.getActorById(id);
		
	}
	@GetMapping("/actors")
	public List<Actor> getAllActors(){
		return actorservice.getAllActors();	
	}
	
    @DeleteMapping
    public String deleteActorById(@RequestParam Long id) {
	return actorservice.deleteActorByIdId(id);	
     }

     public Actor updateByActorId(@RequestParam Long id, @RequestBody Actor actor) {
	 return actorservice.updateByActorId(id,actor);
     }
}
	


