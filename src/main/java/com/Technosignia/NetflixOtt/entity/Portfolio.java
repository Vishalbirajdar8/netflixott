package com.Technosignia.NetflixOtt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String education;
	
	String city;
	
	String shortfilm;
	
	String documentaries;
	
	Long supportRole;
	
	Long leadRole;
	
	

}
