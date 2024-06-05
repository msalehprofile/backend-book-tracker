package com.BookTrackerApplication.BookTracker;


import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookTrackerService {
    @Autowired
    BookTrackerRepository bookTrackerRepository;

    // create
    public void addBook(Books book) {
        bookTrackerRepository.save(book);
    }


    // read
    public List<Books> getAllBooks() {
        return bookTrackerRepository.findAll();
    }

    public List<Books> getAllByAuthor(String authorName,  int limit) {
        List<Books> books = bookTrackerRepository.getAllByAuthor(authorName);

        return books
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

}
