package com.example.cachetest;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

public class KeyGenertor implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        return null;
    }
}
