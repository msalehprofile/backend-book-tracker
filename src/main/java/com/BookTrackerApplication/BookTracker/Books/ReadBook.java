package com.BookTrackerApplication.BookTracker.Books;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="read")
public class ReadBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String genre;
    private long numberOfPages;
    private String imageURL;
    private LocalDate dateAdded =  LocalDate.now();
    private LocalDate dateStarted =  LocalDate.now();
    private LocalDate dateFinished =  LocalDate.now();
    private int rating;
    private String review;

    public ReadBook() {

    }

    public ReadBook(String review, int rating, LocalDate dateFinished, LocalDate dateStarted, LocalDate dateAdded, String imageURL, long numberOfPages, String genre, String author, String title, long id) {
        this.review = review;
        this.rating = rating;
        this.dateFinished = dateFinished;
        this.dateStarted = dateStarted;
        this.dateAdded = dateAdded;
        this.imageURL = imageURL;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.id = id;
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

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public String getImageURL() {
        return imageURL;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public LocalDate getDateStarted() {
        return dateStarted;
    }

    public LocalDate getDateFinished() {
        return dateFinished;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }
}
