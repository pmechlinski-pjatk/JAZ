//package com.example.MovieService;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class InMemoryMovieRepository implements MovieRepository {
//    private final Map<Long, Movie> movies = new HashMap<>();
//
//    @Override
//    public List<Movie> findAll() {
//        return new ArrayList<>(movies.values());
//    }
//
//    @Override
//    public Movie findById(Long id) {
//        return movies.get(id);
//    }
//
//    @Override
//    public void save(Movie movie) {
//        movies.put(movie.getId(), movie);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        movies.remove(id);
//    }
//}
