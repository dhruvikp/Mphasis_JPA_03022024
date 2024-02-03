package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_03022024")
public class Movie {

	@Id
	@GeneratedValue
	@Column(name="movie_id")
	private int id;
	
	@Column(name="movie_name")
	private String name;
	
	@Column(name="movie_genre")
	private String genre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGnere() {
		return genre;
	}
	public void setGenre(String gnere) {
		this.genre = gnere;
	}
}
