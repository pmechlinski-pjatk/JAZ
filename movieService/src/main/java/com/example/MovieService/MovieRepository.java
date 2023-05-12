package com.example.MovieService;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository {
    List<Movie> findAll();
    Movie findById(Long id);
    void save(Movie movie);
    void deleteById(Long id);
}