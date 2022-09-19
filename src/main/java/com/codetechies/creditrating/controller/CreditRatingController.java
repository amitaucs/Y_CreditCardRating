package com.codetechies.creditrating.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
//Test
@RestController
@Slf4j
public class CreditRatingController {

    @GetMapping("getCreditRating/{idNumber}")
    public Integer provideCustomerRating(@PathVariable String idNumber){

        Integer max = 10;
        Integer min = 1;

        return new Random().nextInt(max-min)+min;
    }
}
