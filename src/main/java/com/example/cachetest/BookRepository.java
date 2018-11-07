package com.example.cachetest;

public interface BookRepository {

    Book getByIsbn(String isbn);
    void refresh(String isbn);
}
