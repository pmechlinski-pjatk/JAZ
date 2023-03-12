package pl.pjatk.pawmec;

import org.springframework.stereotype.Component;

@Component
public class SomeClassOne {
    public SomeClassOne() {
        System.out.println("This is Class One");
        this.getNames();
    }

    public void getNames() {
        System.out.println("This is getNames() from Class One");
    }
}
