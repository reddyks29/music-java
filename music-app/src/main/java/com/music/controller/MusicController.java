package com.music.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
//	public String getAllSongs(Model model){
//		List<Music> musicList=musicService.getAllmusic();
//		model.addAttribute("musicList",musicList);
//		return "music";
//	}
	
	@GetMapping("/music")
	public List<Music> getAllSongs(){
		return musicService.getAllmusic();
	}
	
	@GetMapping("/search")
	public String searchMusic(@RequestParam("query") String query,Model model){
		List<Music> searchRes=musicService.searchMusic(query);
		model.addAttribute("musicList",searchRes);
		return "music";
	}
	
	@GetMapping("/add-music")
	public String showAddMusicForm(Model model) {
		model.addAttribute("music", new Music());
		return "add-music";
	}
	
	@PostMapping("/add-music")
	public String addMusic(@ModelAttribute Music music) {
		musicService.addMusic(music);
		return "redirect:/music";
	}
	
	@GetMapping("edit-music/{id}")
	public String showEditMusicForm(@PathVariable Long id, Model model) {
		Optional<Music> music=musicService.getMusicById(id);
		if(music.isPresent()) {
			model.addAttribute("music",music.get());
			return "edit-music";
		}else {
			return "redirect:/music";
		}
	}
	
	@PostMapping("/edit-music/{id}")
	public String updateMusic(@PathVariable Long id, @ModelAttribute Music music) {
		musicService.updateMusic(id,music);
		return "redirect:/music";
	}
	
	@GetMapping("/delete-music/{id}")
	public String deleteMusic(@PathVariable Long id) {
		musicService.deleteMusic(id);
		return "redirect:/music";
	}
	@GetMapping("/test")
    public String test() {
        return "test"; // Create a simple `test.html` in `templates`
    }
	
}
