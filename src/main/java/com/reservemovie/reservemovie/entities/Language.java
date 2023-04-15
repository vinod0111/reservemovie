package com.reservemovie.reservemovie.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Language {

    @Id
    @GeneratedValue
    private int languageId;

    @Column(length = 20, nullable = false, unique = true)
    private String languageName;

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "language")
//    private Set<Customer> customers;

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", languageName='" + languageName + '\'' +
                '}';
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
