package com.music.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.app.Music;

@Repository
public interface MusicRepo extends JpaRepository<Music, String> {
	//To perform crud operations
	//String here represent primary key
}
