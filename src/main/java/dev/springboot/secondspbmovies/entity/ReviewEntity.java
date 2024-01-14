package dev.springboot.secondspbmovies.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity{
	@Column(name = "body")
	private String body;
	
	@OneToMany(mappedBy = "review")
	private List<MovieEntity> movies = new ArrayList<>();

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}

}
