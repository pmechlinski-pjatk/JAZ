package pl.pjatk.pawmec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Beaner {
    public Beaner(ApplicationContext context, @Value("${my.custom.boolean}") Boolean isProd) {
        System.out.println("NewClass build starts");
        var q = context.getBean("beSomeClassOne");
        System.out.println(q);
        var q2 = context.getBean("someClassTwo", SomeClassTwo.class);
        q2.getNames();
//        System.out.println();



    }
}
