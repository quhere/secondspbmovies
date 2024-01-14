package dev.springboot.secondspbmovies.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "backdrop")
public class BackdropEntity extends BaseEntity{
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "backdrop")
	private List<MovieEntity> movies = new ArrayList<>();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MovieEntity> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieEntity> movies) {
		this.movies = movies;
	}
}
