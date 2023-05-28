package com.rental.rentalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class RentalRestController {

    public static Long parseStringToLong(String input) {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Autowired
    RentalService rentalService;

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(@RequestParam(name="reqParam", defaultValue="Hello World") String reqParam){
        return ResponseEntity.ok(reqParam);
    }

    @GetMapping("/error")
    public String returnErrorValue() { return "BŁĄD!"; };

    @GetMapping("/getMovie")
    @ResponseBody
    public String echoValueReq(@RequestParam("id") String someValue) {
        try {
            rentalService.getMovie(parseStringToLong(someValue));
        } catch (NullPointerException e) {
            return "Niepoprawne ID!";
        }
        return "Pozyskano film o id: "+someValue; }

    Long getMovie(Long id) {
        Long somnum = 1410L;
        return somnum;
    }
    @GetMapping("/returnMovie")
    @ResponseBody
    public String returnMovieRequest(@RequestParam("id") String someValue) {
        try {
            rentalService.returnMovie(parseStringToLong(someValue));
        } catch (NullPointerException e) {
            return "Niepoprawne ID!";
        }
        return "Zwrócono film o id: "+someValue; }

    Long returnMovie(Long id) {
        Long somnum = 2137L;
        return somnum;
    }

}

