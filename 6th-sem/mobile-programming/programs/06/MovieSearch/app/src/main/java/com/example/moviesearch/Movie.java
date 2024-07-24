package com.example.moviesearch;

public class Movie {
	private String title, description, posterUrl;

	public Movie(String title, String description, String posterUrl, double rating) {
		this.title = title;
		this.description = description;
		this.posterUrl = posterUrl;
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private double rating;
}
