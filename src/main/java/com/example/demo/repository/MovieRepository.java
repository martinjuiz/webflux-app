package com.example.demo.repository;

import com.example.demo.model.Movie;
import reactor.core.publisher.Flux;

public interface MovieRepository {

    Flux<Movie> findAll();
}
