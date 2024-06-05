package com.BookTrackerApplication.BookTracker.Interfaces;

import com.BookTrackerApplication.BookTracker.Books.CurrentlyReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentlyReadingRepository extends JpaRepository<CurrentlyReading, Long> {



}
