package com.muisc.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String artist;
	private String movie;
	private String language;
	private int year;
	
	public Music() {
		
	}
	
	
	
	public Music(long id, String name, String artist, String movie, String language, int year) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.movie = movie;
		this.language = language;
		this.year = year;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", name=" + name + ", artist=" + artist + ", movie=" + movie + ", language="
				+ language + ", year=" + year + "]";
	}
	
	
}
