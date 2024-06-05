package com.BookTrackerApplication.BookTracker;


import com.BookTrackerApplication.BookTracker.Books.Books;
import com.BookTrackerApplication.BookTracker.Books.CurrentlyReading;
import com.BookTrackerApplication.BookTracker.Books.ReadBook;
import com.BookTrackerApplication.BookTracker.Books.WantToReadBook;
import com.BookTrackerApplication.BookTracker.Interfaces.BookTrackerRepository;
import com.BookTrackerApplication.BookTracker.Interfaces.CurrentlyReadingRepository;
import com.BookTrackerApplication.BookTracker.Interfaces.ReadBookRepository;
import com.BookTrackerApplication.BookTracker.Interfaces.WantToReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookTrackerService {
    @Autowired
    BookTrackerRepository bookTrackerRepository;

    @Autowired
    WantToReadRepository wantToReadRepository;

    @Autowired
    CurrentlyReadingRepository currentlyReadingRepository;

    @Autowired
    ReadBookRepository readBookRepository;

    // create
    public void addBookToAllBooks(Books book) {
        bookTrackerRepository.save(book);
    }

    public void addBookToWantToRead(WantToReadBook book) {
        wantToReadRepository.save(book);
    }

    public void addToCurrentlyReading(CurrentlyReading book) {
        currentlyReadingRepository.save(book);
    }

    public void addBookToRead(ReadBook book) {
        readBookRepository.save(book);
    }

    // read
    public List<Books> getAllBooks() {
        return bookTrackerRepository.getAllStoredBooks();
    }

    public List<Books> getAllWantToReadBooks() {
        return bookTrackerRepository.getAllWantToReadBooks();
    }

    public List<Books> getAllReadBooks() {
        return bookTrackerRepository.getAllReadBooks();
    }

    public List<Books> getCurrentlyReading() {
        return bookTrackerRepository.getCurrentlyReading();
    }


    public List<Books> getAllByAuthor(String authorName,  int limit) {
        List<Books> books = bookTrackerRepository.getAllByAuthor(authorName);

        return books
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

}
