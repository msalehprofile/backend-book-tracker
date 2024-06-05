package com.BookTrackerApplication.BookTracker.Books;

import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name="books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String genre;

    public Books() {

    }

    public Books( long id, String title, String author, String genre ) {
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

//    public String getImageURL() {
//        return imageURL;
//    }
//
//    public void setImageURL(String imageURL) {
//        this.imageURL = imageURL;
//    }
}
