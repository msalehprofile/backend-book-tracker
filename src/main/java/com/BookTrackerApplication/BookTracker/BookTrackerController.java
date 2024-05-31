package com.BookTrackerApplication.BookTracker;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class BookTrackerController {

    @GetMapping("/test")
    public String getOriginCountries() {
        return "Hello";
    }
}
