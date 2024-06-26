package com.BookTrackerApplication.BookTracker.Interfaces;

import com.BookTrackerApplication.BookTracker.Books.Books;
import com.BookTrackerApplication.BookTracker.Books.CurrentlyReading;
import com.BookTrackerApplication.BookTracker.Books.WantToReadBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WantToReadRepository extends JpaRepository<WantToReadBook, Long> {

    @Query(value="SELECT COUNT(*) as Number_of_books_in_TBR from books.wanttoread", nativeQuery = true)
    Long getNumberOfTBR();


}
