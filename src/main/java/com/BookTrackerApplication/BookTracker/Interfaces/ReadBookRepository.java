package com.BookTrackerApplication.BookTracker.Interfaces;

import com.BookTrackerApplication.BookTracker.Books.Books;
import com.BookTrackerApplication.BookTracker.Books.ReadBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReadBookRepository extends JpaRepository<ReadBook, Long> {

    @Query(value="SELECT SUM(number_of_pages) as Number_of_pages_read from books.finishedbooks ;", nativeQuery = true)
    Long getNumberOfPagesRead();

    @Query(value="SELECT COUNT(*) as Number_of_books_read from books.finishedbooks", nativeQuery = true)
    Long getNumberOfBooksRead();

}
