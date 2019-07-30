package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReactiveMovieRepository implements MovieRepository {

    private static final List<Movie> MOVIES = new ArrayList<>();

    static {
        final MovieUtils utils = Movie::new;

        MOVIES.add( utils.addEntry(1, "Polar (2019)", 64, "/img/logo.png") );
        MOVIES.add( utils.addEntry(2, "Iron Man (2008)", 79, "/img/logo.png") );
        MOVIES.add( utils.addEntry(3, "The Shawshank Redemption (1994)", 93, "/img/logo.png") );
        MOVIES.add( utils.addEntry(4, "Forrest Gump (1994)", 83, "/img/logo.png") );
        MOVIES.add( utils.addEntry(5, "Forrest Gump (1994)", 83, "/img/logo.png") );
        MOVIES.add( utils.addEntry(6, "Glass (2019)", 70, "/img/logo.png") );
        MOVIES.add( utils.addEntry(7, "Polar (2019)", 64, "/img/logo.png") );
        MOVIES.add( utils.addEntry(8, "Iron Man (2008)", 79, "/img/logo.png") );
        MOVIES.add( utils.addEntry(9, "The Shawshank Redemption (1994)", 93, "/img/logo.png") );
        MOVIES.add( utils.addEntry(10, "Forrest Gump (1994)", 83, "/img/logo.png") );
        MOVIES.add( utils.addEntry(11, "Glass (2019)", 70, "/img/logo.png") );
    }

    @Override
    public Flux<Movie> findAll() {
        //Simulate big list of data, streaming it every 2 second delay
        return Flux.fromIterable(MOVIES)
                .delayElements( Duration.ofSeconds(2) );
    }

    @Override
    public Mono<Movie> findOne(final int movieId) {
        return Mono.just(
                MOVIES.stream()
                        .filter(movie -> movieId == movie.getId())
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("Movie not found!"))

        ).delayElement( Duration.ofSeconds(3) );
    }
}
