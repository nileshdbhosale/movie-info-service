package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId) {
		return new Movie(movieId, "RHTDM");
	}
}
