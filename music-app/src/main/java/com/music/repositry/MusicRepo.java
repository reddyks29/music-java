package com.music.repositry;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.music.app.Music;

@Repository
public interface MusicRepo extends JpaRepository<Music, Long> {
	//To perform crud operations
	//String here represent primary key
	List<Music> findByNameContaining(String name);
}
