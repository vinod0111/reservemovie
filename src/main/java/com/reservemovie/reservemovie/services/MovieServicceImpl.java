package com.reservemovie.reservemovie.services;

import com.reservemovie.reservemovie.dao.MovieDao;
import com.reservemovie.reservemovie.entities.Movie;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServicceImpl implements MovieService{

    @Autowired
    public MovieDao movieDao;

    @Override
    public Movie acceptMovieDetails(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    @Transactional
    public List<Movie> acceptAllMoviDetails(List<Movie> movies) {

        List<Movie> savedMovies = new ArrayList<>();

        for (Movie movie: movies) {
            savedMovies.add(acceptMovieDetails(movie));
        }

        return savedMovies;
    }

    @Override
    public Movie getMovieDetails(int id) {
        return movieDao.findById(id).get();
    }

    @Override
    public Movie updateMovieDetails(Movie movie) {

        Movie savedMovie = getMovieDetails(movie.getMovieId());

        movie.setMovieId(savedMovie.getMovieId());

        movieDao.save(movie);

        return movie;
    }

    @Override
    public boolean deleteMovie(int id) {

        Movie savedMovie = getMovieDetails(id);

        if (savedMovie == null) {return false;}

        movieDao.delete(savedMovie);

        return true;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    @Override
    public Page<Movie> getPaginatedMovieDetails(Pageable pageRequest) {
        return movieDao.findAll(pageRequest);
    }
}
