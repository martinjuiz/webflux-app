package com.example.demo.repository;

import com.example.demo.model.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieRepository {

    Flux<Movie> findAll();

    Mono<Movie> findOne(int movieId);
}
