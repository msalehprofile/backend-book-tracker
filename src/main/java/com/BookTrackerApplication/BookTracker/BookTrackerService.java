package com.BookTrackerApplication.BookTracker;

import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTrackerService {
    @Autowired
    BookTrackerRepository bookTrackerRepository;

    // create
    public void addBook(Books book) {
        bookTrackerRepository.addBooks(book);
    }
    // read
    public List<Books> getAllBooks() {
        List<Books> storedBooks = bookTrackerRepository.getAllBooks();
        return storedBooks;
    }

}
