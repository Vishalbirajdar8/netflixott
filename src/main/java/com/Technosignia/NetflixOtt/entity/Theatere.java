package com.Technosignia.NetflixOtt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theatere {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String dramaname;
	
	String director;
	
	String producer;
	
	String dramalength;
	
	Long livePerformance;
	
	String genere;

}
