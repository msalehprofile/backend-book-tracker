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

    // ALL BOOKS READS
    @GetMapping("/allbooks")
    public ResponseEntity <List<Books>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllBooks());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity <Books> getBookById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getBookById(id));
    }

    //TBR READS
    @GetMapping("/wanttoread")
    public ResponseEntity  <List<WantToReadBook>> getAllWantToReadBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllWantToReadBooks());
    }

    @GetMapping("/countTBR")
    public ResponseEntity<Long> getNumberOfTBR() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getNumberOfTBR());
    }

    @GetMapping("/TBRbooks/{id}")
    public ResponseEntity <WantToReadBook> getTBRBookById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getTBRBookById(id));
    }

    // CURRENTLY READING READS
    @GetMapping("/currentlyreading")
    public ResponseEntity  <List<CurrentlyReading>> getCurrentlyReading() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getCurrentlyReading());
    }


    // FINISHED READS

    @GetMapping("/finishedreading")
    public ResponseEntity  <List<ReadBook>> getAllReadBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllReadBooks());
    }

    @GetMapping("/countreadbooks")
    public ResponseEntity<Long> getNumberOfBooksRead() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getNumberOfBooksRead());
    }

    @GetMapping("/countreadpages")
    public ResponseEntity<Long> getNumberOfPagesRead() {
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getNumberOfPagesRead());
    }

}
