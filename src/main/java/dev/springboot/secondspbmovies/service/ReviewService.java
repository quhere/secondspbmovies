package dev.springboot.secondspbmovies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.springboot.secondspbmovies.entity.MovieEntity;
import dev.springboot.secondspbmovies.entity.ReviewEntity;
import dev.springboot.secondspbmovies.repository.MovieRepository;
import dev.springboot.secondspbmovies.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private MovieService movieService;
	@Autowired 
	private ReviewRepository reviewRepository;
	
	public ReviewEntity createReview(String reviewBody, Long movieId) {
		
		MovieEntity movie = movieService.singleMovie(movieId).orElseThrow();
		
		ReviewEntity review = new ReviewEntity();
		review.setBody(reviewBody);
		review.setMovie(movie);
		reviewRepository.save(review);
		return review;
	}
}
