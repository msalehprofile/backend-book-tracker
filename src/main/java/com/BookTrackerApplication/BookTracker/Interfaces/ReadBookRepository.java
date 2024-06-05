package com.BookTrackerApplication.BookTracker.Interfaces;

import com.BookTrackerApplication.BookTracker.Books.ReadBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadBookRepository extends JpaRepository<ReadBook, Long> {
}
