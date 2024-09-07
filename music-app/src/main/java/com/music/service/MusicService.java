package com.music.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.*;

import com.music.app.Music;
import com.music.repositry.MusicRepo;

@Service
public class MusicService {
//intermidiate between the repositry and controller
	@Autowired
	private MusicRepo musicRepo;
	
	//method to save a song
	public Music save(Music music) {
		return musicRepo.save(music);
	}
	
	//add music
	public void addMusic(Music music) {
		musicRepo.save(music);
	}
	
	//Method to get all songs
	public List<Music> getAllsongs(){
		return musicRepo.findAll();
	}
	
	//Method to find song by name
	public Optional<Music> getMusicByName(String name){
		return Optional.ofNullable(musicRepo.findById(name).orElse(null));
		
	}
	
	public List<Music> findByText(String text){
		return (List<Music>) musicRepo.findAll().stream().filter(m->m.getArtist().toLowerCase().contains(text.toLowerCase())||
				m.getLanguage().toLowerCase().contains(text.toLowerCase())||
				m.getMovie().toLowerCase().contains(text.toLowerCase())||
				m.getName().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
	}
	
	public List<Music> getSongOfyear(int year){
		return (List<Music>) musicRepo.findAll().stream().filter(m->m.getYear()>=year).collect(Collectors.toList());
	}
	
	//method to delete a song by name
	public void deleteMusic(String name) {
		musicRepo.deleteById(name);
	}
}
