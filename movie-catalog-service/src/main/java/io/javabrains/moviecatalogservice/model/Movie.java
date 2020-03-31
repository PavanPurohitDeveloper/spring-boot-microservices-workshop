package io.javabrains.moviecatalogservice.model;

public class Movie {
	
	private String movieId;
	private String movieName;
	private String moviewDescription;
	
	public Movie() {
		super();
	}

	public Movie(String movieId, String movieName, String moviewDescription) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moviewDescription = moviewDescription;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMoviewDescription() {
		return moviewDescription;
	}
	public void setMoviewDescription(String moviewDescription) {
		this.moviewDescription = moviewDescription;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", moviewDescription=" + moviewDescription
				+ "]";
	}
	
}
