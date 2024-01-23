package dev.springboot.secondspbmovies.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class ReviewEntity extends BaseEntity{
	@Column(name = "body")
	private String body;
	
	@JsonBackReference
	@ManyToOne
    @JoinColumn(name = "movie_id")
	private MovieEntity movie;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public MovieEntity getMovie() {
		return movie;
	}

	public void setMovie(MovieEntity movie) {
		this.movie = movie;
	}
	
}
