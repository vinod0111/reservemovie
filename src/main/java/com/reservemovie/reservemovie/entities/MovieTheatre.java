package com.reservemovie.reservemovie.entities;

import jakarta.persistence.*;

@Entity
public class MovieTheatre {

    @Id
    @GeneratedValue
    private int movietheatreId;

    @OneToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "theatre_id", nullable = false)
    private Theatre theatre;

    @Override
    public String toString() {
        return "MovieTheatre{" +
                "movietheatreId=" + movietheatreId +
                ", movie=" + movie +
                ", theatre=" + theatre +
                '}';
    }

    public int getMovietheatreId() {
        return movietheatreId;
    }

    public void setMovietheatreId(int movietheatreId) {
        this.movietheatreId = movietheatreId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
}
