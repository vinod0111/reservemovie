package com.reservemovie.reservemovie.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int bookingId;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "movie_theatre_id", nullable = false)
    private MovieTheatre movieTheatre;

    @Column(nullable = false)
    private LocalDate bookingDate;

    @Column(nullable = false)
    private int noOfSeats;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", customer=" + customer +
                ", movieTheatre=" + movieTheatre +
                ", bookingDate=" + bookingDate +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public MovieTheatre getMovieTheatre() {
        return movieTheatre;
    }

    public void setMovieTheatre(MovieTheatre movieTheatre) {
        this.movieTheatre = movieTheatre;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
