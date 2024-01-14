package dev.springboot.secondspbmovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.springboot.secondspbmovies.entity.MovieEntity;


public interface MovieRepository extends JpaRepository<MovieEntity, Long>{

}
