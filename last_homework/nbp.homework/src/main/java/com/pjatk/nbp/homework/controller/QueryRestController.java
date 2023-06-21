package com.pjatk.nbp.homework.controller;

import com.pjatk.nbp.homework.model.Entry;
import com.pjatk.nbp.homework.service.DateService;
import com.pjatk.nbp.homework.service.LoggerService;
import com.pjatk.nbp.homework.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;

@RestController
@RequestMapping("/average")
public class QueryRestController {

    @Autowired
    RestService restService;

    @Autowired
    LoggerService loggerService;

    @Autowired
    DateService date;

    @GetMapping(value = "{currency}")
    @ResponseBody
    public ResponseEntity<String> getRequestForCurrency(@RequestParam(defaultValue = "1") int days, @PathVariable String currency) throws HttpClientErrorException.BadRequest, HttpClientErrorException.NotFound, HttpClientErrorException.TooManyRequests {
        Entry requestResult = null;
        try {
            requestResult = restService.getNbpData(currency, days);
        } catch (NullPointerException e) {
            System.out.println("[RestController][ERROR] " + date.getTime() + " Rest Controller was unable to reach the requested endpoint!");
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
        if (requestResult != null) loggerService.logQuery(requestResult);
        return new ResponseEntity<String>(requestResult.toString(), HttpStatus.OK);
    }

    }
