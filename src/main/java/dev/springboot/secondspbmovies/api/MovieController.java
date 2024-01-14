package dev.springboot.secondspbmovies.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.springboot.secondspbmovies.entity.MovieEntity;
import dev.springboot.secondspbmovies.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<MovieEntity>> getAllMovies() {
		return new ResponseEntity<List<MovieEntity>>(movieService.getAllMoivies(), HttpStatus.OK);
	}
}
