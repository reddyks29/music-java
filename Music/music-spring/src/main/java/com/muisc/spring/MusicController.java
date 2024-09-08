package com.muisc.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {
    
    @Autowired
    MusicService musicService;
    
    @GetMapping("/music")
    public List<Music> getAllMusic(){
        return musicService.getAllMusic(); 
    }
    
    @GetMapping("/music/{name}")
    public ResponseEntity<Music> getAMusic(@PathVariable("name") String name) {
        Music music = musicService.getMusic(name);
        if (music != null) {
            return new ResponseEntity<>(music, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  // Return 404 if not found
        }
    }
    
    @PostMapping("/music")
    public ResponseEntity<Void> addMusic(@RequestBody Music music) {
        musicService.addMusic(music);
        return new ResponseEntity<>(HttpStatus.CREATED); // Return 201 Created
    }
    
    @GetMapping("/music/search")
    public List<Music> searchMusic(@RequestParam("query") String query) {
        return musicService.searchMusic(query);
    }
}
