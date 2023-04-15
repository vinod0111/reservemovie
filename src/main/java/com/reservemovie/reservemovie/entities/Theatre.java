package com.reservemovie.reservemovie.entities;

import jakarta.persistence.*;

@Entity
public class Theatre {

    @Id
    @GeneratedValue
    private int theatreId;

    @Column(length = 20, unique = true, nullable = false)
    private String theatreName;

    @OneToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(precision = 2, nullable = false)
    private double ticketPrice=150.00;

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", city=" + city +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
