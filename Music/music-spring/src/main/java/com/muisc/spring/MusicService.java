package com.muisc.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicService {
	
	@Autowired
	MusicDB db;
	
	
	public List<Music> getAllMusic(){
		return db.findAll();
	}
	
	public Music getMusic(String name) {
        return db.findByName(name); // Assuming you have this method for exact name match
    }
	
	public void addMusic(Music music) {
		db.save(music);
	}
	
	 public List<Music> searchMusic(String query) {
	        return db.findByNameContainingIgnoreCaseOrMovieContainingIgnoreCaseOrArtistContainingIgnoreCaseOrLanguageContainingIgnoreCase(
	            query, query, query, query
	        );
	    }
}
