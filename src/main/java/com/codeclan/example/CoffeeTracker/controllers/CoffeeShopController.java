package com.codeclan.example.CoffeeTracker.controllers;

import com.codeclan.example.CoffeeTracker.models.Coffee;
import com.codeclan.example.CoffeeTracker.models.CoffeeShop;
import com.codeclan.example.CoffeeTracker.repositories.CoffeeRepository;
import com.codeclan.example.CoffeeTracker.repositories.CoffeeShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class CoffeeShopController {

    @Autowired
    CoffeeShopRepository coffeeShopRepository;

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping(value = "/coffeeshops/{id}")
    public ResponseEntity getCoffeeShop(@PathVariable Long id){
        return new ResponseEntity<>(coffeeShopRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/coffeeshops")
    public ResponseEntity<List<CoffeeShop>> findCoffeeShopByRegionQueryString(@RequestParam(name="region", required=false) String region) {
        if (region != null) {
            return new ResponseEntity<>(coffeeShopRepository.findByRegion(region), HttpStatus.OK);
        }
        return new ResponseEntity<>(coffeeShopRepository.findAll(), HttpStatus.OK);
    }

}
