package dev.springboot.secondspbmovies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.springboot.secondspbmovies.entity.MovieEntity;
import dev.springboot.secondspbmovies.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired 
	private MovieRepository movieRepository;
	
	public List<MovieEntity> getAllMoivies() {
		return movieRepository.findAll();	
	}
	
	public Optional<MovieEntity> singleMovie(Long id) {
		return movieRepository.findById(id);
	}
	
	public Optional<MovieEntity> getMovieByImdb(String imdb) {
		return movieRepository.findMovieEntityByImdbId(imdb);
	}
}
