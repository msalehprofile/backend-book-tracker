package com.BookTrackerApplication.BookTracker;

import com.BookTrackerApplication.BookTracker.Books.Books;
import jakarta.annotation.PostConstruct;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


import java.io.FileReader;
import java.time.LocalDate;

@Component
public class BookTrackerInitializer {
    private final BookTrackerRepository bookTrackerRepository;

    @Value("classpath:books.json")
    private Resource resourceFile;

    @Autowired
    public BookTrackerInitializer(BookTrackerRepository bookTrackerRepository) {
        this.bookTrackerRepository = bookTrackerRepository;
    }

    @PostConstruct
    public void init() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(resourceFile.getFile())) {
            Object obj = jsonParser.parse(reader);

            JSONArray jsonArray = (JSONArray) obj;

            for (Object book : jsonArray) {
                JSONObject bookJSON = (JSONObject) book;

                long id = (long) bookJSON.get("id");
                String title = (String) bookJSON.get("title");
                String author = (String) bookJSON.get("author");
                String genre = (String) bookJSON.get("genre");
                String imageURL = (String) bookJSON.get("imageURL");

                bookTrackerRepository.addBooks(new Books(id, title, author, genre, imageURL));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
