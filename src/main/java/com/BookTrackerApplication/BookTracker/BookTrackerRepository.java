package com.BookTrackerApplication.BookTracker;


import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookTrackerRepository {

    private final List<Books> storedBooks = new ArrayList<>();

    public void addBooks(Books book) {
        storedBooks.add(book);
    }

    // read

    public List<Books> getAllBooks() {
        return storedBooks;
    }

}
