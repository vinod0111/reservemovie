package com.reservemovie.reservemovie.services;


import com.reservemovie.reservemovie.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    public Movie acceptMovieDetails(Movie movie);

    public List<Movie> acceptAllMoviDetails(List<Movie> movies);
    public Movie getMovieDetails(int id);

    public Movie updateMovieDetails(Movie movie);

    public boolean deleteMovie(int id);

    public List<Movie> getAllMovies();

    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest);
}
