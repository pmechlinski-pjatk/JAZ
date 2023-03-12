package pl.pjatk.pawmec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public Qqq beSomeClassOne() {
        return new Qqq();
    }
//
//    @Bean
//    public SomeClassTwo beSomeClassTwo() {
//        return new SomeClassTwo(new SomeClassOne());
//    }
}
