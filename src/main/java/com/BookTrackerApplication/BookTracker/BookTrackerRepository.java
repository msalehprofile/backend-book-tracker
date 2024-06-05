package com.BookTrackerApplication.BookTracker;


import com.BookTrackerApplication.BookTracker.Books.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTrackerRepository extends JpaRepository<Books, Long> {

    List<Books> getAllByAuthor(String author);
}
