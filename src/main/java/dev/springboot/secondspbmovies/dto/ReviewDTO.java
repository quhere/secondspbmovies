package dev.springboot.secondspbmovies.dto;


public class ReviewDTO extends AbstractDTO<ReviewDTO>{
	private String body;
	private Long idMovie;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Long getIdMoive() {
		return idMovie;
	}
	public void setIdMovie(Long idMove) {
		this.idMovie = idMove;
	}
	
	
}
