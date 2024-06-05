package com.BookTrackerApplication.BookTracker.Interfaces;


import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTrackerRepository extends JpaRepository<Books, Long> {

    // CREATE

    // READ
    @Query(value="SELECT * FROM books.wanttoread", nativeQuery = true)
    List<Books> getAllWantToReadBooks();

    @Query(value="SELECT * FROM books.read", nativeQuery = true)
    List<Books> getAllReadBooks();

    @Query(value="SELECT * FROM books.currentlyreading", nativeQuery = true)
    List<Books> getCurrentlyReading();

    List<Books> getAllByAuthor(String author);
}
