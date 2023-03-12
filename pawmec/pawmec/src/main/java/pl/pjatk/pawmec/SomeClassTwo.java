package pl.pjatk.pawmec;

import org.springframework.stereotype.Component;

@Component
public class SomeClassTwo {
    public SomeClassTwo(SomeClassOne classOne) {
        System.out.println("This is Class Two");
        this.getNames();
    }

    public void getNames() {
        System.out.println("This is getNames() from Class Two");
    }
}
