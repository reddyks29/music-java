package com.music.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.app.Music;
import com.music.repositry.MusicRepo;

@Service
public class MusicService {
//Intermediate between the repository and controller
	@Autowired
	private MusicRepo musicRepo;
	
	public List<Music> getAllmusic(){
		return musicRepo.findAll();
	}
	
	public List<Music> searchMusic(String name){
		return musicRepo.findByNameContaining(name);
	}
	
	public void addMusic(Music music) {
		musicRepo.save(music);
	}
	
	public Optional<Music> getMusicById(Long id){
		return musicRepo.findById(id);
	}
	
	public void updateMusic(Long id,Music updateMusic) {
		Optional<Music> existingMusic=musicRepo.findById(id);
		if(existingMusic.isPresent()) {
			Music music=existingMusic.get();
			music.setName(updateMusic.getName());
			music.setArtist(updateMusic.getArtist());
			music.setLanguage(updateMusic.getLanguage());
			music.setMovie(updateMusic.getMovie());
			music.setYear(updateMusic.getYear());
			musicRepo.save(music);
		}
	}
	
	public void deleteMusic(Long id) {
		musicRepo.deleteById(id);
	}
	
	
}
