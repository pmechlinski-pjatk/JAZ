package pl.pjatk.pawmec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    private final CarModelRepository carModelRepository;

    public ConfigurationClass(CarModelRepository carModelRepository) {
        this.carModelRepository = carModelRepository;
    }

    @Bean
    public Qqq beSomeClassOne() {
        return new Qqq();
    }


    @Bean
    @Conditional(ConditionalOverride.class)
    public Production initalizeProductionEnv() { return new Production(); }

    @Bean
    public CarModelRepository createCarModelRepository() { return new CarModelRepository(); }
//
//    @Bean
//    public SomeClassTwo beSomeClassTwo() {
//        return new SomeClassTwo(new SomeClassOne());
//    }
}
