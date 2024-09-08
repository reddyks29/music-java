package com.muisc.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicDB extends JpaRepository<Music, Long> {
//	@Query("SELECT m FROM Music m WHERE " +
//	           "LOWER(m.name) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
//	           "LOWER(m.movie) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
//	           "LOWER(m.artist) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
//	           "LOWER(m.language) LIKE LOWER(CONCAT('%', :searchText, '%'))")
//	    List<Music> findByTextContaining(String searchText);
	
	List<Music> findByNameContainingIgnoreCaseOrMovieContainingIgnoreCaseOrArtistContainingIgnoreCaseOrLanguageContainingIgnoreCase(String name, String movie, String artist, String language);

	Music findByName(String name);
}

