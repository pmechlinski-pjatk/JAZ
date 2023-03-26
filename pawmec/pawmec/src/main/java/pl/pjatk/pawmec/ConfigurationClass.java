package pl.pjatk.pawmec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public Qqq beSomeClassOne() {
        return new Qqq();
    }


    @Bean
    @Conditional(ConditionalOverride.class)
    public Production initalizeProductionEnv() { return new Production(); }
//
//    @Bean
//    public SomeClassTwo beSomeClassTwo() {
//        return new SomeClassTwo(new SomeClassOne());
//    }
}
