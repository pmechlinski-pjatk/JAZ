package pl.pjatk.pawmec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeClassTwo {
    public SomeClassTwo(SomeClassOne classOne, @Value("${my.empty.property: WARTOŚĆ DOMYŚLNA}") String valueFromProperties) {
        System.out.println("This is Class Two");
        System.out.println(valueFromProperties);
        this.getNames();
    }

    public void getNames() {
        System.out.println("This is getNames() from Class Two");
    }
}
