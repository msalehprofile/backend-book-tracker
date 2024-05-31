package com.BookTrackerApplication.BookTracker.Books;

import java.util.Random;

public class Books {
    private long id = new Random().nextLong();
    private String title;
    private String author;
    private String genre;
    private String imageURL;

    public Books( long id, String title, String author, String genre, String imageURL   ) {
        this.imageURL = imageURL;
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
