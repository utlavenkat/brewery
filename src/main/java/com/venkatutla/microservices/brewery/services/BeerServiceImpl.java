package com.venkatutla.microservices.brewery.services;

import com.venkatutla.microservices.brewery.web.dto.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder().id(beerId).beerType("Pale Ale").beerName("Galaxy Cat").upc(10L).build();
    }

    @Override
    public Beer createBeer(Beer beer) {
        return Beer.builder().id(UUID.randomUUID()).build();
    }
}
