package com.BookTrackerApplication.BookTracker;
import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class BookTrackerController {

    @Autowired
    private BookTrackerService bookTrackerService;

    @GetMapping("/test")
    public String getOriginCountries() {
        return "Hello";
    }

    @GetMapping("/allbooks")
    public List<Books> getAllBooks() {
        return bookTrackerService.getAllBooks();
    }
}
