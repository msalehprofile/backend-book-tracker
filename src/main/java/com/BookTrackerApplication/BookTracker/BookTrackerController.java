package com.BookTrackerApplication.BookTracker;
import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookTrackerController {

    @Autowired
    BookTrackerService bookTrackerService;

//    @GetMapping("/allbooks")
//    public ResponseEntity <List<Books>> getGreetings(@RequestParam(required = false) String authorName, @RequestParam(defaultValue = "10") int limit) {
//
//        if (authorName != null) {
//            return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllByAuthor(authorName, limit));
//        }
//
//        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllBooks());
//
//    }
    @GetMapping("/ollie")
    public String testing() {
        return "Got here";
    }


    @PostMapping
    public Books createBook(@RequestBody Books book) {
        bookTrackerService.addBook(book);
        return book;
    }

    @GetMapping("/test")
    public String getOriginCountries() {
        return "Hello";
    }



    @GetMapping("/allbooks")
    public ResponseEntity <List<Books>> getAllBooks() {
//        System.out.println("getting here");
        return ResponseEntity.status(HttpStatus.OK).body(bookTrackerService.getAllBooks());
    }


}
