package com.github.serhx4.patterns.model.mapper;

public interface Mapper <F, T>{

    T map(F from);

}
