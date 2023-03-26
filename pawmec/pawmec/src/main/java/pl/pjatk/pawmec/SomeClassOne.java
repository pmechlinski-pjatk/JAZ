package pl.pjatk.pawmec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeClassOne {
    public SomeClassOne(@Value("${my.custom.property}") String valueFromProperties) {
        System.out.println("This is Class One");
        System.out.println(valueFromProperties);
        this.getNames();
    }

    public void getNames() {
        System.out.println("This is getNames() from Class One");
    }
}
