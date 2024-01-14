package dev.springboot.secondspbmovies.entity;

import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
	
	@ManyToOne
    @JoinColumn(name = "genre_id")
	private GenreEntity genre;
	
	@ManyToOne
    @JoinColumn(name = "backdrop_id")
	private BackdropEntity backdrop;
	
	@ManyToOne
    @JoinColumn(name = "review_id")
	private ReviewEntity review;
	
	
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

	public ReviewEntity getReview() {
		return review;
	}

	public void setReview(ReviewEntity review) {
		this.review = review;
	}

	public GenreEntity getGenre() {
		return genre;
	}

	public void setGenre(GenreEntity genre) {
		this.genre = genre;
	}

	public BackdropEntity getBackdrop() {
		return backdrop;
	}

	public void setBackdrop(BackdropEntity backdrop) {
		this.backdrop = backdrop;
	}

}
