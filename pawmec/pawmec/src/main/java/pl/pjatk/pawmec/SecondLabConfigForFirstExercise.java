package pl.pjatk.pawmec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

@Configuration
public class SecondLabConfigForFirstExercise {
    private final List<String> defaultData = new ArrayList<>();




    @Bean
    public PlainClass beSomePlainClass() {
        return new PlainClass();
    }
    @Bean
    public List<String> defaultData() {
        return List.of(
               "Why are Communists bad Java programmers?\n" +
                        "They don't like classes.",
               "Why do blind programmers use Java?\n" +
                       "Because they can't C.",
               "Why do Java programmers have to wear glasses?\n" +
                        "Because they don't C#\n",
               "What's the difference between Java and JavaScript?\n" +
                        "Java and JavaScript are similar in the same way car and carpet are.\n",
               "I recently rejected a junior software dev job at IKEA.\n" +
                        "I kinda know java, kotlin and some php but unfortunately Assembly was required.\n");
    }


}
