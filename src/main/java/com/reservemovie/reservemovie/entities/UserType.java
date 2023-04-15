package com.reservemovie.reservemovie.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class UserType {

    @Id
    @GeneratedValue
    private int userTypeId;
    @Column(nullable = false, columnDefinition = "VARCHAR(20) DEFAULT 'Customer'", unique = true)
    private String userTypeName;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user_type")
//    private Set<Customer> Customers;

    @Override
    public String toString() {
        return "UserType{" +
                "userTypeId=" + userTypeId +
                ", userTypeName='" + userTypeName + '\'' +
                '}';
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }
}
