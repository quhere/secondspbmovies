package dev.springboot.secondspbmovies.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import dev.springboot.secondspbmovies.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "movie")
public class MovieEntity extends BaseEntity {
	@Column(name = "imdbId")
	private String imdbId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "releaseDate")
	private String releaseDate;
	
	@Column(name = "trailerLink")
	private String trailerLink;
	
	@Column(name = "poster")
	private String poster;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "movie")
	private List<GenreEntity> genres = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "movie")
	private List<BackdropEntity> backdrops = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "movie")
	private List<ReviewEntity> reviews = new ArrayList<>();
	
	
	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	

	public List<ReviewEntity> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}

	public List<GenreEntity> getGenres() {
		return genres;
	}

	public void setGenres(List<GenreEntity> genres) {
		this.genres = genres;
	}

	public List<BackdropEntity> getBackdrops() {
		return backdrops;
	}

	public void setBackdrops(List<BackdropEntity> backdrops) {
		this.backdrops = backdrops;
	}


}
