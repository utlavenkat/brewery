package com.venkatutla.microservices.brewery.services;

import com.venkatutla.microservices.brewery.web.dto.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID beerId);
}
