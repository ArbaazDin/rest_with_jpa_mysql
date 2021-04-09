package com.leadows.rest_with_jpa;


import javax.persistence.Entity;
import javax.persistence.Id; 

import org.json.JSONObject;

@Entity
public class Books {
    @Id
    private Long id;
    private String title;
    private String author;
    private int price;
    private String type;

    public Books() {
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Books(Long id, String title, String author, int price, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public JSONObject toJSON(){
        JSONObject object = new JSONObject();
        object.put("title", this.title);
        object.put("author", this.author);
        object.put("price", this.price);

        return object;
    }
    
}
