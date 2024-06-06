package com.BookTrackerApplication.BookTracker.Books;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="currentlyreading")

public class CurrentlyReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String genre;
    private long numberOfPages;
    private String imageURL;
    private LocalDate dateAdded;
    private LocalDate dateStarted =  LocalDate.now();

    public CurrentlyReading() {

    }

    public CurrentlyReading( long id, String title, String author, String genre, long numberOfPages, String imageURL, LocalDate dateAdded, LocalDate dateStarted ) {
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.id = id;
        this.numberOfPages = numberOfPages;
        this.imageURL = imageURL;
        this.dateAdded = dateAdded;
        this.dateStarted = dateStarted;
    }

    public LocalDate getDateStarted() {
        return dateStarted;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getImageURL() {
        return imageURL;
    }

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

//    public String getImageURL() {
//        return imageURL;
//    }
//
//    public void setImageURL(String imageURL) {
//        this.imageURL = imageURL;
//    }
}
