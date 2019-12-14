package com.venkatutla.microservices.brewery.web.controller;

import com.venkatutla.microservices.brewery.services.BeerService;
import com.venkatutla.microservices.brewery.web.dto.Beer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/beer")
public class BeerController {

    private static final String SERVICE_URL = "/api/v1/beer";

    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<Beer> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody Beer beer) {
        Beer newBeer = beerService.createBeer(beer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location",SERVICE_URL + "/"+newBeer.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody Beer beer) {
        beerService.updateBeer(beerId,beer);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{beerId}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        beerService.deleteBeer(beerId);
    }
}
