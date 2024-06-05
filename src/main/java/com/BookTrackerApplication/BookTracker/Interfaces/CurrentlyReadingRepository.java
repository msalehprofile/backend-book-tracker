package com.BookTrackerApplication.BookTracker.Interfaces;

import com.BookTrackerApplication.BookTracker.Books.Books;
import com.BookTrackerApplication.BookTracker.Books.CurrentlyReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrentlyReadingRepository extends JpaRepository<CurrentlyReading, Long> {

    @Query(value="SELECT * FROM books.currentlyreading", nativeQuery = true)
    List<CurrentlyReading> getCurrentlyReading();

}
