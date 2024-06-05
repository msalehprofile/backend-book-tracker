package com.BookTrackerApplication.BookTracker;
import com.BookTrackerApplication.BookTracker.Books.Books;
import com.BookTrackerApplication.BookTracker.Books.CurrentlyReading;
import com.BookTrackerApplication.BookTracker.Books.ReadBook;
import com.BookTrackerApplication.BookTracker.Books.WantToReadBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookTrackerController {

    @Autowired
    BookTrackerService bookTrackerService;

    // CREATE

    @PostMapping("/addbook")
    public Books createBook(@RequestBody Books book) {
        bookTrackerService.addBookToAllBooks(book);
        return book;
    }

    @PostMapping("/wanttoread")
    public WantToReadBook addBookToWantToRead(@RequestBody WantToReadBook book) {
        bookTrackerService.addBookToWantToRead(book);
        return book;
    }

    @PostMapping("/currentlyreading")
    public CurrentlyReading addBookToCurrentlyReading(@RequestBody CurrentlyReading book) {
        bookTrackerService.addToCurrentlyReading(book);
        return book;
    }

    @PostMapping("/read")
    public ReadBook addBookToReadList(@RequestBody ReadBook book) {
        bookTrackerService.addBookToRead(book);
        return book;
    }


    @GetMapping("/test")
    public String getOriginCountries() {
        return "Hello";
    }

    // READ
    @GetMapping("/allbooks")
    public ResponseEntity <List<Books>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllBooks());
    }

    @GetMapping("/wanttoread")
    public ResponseEntity  <List<Books>> getAllWantToReadBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllWantToReadBooks());
    }

    @GetMapping("/currentlyreading")
    public ResponseEntity  <List<Books>> getCurrentlyReading() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getCurrentlyReading());
    }

    @GetMapping("/read")
    public ResponseEntity  <List<Books>> getAllReadBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllReadBooks());
    }

}
