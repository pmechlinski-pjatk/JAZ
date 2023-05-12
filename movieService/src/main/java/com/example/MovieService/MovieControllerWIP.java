//package com.example.MovieService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/movies")
//public class MovieControllerWIP {
//
//    @Autowired
//    public MovieControllerWIP(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Movie>> getAllMovies() {
//        List<Movie> movies = movieRepository.findAll();
//        return ResponseEntity.status(HttpStatus.OK).body(movies);
//    }
//}
