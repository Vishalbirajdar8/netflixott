package com.Technosignia.NetflixOtt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.NetflixOtt.entity.Actor;
import com.Technosignia.NetflixOtt.repository.ActorRepository;

@Service
public class ActorService {
	@Autowired
	ActorRepository actorrepository;

	public Actor createActor(Actor actor) {
		return actorrepository.save(actor);
	}

	public Actor getActorById(Long id) {
		return actorrepository.findById(id).get();
	}

	public List<Actor> getAllActors() {
		return actorrepository.findAll();
	}

	public String deleteActorByIdId(Long id) {
		 actorrepository.deleteById(id);
		 return "Id is successfully deleted";
	}

	public Actor updateByActorId(Long id, Actor actor) {
		Actor actor1=actorrepository.findById(id).get();
		actor1.setAge(actor.getAge());
		actor1.setContact(actor.getContact());
		actor1.setDob(actor.getDob());
		actor1.setEmail(actor.getEmail());
		actor1.setHeight(actor.getHeight());
		actor1.setMartialStaus(actor.getMartialStaus());
		actor1.setName(actor.getName());
		actor1.setPortfolio(actor.getPortfolio());
		actor1.setFilm(actor.getFilm());
		actor1.setId(actor.getId());
		
		return actorrepository.save(actor1);
	}
	

}
