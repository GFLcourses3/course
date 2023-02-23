package com.github.serhx4.patterns.di;

public interface AbstractContext {
    
    <T> T create(Class<T> tClass);

}
