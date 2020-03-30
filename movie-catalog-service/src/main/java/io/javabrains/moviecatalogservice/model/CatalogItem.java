package io.javabrains.moviecatalogservice.model;

public class CatalogItem {
	
	private String movieNme;
	private String moviewDescription;
	private int movieRating;
	
	
	public CatalogItem(String movieNme, String moviewDescription, int movieRating) {
		super();
		this.movieNme = movieNme;
		this.moviewDescription = moviewDescription;
		this.movieRating = movieRating;
	}
	
	public String getMovieNme() {
		return movieNme;
	}
	public void setMovieNme(String movieNme) {
		this.movieNme = movieNme;
	}
	public String getMoviewDescription() {
		return moviewDescription;
	}
	public void setMoviewDescription(String moviewDescription) {
		this.moviewDescription = moviewDescription;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "CatalogItem [movieNme=" + movieNme + ", moviewDescription=" + moviewDescription + ", movieRating="
				+ movieRating + "]";
	}
	
	
}
