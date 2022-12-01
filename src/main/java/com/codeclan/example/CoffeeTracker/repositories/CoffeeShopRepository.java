package com.codeclan.example.CoffeeTracker.repositories;

import com.codeclan.example.CoffeeTracker.models.CoffeeShop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeShopRepository extends JpaRepository<CoffeeShop, Long> {
    List<CoffeeShop> findByRegion(String region);

    List<CoffeeShop> findByCoffeeGreaterThan(int age);
}
