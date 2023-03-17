package org.example.controller;

import java.util.List;
import org.example.domain.Bike;
import org.example.service.BikeService;

public class BikeController {

    private final BikeService bikeService = new BikeService();

    public List<Bike> getAllBikes() {
        return bikeService.getAllBikes();
    }

    public void addBike(Bike bike) {
        bikeService.addBike(bike);
    }

    public void removeBikeById(int id) {
        bikeService.removeBikeById(id);
    }

    public List<Bike> findBikeByBrand(String brand) {
        return bikeService.findBikeByBrand(brand);
    }

    public List<Bike> findBikeByModel(String model) {
        return bikeService.findBikeByModel(model);
    }
}
