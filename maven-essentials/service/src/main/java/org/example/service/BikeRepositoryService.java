package org.example.service;

import java.util.List;
import org.example.domain.Bike;
import org.example.repository.BikeRepository;

public class BikeRepositoryService {

    private BikeRepository bikeRepository = new BikeRepository();

    public List<Bike> getAllBikes() {
        return bikeRepository.getAllBikes();
    }

    public void addBike(Bike bike) {
        bikeRepository.addBike(bike);
    }

    public void removeBikeById(int id) {
        bikeRepository.removeBikeById(id);
    }

    public List<Bike> findBikeByBrand(String brand) {
        return bikeRepository.findBikeByBrand(brand);
    }

    public List<Bike> findBikeByModel(String model) {
        return bikeRepository.findBikeByModel(model);
    }

}
