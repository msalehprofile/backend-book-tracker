package com.BookTrackerApplication.BookTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BookTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookTrackerApplication.class, args);
	}

}
