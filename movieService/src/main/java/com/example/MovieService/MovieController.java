package com.example.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private List<Movie> movies;

    public MovieController() {
        movies = createMovieList();
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.status(HttpStatus.OK).body(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Movie movie = findMovieById(id);
        if (movie != null) {
            return ResponseEntity.status(HttpStatus.OK).body(movie);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    private List<Movie> createMovieList() {
        List<Movie> movies = new ArrayList<>();

        // Add movies to the list
        movies.add(new Movie(1L, "Movie 1", "Action", 2020, 7.5));
        movies.add(new Movie(2L, "Movie 2", "Comedy", 2018, 6.8));
        movies.add(new Movie(3L, "Movie 3", "Drama", 2019, 8.2));

        return movies;
    }

    private Movie findMovieById(Long id) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        if (movie.getId() != null) {
            // Invalid input: ID should not be provided in the request body
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        // Generate a new ID for the movie
        Long newId = generateNewId();

        // Create a new movie with the generated ID
        Movie newMovie = new Movie(newId, movie.getName(), movie.getCategory(), movie.getReleaseYear(), movie.getRating());

        // Add the new movie to the list
        movies.add(newMovie);

        // Return the added movie with a 200 OK status
        return ResponseEntity.status(HttpStatus.OK).body(newMovie);
    }

    private Long generateNewId() {
        // Generate a new ID based on the last movie's ID
        Long lastId = movies.get(movies.size() - 1).getId();
        return lastId + 1;
    }
}