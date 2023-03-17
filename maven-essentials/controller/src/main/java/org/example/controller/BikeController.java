package org.example.controller;

import java.util.List;
import org.example.domain.Bike;
import org.example.service.BikeRepositoryService;

public class BikeController {

    private final BikeRepositoryService bikeRepositoryService = new BikeRepositoryService();

    public List<Bike> getAllBikes() {
        return bikeRepositoryService.getAllBikes();
    }

    public void addBike(Bike bike) {
        bikeRepositoryService.addBike(bike);
    }

    public void removeBikeById(int id) {
        bikeRepositoryService.removeBikeById(id);
    }

    public List<Bike> findBikeByBrand(String brand) {
        return bikeRepositoryService.findBikeByBrand(brand);
    }

    public List<Bike> findBikeByModel(String model) {
        return bikeRepositoryService.findBikeByModel(model);
    }
}
