package com.BookTrackerApplication.BookTracker.Books;

import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name = "allstoredbooks")

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private String genre;
    private long numberOfPages;
    private String imageURL;

    public Books() {

    }

    public Books( long id, String title, String author, String genre, long numberOfPages, String imageURL ) {
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.id = id;
        this.numberOfPages = numberOfPages;
        this.imageURL = imageURL;

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
