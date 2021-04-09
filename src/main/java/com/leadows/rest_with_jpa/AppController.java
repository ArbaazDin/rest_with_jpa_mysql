package com.leadows.rest_with_jpa;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private BooksService service;

    @GetMapping("/getBooks")
    public String viewHomePage() {

        // Data fetched from db
        List<Books> listBooks = service.listAll();

        // JSON array to return 
        JSONArray bookList = new JSONArray();

        listBooks.forEach((book) -> {
            JSONObject jsonObject = book.toJSON(); 
            bookList.put(jsonObject);
        });

        //SErializing array to json
        
        System.out.println(bookList.toString());
        return bookList.toString();

    }
}