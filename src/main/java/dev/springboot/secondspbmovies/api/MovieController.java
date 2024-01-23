package dev.springboot.secondspbmovies.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		List<MovieEntity> listAll = movieService.getAllMoivies();
		return new ResponseEntity<List<MovieEntity>>(listAll, HttpStatus.OK);
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Optional<MovieEntity>> getSingleMovie (@PathVariable Long id) {
		
		
		return new ResponseEntity<Optional<MovieEntity>>(movieService.singleMovie(id), HttpStatus.OK);
	}
	
//	@GetMapping ("/{imdb}")
//	public ResponseEntity<Optional<MovieEntity>> getSingleMovie (@PathVariable String imdb) {
//		
//		
//		return new ResponseEntity<Optional<MovieEntity>>(movieService.getMovieByImdb(imdb), HttpStatus.OK);
//	}
}
