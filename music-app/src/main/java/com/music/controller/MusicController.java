package com.music.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.music.app.Music;
import com.music.service.MusicService;

@RestController
@RequestMapping("/music")
public class MusicController {
	@Autowired
	private MusicService musicService;
	
	@GetMapping("/all")
	public List<Music> getAllSongs(){
		return musicService.getAllsongs();
	}
	
	@GetMapping("/{name}")
	public Optional<Music> getMusicByName(@PathVariable String name) {
		return musicService.getMusicByName(name);
	}
	
	@PostMapping("/add")
	public void addMusic(@RequestBody Music music) {
		musicService.addMusic(music);
	}
	
	@GetMapping("/search")
	public List<Music> searchMusic(@RequestParam String text){
		return musicService.findByText(text);
	}
	
	@GetMapping("/year/{year}")
	public List<Music> getSongByYear(@PathVariable int year){
		return musicService.getSongOfyear(year);
	}
}
