package com.Technosignia.NetflixOtt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
    String name;
	
	Long age;
	
	Long contact;
	
	String email;
	
	String martialStaus;
	
	Long height;
	
	String dob;
	
	@OneToOne
	Portfolio portfolio;
	

	@OneToMany
	List <Film> film;
	
	@OneToMany
	List<Seriese> seriese;
	
	@OneToMany
	List<Theatere> theatere;
	
	@OneToMany
	List<Songs> songs;
	
	

}
