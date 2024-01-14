package dev.springboot.secondspbmovies.service;

import java.util.List;

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
}
