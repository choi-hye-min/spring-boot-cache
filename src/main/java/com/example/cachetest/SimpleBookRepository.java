package com.example.cachetest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable(value = "book", key = "#isbn")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some Book");
    }

    @Override
    @CacheEvict(value = "book", key = "#isbn")
    public void refresh(String isbn) {
        log.info("--- cache clear {}", isbn);
    }

    public void simulateSlowService() {

        long time = 3000L;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
