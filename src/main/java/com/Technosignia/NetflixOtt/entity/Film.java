package com.Technosignia.NetflixOtt.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	String director;
	
	String producer;
	
	String movieLength;
	
	String budget;
	
	String genere;
	
	String language;
	
	

}
