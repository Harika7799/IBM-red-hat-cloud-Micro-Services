package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	
	private MovieService movieService;
	private Environment environment;
	@Autowired
	public MovieController(MovieService movieService, Environment environment) {
		super();
		this.movieService = movieService;
		this.environment = environment;
	}
	@GetMapping
	public String getStatus() {
		return "app running and up on port" +environment.getProperty("local.server.port");
	}
	@GetMapping("/movies/{movieName}")
	public Movie getMovieByName(@PathVariable("movieName") String movieName)
	{
		return movieService.findByMovieName(movieName);
	}
	@GetMapping("/movies")
	public List<Movie> getAllMovies()
	{
		return movieService.getAllMovies();
	}
	@PostMapping("/movies")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}


}
