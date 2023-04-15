package com.reservemovie.reservemovie.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDateTime;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int cutomerId;

    @Column(length = 20, nullable = false)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 20, unique = true, nullable = false)
    private String userName;

    @Column(length = 20, nullable = false)//, columnDefinition = "CONSTRAINT length_of_password CHECK (CHAR_LENGTH(password) > 5)")
    private String password;

    @Column(nullable = false)
    private LocalDateTime dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "user_type_id", nullable = false)
    private UserType userTypeId;
    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language languageId;

    @Override
    public String toString() {
        return "Customer{" +
                "cutomerId=" + cutomerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", userTypeId=" + userTypeId +
                ", languageId=" + languageId +
                '}';
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UserType userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }
}
