package com.rental.rentalService;

import org.springframework.stereotype.Service;

@Service
public class RentalService {
    Long getMovie(Long id) {
        try {
        Long somnum = 1410L;
        return somnum;
    } catch (NullPointerException e) {
            System.out.print("Złapano null na getMovie!");
            return null;
        }
    }

    Long returnMovie(Long id) {
        Long somnum = 2137L;
        return somnum;
    }
}
