package pl.pjatk.pawmec;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NewClass {
    public NewClass(ApplicationContext context) {
        System.out.println("NewClass build starts");
        var q = context.getBean("beSomeClassOne");
        System.out.println(q);
        var q2 = context.getBean("someClassTwo", SomeClassTwo.class);
        q2.getNames();
//        System.out.println();

    }
}
