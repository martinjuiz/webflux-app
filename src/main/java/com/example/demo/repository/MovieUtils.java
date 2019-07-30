package com.example.demo.repository;

import com.example.demo.model.Movie;

@FunctionalInterface
public interface MovieUtils {

    Movie addEntry(int id, String name, int score, String picture);
}
