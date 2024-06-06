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

    @Query(value="SELECT * FROM books.allbooks", nativeQuery = true)
    List<Books> getAllStoredBooks();

    List<Books> getAllByAuthor(String author);
}
