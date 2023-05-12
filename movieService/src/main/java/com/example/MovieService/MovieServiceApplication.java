package com.example.MovieService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MovieServiceApplication {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(AppConfig.class);
//		context.refresh();
//
//		MovieController movieController = context.getBean(MovieController.class);
		SpringApplication.run(MovieServiceApplication.class, args);
	}

}
