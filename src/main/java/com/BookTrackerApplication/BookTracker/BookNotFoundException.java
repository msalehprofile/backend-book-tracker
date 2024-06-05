package com.BookTrackerApplication.BookTracker;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("Book has not been found");
    }
}