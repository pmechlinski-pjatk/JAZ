package pl.pjatk.pawmec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PawmecApplication {

	public static void main(String[] args) {

		SpringApplication.run(PawmecApplication.class, args);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("pl.pjatk.pawmec");
//		context.refresh();
	}



}
