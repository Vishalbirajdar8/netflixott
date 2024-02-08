package com.Technosignia.NetflixOtt.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actor {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMartialStaus() {
		return martialStaus;
	}

	public void setMartialStaus(String martialStaus) {
		this.martialStaus = martialStaus;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}

	public List<Seriese> getSeriese() {
		return seriese;
	}

	public void setSeriese(List<Seriese> seriese) {
		this.seriese = seriese;
	}

	public List<Theatere> getTheatere() {
		return theatere;
	}

	public void setTheatere(List<Theatere> theatere) {
		this.theatere = theatere;
	}

	public List<Songs> getSongs() {
		return songs;
	}

	public void setSongs(List<Songs> songs) {
		this.songs = songs;
	}
	
	
	
	
	

}
