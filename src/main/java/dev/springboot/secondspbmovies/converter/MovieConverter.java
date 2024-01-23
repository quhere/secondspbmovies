package dev.springboot.secondspbmovies.converter;

import org.springframework.stereotype.Component;


import dev.springboot.secondspbmovies.dto.MovieDTO;
import dev.springboot.secondspbmovies.entity.MovieEntity;

@Component
public class MovieConverter {
	public MovieEntity toEntity(MovieDTO dto) {
		MovieEntity movieEntity = new MovieEntity();
		movieEntity.setImdbId(dto.getImdbId());
		movieEntity.setTitle(dto.getTitle());
		movieEntity.setReleaseDate(dto.getReleaseDate());
		movieEntity.setTrailerLink(dto.getTrailerLink());
		movieEntity.setPoster(dto.getPoster());
		return movieEntity;
	}
	
	public MovieEntity toEntity(MovieDTO dto, MovieEntity oldMovieEntity) {
		oldMovieEntity.setImdbId(dto.getImdbId());
		oldMovieEntity.setTitle(dto.getTitle());
		oldMovieEntity.setReleaseDate(dto.getReleaseDate());
		oldMovieEntity.setTrailerLink(dto.getTrailerLink());
		oldMovieEntity.setPoster(dto.getPoster());
		return oldMovieEntity;
	}
	
	public MovieDTO toDTO(MovieEntity entity) {
		MovieDTO dto = new MovieDTO();
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setImdbId(entity.getImdbId());
		dto.setTitle(entity.getTitle());
		dto.setReleaseDate(entity.getReleaseDate());
		dto.setTrailerLink(entity.getTrailerLink());
		dto.setPoster(entity.getPoster());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		return dto;
	}
}
