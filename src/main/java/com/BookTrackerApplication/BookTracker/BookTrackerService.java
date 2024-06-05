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
import java.util.Optional;
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
        return bookTrackerRepository.findAll();
    }

    public Books getBookById(long id) {
        Optional<Books> book = bookTrackerRepository.findById(id);

        if (book.isEmpty()) {
            throw new BookNotFoundException();
        }
        return book.get();
    }

    public List<WantToReadBook> getAllWantToReadBooks() {
        return wantToReadRepository.findAll();
    }

    public WantToReadBook getTBRBookById(long id) {
        Optional<WantToReadBook> book = wantToReadRepository.findById(id);

        if (book.isEmpty()) {
            throw new BookNotFoundException();
        }
        return book.get();
    }

    public Long getNumberOfTBR() {
        return wantToReadRepository.getNumberOfTBR();
    }

    public List<ReadBook> getAllReadBooks() {
        return readBookRepository.findAll();
    }

    public Long getNumberOfBooksRead() {
        return readBookRepository.getNumberOfBooksRead();
    }

    public Long getNumberOfPagesRead() {
        return readBookRepository.getNumberOfPagesRead();
    }

    public List<CurrentlyReading> getCurrentlyReading() {
        return currentlyReadingRepository.findAll();
    }




    public List<Books> getAllByAuthor(String authorName,  int limit) {
        List<Books> books = bookTrackerRepository.getAllByAuthor(authorName);

        return books
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

}
