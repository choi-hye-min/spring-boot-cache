package com.example.cachetest;

import lombok.Data;

@Data
public class Book {

    private String isbn;
    private String value;

    public Book(String isbn, String value) {
        this.isbn = isbn;
        this.value = value;
    }
}
