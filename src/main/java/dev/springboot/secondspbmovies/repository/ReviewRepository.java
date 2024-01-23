package dev.springboot.secondspbmovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.secondspbmovies.entity.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long>{
	
}
