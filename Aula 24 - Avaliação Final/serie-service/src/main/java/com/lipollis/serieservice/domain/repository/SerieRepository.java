package com.lipollis.serieservice.domain.repository;

import com.lipollis.serieservice.domain.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

	@Query("SELECT s FROM Serie s WHERE s.genre = ?1")
	List<Serie> findByGenre(String genre);
}
