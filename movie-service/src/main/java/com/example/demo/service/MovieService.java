package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;

public interface MovieService {
	public Movie createMovie(Movie movie);
	public Movie findByMovieName(String movieName);
	public List<Movie> getAllMovies();

}
