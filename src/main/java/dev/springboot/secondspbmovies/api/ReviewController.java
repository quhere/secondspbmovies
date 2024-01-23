package dev.springboot.secondspbmovies.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.springboot.secondspbmovies.dto.ReviewDTO;
import dev.springboot.secondspbmovies.entity.ReviewEntity;
import dev.springboot.secondspbmovies.service.ReviewService;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

	@Autowired 
	ReviewService reviewService;
	
	@PostMapping(value="/create-review")
	public ResponseEntity<ReviewEntity> createReview(@RequestBody ReviewDTO dto) {
		String reviewBody = dto.getBody();
		Long movieId = dto.getIdMoive();
		ReviewEntity riview = reviewService.createReview(reviewBody,movieId);
		return new ResponseEntity<ReviewEntity>(riview, HttpStatus.CREATED);
	}
	
}
