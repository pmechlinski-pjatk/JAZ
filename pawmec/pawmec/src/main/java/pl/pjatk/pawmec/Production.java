package pl.pjatk.pawmec;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class Production {
    public Production() {
        System.out.println("THIS IS PRODUCTION! DON't TOUCH THE DATABASE!");
    }
}
