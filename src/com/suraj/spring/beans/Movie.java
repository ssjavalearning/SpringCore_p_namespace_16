package com.suraj.spring.beans;

import java.util.List;

public class Movie {

	private String movieName;
	private Song song;
	private List<String> movieNames;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public List<String> getMovieNames() {
		return movieNames;
	}
	public void setMovieNames(List<String> movieNames) {
		this.movieNames = movieNames;
	}
	
}
