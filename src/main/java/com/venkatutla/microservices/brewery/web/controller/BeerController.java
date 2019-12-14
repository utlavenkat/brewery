package com.venkatutla.microservices.brewery.web.controller;

import com.venkatutla.microservices.brewery.web.dto.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(Beer.builder().id(beerId).beerName("Kingfisher").beerType("KingfisherType").build(), HttpStatus.OK);
    }
}
