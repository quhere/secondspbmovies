package dev.springboot.secondspbmovies.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.secondspbmovies.entity.MovieEntity;


public interface MovieRepository extends JpaRepository<MovieEntity, Long>{
	Optional<MovieEntity> findMovieEntityByImdbId(String imdb);
}
